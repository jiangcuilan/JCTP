package com.jctp.trader;

import org.apache.commons.lang3.StringUtils;

import com.ctp.thostftdcuserapistruct.CThostFtdcOrderField;

import com.ctp.thostftdcuserapistruct.CThostFtdcRspInfoField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRspUserLoginField;
import com.ctp.thostftdcuserapistruct.CThostFtdcSettlementInfoConfirmField;
import com.jctp.model.TOrderInfo;
import com.jctp.model.TUserInfo;
import com.jctp.service.TOrderService;
import com.jctp.util.Constants;
import com.jctp.util.JmsUtil;
import com.jctp.util.LogUtil;
import com.jctp.util.TCache;

public class MyJCTPTraderSpi extends JCTPTraderSpi {

	JCTPTraderApi traderApi;
	private int userId;
	private TOrderService tOrderService;
	private JmsUtil jmsUtil;
	private String tradeDate;

	@Override
	public void onRtnOrder(CThostFtdcOrderField pOrder) {
		TUserInfo tUser = TCache.getUser(userId);
		LogUtil.info("i'm on return order.....................");
		if (tUser == null || pOrder == null)
			return;
		TOrderInfo tOrder = new TOrderInfo();
		tOrder.setOrder(pOrder);
		try {
			tOrderService.addOrder(tUser, tOrder);
			// 表示是从账户

			if ("0".equals(tUser.getTag())) {
				if (pOrder.OrderStatus() == 2 || pOrder.OrderStatus() == 5)
					tUser.setKey(Constants.w_DrawOrder, false);
				else
					tUser.setKey(Constants.w_Order, false);
			}
			LogUtil.info(String.valueOf(pOrder.OrderStatus()));
			if ("1".equals(tUser.getTag())) {
				if (pOrder.OrderStatus() == 0 || pOrder.OrderStatus() == 1 || pOrder.OrderStatus() == 2
						|| pOrder.OrderStatus() == 3 || pOrder.OrderStatus() == 5 || pOrder.OrderStatus() == 97)
					return;
					//DoOrderAdd(User,Order);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void onFrontConnected() {
		TUserInfo tUser = TCache.getUser(userId);
		if (tUser == null) {
			jmsUtil.log("账户不存在!");
			return;
		}
		jmsUtil.log(tUser, "连接服务器成功!");
		if (tUser.getLoginState() == Constants.isLogining) {
			tUser.setLoginState(Constants.isConnected);
			jmsUtil.doLogin(userId);
		}
		System.out.println(userId+":"+Thread.currentThread().getName());
		
	}

	@Override
	public void onFrontDisconnected(int nReason) {
		TUserInfo tUser = TCache.getUser(userId);
		if (tUser != null)
			jmsUtil.log(tUser, "连接已断开!");
		System.out.println(userId+":"+Thread.currentThread().getName());
	}

	@Override
	public void onRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		TUserInfo tUser = TCache.getUser(userId);
		jmsUtil.log(tUser, "登录成功！");
		System.out.println(userId+":"+Thread.currentThread().getName());
		if (tUser == null)
			return;
		if (pRspUserLogin != null && pRspInfo.ErrorID() == 0) {
			tUser.setLoginState(Constants.isLogined);
			tUser.setFrontId(pRspUserLogin.getFrontID());
			tUser.setSessionId(pRspUserLogin.getSessionID());
			tUser.setOrderRef(pRspUserLogin.getMaxOrderRef());
			jmsUtil.log(tUser, "登录成功！");
			jmsUtil.doQueryTradeDate(userId);
			jmsUtil.doQueryConfirmDate(userId);
			
		} else {
			if (pRspUserLogin != null) {
				tUser.setLoginState(Constants.isLoginFail);
				jmsUtil.log(tUser, "登录失败," + pRspInfo.getErrorMsg());
			}
		}
		if (bIsLast)
			tUser.setKey(nRequestID, false);
	}




	@Override
	public void onRspQrySettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		TUserInfo tUser = TCache.getUser(userId);
		if (tUser == null || pSettlementInfoConfirm == null || StringUtils.isBlank(tradeDate))
			return;
		tUser.setIsConfirmDate(tradeDate.equals(pSettlementInfoConfirm.ConfirmDate().toString()));
		jmsUtil.log(tUser, "账单确认日期:" + pSettlementInfoConfirm.ConfirmDate());
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public JCTPTraderApi getTraderApi() {
		return traderApi;
	}

	public void setTraderApi(JCTPTraderApi traderApi) {
		this.traderApi = traderApi;
	}

	public TOrderService gettOrderService() {
		return tOrderService;
	}

	public void settOrderService(TOrderService tOrderService) {
		this.tOrderService = tOrderService;
	}

	public JmsUtil getJmsUtil() {
		return jmsUtil;
	}

	public void setJmsUtil(JmsUtil jmsUtil) {
		this.jmsUtil = jmsUtil;
	}

	public MyJCTPTraderSpi(JCTPTraderApi traderApi) {
		this.traderApi = traderApi;
	}

	public String getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}
}
