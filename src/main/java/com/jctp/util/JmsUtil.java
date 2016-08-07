package com.jctp.util;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.jctp.model.TUserInfo;
import com.jctp.service.TUserService;
@Service
public class JmsUtil {
     
	@Resource
	private JmsTemplate jmsTemplate;
	@Resource
	private TUserService tUserService;
	/**
	 * 发送日志
	 * @param context
	 */
	public  void log(final String message){
        jmsTemplate.send("log",new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
            	LogUtil.info("send:"+message);
                return session.createTextMessage(message);
            }
        });
	}
	/**
	 * 发送日志
	 * @param context
	 */
	public  void log(final TUserInfo tUser,final String message){
		jmsTemplate.send("log",new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				String context=message;
				if(tUser!=null)
					context ="["+tUser.getUser()+"]:"+message;
				LogUtil.info(context);
				return session.createTextMessage(context);
			}
		});
	}
	/**
	 * 执行登录
	 * @param context
	 */
	public  void doLogin(final int userId){
        jmsTemplate.send("method",new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException  {
            	
                return session.createTextMessage("1@"+String.valueOf(userId));
                
            }
        });
	}
	/**
	 * 查询交易日
	 * @param context
	 */
	public  void doQueryTradeDate(final int userId){
        jmsTemplate.send("method",new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException  {
            	
                return session.createTextMessage("2@"+String.valueOf(userId));
                
            }
        });
	}	
	/**
	 * 查询订单日期
	 * @param context
	 */
	public  void doQueryConfirmDate(final int userId){
        jmsTemplate.send("method",new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException  {
            	
                return session.createTextMessage("3@"+String.valueOf(userId));
                
            }
        });
	}	
}
