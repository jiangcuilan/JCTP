package com.jctp.trader;

import com.ctp.thostftdcuserapistruct.CThostFtdcAccountregisterField;
import com.ctp.thostftdcuserapistruct.CThostFtdcBrokerTradingAlgosField;
import com.ctp.thostftdcuserapistruct.CThostFtdcBrokerTradingParamsField;
import com.ctp.thostftdcuserapistruct.CThostFtdcCFMMCTradingAccountKeyField;
import com.ctp.thostftdcuserapistruct.CThostFtdcCancelAccountField;
import com.ctp.thostftdcuserapistruct.CThostFtdcChangeAccountField;
import com.ctp.thostftdcuserapistruct.CThostFtdcContractBankField;
import com.ctp.thostftdcuserapistruct.CThostFtdcDepthMarketDataField;
import com.ctp.thostftdcuserapistruct.CThostFtdcEWarrantOffsetField;
import com.ctp.thostftdcuserapistruct.CThostFtdcErrorConditionalOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcExchangeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInstrumentCommissionRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInstrumentField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInstrumentMarginRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInstrumentStatusField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInvestorField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInvestorPositionCombineDetailField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInvestorPositionDetailField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInvestorPositionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcNoticeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcNotifyQueryAccountField;
import com.ctp.thostftdcuserapistruct.CThostFtdcOpenAccountField;
import com.ctp.thostftdcuserapistruct.CThostFtdcOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcParkedOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcParkedOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQueryMaxOrderVolumeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRemoveParkedOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRemoveParkedOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcReqQueryAccountField;
import com.ctp.thostftdcuserapistruct.CThostFtdcReqRepealField;
import com.ctp.thostftdcuserapistruct.CThostFtdcReqTransferField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRspAuthenticateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRspInfoField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRspRepealField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRspTransferField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRspUserLoginField;
import com.ctp.thostftdcuserapistruct.CThostFtdcSettlementInfoConfirmField;
import com.ctp.thostftdcuserapistruct.CThostFtdcSettlementInfoField;
import com.ctp.thostftdcuserapistruct.CThostFtdcTradeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcTradingAccountField;
import com.ctp.thostftdcuserapistruct.CThostFtdcTradingAccountPasswordUpdateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcTradingCodeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcTradingNoticeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcTradingNoticeInfoField;
import com.ctp.thostftdcuserapistruct.CThostFtdcTransferBankField;
import com.ctp.thostftdcuserapistruct.CThostFtdcTransferSerialField;
import com.ctp.thostftdcuserapistruct.CThostFtdcUserLogoutField;
import com.ctp.thostftdcuserapistruct.CThostFtdcUserPasswordUpdateField;

/**
 * CThostFtdcTraderSpi封装类
 * 
 * @author Hraink E-mail:Hraink@Gmail.com
 * @version 2013-1-27 上午12:05:18
 */

public class JCTPTraderSpi {
	
	/**
	 * 当客户端与交易后台建立起通信连接时（还未登录前），该方法被调用。
	 */
	public void onFrontConnected() {
	}
	
	/**
	 * 当客户端与交易后台通信连接断开时，该方法被调用。
	 * <pre>
	 * 当发生这个情况后，API会自动重新连接，客户端可不做处理。
	 * </pre>
	 * <pre>
	 * @param nReason 错误原因
	 *          0x1001 网络读失败
	 *          0x1002 网络写失败
	 *          0x2001 接收心跳超时
	 *          0x2002 发送心跳失败
	 *          0x2003 收到错误报文
	 *</pre>
	 */
	public void onFrontDisconnected(int nReason) {
	}
	
	/**
	 * 心跳超时警告。当长时间未收到报文时，该方法被调用。
	 * @param nTimeLapse 距离上次接收报文的时间
	 */
	public void onHeartBeatWarning(int nTimeLapse) {
	}	
	
	/**
	 * 客户端认证响应
	 * @param pRspAuthenticateField
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspAuthenticate(CThostFtdcRspAuthenticateField pRspAuthenticateField, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 登录请求响应
	 * @param pRspUserLogin
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 登出请求响应
	 * @param pUserLogout
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspUserLogout(CThostFtdcUserLogoutField pUserLogout, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 用户口令更新请求响应
	 * @param pUserPasswordUpdate
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspUserPasswordUpdate(CThostFtdcUserPasswordUpdateField pUserPasswordUpdate, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 资金账户口令更新请求响应
	 * @param pTradingAccountPasswordUpdate
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspTradingAccountPasswordUpdate(CThostFtdcTradingAccountPasswordUpdateField pTradingAccountPasswordUpdate, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 报单录入请求响应
	 * @param pInputOrder
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspOrderInsert(CThostFtdcInputOrderField pInputOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 预埋单录入请求响应
	 * @param pParkedOrder
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspParkedOrderInsert(CThostFtdcParkedOrderField pParkedOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 预埋撤单录入请求响应
	 * @param pParkedOrderAction
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspParkedOrderAction(CThostFtdcParkedOrderActionField pParkedOrderAction, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 报单操作请求响应
	 * @param pInputOrderAction
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspOrderAction(CThostFtdcInputOrderActionField pInputOrderAction, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 查询最大报单数量响应
	 * @param pQueryMaxOrderVolume
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQueryMaxOrderVolume(CThostFtdcQueryMaxOrderVolumeField pQueryMaxOrderVolume, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 投资者结算结果确认响应
	 * @param pSettlementInfoConfirm
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspSettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 删除预埋单响应
	 * @param pRemoveParkedOrder
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspRemoveParkedOrder(CThostFtdcRemoveParkedOrderField pRemoveParkedOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 删除预埋撤单响应
	 * @param pRemoveParkedOrderAction
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspRemoveParkedOrderAction(CThostFtdcRemoveParkedOrderActionField pRemoveParkedOrderAction, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询报单响应
	 * @param pOrder
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryOrder(CThostFtdcOrderField pOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询成交响应
	 * @param pTrade
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryTrade(CThostFtdcTradeField pTrade, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询投资者持仓响应
	 * @param pInvestorPosition
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryInvestorPosition(CThostFtdcInvestorPositionField pInvestorPosition, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询资金账户响应
	 * @param pTradingAccount
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryTradingAccount(CThostFtdcTradingAccountField pTradingAccount, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询投资者响应
	 * @param pInvestor
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryInvestor(CThostFtdcInvestorField pInvestor, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询交易编码响应
	 * @param pTradingCode
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryTradingCode(CThostFtdcTradingCodeField pTradingCode, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询合约保证金率响应
	 * @param pInstrumentMarginRate
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryInstrumentMarginRate(CThostFtdcInstrumentMarginRateField pInstrumentMarginRate, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询合约手续费率响应
	 * @param pInstrumentCommissionRate
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryInstrumentCommissionRate(CThostFtdcInstrumentCommissionRateField pInstrumentCommissionRate, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询交易所响应
	 * @param pExchange
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryExchange(CThostFtdcExchangeField pExchange, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询合约响应
	 * @param pInstrument
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryInstrument(CThostFtdcInstrumentField pInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询行情响应
	 * @param pDepthMarketData
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询投资者结算结果响应
	 * @param pSettlementInfo
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQrySettlementInfo(CThostFtdcSettlementInfoField pSettlementInfo, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询转帐银行响应
	 * @param pTransferBank
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryTransferBank(CThostFtdcTransferBankField pTransferBank, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询投资者持仓明细响应
	 * @param pInvestorPositionDetail
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryInvestorPositionDetail(CThostFtdcInvestorPositionDetailField pInvestorPositionDetail, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询客户通知响应
	 * @param pNotice
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryNotice(CThostFtdcNoticeField pNotice, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询结算信息确认响应
	 * @param pSettlementInfoConfirm
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQrySettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询投资者持仓明细响应
	 * @param pInvestorPositionCombineDetail
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryInvestorPositionCombineDetail(CThostFtdcInvestorPositionCombineDetailField pInvestorPositionCombineDetail, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 查询保证金监管系统经纪公司资金账户密钥响应
	 * @param pCFMMCTradingAccountKey
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryCFMMCTradingAccountKey(CThostFtdcCFMMCTradingAccountKeyField pCFMMCTradingAccountKey, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询仓单折抵信息响应
	 * @param pEWarrantOffset
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryEWarrantOffset(CThostFtdcEWarrantOffsetField pEWarrantOffset, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询转帐流水响应
	 * @param pTransferSerial
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryTransferSerial(CThostFtdcTransferSerialField pTransferSerial, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询银期签约关系响应
	 * @param pAccountregister
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryAccountregister(CThostFtdcAccountregisterField pAccountregister, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 错误应答
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 报单通知
	 * @param pOrder
	 */
	public void onRtnOrder(CThostFtdcOrderField pOrder) {
		
		
	}
	
	/**
	 * 成交通知
	 * @param pTrade
	 */
	public void onRtnTrade(CThostFtdcTradeField pTrade) {
	}
	
	/**
	 * 报单录入错误回报
	 * @param pInputOrder
	 * @param pRspInfo
	 */
	public void onErrRtnOrderInsert(CThostFtdcInputOrderField pInputOrder, CThostFtdcRspInfoField pRspInfo) {
	}
	
	/**
	 * 报单操作错误回报
	 * @param pOrderAction
	 * @param pRspInfo
	 */
	public void onErrRtnOrderAction(CThostFtdcOrderActionField pOrderAction, CThostFtdcRspInfoField pRspInfo) {
	}
	
	/**
	 * 合约交易状态通知
	 * @param pInstrumentStatus
	 */
	public void onRtnInstrumentStatus(CThostFtdcInstrumentStatusField pInstrumentStatus) {
	}
	
	/**
	 * 交易通知
	 * @param pTradingNoticeInfo
	 */
	public void onRtnTradingNotice(CThostFtdcTradingNoticeInfoField pTradingNoticeInfo) {
	}
	
	/**
	 * 提示条件单校验错误
	 * @param pErrorConditionalOrder
	 */
	public void onRtnErrorConditionalOrder(CThostFtdcErrorConditionalOrderField pErrorConditionalOrder) {
	}
	
	/**
	 * 请求查询签约银行响应
	 * @param pContractBank
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryContractBank(CThostFtdcContractBankField pContractBank, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询预埋单响应
	 * @param pParkedOrder
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryParkedOrder(CThostFtdcParkedOrderField pParkedOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * /请求查询预埋撤单响应
	 * @param pParkedOrderAction
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryParkedOrderAction(CThostFtdcParkedOrderActionField pParkedOrderAction, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询交易通知响应
	 * @param pTradingNotice
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryTradingNotice(CThostFtdcTradingNoticeField pTradingNotice, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询经纪公司交易参数响应
	 * @param pBrokerTradingParams
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryBrokerTradingParams(CThostFtdcBrokerTradingParamsField pBrokerTradingParams, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 请求查询经纪公司交易算法响应
	 * @param pBrokerTradingAlgos
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQryBrokerTradingAlgos(CThostFtdcBrokerTradingAlgosField pBrokerTradingAlgos, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 银行发起银行资金转期货通知
	 * @param pRspTransfer
	 */
	public void onRtnFromBankToFutureByBank(CThostFtdcRspTransferField pRspTransfer) {
	}
	
	/**
	 * 银行发起期货资金转银行通知
	 * @param pRspTransfer
	 */
	public void onRtnFromFutureToBankByBank(CThostFtdcRspTransferField pRspTransfer) {
	}
	
	/**
	 * 银行发起冲正银行转期货通知
	 * @param pRspRepeal
	 */
	public void onRtnRepealFromBankToFutureByBank(CThostFtdcRspRepealField pRspRepeal) {
	}
	
	/**
	 * 银行发起冲正期货转银行通知
	 * @param pRspRepeal
	 */
	public void onRtnRepealFromFutureToBankByBank(CThostFtdcRspRepealField pRspRepeal) {
	}
	
	/**
	 * 期货发起银行资金转期货通知
	 * @param pRspTransfer
	 */
	public void onRtnFromBankToFutureByFuture(CThostFtdcRspTransferField pRspTransfer) {
	}
	
	/**
	 * 期货发起期货资金转银行通知
	 * @param pRspTransfer
	 */
	public void onRtnFromFutureToBankByFuture(CThostFtdcRspTransferField pRspTransfer) {
	}
	
	/**
	 * 系统运行时期货端手工发起冲正银行转期货请求，银行处理完毕后报盘发回的通知
	 * @param pRspRepeal
	 */
	public void onRtnRepealFromBankToFutureByFutureManual(CThostFtdcRspRepealField pRspRepeal) {
	}
	
	/**
	 * 系统运行时期货端手工发起冲正期货转银行请求，银行处理完毕后报盘发回的通知
	 * @param pRspRepeal
	 */
	public void onRtnRepealFromFutureToBankByFutureManual(CThostFtdcRspRepealField pRspRepeal) {
	}
	
	/**
	 * 期货发起查询银行余额通知
	 * @param pNotifyQueryAccount
	 */
	public void onRtnQueryBankBalanceByFuture(CThostFtdcNotifyQueryAccountField pNotifyQueryAccount) {
	}
	
	/**
	 * 期货发起银行资金转期货错误回报
	 * @param pReqTransfer
	 * @param pRspInfo
	 */
	public void onErrRtnBankToFutureByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo) {
	}
	
	/**
	 * 期货发起期货资金转银行错误回报
	 * @param pReqTransfer
	 * @param pRspInfo
	 */
	public void onErrRtnFutureToBankByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo) {
	}
	
	/**
	 * 系统运行时期货端手工发起冲正银行转期货错误回报
	 * @param pReqRepeal
	 * @param pRspInfo
	 */
	public void onErrRtnRepealBankToFutureByFutureManual(CThostFtdcReqRepealField pReqRepeal, CThostFtdcRspInfoField pRspInfo) {
	}
	
	/**
	 * 系统运行时期货端手工发起冲正期货转银行错误回报
	 * @param pReqRepeal
	 * @param pRspInfo
	 */
	public void onErrRtnRepealFutureToBankByFutureManual(CThostFtdcReqRepealField pReqRepeal, CThostFtdcRspInfoField pRspInfo) {
	}
	
	/**
	 * 期货发起查询银行余额错误回报
	 * @param pReqQueryAccount
	 * @param pRspInfo
	 */
	public void onErrRtnQueryBankBalanceByFuture(CThostFtdcReqQueryAccountField pReqQueryAccount, CThostFtdcRspInfoField pRspInfo) {
	}
	
	/**
	 * 期货发起冲正银行转期货请求，银行处理完毕后报盘发回的通知
	 * @param pRspRepeal
	 */
	public void onRtnRepealFromBankToFutureByFuture(CThostFtdcRspRepealField pRspRepeal) {
	}
	
	/**
	 * 期货发起冲正期货转银行请求，银行处理完毕后报盘发回的通知
	 * @param pRspRepeal
	 */
	public void onRtnRepealFromFutureToBankByFuture(CThostFtdcRspRepealField pRspRepeal) {
	}
	
	/**
	 * 期货发起银行资金转期货应答
	 * @param pReqTransfer
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspFromBankToFutureByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 期货发起期货资金转银行应答
	 * @param pReqTransfer
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspFromFutureToBankByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 期货发起查询银行余额应答
	 * @param pReqQueryAccount
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspQueryBankAccountMoneyByFuture(CThostFtdcReqQueryAccountField pReqQueryAccount, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 银行发起银期开户通知
	 * @param pOpenAccount
	 */
	public void onRtnOpenAccountByBank(CThostFtdcOpenAccountField pOpenAccount) {
	}
	
	/**
	 * 银行发起银期销户通知
	 * @param pCancelAccount
	 */
	public void onRtnCancelAccountByBank(CThostFtdcCancelAccountField pCancelAccount) {
	}
	
	/**
	 * 银行发起变更银行账号通知
	 * @param pChangeAccount
	 */
	public void onRtnChangeAccountByBank(CThostFtdcChangeAccountField pChangeAccount) {
	}
}
