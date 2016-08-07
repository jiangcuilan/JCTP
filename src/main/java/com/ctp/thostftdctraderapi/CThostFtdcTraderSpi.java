package com.ctp.thostftdctraderapi;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;

import com.ctp.thostftdcuserapistruct.CThostFtdcAccountregisterField;
import com.ctp.thostftdcuserapistruct.CThostFtdcBatchOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcBrokerTradingAlgosField;
import com.ctp.thostftdcuserapistruct.CThostFtdcBrokerTradingParamsField;
import com.ctp.thostftdcuserapistruct.CThostFtdcBulletinField;
import com.ctp.thostftdcuserapistruct.CThostFtdcCFMMCTradingAccountKeyField;
import com.ctp.thostftdcuserapistruct.CThostFtdcCFMMCTradingAccountTokenField;
import com.ctp.thostftdcuserapistruct.CThostFtdcCancelAccountField;
import com.ctp.thostftdcuserapistruct.CThostFtdcChangeAccountField;
import com.ctp.thostftdcuserapistruct.CThostFtdcCombActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcCombInstrumentGuardField;
import com.ctp.thostftdcuserapistruct.CThostFtdcContractBankField;
import com.ctp.thostftdcuserapistruct.CThostFtdcDepthMarketDataField;
import com.ctp.thostftdcuserapistruct.CThostFtdcEWarrantOffsetField;
import com.ctp.thostftdcuserapistruct.CThostFtdcErrorConditionalOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcExchangeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcExchangeMarginRateAdjustField;
import com.ctp.thostftdcuserapistruct.CThostFtdcExchangeMarginRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcExchangeRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcExecOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcExecOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcForQuoteField;
import com.ctp.thostftdcuserapistruct.CThostFtdcForQuoteRspField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputBatchOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputCombActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputExecOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputExecOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputForQuoteField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputQuoteActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputQuoteField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInstrumentCommissionRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInstrumentField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInstrumentMarginRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInstrumentOrderCommRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInstrumentStatusField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInvestorField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInvestorPositionCombineDetailField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInvestorPositionDetailField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInvestorPositionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInvestorProductGroupMarginField;
import com.ctp.thostftdcuserapistruct.CThostFtdcMMInstrumentCommissionRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcMMOptionInstrCommRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcNoticeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcNotifyQueryAccountField;
import com.ctp.thostftdcuserapistruct.CThostFtdcOpenAccountField;
import com.ctp.thostftdcuserapistruct.CThostFtdcOptionInstrCommRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcOptionInstrTradeCostField;
import com.ctp.thostftdcuserapistruct.CThostFtdcOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcParkedOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcParkedOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcProductExchRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcProductField;
import com.ctp.thostftdcuserapistruct.CThostFtdcProductGroupField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQueryCFMMCTradingAccountTokenField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQueryMaxOrderVolumeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQuoteActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQuoteField;
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
import com.ctp.thostftdcuserapistruct.CThostFtdcSecAgentACIDMapField;
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
 * <i>native declaration : ThostFtdcTraderApi.h:12</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thosttraderapi") 
public class CThostFtdcTraderSpi extends CPPObject {
	/**
	 * \u5f53\u5ba2\u6237\u7aef\u4e0e\u4ea4\u6613\u540e\u53f0\u5efa\u7acb\u8d77\u901a\u4fe1\u8fde\u63a5\u65f6\uff08\u8fd8\u672a\u767b\u5f55\u524d\uff09\uff0c\u8be5\u65b9\u6cd5\u88ab\u8c03\u7528\u3002<br>
	 * Original signature : <code>void OnFrontConnected()</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:16</i>
	 */
	@Virtual(0) 
	native public void OnFrontConnected();
	/**
	 * 0x2003 \u6536\u5230\u9519\u8bef\u62a5\u6587<br>
	 * Original signature : <code>void OnFrontDisconnected(int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:25</i>
	 */
	@Virtual(1) 
	native public void OnFrontDisconnected(int nReason);
	/**
	 * @param nTimeLapse \u8ddd\u79bb\u4e0a\u6b21\u63a5\u6536\u62a5\u6587\u7684\u65f6\u95f4<br>
	 * Original signature : <code>void OnHeartBeatWarning(int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:29</i>
	 */
	@Virtual(2) 
	native public void OnHeartBeatWarning(int nTimeLapse);
	/**
	 * \u5ba2\u6237\u7aef\u8ba4\u8bc1\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspAuthenticate(CThostFtdcRspAuthenticateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:32</i>
	 */
	@Virtual(3) 
	public void OnRspAuthenticate(Pointer<CThostFtdcRspAuthenticateField > pRspAuthenticateField, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspAuthenticate(Pointer.getPeer(pRspAuthenticateField), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(3) 
	protected native void OnRspAuthenticate(@Ptr long pRspAuthenticateField, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u767b\u5f55\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspUserLogin(CThostFtdcRspUserLoginField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:36</i>
	 */
	@Virtual(4) 
	public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField > pRspUserLogin, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspUserLogin(Pointer.getPeer(pRspUserLogin), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(4) 
	protected native void OnRspUserLogin(@Ptr long pRspUserLogin, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u767b\u51fa\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspUserLogout(CThostFtdcUserLogoutField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:39</i>
	 */
	@Virtual(5) 
	public void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField > pUserLogout, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspUserLogout(Pointer.getPeer(pUserLogout), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(5) 
	protected native void OnRspUserLogout(@Ptr long pUserLogout, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u7528\u6237\u53e3\u4ee4\u66f4\u65b0\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspUserPasswordUpdate(CThostFtdcUserPasswordUpdateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:42</i>
	 */
	@Virtual(6) 
	public void OnRspUserPasswordUpdate(Pointer<CThostFtdcUserPasswordUpdateField > pUserPasswordUpdate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspUserPasswordUpdate(Pointer.getPeer(pUserPasswordUpdate), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(6) 
	protected native void OnRspUserPasswordUpdate(@Ptr long pUserPasswordUpdate, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8d44\u91d1\u8d26\u6237\u53e3\u4ee4\u66f4\u65b0\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspTradingAccountPasswordUpdate(CThostFtdcTradingAccountPasswordUpdateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:45</i>
	 */
	@Virtual(7) 
	public void OnRspTradingAccountPasswordUpdate(Pointer<CThostFtdcTradingAccountPasswordUpdateField > pTradingAccountPasswordUpdate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspTradingAccountPasswordUpdate(Pointer.getPeer(pTradingAccountPasswordUpdate), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(7) 
	protected native void OnRspTradingAccountPasswordUpdate(@Ptr long pTradingAccountPasswordUpdate, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u62a5\u5355\u5f55\u5165\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspOrderInsert(CThostFtdcInputOrderField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:48</i>
	 */
	@Virtual(8) 
	public void OnRspOrderInsert(Pointer<CThostFtdcInputOrderField > pInputOrder, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspOrderInsert(Pointer.getPeer(pInputOrder), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(8) 
	protected native void OnRspOrderInsert(@Ptr long pInputOrder, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u9884\u57cb\u5355\u5f55\u5165\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspParkedOrderInsert(CThostFtdcParkedOrderField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:51</i>
	 */
	@Virtual(9) 
	public void OnRspParkedOrderInsert(Pointer<CThostFtdcParkedOrderField > pParkedOrder, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspParkedOrderInsert(Pointer.getPeer(pParkedOrder), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(9) 
	protected native void OnRspParkedOrderInsert(@Ptr long pParkedOrder, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u9884\u57cb\u64a4\u5355\u5f55\u5165\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspParkedOrderAction(CThostFtdcParkedOrderActionField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:54</i>
	 */
	@Virtual(10) 
	public void OnRspParkedOrderAction(Pointer<CThostFtdcParkedOrderActionField > pParkedOrderAction, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspParkedOrderAction(Pointer.getPeer(pParkedOrderAction), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(10) 
	protected native void OnRspParkedOrderAction(@Ptr long pParkedOrderAction, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u62a5\u5355\u64cd\u4f5c\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspOrderAction(CThostFtdcInputOrderActionField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:57</i>
	 */
	@Virtual(11) 
	public void OnRspOrderAction(Pointer<CThostFtdcInputOrderActionField > pInputOrderAction, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspOrderAction(Pointer.getPeer(pInputOrderAction), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(11) 
	protected native void OnRspOrderAction(@Ptr long pInputOrderAction, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u67e5\u8be2\u6700\u5927\u62a5\u5355\u6570\u91cf\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQueryMaxOrderVolume(CThostFtdcQueryMaxOrderVolumeField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:60</i>
	 */
	@Virtual(12) 
	public void OnRspQueryMaxOrderVolume(Pointer<CThostFtdcQueryMaxOrderVolumeField > pQueryMaxOrderVolume, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQueryMaxOrderVolume(Pointer.getPeer(pQueryMaxOrderVolume), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(12) 
	protected native void OnRspQueryMaxOrderVolume(@Ptr long pQueryMaxOrderVolume, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u6295\u8d44\u8005\u7ed3\u7b97\u7ed3\u679c\u786e\u8ba4\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspSettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:63</i>
	 */
	@Virtual(13) 
	public void OnRspSettlementInfoConfirm(Pointer<CThostFtdcSettlementInfoConfirmField > pSettlementInfoConfirm, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspSettlementInfoConfirm(Pointer.getPeer(pSettlementInfoConfirm), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(13) 
	protected native void OnRspSettlementInfoConfirm(@Ptr long pSettlementInfoConfirm, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u5220\u9664\u9884\u57cb\u5355\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspRemoveParkedOrder(CThostFtdcRemoveParkedOrderField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:66</i>
	 */
	@Virtual(14) 
	public void OnRspRemoveParkedOrder(Pointer<CThostFtdcRemoveParkedOrderField > pRemoveParkedOrder, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspRemoveParkedOrder(Pointer.getPeer(pRemoveParkedOrder), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(14) 
	protected native void OnRspRemoveParkedOrder(@Ptr long pRemoveParkedOrder, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u5220\u9664\u9884\u57cb\u64a4\u5355\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspRemoveParkedOrderAction(CThostFtdcRemoveParkedOrderActionField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:69</i>
	 */
	@Virtual(15) 
	public void OnRspRemoveParkedOrderAction(Pointer<CThostFtdcRemoveParkedOrderActionField > pRemoveParkedOrderAction, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspRemoveParkedOrderAction(Pointer.getPeer(pRemoveParkedOrderAction), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(15) 
	protected native void OnRspRemoveParkedOrderAction(@Ptr long pRemoveParkedOrderAction, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u6267\u884c\u5ba3\u544a\u5f55\u5165\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspExecOrderInsert(CThostFtdcInputExecOrderField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:72</i>
	 */
	@Virtual(16) 
	public void OnRspExecOrderInsert(Pointer<CThostFtdcInputExecOrderField > pInputExecOrder, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspExecOrderInsert(Pointer.getPeer(pInputExecOrder), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(16) 
	protected native void OnRspExecOrderInsert(@Ptr long pInputExecOrder, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u6267\u884c\u5ba3\u544a\u64cd\u4f5c\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspExecOrderAction(CThostFtdcInputExecOrderActionField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:75</i>
	 */
	@Virtual(17) 
	public void OnRspExecOrderAction(Pointer<CThostFtdcInputExecOrderActionField > pInputExecOrderAction, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspExecOrderAction(Pointer.getPeer(pInputExecOrderAction), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(17) 
	protected native void OnRspExecOrderAction(@Ptr long pInputExecOrderAction, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8be2\u4ef7\u5f55\u5165\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspForQuoteInsert(CThostFtdcInputForQuoteField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:78</i>
	 */
	@Virtual(18) 
	public void OnRspForQuoteInsert(Pointer<CThostFtdcInputForQuoteField > pInputForQuote, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspForQuoteInsert(Pointer.getPeer(pInputForQuote), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(18) 
	protected native void OnRspForQuoteInsert(@Ptr long pInputForQuote, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u62a5\u4ef7\u5f55\u5165\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQuoteInsert(CThostFtdcInputQuoteField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:81</i>
	 */
	@Virtual(19) 
	public void OnRspQuoteInsert(Pointer<CThostFtdcInputQuoteField > pInputQuote, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQuoteInsert(Pointer.getPeer(pInputQuote), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(19) 
	protected native void OnRspQuoteInsert(@Ptr long pInputQuote, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u62a5\u4ef7\u64cd\u4f5c\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQuoteAction(CThostFtdcInputQuoteActionField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:84</i>
	 */
	@Virtual(20) 
	public void OnRspQuoteAction(Pointer<CThostFtdcInputQuoteActionField > pInputQuoteAction, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQuoteAction(Pointer.getPeer(pInputQuoteAction), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(20) 
	protected native void OnRspQuoteAction(@Ptr long pInputQuoteAction, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u6279\u91cf\u62a5\u5355\u64cd\u4f5c\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspBatchOrderAction(CThostFtdcInputBatchOrderActionField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:87</i>
	 */
	@Virtual(21) 
	public void OnRspBatchOrderAction(Pointer<CThostFtdcInputBatchOrderActionField > pInputBatchOrderAction, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspBatchOrderAction(Pointer.getPeer(pInputBatchOrderAction), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(21) 
	protected native void OnRspBatchOrderAction(@Ptr long pInputBatchOrderAction, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u7533\u8bf7\u7ec4\u5408\u5f55\u5165\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspCombActionInsert(CThostFtdcInputCombActionField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:90</i>
	 */
	@Virtual(22) 
	public void OnRspCombActionInsert(Pointer<CThostFtdcInputCombActionField > pInputCombAction, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspCombActionInsert(Pointer.getPeer(pInputCombAction), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(22) 
	protected native void OnRspCombActionInsert(@Ptr long pInputCombAction, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u62a5\u5355\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryOrder(CThostFtdcOrderField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:93</i>
	 */
	@Virtual(23) 
	public void OnRspQryOrder(Pointer<CThostFtdcOrderField > pOrder, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryOrder(Pointer.getPeer(pOrder), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(23) 
	protected native void OnRspQryOrder(@Ptr long pOrder, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6210\u4ea4\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryTrade(CThostFtdcTradeField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:96</i>
	 */
	@Virtual(24) 
	public void OnRspQryTrade(Pointer<CThostFtdcTradeField > pTrade, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryTrade(Pointer.getPeer(pTrade), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(24) 
	protected native void OnRspQryTrade(@Ptr long pTrade, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6295\u8d44\u8005\u6301\u4ed3\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryInvestorPosition(CThostFtdcInvestorPositionField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:99</i>
	 */
	@Virtual(25) 
	public void OnRspQryInvestorPosition(Pointer<CThostFtdcInvestorPositionField > pInvestorPosition, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryInvestorPosition(Pointer.getPeer(pInvestorPosition), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(25) 
	protected native void OnRspQryInvestorPosition(@Ptr long pInvestorPosition, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u8d44\u91d1\u8d26\u6237\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryTradingAccount(CThostFtdcTradingAccountField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:102</i>
	 */
	@Virtual(26) 
	public void OnRspQryTradingAccount(Pointer<CThostFtdcTradingAccountField > pTradingAccount, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryTradingAccount(Pointer.getPeer(pTradingAccount), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(26) 
	protected native void OnRspQryTradingAccount(@Ptr long pTradingAccount, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6295\u8d44\u8005\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryInvestor(CThostFtdcInvestorField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:105</i>
	 */
	@Virtual(27) 
	public void OnRspQryInvestor(Pointer<CThostFtdcInvestorField > pInvestor, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryInvestor(Pointer.getPeer(pInvestor), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(27) 
	protected native void OnRspQryInvestor(@Ptr long pInvestor, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea4\u6613\u7f16\u7801\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryTradingCode(CThostFtdcTradingCodeField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:108</i>
	 */
	@Virtual(28) 
	public void OnRspQryTradingCode(Pointer<CThostFtdcTradingCodeField > pTradingCode, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryTradingCode(Pointer.getPeer(pTradingCode), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(28) 
	protected native void OnRspQryTradingCode(@Ptr long pTradingCode, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u5408\u7ea6\u4fdd\u8bc1\u91d1\u7387\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryInstrumentMarginRate(CThostFtdcInstrumentMarginRateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:111</i>
	 */
	@Virtual(29) 
	public void OnRspQryInstrumentMarginRate(Pointer<CThostFtdcInstrumentMarginRateField > pInstrumentMarginRate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryInstrumentMarginRate(Pointer.getPeer(pInstrumentMarginRate), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(29) 
	protected native void OnRspQryInstrumentMarginRate(@Ptr long pInstrumentMarginRate, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u5408\u7ea6\u624b\u7eed\u8d39\u7387\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryInstrumentCommissionRate(CThostFtdcInstrumentCommissionRateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:114</i>
	 */
	@Virtual(30) 
	public void OnRspQryInstrumentCommissionRate(Pointer<CThostFtdcInstrumentCommissionRateField > pInstrumentCommissionRate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryInstrumentCommissionRate(Pointer.getPeer(pInstrumentCommissionRate), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(30) 
	protected native void OnRspQryInstrumentCommissionRate(@Ptr long pInstrumentCommissionRate, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea4\u6613\u6240\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryExchange(CThostFtdcExchangeField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:117</i>
	 */
	@Virtual(31) 
	public void OnRspQryExchange(Pointer<CThostFtdcExchangeField > pExchange, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryExchange(Pointer.getPeer(pExchange), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(31) 
	protected native void OnRspQryExchange(@Ptr long pExchange, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea7\u54c1\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryProduct(CThostFtdcProductField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:120</i>
	 */
	@Virtual(32) 
	public void OnRspQryProduct(Pointer<CThostFtdcProductField > pProduct, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryProduct(Pointer.getPeer(pProduct), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(32) 
	protected native void OnRspQryProduct(@Ptr long pProduct, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u5408\u7ea6\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryInstrument(CThostFtdcInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:123</i>
	 */
	@Virtual(33) 
	public void OnRspQryInstrument(Pointer<CThostFtdcInstrumentField > pInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryInstrument(Pointer.getPeer(pInstrument), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(33) 
	protected native void OnRspQryInstrument(@Ptr long pInstrument, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u884c\u60c5\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryDepthMarketData(CThostFtdcDepthMarketDataField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:126</i>
	 */
	@Virtual(34) 
	public void OnRspQryDepthMarketData(Pointer<CThostFtdcDepthMarketDataField > pDepthMarketData, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryDepthMarketData(Pointer.getPeer(pDepthMarketData), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(34) 
	protected native void OnRspQryDepthMarketData(@Ptr long pDepthMarketData, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6295\u8d44\u8005\u7ed3\u7b97\u7ed3\u679c\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQrySettlementInfo(CThostFtdcSettlementInfoField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:129</i>
	 */
	@Virtual(35) 
	public void OnRspQrySettlementInfo(Pointer<CThostFtdcSettlementInfoField > pSettlementInfo, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQrySettlementInfo(Pointer.getPeer(pSettlementInfo), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(35) 
	protected native void OnRspQrySettlementInfo(@Ptr long pSettlementInfo, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u8f6c\u5e10\u94f6\u884c\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryTransferBank(CThostFtdcTransferBankField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:132</i>
	 */
	@Virtual(36) 
	public void OnRspQryTransferBank(Pointer<CThostFtdcTransferBankField > pTransferBank, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryTransferBank(Pointer.getPeer(pTransferBank), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(36) 
	protected native void OnRspQryTransferBank(@Ptr long pTransferBank, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6295\u8d44\u8005\u6301\u4ed3\u660e\u7ec6\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryInvestorPositionDetail(CThostFtdcInvestorPositionDetailField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:135</i>
	 */
	@Virtual(37) 
	public void OnRspQryInvestorPositionDetail(Pointer<CThostFtdcInvestorPositionDetailField > pInvestorPositionDetail, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryInvestorPositionDetail(Pointer.getPeer(pInvestorPositionDetail), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(37) 
	protected native void OnRspQryInvestorPositionDetail(@Ptr long pInvestorPositionDetail, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u5ba2\u6237\u901a\u77e5\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryNotice(CThostFtdcNoticeField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:138</i>
	 */
	@Virtual(38) 
	public void OnRspQryNotice(Pointer<CThostFtdcNoticeField > pNotice, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryNotice(Pointer.getPeer(pNotice), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(38) 
	protected native void OnRspQryNotice(@Ptr long pNotice, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u7ed3\u7b97\u4fe1\u606f\u786e\u8ba4\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQrySettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:141</i>
	 */
	@Virtual(39) 
	public void OnRspQrySettlementInfoConfirm(Pointer<CThostFtdcSettlementInfoConfirmField > pSettlementInfoConfirm, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQrySettlementInfoConfirm(Pointer.getPeer(pSettlementInfoConfirm), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(39) 
	protected native void OnRspQrySettlementInfoConfirm(@Ptr long pSettlementInfoConfirm, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6295\u8d44\u8005\u6301\u4ed3\u660e\u7ec6\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryInvestorPositionCombineDetail(CThostFtdcInvestorPositionCombineDetailField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:144</i>
	 */
	@Virtual(40) 
	public void OnRspQryInvestorPositionCombineDetail(Pointer<CThostFtdcInvestorPositionCombineDetailField > pInvestorPositionCombineDetail, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryInvestorPositionCombineDetail(Pointer.getPeer(pInvestorPositionCombineDetail), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(40) 
	protected native void OnRspQryInvestorPositionCombineDetail(@Ptr long pInvestorPositionCombineDetail, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u67e5\u8be2\u4fdd\u8bc1\u91d1\u76d1\u7ba1\u7cfb\u7edf\u7ecf\u7eaa\u516c\u53f8\u8d44\u91d1\u8d26\u6237\u5bc6\u94a5\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryCFMMCTradingAccountKey(CThostFtdcCFMMCTradingAccountKeyField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:147</i>
	 */
	@Virtual(41) 
	public void OnRspQryCFMMCTradingAccountKey(Pointer<CThostFtdcCFMMCTradingAccountKeyField > pCFMMCTradingAccountKey, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryCFMMCTradingAccountKey(Pointer.getPeer(pCFMMCTradingAccountKey), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(41) 
	protected native void OnRspQryCFMMCTradingAccountKey(@Ptr long pCFMMCTradingAccountKey, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ed3\u5355\u6298\u62b5\u4fe1\u606f\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryEWarrantOffset(CThostFtdcEWarrantOffsetField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:150</i>
	 */
	@Virtual(42) 
	public void OnRspQryEWarrantOffset(Pointer<CThostFtdcEWarrantOffsetField > pEWarrantOffset, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryEWarrantOffset(Pointer.getPeer(pEWarrantOffset), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(42) 
	protected native void OnRspQryEWarrantOffset(@Ptr long pEWarrantOffset, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6295\u8d44\u8005\u54c1\u79cd/\u8de8\u54c1\u79cd\u4fdd\u8bc1\u91d1\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryInvestorProductGroupMargin(CThostFtdcInvestorProductGroupMarginField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:153</i>
	 */
	@Virtual(43) 
	public void OnRspQryInvestorProductGroupMargin(Pointer<CThostFtdcInvestorProductGroupMarginField > pInvestorProductGroupMargin, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryInvestorProductGroupMargin(Pointer.getPeer(pInvestorProductGroupMargin), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(43) 
	protected native void OnRspQryInvestorProductGroupMargin(@Ptr long pInvestorProductGroupMargin, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea4\u6613\u6240\u4fdd\u8bc1\u91d1\u7387\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryExchangeMarginRate(CThostFtdcExchangeMarginRateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:156</i>
	 */
	@Virtual(44) 
	public void OnRspQryExchangeMarginRate(Pointer<CThostFtdcExchangeMarginRateField > pExchangeMarginRate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryExchangeMarginRate(Pointer.getPeer(pExchangeMarginRate), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(44) 
	protected native void OnRspQryExchangeMarginRate(@Ptr long pExchangeMarginRate, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea4\u6613\u6240\u8c03\u6574\u4fdd\u8bc1\u91d1\u7387\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryExchangeMarginRateAdjust(CThostFtdcExchangeMarginRateAdjustField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:159</i>
	 */
	@Virtual(45) 
	public void OnRspQryExchangeMarginRateAdjust(Pointer<CThostFtdcExchangeMarginRateAdjustField > pExchangeMarginRateAdjust, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryExchangeMarginRateAdjust(Pointer.getPeer(pExchangeMarginRateAdjust), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(45) 
	protected native void OnRspQryExchangeMarginRateAdjust(@Ptr long pExchangeMarginRateAdjust, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6c47\u7387\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryExchangeRate(CThostFtdcExchangeRateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:162</i>
	 */
	@Virtual(46) 
	public void OnRspQryExchangeRate(Pointer<CThostFtdcExchangeRateField > pExchangeRate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryExchangeRate(Pointer.getPeer(pExchangeRate), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(46) 
	protected native void OnRspQryExchangeRate(@Ptr long pExchangeRate, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4e8c\u7ea7\u4ee3\u7406\u64cd\u4f5c\u5458\u94f6\u671f\u6743\u9650\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQrySecAgentACIDMap(CThostFtdcSecAgentACIDMapField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:165</i>
	 */
	@Virtual(47) 
	public void OnRspQrySecAgentACIDMap(Pointer<CThostFtdcSecAgentACIDMapField > pSecAgentACIDMap, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQrySecAgentACIDMap(Pointer.getPeer(pSecAgentACIDMap), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(47) 
	protected native void OnRspQrySecAgentACIDMap(@Ptr long pSecAgentACIDMap, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea7\u54c1\u62a5\u4ef7\u6c47\u7387<br>
	 * Original signature : <code>void OnRspQryProductExchRate(CThostFtdcProductExchRateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:168</i>
	 */
	@Virtual(48) 
	public void OnRspQryProductExchRate(Pointer<CThostFtdcProductExchRateField > pProductExchRate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryProductExchRate(Pointer.getPeer(pProductExchRate), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(48) 
	protected native void OnRspQryProductExchRate(@Ptr long pProductExchRate, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea7\u54c1\u7ec4<br>
	 * Original signature : <code>void OnRspQryProductGroup(CThostFtdcProductGroupField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:171</i>
	 */
	@Virtual(49) 
	public void OnRspQryProductGroup(Pointer<CThostFtdcProductGroupField > pProductGroup, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryProductGroup(Pointer.getPeer(pProductGroup), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(49) 
	protected native void OnRspQryProductGroup(@Ptr long pProductGroup, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u505a\u5e02\u5546\u5408\u7ea6\u624b\u7eed\u8d39\u7387\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryMMInstrumentCommissionRate(CThostFtdcMMInstrumentCommissionRateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:174</i>
	 */
	@Virtual(50) 
	public void OnRspQryMMInstrumentCommissionRate(Pointer<CThostFtdcMMInstrumentCommissionRateField > pMMInstrumentCommissionRate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryMMInstrumentCommissionRate(Pointer.getPeer(pMMInstrumentCommissionRate), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(50) 
	protected native void OnRspQryMMInstrumentCommissionRate(@Ptr long pMMInstrumentCommissionRate, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u505a\u5e02\u5546\u671f\u6743\u5408\u7ea6\u624b\u7eed\u8d39\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryMMOptionInstrCommRate(CThostFtdcMMOptionInstrCommRateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:177</i>
	 */
	@Virtual(51) 
	public void OnRspQryMMOptionInstrCommRate(Pointer<CThostFtdcMMOptionInstrCommRateField > pMMOptionInstrCommRate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryMMOptionInstrCommRate(Pointer.getPeer(pMMOptionInstrCommRate), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(51) 
	protected native void OnRspQryMMOptionInstrCommRate(@Ptr long pMMOptionInstrCommRate, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u62a5\u5355\u624b\u7eed\u8d39\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryInstrumentOrderCommRate(CThostFtdcInstrumentOrderCommRateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:180</i>
	 */
	@Virtual(52) 
	public void OnRspQryInstrumentOrderCommRate(Pointer<CThostFtdcInstrumentOrderCommRateField > pInstrumentOrderCommRate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryInstrumentOrderCommRate(Pointer.getPeer(pInstrumentOrderCommRate), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(52) 
	protected native void OnRspQryInstrumentOrderCommRate(@Ptr long pInstrumentOrderCommRate, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u671f\u6743\u4ea4\u6613\u6210\u672c\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryOptionInstrTradeCost(CThostFtdcOptionInstrTradeCostField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:183</i>
	 */
	@Virtual(53) 
	public void OnRspQryOptionInstrTradeCost(Pointer<CThostFtdcOptionInstrTradeCostField > pOptionInstrTradeCost, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryOptionInstrTradeCost(Pointer.getPeer(pOptionInstrTradeCost), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(53) 
	protected native void OnRspQryOptionInstrTradeCost(@Ptr long pOptionInstrTradeCost, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u671f\u6743\u5408\u7ea6\u624b\u7eed\u8d39\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryOptionInstrCommRate(CThostFtdcOptionInstrCommRateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:186</i>
	 */
	@Virtual(54) 
	public void OnRspQryOptionInstrCommRate(Pointer<CThostFtdcOptionInstrCommRateField > pOptionInstrCommRate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryOptionInstrCommRate(Pointer.getPeer(pOptionInstrCommRate), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(54) 
	protected native void OnRspQryOptionInstrCommRate(@Ptr long pOptionInstrCommRate, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6267\u884c\u5ba3\u544a\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryExecOrder(CThostFtdcExecOrderField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:189</i>
	 */
	@Virtual(55) 
	public void OnRspQryExecOrder(Pointer<CThostFtdcExecOrderField > pExecOrder, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryExecOrder(Pointer.getPeer(pExecOrder), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(55) 
	protected native void OnRspQryExecOrder(@Ptr long pExecOrder, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u8be2\u4ef7\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryForQuote(CThostFtdcForQuoteField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:192</i>
	 */
	@Virtual(56) 
	public void OnRspQryForQuote(Pointer<CThostFtdcForQuoteField > pForQuote, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryForQuote(Pointer.getPeer(pForQuote), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(56) 
	protected native void OnRspQryForQuote(@Ptr long pForQuote, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u62a5\u4ef7\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryQuote(CThostFtdcQuoteField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:195</i>
	 */
	@Virtual(57) 
	public void OnRspQryQuote(Pointer<CThostFtdcQuoteField > pQuote, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryQuote(Pointer.getPeer(pQuote), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(57) 
	protected native void OnRspQryQuote(@Ptr long pQuote, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u7ec4\u5408\u5408\u7ea6\u5b89\u5168\u7cfb\u6570\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryCombInstrumentGuard(CThostFtdcCombInstrumentGuardField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:198</i>
	 */
	@Virtual(58) 
	public void OnRspQryCombInstrumentGuard(Pointer<CThostFtdcCombInstrumentGuardField > pCombInstrumentGuard, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryCombInstrumentGuard(Pointer.getPeer(pCombInstrumentGuard), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(58) 
	protected native void OnRspQryCombInstrumentGuard(@Ptr long pCombInstrumentGuard, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u7533\u8bf7\u7ec4\u5408\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryCombAction(CThostFtdcCombActionField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:201</i>
	 */
	@Virtual(59) 
	public void OnRspQryCombAction(Pointer<CThostFtdcCombActionField > pCombAction, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryCombAction(Pointer.getPeer(pCombAction), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(59) 
	protected native void OnRspQryCombAction(@Ptr long pCombAction, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u8f6c\u5e10\u6d41\u6c34\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryTransferSerial(CThostFtdcTransferSerialField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:204</i>
	 */
	@Virtual(60) 
	public void OnRspQryTransferSerial(Pointer<CThostFtdcTransferSerialField > pTransferSerial, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryTransferSerial(Pointer.getPeer(pTransferSerial), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(60) 
	protected native void OnRspQryTransferSerial(@Ptr long pTransferSerial, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u94f6\u671f\u7b7e\u7ea6\u5173\u7cfb\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryAccountregister(CThostFtdcAccountregisterField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:207</i>
	 */
	@Virtual(61) 
	public void OnRspQryAccountregister(Pointer<CThostFtdcAccountregisterField > pAccountregister, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryAccountregister(Pointer.getPeer(pAccountregister), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(61) 
	protected native void OnRspQryAccountregister(@Ptr long pAccountregister, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u9519\u8bef\u5e94\u7b54<br>
	 * Original signature : <code>void OnRspError(CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:210</i>
	 */
	@Virtual(62) 
	public void OnRspError(Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspError(Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(62) 
	protected native void OnRspError(@Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u62a5\u5355\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnOrder(CThostFtdcOrderField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:213</i>
	 */
	@Virtual(63) 
	public void OnRtnOrder(Pointer<CThostFtdcOrderField > pOrder) {
		OnRtnOrder(Pointer.getPeer(pOrder));
	}
	@Virtual(63) 
	protected native void OnRtnOrder(@Ptr long pOrder);
	/**
	 * \u6210\u4ea4\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnTrade(CThostFtdcTradeField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:216</i>
	 */
	@Virtual(64) 
	public void OnRtnTrade(Pointer<CThostFtdcTradeField > pTrade) {
		OnRtnTrade(Pointer.getPeer(pTrade));
	}
	@Virtual(64) 
	protected native void OnRtnTrade(@Ptr long pTrade);
	/**
	 * \u62a5\u5355\u5f55\u5165\u9519\u8bef\u56de\u62a5<br>
	 * Original signature : <code>void OnErrRtnOrderInsert(CThostFtdcInputOrderField*, CThostFtdcRspInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:219</i>
	 */
	@Virtual(65) 
	public void OnErrRtnOrderInsert(Pointer<CThostFtdcInputOrderField > pInputOrder, Pointer<CThostFtdcRspInfoField > pRspInfo) {
		OnErrRtnOrderInsert(Pointer.getPeer(pInputOrder), Pointer.getPeer(pRspInfo));
	}
	@Virtual(65) 
	protected native void OnErrRtnOrderInsert(@Ptr long pInputOrder, @Ptr long pRspInfo);
	/**
	 * \u62a5\u5355\u64cd\u4f5c\u9519\u8bef\u56de\u62a5<br>
	 * Original signature : <code>void OnErrRtnOrderAction(CThostFtdcOrderActionField*, CThostFtdcRspInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:222</i>
	 */
	@Virtual(66) 
	public void OnErrRtnOrderAction(Pointer<CThostFtdcOrderActionField > pOrderAction, Pointer<CThostFtdcRspInfoField > pRspInfo) {
		OnErrRtnOrderAction(Pointer.getPeer(pOrderAction), Pointer.getPeer(pRspInfo));
	}
	@Virtual(66) 
	protected native void OnErrRtnOrderAction(@Ptr long pOrderAction, @Ptr long pRspInfo);
	/**
	 * \u5408\u7ea6\u4ea4\u6613\u72b6\u6001\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnInstrumentStatus(CThostFtdcInstrumentStatusField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:225</i>
	 */
	@Virtual(67) 
	public void OnRtnInstrumentStatus(Pointer<CThostFtdcInstrumentStatusField > pInstrumentStatus) {
		OnRtnInstrumentStatus(Pointer.getPeer(pInstrumentStatus));
	}
	@Virtual(67) 
	protected native void OnRtnInstrumentStatus(@Ptr long pInstrumentStatus);
	/**
	 * \u4ea4\u6613\u6240\u516c\u544a\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnBulletin(CThostFtdcBulletinField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:228</i>
	 */
	@Virtual(68) 
	public void OnRtnBulletin(Pointer<CThostFtdcBulletinField > pBulletin) {
		OnRtnBulletin(Pointer.getPeer(pBulletin));
	}
	@Virtual(68) 
	protected native void OnRtnBulletin(@Ptr long pBulletin);
	/**
	 * \u4ea4\u6613\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnTradingNotice(CThostFtdcTradingNoticeInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:231</i>
	 */
	@Virtual(69) 
	public void OnRtnTradingNotice(Pointer<CThostFtdcTradingNoticeInfoField > pTradingNoticeInfo) {
		OnRtnTradingNotice(Pointer.getPeer(pTradingNoticeInfo));
	}
	@Virtual(69) 
	protected native void OnRtnTradingNotice(@Ptr long pTradingNoticeInfo);
	/**
	 * \u63d0\u793a\u6761\u4ef6\u5355\u6821\u9a8c\u9519\u8bef<br>
	 * Original signature : <code>void OnRtnErrorConditionalOrder(CThostFtdcErrorConditionalOrderField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:234</i>
	 */
	@Virtual(70) 
	public void OnRtnErrorConditionalOrder(Pointer<CThostFtdcErrorConditionalOrderField > pErrorConditionalOrder) {
		OnRtnErrorConditionalOrder(Pointer.getPeer(pErrorConditionalOrder));
	}
	@Virtual(70) 
	protected native void OnRtnErrorConditionalOrder(@Ptr long pErrorConditionalOrder);
	/**
	 * \u6267\u884c\u5ba3\u544a\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnExecOrder(CThostFtdcExecOrderField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:237</i>
	 */
	@Virtual(71) 
	public void OnRtnExecOrder(Pointer<CThostFtdcExecOrderField > pExecOrder) {
		OnRtnExecOrder(Pointer.getPeer(pExecOrder));
	}
	@Virtual(71) 
	protected native void OnRtnExecOrder(@Ptr long pExecOrder);
	/**
	 * \u6267\u884c\u5ba3\u544a\u5f55\u5165\u9519\u8bef\u56de\u62a5<br>
	 * Original signature : <code>void OnErrRtnExecOrderInsert(CThostFtdcInputExecOrderField*, CThostFtdcRspInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:240</i>
	 */
	@Virtual(72) 
	public void OnErrRtnExecOrderInsert(Pointer<CThostFtdcInputExecOrderField > pInputExecOrder, Pointer<CThostFtdcRspInfoField > pRspInfo) {
		OnErrRtnExecOrderInsert(Pointer.getPeer(pInputExecOrder), Pointer.getPeer(pRspInfo));
	}
	@Virtual(72) 
	protected native void OnErrRtnExecOrderInsert(@Ptr long pInputExecOrder, @Ptr long pRspInfo);
	/**
	 * \u6267\u884c\u5ba3\u544a\u64cd\u4f5c\u9519\u8bef\u56de\u62a5<br>
	 * Original signature : <code>void OnErrRtnExecOrderAction(CThostFtdcExecOrderActionField*, CThostFtdcRspInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:243</i>
	 */
	@Virtual(73) 
	public void OnErrRtnExecOrderAction(Pointer<CThostFtdcExecOrderActionField > pExecOrderAction, Pointer<CThostFtdcRspInfoField > pRspInfo) {
		OnErrRtnExecOrderAction(Pointer.getPeer(pExecOrderAction), Pointer.getPeer(pRspInfo));
	}
	@Virtual(73) 
	protected native void OnErrRtnExecOrderAction(@Ptr long pExecOrderAction, @Ptr long pRspInfo);
	/**
	 * \u8be2\u4ef7\u5f55\u5165\u9519\u8bef\u56de\u62a5<br>
	 * Original signature : <code>void OnErrRtnForQuoteInsert(CThostFtdcInputForQuoteField*, CThostFtdcRspInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:246</i>
	 */
	@Virtual(74) 
	public void OnErrRtnForQuoteInsert(Pointer<CThostFtdcInputForQuoteField > pInputForQuote, Pointer<CThostFtdcRspInfoField > pRspInfo) {
		OnErrRtnForQuoteInsert(Pointer.getPeer(pInputForQuote), Pointer.getPeer(pRspInfo));
	}
	@Virtual(74) 
	protected native void OnErrRtnForQuoteInsert(@Ptr long pInputForQuote, @Ptr long pRspInfo);
	/**
	 * \u62a5\u4ef7\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnQuote(CThostFtdcQuoteField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:249</i>
	 */
	@Virtual(75) 
	public void OnRtnQuote(Pointer<CThostFtdcQuoteField > pQuote) {
		OnRtnQuote(Pointer.getPeer(pQuote));
	}
	@Virtual(75) 
	protected native void OnRtnQuote(@Ptr long pQuote);
	/**
	 * \u62a5\u4ef7\u5f55\u5165\u9519\u8bef\u56de\u62a5<br>
	 * Original signature : <code>void OnErrRtnQuoteInsert(CThostFtdcInputQuoteField*, CThostFtdcRspInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:252</i>
	 */
	@Virtual(76) 
	public void OnErrRtnQuoteInsert(Pointer<CThostFtdcInputQuoteField > pInputQuote, Pointer<CThostFtdcRspInfoField > pRspInfo) {
		OnErrRtnQuoteInsert(Pointer.getPeer(pInputQuote), Pointer.getPeer(pRspInfo));
	}
	@Virtual(76) 
	protected native void OnErrRtnQuoteInsert(@Ptr long pInputQuote, @Ptr long pRspInfo);
	/**
	 * \u62a5\u4ef7\u64cd\u4f5c\u9519\u8bef\u56de\u62a5<br>
	 * Original signature : <code>void OnErrRtnQuoteAction(CThostFtdcQuoteActionField*, CThostFtdcRspInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:255</i>
	 */
	@Virtual(77) 
	public void OnErrRtnQuoteAction(Pointer<CThostFtdcQuoteActionField > pQuoteAction, Pointer<CThostFtdcRspInfoField > pRspInfo) {
		OnErrRtnQuoteAction(Pointer.getPeer(pQuoteAction), Pointer.getPeer(pRspInfo));
	}
	@Virtual(77) 
	protected native void OnErrRtnQuoteAction(@Ptr long pQuoteAction, @Ptr long pRspInfo);
	/**
	 * \u8be2\u4ef7\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnForQuoteRsp(CThostFtdcForQuoteRspField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:258</i>
	 */
	@Virtual(78) 
	public void OnRtnForQuoteRsp(Pointer<CThostFtdcForQuoteRspField > pForQuoteRsp) {
		OnRtnForQuoteRsp(Pointer.getPeer(pForQuoteRsp));
	}
	@Virtual(78) 
	protected native void OnRtnForQuoteRsp(@Ptr long pForQuoteRsp);
	/**
	 * \u4fdd\u8bc1\u91d1\u76d1\u63a7\u4e2d\u5fc3\u7528\u6237\u4ee4\u724c<br>
	 * Original signature : <code>void OnRtnCFMMCTradingAccountToken(CThostFtdcCFMMCTradingAccountTokenField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:261</i>
	 */
	@Virtual(79) 
	public void OnRtnCFMMCTradingAccountToken(Pointer<CThostFtdcCFMMCTradingAccountTokenField > pCFMMCTradingAccountToken) {
		OnRtnCFMMCTradingAccountToken(Pointer.getPeer(pCFMMCTradingAccountToken));
	}
	@Virtual(79) 
	protected native void OnRtnCFMMCTradingAccountToken(@Ptr long pCFMMCTradingAccountToken);
	/**
	 * \u6279\u91cf\u62a5\u5355\u64cd\u4f5c\u9519\u8bef\u56de\u62a5<br>
	 * Original signature : <code>void OnErrRtnBatchOrderAction(CThostFtdcBatchOrderActionField*, CThostFtdcRspInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:264</i>
	 */
	@Virtual(80) 
	public void OnErrRtnBatchOrderAction(Pointer<CThostFtdcBatchOrderActionField > pBatchOrderAction, Pointer<CThostFtdcRspInfoField > pRspInfo) {
		OnErrRtnBatchOrderAction(Pointer.getPeer(pBatchOrderAction), Pointer.getPeer(pRspInfo));
	}
	@Virtual(80) 
	protected native void OnErrRtnBatchOrderAction(@Ptr long pBatchOrderAction, @Ptr long pRspInfo);
	/**
	 * \u7533\u8bf7\u7ec4\u5408\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnCombAction(CThostFtdcCombActionField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:267</i>
	 */
	@Virtual(81) 
	public void OnRtnCombAction(Pointer<CThostFtdcCombActionField > pCombAction) {
		OnRtnCombAction(Pointer.getPeer(pCombAction));
	}
	@Virtual(81) 
	protected native void OnRtnCombAction(@Ptr long pCombAction);
	/**
	 * \u7533\u8bf7\u7ec4\u5408\u5f55\u5165\u9519\u8bef\u56de\u62a5<br>
	 * Original signature : <code>void OnErrRtnCombActionInsert(CThostFtdcInputCombActionField*, CThostFtdcRspInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:270</i>
	 */
	@Virtual(82) 
	public void OnErrRtnCombActionInsert(Pointer<CThostFtdcInputCombActionField > pInputCombAction, Pointer<CThostFtdcRspInfoField > pRspInfo) {
		OnErrRtnCombActionInsert(Pointer.getPeer(pInputCombAction), Pointer.getPeer(pRspInfo));
	}
	@Virtual(82) 
	protected native void OnErrRtnCombActionInsert(@Ptr long pInputCombAction, @Ptr long pRspInfo);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u7b7e\u7ea6\u94f6\u884c\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryContractBank(CThostFtdcContractBankField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:273</i>
	 */
	@Virtual(83) 
	public void OnRspQryContractBank(Pointer<CThostFtdcContractBankField > pContractBank, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryContractBank(Pointer.getPeer(pContractBank), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(83) 
	protected native void OnRspQryContractBank(@Ptr long pContractBank, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u9884\u57cb\u5355\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryParkedOrder(CThostFtdcParkedOrderField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:276</i>
	 */
	@Virtual(84) 
	public void OnRspQryParkedOrder(Pointer<CThostFtdcParkedOrderField > pParkedOrder, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryParkedOrder(Pointer.getPeer(pParkedOrder), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(84) 
	protected native void OnRspQryParkedOrder(@Ptr long pParkedOrder, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u9884\u57cb\u64a4\u5355\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryParkedOrderAction(CThostFtdcParkedOrderActionField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:279</i>
	 */
	@Virtual(85) 
	public void OnRspQryParkedOrderAction(Pointer<CThostFtdcParkedOrderActionField > pParkedOrderAction, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryParkedOrderAction(Pointer.getPeer(pParkedOrderAction), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(85) 
	protected native void OnRspQryParkedOrderAction(@Ptr long pParkedOrderAction, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea4\u6613\u901a\u77e5\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryTradingNotice(CThostFtdcTradingNoticeField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:282</i>
	 */
	@Virtual(86) 
	public void OnRspQryTradingNotice(Pointer<CThostFtdcTradingNoticeField > pTradingNotice, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryTradingNotice(Pointer.getPeer(pTradingNotice), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(86) 
	protected native void OnRspQryTradingNotice(@Ptr long pTradingNotice, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u7ecf\u7eaa\u516c\u53f8\u4ea4\u6613\u53c2\u6570\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryBrokerTradingParams(CThostFtdcBrokerTradingParamsField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:285</i>
	 */
	@Virtual(87) 
	public void OnRspQryBrokerTradingParams(Pointer<CThostFtdcBrokerTradingParamsField > pBrokerTradingParams, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryBrokerTradingParams(Pointer.getPeer(pBrokerTradingParams), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(87) 
	protected native void OnRspQryBrokerTradingParams(@Ptr long pBrokerTradingParams, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u7ecf\u7eaa\u516c\u53f8\u4ea4\u6613\u7b97\u6cd5\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspQryBrokerTradingAlgos(CThostFtdcBrokerTradingAlgosField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:288</i>
	 */
	@Virtual(88) 
	public void OnRspQryBrokerTradingAlgos(Pointer<CThostFtdcBrokerTradingAlgosField > pBrokerTradingAlgos, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQryBrokerTradingAlgos(Pointer.getPeer(pBrokerTradingAlgos), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(88) 
	protected native void OnRspQryBrokerTradingAlgos(@Ptr long pBrokerTradingAlgos, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u76d1\u63a7\u4e2d\u5fc3\u7528\u6237\u4ee4\u724c<br>
	 * Original signature : <code>void OnRspQueryCFMMCTradingAccountToken(CThostFtdcQueryCFMMCTradingAccountTokenField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:291</i>
	 */
	@Virtual(89) 
	public void OnRspQueryCFMMCTradingAccountToken(Pointer<CThostFtdcQueryCFMMCTradingAccountTokenField > pQueryCFMMCTradingAccountToken, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQueryCFMMCTradingAccountToken(Pointer.getPeer(pQueryCFMMCTradingAccountToken), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(89) 
	protected native void OnRspQueryCFMMCTradingAccountToken(@Ptr long pQueryCFMMCTradingAccountToken, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u94f6\u884c\u53d1\u8d77\u94f6\u884c\u8d44\u91d1\u8f6c\u671f\u8d27\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnFromBankToFutureByBank(CThostFtdcRspTransferField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:294</i>
	 */
	@Virtual(90) 
	public void OnRtnFromBankToFutureByBank(Pointer<CThostFtdcRspTransferField > pRspTransfer) {
		OnRtnFromBankToFutureByBank(Pointer.getPeer(pRspTransfer));
	}
	@Virtual(90) 
	protected native void OnRtnFromBankToFutureByBank(@Ptr long pRspTransfer);
	/**
	 * \u94f6\u884c\u53d1\u8d77\u671f\u8d27\u8d44\u91d1\u8f6c\u94f6\u884c\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnFromFutureToBankByBank(CThostFtdcRspTransferField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:297</i>
	 */
	@Virtual(91) 
	public void OnRtnFromFutureToBankByBank(Pointer<CThostFtdcRspTransferField > pRspTransfer) {
		OnRtnFromFutureToBankByBank(Pointer.getPeer(pRspTransfer));
	}
	@Virtual(91) 
	protected native void OnRtnFromFutureToBankByBank(@Ptr long pRspTransfer);
	/**
	 * \u94f6\u884c\u53d1\u8d77\u51b2\u6b63\u94f6\u884c\u8f6c\u671f\u8d27\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnRepealFromBankToFutureByBank(CThostFtdcRspRepealField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:300</i>
	 */
	@Virtual(92) 
	public void OnRtnRepealFromBankToFutureByBank(Pointer<CThostFtdcRspRepealField > pRspRepeal) {
		OnRtnRepealFromBankToFutureByBank(Pointer.getPeer(pRspRepeal));
	}
	@Virtual(92) 
	protected native void OnRtnRepealFromBankToFutureByBank(@Ptr long pRspRepeal);
	/**
	 * \u94f6\u884c\u53d1\u8d77\u51b2\u6b63\u671f\u8d27\u8f6c\u94f6\u884c\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnRepealFromFutureToBankByBank(CThostFtdcRspRepealField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:303</i>
	 */
	@Virtual(93) 
	public void OnRtnRepealFromFutureToBankByBank(Pointer<CThostFtdcRspRepealField > pRspRepeal) {
		OnRtnRepealFromFutureToBankByBank(Pointer.getPeer(pRspRepeal));
	}
	@Virtual(93) 
	protected native void OnRtnRepealFromFutureToBankByBank(@Ptr long pRspRepeal);
	/**
	 * \u671f\u8d27\u53d1\u8d77\u94f6\u884c\u8d44\u91d1\u8f6c\u671f\u8d27\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnFromBankToFutureByFuture(CThostFtdcRspTransferField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:306</i>
	 */
	@Virtual(94) 
	public void OnRtnFromBankToFutureByFuture(Pointer<CThostFtdcRspTransferField > pRspTransfer) {
		OnRtnFromBankToFutureByFuture(Pointer.getPeer(pRspTransfer));
	}
	@Virtual(94) 
	protected native void OnRtnFromBankToFutureByFuture(@Ptr long pRspTransfer);
	/**
	 * \u671f\u8d27\u53d1\u8d77\u671f\u8d27\u8d44\u91d1\u8f6c\u94f6\u884c\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnFromFutureToBankByFuture(CThostFtdcRspTransferField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:309</i>
	 */
	@Virtual(95) 
	public void OnRtnFromFutureToBankByFuture(Pointer<CThostFtdcRspTransferField > pRspTransfer) {
		OnRtnFromFutureToBankByFuture(Pointer.getPeer(pRspTransfer));
	}
	@Virtual(95) 
	protected native void OnRtnFromFutureToBankByFuture(@Ptr long pRspTransfer);
	/**
	 * \u7cfb\u7edf\u8fd0\u884c\u65f6\u671f\u8d27\u7aef\u624b\u5de5\u53d1\u8d77\u51b2\u6b63\u94f6\u884c\u8f6c\u671f\u8d27\u8bf7\u6c42\uff0c\u94f6\u884c\u5904\u7406\u5b8c\u6bd5\u540e\u62a5\u76d8\u53d1\u56de\u7684\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnRepealFromBankToFutureByFutureManual(CThostFtdcRspRepealField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:312</i>
	 */
	@Virtual(96) 
	public void OnRtnRepealFromBankToFutureByFutureManual(Pointer<CThostFtdcRspRepealField > pRspRepeal) {
		OnRtnRepealFromBankToFutureByFutureManual(Pointer.getPeer(pRspRepeal));
	}
	@Virtual(96) 
	protected native void OnRtnRepealFromBankToFutureByFutureManual(@Ptr long pRspRepeal);
	/**
	 * \u7cfb\u7edf\u8fd0\u884c\u65f6\u671f\u8d27\u7aef\u624b\u5de5\u53d1\u8d77\u51b2\u6b63\u671f\u8d27\u8f6c\u94f6\u884c\u8bf7\u6c42\uff0c\u94f6\u884c\u5904\u7406\u5b8c\u6bd5\u540e\u62a5\u76d8\u53d1\u56de\u7684\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnRepealFromFutureToBankByFutureManual(CThostFtdcRspRepealField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:315</i>
	 */
	@Virtual(97) 
	public void OnRtnRepealFromFutureToBankByFutureManual(Pointer<CThostFtdcRspRepealField > pRspRepeal) {
		OnRtnRepealFromFutureToBankByFutureManual(Pointer.getPeer(pRspRepeal));
	}
	@Virtual(97) 
	protected native void OnRtnRepealFromFutureToBankByFutureManual(@Ptr long pRspRepeal);
	/**
	 * \u671f\u8d27\u53d1\u8d77\u67e5\u8be2\u94f6\u884c\u4f59\u989d\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnQueryBankBalanceByFuture(CThostFtdcNotifyQueryAccountField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:318</i>
	 */
	@Virtual(98) 
	public void OnRtnQueryBankBalanceByFuture(Pointer<CThostFtdcNotifyQueryAccountField > pNotifyQueryAccount) {
		OnRtnQueryBankBalanceByFuture(Pointer.getPeer(pNotifyQueryAccount));
	}
	@Virtual(98) 
	protected native void OnRtnQueryBankBalanceByFuture(@Ptr long pNotifyQueryAccount);
	/**
	 * \u671f\u8d27\u53d1\u8d77\u94f6\u884c\u8d44\u91d1\u8f6c\u671f\u8d27\u9519\u8bef\u56de\u62a5<br>
	 * Original signature : <code>void OnErrRtnBankToFutureByFuture(CThostFtdcReqTransferField*, CThostFtdcRspInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:321</i>
	 */
	@Virtual(99) 
	public void OnErrRtnBankToFutureByFuture(Pointer<CThostFtdcReqTransferField > pReqTransfer, Pointer<CThostFtdcRspInfoField > pRspInfo) {
		OnErrRtnBankToFutureByFuture(Pointer.getPeer(pReqTransfer), Pointer.getPeer(pRspInfo));
	}
	@Virtual(99) 
	protected native void OnErrRtnBankToFutureByFuture(@Ptr long pReqTransfer, @Ptr long pRspInfo);
	/**
	 * \u671f\u8d27\u53d1\u8d77\u671f\u8d27\u8d44\u91d1\u8f6c\u94f6\u884c\u9519\u8bef\u56de\u62a5<br>
	 * Original signature : <code>void OnErrRtnFutureToBankByFuture(CThostFtdcReqTransferField*, CThostFtdcRspInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:324</i>
	 */
	@Virtual(100) 
	public void OnErrRtnFutureToBankByFuture(Pointer<CThostFtdcReqTransferField > pReqTransfer, Pointer<CThostFtdcRspInfoField > pRspInfo) {
		OnErrRtnFutureToBankByFuture(Pointer.getPeer(pReqTransfer), Pointer.getPeer(pRspInfo));
	}
	@Virtual(100) 
	protected native void OnErrRtnFutureToBankByFuture(@Ptr long pReqTransfer, @Ptr long pRspInfo);
	/**
	 * \u7cfb\u7edf\u8fd0\u884c\u65f6\u671f\u8d27\u7aef\u624b\u5de5\u53d1\u8d77\u51b2\u6b63\u94f6\u884c\u8f6c\u671f\u8d27\u9519\u8bef\u56de\u62a5<br>
	 * Original signature : <code>void OnErrRtnRepealBankToFutureByFutureManual(CThostFtdcReqRepealField*, CThostFtdcRspInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:327</i>
	 */
	@Virtual(101) 
	public void OnErrRtnRepealBankToFutureByFutureManual(Pointer<CThostFtdcReqRepealField > pReqRepeal, Pointer<CThostFtdcRspInfoField > pRspInfo) {
		OnErrRtnRepealBankToFutureByFutureManual(Pointer.getPeer(pReqRepeal), Pointer.getPeer(pRspInfo));
	}
	@Virtual(101) 
	protected native void OnErrRtnRepealBankToFutureByFutureManual(@Ptr long pReqRepeal, @Ptr long pRspInfo);
	/**
	 * \u7cfb\u7edf\u8fd0\u884c\u65f6\u671f\u8d27\u7aef\u624b\u5de5\u53d1\u8d77\u51b2\u6b63\u671f\u8d27\u8f6c\u94f6\u884c\u9519\u8bef\u56de\u62a5<br>
	 * Original signature : <code>void OnErrRtnRepealFutureToBankByFutureManual(CThostFtdcReqRepealField*, CThostFtdcRspInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:330</i>
	 */
	@Virtual(102) 
	public void OnErrRtnRepealFutureToBankByFutureManual(Pointer<CThostFtdcReqRepealField > pReqRepeal, Pointer<CThostFtdcRspInfoField > pRspInfo) {
		OnErrRtnRepealFutureToBankByFutureManual(Pointer.getPeer(pReqRepeal), Pointer.getPeer(pRspInfo));
	}
	@Virtual(102) 
	protected native void OnErrRtnRepealFutureToBankByFutureManual(@Ptr long pReqRepeal, @Ptr long pRspInfo);
	/**
	 * \u671f\u8d27\u53d1\u8d77\u67e5\u8be2\u94f6\u884c\u4f59\u989d\u9519\u8bef\u56de\u62a5<br>
	 * Original signature : <code>void OnErrRtnQueryBankBalanceByFuture(CThostFtdcReqQueryAccountField*, CThostFtdcRspInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:333</i>
	 */
	@Virtual(103) 
	public void OnErrRtnQueryBankBalanceByFuture(Pointer<CThostFtdcReqQueryAccountField > pReqQueryAccount, Pointer<CThostFtdcRspInfoField > pRspInfo) {
		OnErrRtnQueryBankBalanceByFuture(Pointer.getPeer(pReqQueryAccount), Pointer.getPeer(pRspInfo));
	}
	@Virtual(103) 
	protected native void OnErrRtnQueryBankBalanceByFuture(@Ptr long pReqQueryAccount, @Ptr long pRspInfo);
	/**
	 * \u671f\u8d27\u53d1\u8d77\u51b2\u6b63\u94f6\u884c\u8f6c\u671f\u8d27\u8bf7\u6c42\uff0c\u94f6\u884c\u5904\u7406\u5b8c\u6bd5\u540e\u62a5\u76d8\u53d1\u56de\u7684\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnRepealFromBankToFutureByFuture(CThostFtdcRspRepealField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:336</i>
	 */
	@Virtual(104) 
	public void OnRtnRepealFromBankToFutureByFuture(Pointer<CThostFtdcRspRepealField > pRspRepeal) {
		OnRtnRepealFromBankToFutureByFuture(Pointer.getPeer(pRspRepeal));
	}
	@Virtual(104) 
	protected native void OnRtnRepealFromBankToFutureByFuture(@Ptr long pRspRepeal);
	/**
	 * \u671f\u8d27\u53d1\u8d77\u51b2\u6b63\u671f\u8d27\u8f6c\u94f6\u884c\u8bf7\u6c42\uff0c\u94f6\u884c\u5904\u7406\u5b8c\u6bd5\u540e\u62a5\u76d8\u53d1\u56de\u7684\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnRepealFromFutureToBankByFuture(CThostFtdcRspRepealField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:339</i>
	 */
	@Virtual(105) 
	public void OnRtnRepealFromFutureToBankByFuture(Pointer<CThostFtdcRspRepealField > pRspRepeal) {
		OnRtnRepealFromFutureToBankByFuture(Pointer.getPeer(pRspRepeal));
	}
	@Virtual(105) 
	protected native void OnRtnRepealFromFutureToBankByFuture(@Ptr long pRspRepeal);
	/**
	 * \u671f\u8d27\u53d1\u8d77\u94f6\u884c\u8d44\u91d1\u8f6c\u671f\u8d27\u5e94\u7b54<br>
	 * Original signature : <code>void OnRspFromBankToFutureByFuture(CThostFtdcReqTransferField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:342</i>
	 */
	@Virtual(106) 
	public void OnRspFromBankToFutureByFuture(Pointer<CThostFtdcReqTransferField > pReqTransfer, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspFromBankToFutureByFuture(Pointer.getPeer(pReqTransfer), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(106) 
	protected native void OnRspFromBankToFutureByFuture(@Ptr long pReqTransfer, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u671f\u8d27\u53d1\u8d77\u671f\u8d27\u8d44\u91d1\u8f6c\u94f6\u884c\u5e94\u7b54<br>
	 * Original signature : <code>void OnRspFromFutureToBankByFuture(CThostFtdcReqTransferField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:345</i>
	 */
	@Virtual(107) 
	public void OnRspFromFutureToBankByFuture(Pointer<CThostFtdcReqTransferField > pReqTransfer, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspFromFutureToBankByFuture(Pointer.getPeer(pReqTransfer), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(107) 
	protected native void OnRspFromFutureToBankByFuture(@Ptr long pReqTransfer, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u671f\u8d27\u53d1\u8d77\u67e5\u8be2\u94f6\u884c\u4f59\u989d\u5e94\u7b54<br>
	 * Original signature : <code>void OnRspQueryBankAccountMoneyByFuture(CThostFtdcReqQueryAccountField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:348</i>
	 */
	@Virtual(108) 
	public void OnRspQueryBankAccountMoneyByFuture(Pointer<CThostFtdcReqQueryAccountField > pReqQueryAccount, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspQueryBankAccountMoneyByFuture(Pointer.getPeer(pReqQueryAccount), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(108) 
	protected native void OnRspQueryBankAccountMoneyByFuture(@Ptr long pReqQueryAccount, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u94f6\u884c\u53d1\u8d77\u94f6\u671f\u5f00\u6237\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnOpenAccountByBank(CThostFtdcOpenAccountField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:351</i>
	 */
	@Virtual(109) 
	public void OnRtnOpenAccountByBank(Pointer<CThostFtdcOpenAccountField > pOpenAccount) {
		OnRtnOpenAccountByBank(Pointer.getPeer(pOpenAccount));
	}
	@Virtual(109) 
	protected native void OnRtnOpenAccountByBank(@Ptr long pOpenAccount);
	/**
	 * \u94f6\u884c\u53d1\u8d77\u94f6\u671f\u9500\u6237\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnCancelAccountByBank(CThostFtdcCancelAccountField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:354</i>
	 */
	@Virtual(110) 
	public void OnRtnCancelAccountByBank(Pointer<CThostFtdcCancelAccountField > pCancelAccount) {
		OnRtnCancelAccountByBank(Pointer.getPeer(pCancelAccount));
	}
	@Virtual(110) 
	protected native void OnRtnCancelAccountByBank(@Ptr long pCancelAccount);
	/**
	 * \u94f6\u884c\u53d1\u8d77\u53d8\u66f4\u94f6\u884c\u8d26\u53f7\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnChangeAccountByBank(CThostFtdcChangeAccountField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:357</i>
	 */
	@Virtual(111) 
	public void OnRtnChangeAccountByBank(Pointer<CThostFtdcChangeAccountField > pChangeAccount) {
		OnRtnChangeAccountByBank(Pointer.getPeer(pChangeAccount));
	}
	@Virtual(111) 
	protected native void OnRtnChangeAccountByBank(@Ptr long pChangeAccount);
	public CThostFtdcTraderSpi() {
		super();
	}
	public CThostFtdcTraderSpi(Pointer pointer) {
		super(pointer);
	}
}
