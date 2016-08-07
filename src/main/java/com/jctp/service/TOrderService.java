package com.jctp.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.ctp.thostftdcuserapistruct.CThostFtdcOrderField;
import com.jctp.model.TOrderInfo;
import com.jctp.model.TUserInfo;

/**
 * 账户报单操作
 * @author Administrator
 *
 */
@Service
public class TOrderService {

	/**
	 * 每当有报单时，就查找和替换账户的存在的报单
	 * @param userInfo
	 * @param orderInfo
	 * @return
	 * @throws Exception
	 */
	public TUserInfo addOrder(TUserInfo userInfo,TOrderInfo orderInfo) throws Exception{
		if(userInfo==null){
			throw new RuntimeException("账户不存在");
		}
		if(userInfo.gettOrders()==null){
			userInfo.settOrders(new ArrayList<TOrderInfo>());
		}
		int index=getOrder(userInfo.gettOrders(),orderInfo.getOrder());
		if(index==-1){
			userInfo.gettOrders().add(orderInfo);
		}else {
			userInfo.gettOrders().set(index, orderInfo);
		}
		return userInfo;
	}
	
	/**
	 * 从现有的报单列表中获取报单
	 * @param tOrders
	 * @param order
	 * @return
	 */
	private int getOrder(List<TOrderInfo> tOrders,CThostFtdcOrderField order){
		if(order!=null&&tOrders!=null){
			for(int i=0;i<=tOrders.size();i++){
				if(compareOrder(tOrders.get(i).getOrder(),order)){
					return i;
				}
			}
		}
        return -1;
		
	}
	/**
	 * 比较两个报单是否相同
	 * @param order1
	 * @param order2
	 * @return
	 */
	private boolean compareOrder(CThostFtdcOrderField order1,CThostFtdcOrderField order2){
		if(order1.SessionID()==order2.SessionID()&&order1.FrontID()==order2.FrontID()&&StringUtils.isNotBlank(order1.getOrderRef())&&StringUtils.isNotBlank(order2.getOrderRef())&&order1.getOrderRef().equals(order2.getOrderRef()))
		    return true;
		return false;
		
	}
}
