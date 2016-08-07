package com.jctp.model;

import com.ctp.thostftdcuserapistruct.CThostFtdcOrderField;

/**
 * 报单信息
 * @author Administrator
 *
 */
public class TOrderInfo {

	//跟随的主账户的userId	
	private String userId;
	//跟随的主账户的FrontId
	private int frontId;
	//跟随的主账户的sessionId
	private int sessionId;
	private int lastTime;
	//跟随的主账户的orderRef
	private String orderRef;
	//跟谁订单
	CThostFtdcOrderField  order;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getFrontId() {
		return frontId;
	}
	public void setFrontId(int frontId) {
		this.frontId = frontId;
	}
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	public int getLastTime() {
		return lastTime;
	}
	public void setLastTime(int lastTime) {
		this.lastTime = lastTime;
	}
	public String getOrderRef() {
		return orderRef;
	}
	public void setOrderRef(String orderRef) {
		this.orderRef = orderRef;
	}
	public CThostFtdcOrderField getOrder() {
		return order;
	}
	public void setOrder(CThostFtdcOrderField order) {
		this.order = order;
	}
}
