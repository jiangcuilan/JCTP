package com;


import javax.annotation.Resource;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.jctp.service.TUserService;
import com.jctp.util.TCache;

/**
 * message receiver
 *
 * @author linux_china
 */
@Component
public class MessageReceiver {
	@Resource
	private TUserService tUserService;
    @JmsListener(destination = "method")
    public void processMessage(String content) {
    	try {
    		String[] op=content.split("@");
    		if(op.length>1){
    			Integer userId=Integer.valueOf(op[1]);
    			if("1".equals(op[0]))
    				tUserService.login(userId);
    			if("2".equals(op[0]))
    				tUserService.queryTradeDate(userId);
    			/*if("3".equals(op[0]))
    				tUserService.queryConfirmDate(userId);  */  			
    		}
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    @JmsListener(destination = "log")
    public void printlog(String content) {
    	TCache.putMessage(content);

    }
}
