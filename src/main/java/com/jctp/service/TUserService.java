package com.jctp.service;

import java.io.File;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.ctp.thostftdcuserapidatatype.ThostFtdcUserApiDataTypeLibrary.THOST_TE_RESUME_TYPE;
import com.ctp.thostftdcuserapistruct.CThostFtdcQrySettlementInfoConfirmField;
import com.ctp.thostftdcuserapistruct.CThostFtdcReqUserLoginField;
import com.jctp.model.TUserInfo;
import com.jctp.trader.JCTPTraderApi;
import com.jctp.trader.MyJCTPTraderSpi;
import com.jctp.util.Constants;
import com.jctp.util.JmsUtil;
import com.jctp.util.TCache;
import com.min.DateFormatUtil;

@Service
public class TUserService {


	@Resource
	private JmsUtil jmsUtil;

	/**
	 * 初始化用户
	 * 
	 * @param tUser
	 * @return
	 * @throws Exception
	 */
	public boolean initUser(TUserInfo tUser) throws Exception {
		// 如果账户已经连接，则断开连接

		if (tUser != null && tUser.getTrApi() != null) {
			JCTPTraderApi trApi = tUser.getTrApi();
			trApi.release();
		}
		if (tUser == null || StringUtils.isBlank(tUser.getHost()) || StringUtils.isBlank(tUser.getUser())
				|| StringUtils.isBlank(tUser.getPass()) || StringUtils.isBlank(tUser.getBrokerId())) {
			jmsUtil.log(tUser, "账户信息不全，无法初始化登录！");
			return false;
		}
		try {
			String path = getUserPath(tUser.getUser());
			jmsUtil.log(tUser, "初始化登录中...");
			tUser.setLastTick(DateFormatUtil.currentTimeStamp());
			tUser.setLoginState(Constants.isLogining);
			JCTPTraderApi traderApi = JCTPTraderApi.createFtdcTraderApi(path);
			if (traderApi != null) {
				tUser.setTrApi(traderApi);
				MyJCTPTraderSpi traderSpi = new MyJCTPTraderSpi(traderApi);
				traderSpi.setUserId(tUser.getId());
				traderSpi.setTraderApi(traderApi);
				traderSpi.setJmsUtil(jmsUtil);
				tUser.setTrSpi(traderSpi);
				traderApi.registerSpi(traderSpi);
				traderApi.registerFront(tUser.getHost());
				traderApi.subscribePublicTopic(THOST_TE_RESUME_TYPE.THOST_TERT_QUICK);
				traderApi.subscribePrivateTopic(THOST_TE_RESUME_TYPE.THOST_TERT_QUICK);
				traderApi.init();
				return true;
			} else {
				jmsUtil.log(tUser, "服务器创建失败！");
			}
		} catch (Exception e) {
			jmsUtil.log(tUser, "登录失败！");
		}

		return false;
	}

	/**
	 * 用户登录
	 * 
	 * @param tUser
	 * @return
	 * @throws Exception
	 */
	public void login(int userId) throws Exception {
		TUserInfo tUser = TCache.getUser(userId);
		if (tUser == null || tUser.getLoginState() != Constants.isConnected) {
			jmsUtil.log(tUser, "服务器连接失败！");
			return;
		}
		tUser.check();
		tUser.setKey(Constants.w_Login, true);
		CThostFtdcReqUserLoginField user = new CThostFtdcReqUserLoginField();
		user.setUserID(tUser.getUser());
		user.setPassword(tUser.getPass());
		user.setBrokerID(tUser.getBrokerId());
		user.setUserProductInfo(tUser.getProdInfo());
		JCTPTraderApi traderApi = tUser.getTrApi();
		int result = traderApi.reqUserLogin(user, Constants.w_Login);
		if (result != 0) {
			tUser.setKey(Constants.w_Login, false);
			jmsUtil.log(tUser, "登录失败," + TCache.getError(result));
		} else {
			tUser.setLoginState(Constants.isLogining);
			jmsUtil.log(tUser, "登录指令已发送,等待回馈!");
		}
	}

	/**
	 * 查询交易日
	 * @param userId
	 */
	public void queryTradeDate(int userId) {
		TUserInfo tUser = TCache.getUser(userId);
		if (tUser == null || tUser.getLoginState() != Constants.isLogined
				|| tUser.getTrSpi() == null || tUser.getTrApi() == null) {
			return;
		}

		if (StringUtils.isBlank(tUser.getTrSpi().getTradeDate())) {
			String tradeDate = tUser.getTrApi().getTradingDay();
			tUser.getTrSpi().setTradeDate(tradeDate);
			jmsUtil.log(tUser, "当前交易日:" + tradeDate);
		}

	}
	/**
	 * 查询交易日
	 * @param userId
	 */
	public void queryConfirmDate(int userId) {
		TUserInfo tUser = TCache.getUser(userId);
		if (tUser == null || tUser.getLoginState() != Constants.isLogined
				|| tUser.getTrSpi() == null  || tUser.getTrApi() == null) {
			return;
		}
		if (tUser.getLoginState() != Constants.isLogined)
			return;
		CThostFtdcQrySettlementInfoConfirmField pQrySettlementInfoConfirm = new CThostFtdcQrySettlementInfoConfirmField();
		tUser.getTrApi().reqQrySettlementInfoConfirm(pQrySettlementInfoConfirm, 100);
	}
	
	
	private String getUserPath(String userName) {
		String path = "Data/";
		File file = new File(path);
		// 如果文件夹不存在则创建
		if (!file.exists() && !file.isDirectory())
			file.mkdir();
		path += userName + "/";
		file = new File(path);
		if (!file.exists() && !file.isDirectory())
			file.mkdir();
		return path;
	}

}
