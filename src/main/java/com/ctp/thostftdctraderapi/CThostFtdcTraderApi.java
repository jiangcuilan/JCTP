package com.ctp.thostftdctraderapi;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Name;
import org.bridj.ann.Ptr;
import org.bridj.ann.Symbol;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;

import com.ctp.thostftdcuserapidatatype.ThostFtdcUserApiDataTypeLibrary.THOST_TE_RESUME_TYPE;
import com.ctp.thostftdcuserapistruct.CThostFtdcFensUserInfoField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputBatchOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputCombActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputExecOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputExecOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputForQuoteField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputQuoteActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputQuoteField;
import com.ctp.thostftdcuserapistruct.CThostFtdcParkedOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcParkedOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryAccountregisterField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryBrokerTradingAlgosField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryBrokerTradingParamsField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryCFMMCTradingAccountKeyField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryCombActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryCombInstrumentGuardField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryContractBankField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryDepthMarketDataField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryEWarrantOffsetField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryExchangeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryExchangeMarginRateAdjustField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryExchangeMarginRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryExchangeRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryExecOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryForQuoteField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInstrumentCommissionRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInstrumentField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInstrumentMarginRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInstrumentOrderCommRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInvestorField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInvestorPositionCombineDetailField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInvestorPositionDetailField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInvestorPositionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInvestorProductGroupMarginField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryMMInstrumentCommissionRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryMMOptionInstrCommRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryNoticeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryOptionInstrCommRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryOptionInstrTradeCostField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryParkedOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryParkedOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryProductExchRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryProductField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryProductGroupField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryQuoteField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQrySecAgentACIDMapField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQrySettlementInfoConfirmField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQrySettlementInfoField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryTradeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryTradingAccountField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryTradingCodeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryTradingNoticeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryTransferBankField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryTransferSerialField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQueryCFMMCTradingAccountTokenField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQueryMaxOrderVolumeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRemoveParkedOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRemoveParkedOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcReqAuthenticateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcReqQueryAccountField;
import com.ctp.thostftdcuserapistruct.CThostFtdcReqTransferField;
import com.ctp.thostftdcuserapistruct.CThostFtdcReqUserLoginField;
import com.ctp.thostftdcuserapistruct.CThostFtdcSettlementInfoConfirmField;
import com.ctp.thostftdcuserapistruct.CThostFtdcTradingAccountPasswordUpdateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcUserLogoutField;
import com.ctp.thostftdcuserapistruct.CThostFtdcUserPasswordUpdateField;
/**
 * <i>native declaration : ThostFtdcTraderApi.h:360</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thosttraderapi") 
public class CThostFtdcTraderApi extends CPPObject {
	/**
	 * @return \u521b\u5efa\u51fa\u7684UserApi<br>
	 * Original signature : <code>CThostFtdcTraderApi* CreateFtdcTraderApi(const char*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:366</i>
	 */
	public static Pointer<CThostFtdcTraderApi > CreateFtdcTraderApi(Pointer<Byte > pszFlowPath) {
		return Pointer.pointerToAddress(CreateFtdcTraderApi(Pointer.getPeer(pszFlowPath)), CThostFtdcTraderApi.class);
	}
	@Ptr 
	@Symbol("?CreateFtdcTraderApi@CThostFtdcTraderApi@@SAPEAV1@PEBD@Z")
	protected native static long CreateFtdcTraderApi(@Ptr long pszFlowPath);
	/**
	 * @retrun \u83b7\u53d6\u5230\u7684\u7248\u672c\u53f7<br>
	 * Original signature : <code>char* GetApiVersion()</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:370</i>
	 */
	public static Pointer<Byte > GetApiVersion() {
		return Pointer.pointerToAddress(GetApiVersion$2(), Byte.class);
	}
	@Ptr 
	@Name("GetApiVersion") 
	@Symbol("?GetApiVersion@CThostFtdcTraderApi@@SAPEBDXZ")
	protected native static long GetApiVersion$2();
	/**
	 * @remark \u4e0d\u518d\u4f7f\u7528\u672c\u63a5\u53e3\u5bf9\u8c61\u65f6,\u8c03\u7528\u8be5\u51fd\u6570\u5220\u9664\u63a5\u53e3\u5bf9\u8c61<br>
	 * Original signature : <code>void Release()</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:374</i>
	 */
	@Virtual(0) 
	native public void Release();
	/**
	 * @remark \u521d\u59cb\u5316\u8fd0\u884c\u73af\u5883,\u53ea\u6709\u8c03\u7528\u540e,\u63a5\u53e3\u624d\u5f00\u59cb\u5de5\u4f5c<br>
	 * Original signature : <code>void Init()</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:378</i>
	 */
	@Virtual(1) 
	native public void Init();
	/**
	 * @return \u7ebf\u7a0b\u9000\u51fa\u4ee3\u7801<br>
	 * Original signature : <code>int Join()</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:382</i>
	 */
	@Virtual(2) 
	native public int Join();
	/**
	 * @remark \u53ea\u6709\u767b\u5f55\u6210\u529f\u540e,\u624d\u80fd\u5f97\u5230\u6b63\u786e\u7684\u4ea4\u6613\u65e5<br>
	 * Original signature : <code>char* GetTradingDay()</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:387</i>
	 */
	@Virtual(3) 
	public Pointer<Byte > GetTradingDay() {
		return Pointer.pointerToAddress(GetTradingDay$2(), Byte.class);
	}
	@Ptr 
	@Name("GetTradingDay") 
	@Virtual(3) 
	protected native long GetTradingDay$2();
	/**
	 * @remark \u201ctcp\u201d\u4ee3\u8868\u4f20\u8f93\u534f\u8bae\uff0c\u201c127.0.0.1\u201d\u4ee3\u8868\u670d\u52a1\u5668\u5730\u5740\u3002\u201d17001\u201d\u4ee3\u8868\u670d\u52a1\u5668\u7aef\u53e3\u53f7\u3002<br>
	 * Original signature : <code>void RegisterFront(char*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:393</i>
	 */
	@Virtual(4) 
	public void RegisterFront(Pointer<Byte > pszFrontAddress) {
		RegisterFront(Pointer.getPeer(pszFrontAddress));
	}
	@Virtual(4) 
	protected native void RegisterFront(@Ptr long pszFrontAddress);
	/**
	 * @remark RegisterNameServer\u4f18\u5148\u4e8eRegisterFront<br>
	 * Original signature : <code>void RegisterNameServer(char*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:400</i>
	 */
	@Virtual(5) 
	public void RegisterNameServer(Pointer<Byte > pszNsAddress) {
		RegisterNameServer(Pointer.getPeer(pszNsAddress));
	}
	@Virtual(5) 
	protected native void RegisterNameServer(@Ptr long pszNsAddress);
	/**
	 * @param pFensUserInfo\uff1a\u7528\u6237\u4fe1\u606f\u3002<br>
	 * Original signature : <code>void RegisterFensUserInfo(CThostFtdcFensUserInfoField*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:404</i>
	 */
	@Virtual(6) 
	public void RegisterFensUserInfo(Pointer<CThostFtdcFensUserInfoField > pFensUserInfo) {
		RegisterFensUserInfo(Pointer.getPeer(pFensUserInfo));
	}
	@Virtual(6) 
	protected native void RegisterFensUserInfo(@Ptr long pFensUserInfo);
	/**
	 * @param pSpi \u6d3e\u751f\u81ea\u56de\u8c03\u63a5\u53e3\u7c7b\u7684\u5b9e\u4f8b<br>
	 * Original signature : <code>void RegisterSpi(CThostFtdcTraderSpi*)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:408</i>
	 */
	@Virtual(7) 
	public void RegisterSpi(Pointer<CThostFtdcTraderSpi > pSpi) {
		RegisterSpi(Pointer.getPeer(pSpi));
	}
	@Virtual(7) 
	protected native void RegisterSpi(@Ptr long pSpi);
	/**
	 * @remark \u8be5\u65b9\u6cd5\u8981\u5728Init\u65b9\u6cd5\u524d\u8c03\u7528\u3002\u82e5\u4e0d\u8c03\u7528\u5219\u4e0d\u4f1a\u6536\u5230\u79c1\u6709\u6d41\u7684\u6570\u636e\u3002<br>
	 * Original signature : <code>void SubscribePrivateTopic(THOST_TE_RESUME_TYPE)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:416</i>
	 */
	@Virtual(8) 
	public void SubscribePrivateTopic(IntValuedEnum<THOST_TE_RESUME_TYPE > nResumeType) {
		SubscribePrivateTopic((int)nResumeType.value());
	}
	@Virtual(8) 
	protected native void SubscribePrivateTopic(int nResumeType);
	/**
	 * @remark \u8be5\u65b9\u6cd5\u8981\u5728Init\u65b9\u6cd5\u524d\u8c03\u7528\u3002\u82e5\u4e0d\u8c03\u7528\u5219\u4e0d\u4f1a\u6536\u5230\u516c\u5171\u6d41\u7684\u6570\u636e\u3002<br>
	 * Original signature : <code>void SubscribePublicTopic(THOST_TE_RESUME_TYPE)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:424</i>
	 */
	@Virtual(9) 
	public void SubscribePublicTopic(IntValuedEnum<THOST_TE_RESUME_TYPE > nResumeType) {
		SubscribePublicTopic((int)nResumeType.value());
	}
	@Virtual(9) 
	protected native void SubscribePublicTopic(int nResumeType);
	/**
	 * \u5ba2\u6237\u7aef\u8ba4\u8bc1\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqAuthenticate(CThostFtdcReqAuthenticateField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:427</i>
	 */
	@Virtual(10) 
	public int ReqAuthenticate(Pointer<CThostFtdcReqAuthenticateField > pReqAuthenticateField, int nRequestID) {
		return ReqAuthenticate(Pointer.getPeer(pReqAuthenticateField), nRequestID);
	}
	@Virtual(10) 
	protected native int ReqAuthenticate(@Ptr long pReqAuthenticateField, int nRequestID);
	/**
	 * \u7528\u6237\u767b\u5f55\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqUserLogin(CThostFtdcReqUserLoginField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:430</i>
	 */
	@Virtual(11) 
	public int ReqUserLogin(Pointer<CThostFtdcReqUserLoginField > pReqUserLoginField, int nRequestID) {
		return ReqUserLogin(Pointer.getPeer(pReqUserLoginField), nRequestID);
	}
	@Virtual(11) 
	protected native int ReqUserLogin(@Ptr long pReqUserLoginField, int nRequestID);
	/**
	 * \u767b\u51fa\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqUserLogout(CThostFtdcUserLogoutField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:434</i>
	 */
	@Virtual(12) 
	public int ReqUserLogout(Pointer<CThostFtdcUserLogoutField > pUserLogout, int nRequestID) {
		return ReqUserLogout(Pointer.getPeer(pUserLogout), nRequestID);
	}
	@Virtual(12) 
	protected native int ReqUserLogout(@Ptr long pUserLogout, int nRequestID);
	/**
	 * \u7528\u6237\u53e3\u4ee4\u66f4\u65b0\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqUserPasswordUpdate(CThostFtdcUserPasswordUpdateField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:437</i>
	 */
	@Virtual(13) 
	public int ReqUserPasswordUpdate(Pointer<CThostFtdcUserPasswordUpdateField > pUserPasswordUpdate, int nRequestID) {
		return ReqUserPasswordUpdate(Pointer.getPeer(pUserPasswordUpdate), nRequestID);
	}
	@Virtual(13) 
	protected native int ReqUserPasswordUpdate(@Ptr long pUserPasswordUpdate, int nRequestID);
	/**
	 * \u8d44\u91d1\u8d26\u6237\u53e3\u4ee4\u66f4\u65b0\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqTradingAccountPasswordUpdate(CThostFtdcTradingAccountPasswordUpdateField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:440</i>
	 */
	@Virtual(14) 
	public int ReqTradingAccountPasswordUpdate(Pointer<CThostFtdcTradingAccountPasswordUpdateField > pTradingAccountPasswordUpdate, int nRequestID) {
		return ReqTradingAccountPasswordUpdate(Pointer.getPeer(pTradingAccountPasswordUpdate), nRequestID);
	}
	@Virtual(14) 
	protected native int ReqTradingAccountPasswordUpdate(@Ptr long pTradingAccountPasswordUpdate, int nRequestID);
	/**
	 * \u62a5\u5355\u5f55\u5165\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqOrderInsert(CThostFtdcInputOrderField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:443</i>
	 */
	@Virtual(15) 
	public int ReqOrderInsert(Pointer<CThostFtdcInputOrderField > pInputOrder, int nRequestID) {
		return ReqOrderInsert(Pointer.getPeer(pInputOrder), nRequestID);
	}
	@Virtual(15) 
	protected native int ReqOrderInsert(@Ptr long pInputOrder, int nRequestID);
	/**
	 * \u9884\u57cb\u5355\u5f55\u5165\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqParkedOrderInsert(CThostFtdcParkedOrderField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:446</i>
	 */
	@Virtual(16) 
	public int ReqParkedOrderInsert(Pointer<CThostFtdcParkedOrderField > pParkedOrder, int nRequestID) {
		return ReqParkedOrderInsert(Pointer.getPeer(pParkedOrder), nRequestID);
	}
	@Virtual(16) 
	protected native int ReqParkedOrderInsert(@Ptr long pParkedOrder, int nRequestID);
	/**
	 * \u9884\u57cb\u64a4\u5355\u5f55\u5165\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqParkedOrderAction(CThostFtdcParkedOrderActionField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:449</i>
	 */
	@Virtual(17) 
	public int ReqParkedOrderAction(Pointer<CThostFtdcParkedOrderActionField > pParkedOrderAction, int nRequestID) {
		return ReqParkedOrderAction(Pointer.getPeer(pParkedOrderAction), nRequestID);
	}
	@Virtual(17) 
	protected native int ReqParkedOrderAction(@Ptr long pParkedOrderAction, int nRequestID);
	/**
	 * \u62a5\u5355\u64cd\u4f5c\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqOrderAction(CThostFtdcInputOrderActionField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:452</i>
	 */
	@Virtual(18) 
	public int ReqOrderAction(Pointer<CThostFtdcInputOrderActionField > pInputOrderAction, int nRequestID) {
		return ReqOrderAction(Pointer.getPeer(pInputOrderAction), nRequestID);
	}
	@Virtual(18) 
	protected native int ReqOrderAction(@Ptr long pInputOrderAction, int nRequestID);
	/**
	 * \u67e5\u8be2\u6700\u5927\u62a5\u5355\u6570\u91cf\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqQueryMaxOrderVolume(CThostFtdcQueryMaxOrderVolumeField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:455</i>
	 */
	@Virtual(19) 
	public int ReqQueryMaxOrderVolume(Pointer<CThostFtdcQueryMaxOrderVolumeField > pQueryMaxOrderVolume, int nRequestID) {
		return ReqQueryMaxOrderVolume(Pointer.getPeer(pQueryMaxOrderVolume), nRequestID);
	}
	@Virtual(19) 
	protected native int ReqQueryMaxOrderVolume(@Ptr long pQueryMaxOrderVolume, int nRequestID);
	/**
	 * \u6295\u8d44\u8005\u7ed3\u7b97\u7ed3\u679c\u786e\u8ba4<br>
	 * Original signature : <code>int ReqSettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:458</i>
	 */
	@Virtual(20) 
	public int ReqSettlementInfoConfirm(Pointer<CThostFtdcSettlementInfoConfirmField > pSettlementInfoConfirm, int nRequestID) {
		return ReqSettlementInfoConfirm(Pointer.getPeer(pSettlementInfoConfirm), nRequestID);
	}
	@Virtual(20) 
	protected native int ReqSettlementInfoConfirm(@Ptr long pSettlementInfoConfirm, int nRequestID);
	/**
	 * \u8bf7\u6c42\u5220\u9664\u9884\u57cb\u5355<br>
	 * Original signature : <code>int ReqRemoveParkedOrder(CThostFtdcRemoveParkedOrderField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:461</i>
	 */
	@Virtual(21) 
	public int ReqRemoveParkedOrder(Pointer<CThostFtdcRemoveParkedOrderField > pRemoveParkedOrder, int nRequestID) {
		return ReqRemoveParkedOrder(Pointer.getPeer(pRemoveParkedOrder), nRequestID);
	}
	@Virtual(21) 
	protected native int ReqRemoveParkedOrder(@Ptr long pRemoveParkedOrder, int nRequestID);
	/**
	 * \u8bf7\u6c42\u5220\u9664\u9884\u57cb\u64a4\u5355<br>
	 * Original signature : <code>int ReqRemoveParkedOrderAction(CThostFtdcRemoveParkedOrderActionField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:464</i>
	 */
	@Virtual(22) 
	public int ReqRemoveParkedOrderAction(Pointer<CThostFtdcRemoveParkedOrderActionField > pRemoveParkedOrderAction, int nRequestID) {
		return ReqRemoveParkedOrderAction(Pointer.getPeer(pRemoveParkedOrderAction), nRequestID);
	}
	@Virtual(22) 
	protected native int ReqRemoveParkedOrderAction(@Ptr long pRemoveParkedOrderAction, int nRequestID);
	/**
	 * \u6267\u884c\u5ba3\u544a\u5f55\u5165\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqExecOrderInsert(CThostFtdcInputExecOrderField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:467</i>
	 */
	@Virtual(23) 
	public int ReqExecOrderInsert(Pointer<CThostFtdcInputExecOrderField > pInputExecOrder, int nRequestID) {
		return ReqExecOrderInsert(Pointer.getPeer(pInputExecOrder), nRequestID);
	}
	@Virtual(23) 
	protected native int ReqExecOrderInsert(@Ptr long pInputExecOrder, int nRequestID);
	/**
	 * \u6267\u884c\u5ba3\u544a\u64cd\u4f5c\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqExecOrderAction(CThostFtdcInputExecOrderActionField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:470</i>
	 */
	@Virtual(24) 
	public int ReqExecOrderAction(Pointer<CThostFtdcInputExecOrderActionField > pInputExecOrderAction, int nRequestID) {
		return ReqExecOrderAction(Pointer.getPeer(pInputExecOrderAction), nRequestID);
	}
	@Virtual(24) 
	protected native int ReqExecOrderAction(@Ptr long pInputExecOrderAction, int nRequestID);
	/**
	 * \u8be2\u4ef7\u5f55\u5165\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqForQuoteInsert(CThostFtdcInputForQuoteField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:473</i>
	 */
	@Virtual(25) 
	public int ReqForQuoteInsert(Pointer<CThostFtdcInputForQuoteField > pInputForQuote, int nRequestID) {
		return ReqForQuoteInsert(Pointer.getPeer(pInputForQuote), nRequestID);
	}
	@Virtual(25) 
	protected native int ReqForQuoteInsert(@Ptr long pInputForQuote, int nRequestID);
	/**
	 * \u62a5\u4ef7\u5f55\u5165\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqQuoteInsert(CThostFtdcInputQuoteField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:476</i>
	 */
	@Virtual(26) 
	public int ReqQuoteInsert(Pointer<CThostFtdcInputQuoteField > pInputQuote, int nRequestID) {
		return ReqQuoteInsert(Pointer.getPeer(pInputQuote), nRequestID);
	}
	@Virtual(26) 
	protected native int ReqQuoteInsert(@Ptr long pInputQuote, int nRequestID);
	/**
	 * \u62a5\u4ef7\u64cd\u4f5c\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqQuoteAction(CThostFtdcInputQuoteActionField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:479</i>
	 */
	@Virtual(27) 
	public int ReqQuoteAction(Pointer<CThostFtdcInputQuoteActionField > pInputQuoteAction, int nRequestID) {
		return ReqQuoteAction(Pointer.getPeer(pInputQuoteAction), nRequestID);
	}
	@Virtual(27) 
	protected native int ReqQuoteAction(@Ptr long pInputQuoteAction, int nRequestID);
	/**
	 * \u6279\u91cf\u62a5\u5355\u64cd\u4f5c\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqBatchOrderAction(CThostFtdcInputBatchOrderActionField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:482</i>
	 */
	@Virtual(28) 
	public int ReqBatchOrderAction(Pointer<CThostFtdcInputBatchOrderActionField > pInputBatchOrderAction, int nRequestID) {
		return ReqBatchOrderAction(Pointer.getPeer(pInputBatchOrderAction), nRequestID);
	}
	@Virtual(28) 
	protected native int ReqBatchOrderAction(@Ptr long pInputBatchOrderAction, int nRequestID);
	/**
	 * \u7533\u8bf7\u7ec4\u5408\u5f55\u5165\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqCombActionInsert(CThostFtdcInputCombActionField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:485</i>
	 */
	@Virtual(29) 
	public int ReqCombActionInsert(Pointer<CThostFtdcInputCombActionField > pInputCombAction, int nRequestID) {
		return ReqCombActionInsert(Pointer.getPeer(pInputCombAction), nRequestID);
	}
	@Virtual(29) 
	protected native int ReqCombActionInsert(@Ptr long pInputCombAction, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u62a5\u5355<br>
	 * Original signature : <code>int ReqQryOrder(CThostFtdcQryOrderField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:488</i>
	 */
	@Virtual(30) 
	public int ReqQryOrder(Pointer<CThostFtdcQryOrderField > pQryOrder, int nRequestID) {
		return ReqQryOrder(Pointer.getPeer(pQryOrder), nRequestID);
	}
	@Virtual(30) 
	protected native int ReqQryOrder(@Ptr long pQryOrder, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6210\u4ea4<br>
	 * Original signature : <code>int ReqQryTrade(CThostFtdcQryTradeField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:491</i>
	 */
	@Virtual(31) 
	public int ReqQryTrade(Pointer<CThostFtdcQryTradeField > pQryTrade, int nRequestID) {
		return ReqQryTrade(Pointer.getPeer(pQryTrade), nRequestID);
	}
	@Virtual(31) 
	protected native int ReqQryTrade(@Ptr long pQryTrade, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6295\u8d44\u8005\u6301\u4ed3<br>
	 * Original signature : <code>int ReqQryInvestorPosition(CThostFtdcQryInvestorPositionField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:494</i>
	 */
	@Virtual(32) 
	public int ReqQryInvestorPosition(Pointer<CThostFtdcQryInvestorPositionField > pQryInvestorPosition, int nRequestID) {
		return ReqQryInvestorPosition(Pointer.getPeer(pQryInvestorPosition), nRequestID);
	}
	@Virtual(32) 
	protected native int ReqQryInvestorPosition(@Ptr long pQryInvestorPosition, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u8d44\u91d1\u8d26\u6237<br>
	 * Original signature : <code>int ReqQryTradingAccount(CThostFtdcQryTradingAccountField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:497</i>
	 */
	@Virtual(33) 
	public int ReqQryTradingAccount(Pointer<CThostFtdcQryTradingAccountField > pQryTradingAccount, int nRequestID) {
		return ReqQryTradingAccount(Pointer.getPeer(pQryTradingAccount), nRequestID);
	}
	@Virtual(33) 
	protected native int ReqQryTradingAccount(@Ptr long pQryTradingAccount, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6295\u8d44\u8005<br>
	 * Original signature : <code>int ReqQryInvestor(CThostFtdcQryInvestorField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:500</i>
	 */
	@Virtual(34) 
	public int ReqQryInvestor(Pointer<CThostFtdcQryInvestorField > pQryInvestor, int nRequestID) {
		return ReqQryInvestor(Pointer.getPeer(pQryInvestor), nRequestID);
	}
	@Virtual(34) 
	protected native int ReqQryInvestor(@Ptr long pQryInvestor, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea4\u6613\u7f16\u7801<br>
	 * Original signature : <code>int ReqQryTradingCode(CThostFtdcQryTradingCodeField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:503</i>
	 */
	@Virtual(35) 
	public int ReqQryTradingCode(Pointer<CThostFtdcQryTradingCodeField > pQryTradingCode, int nRequestID) {
		return ReqQryTradingCode(Pointer.getPeer(pQryTradingCode), nRequestID);
	}
	@Virtual(35) 
	protected native int ReqQryTradingCode(@Ptr long pQryTradingCode, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u5408\u7ea6\u4fdd\u8bc1\u91d1\u7387<br>
	 * Original signature : <code>int ReqQryInstrumentMarginRate(CThostFtdcQryInstrumentMarginRateField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:506</i>
	 */
	@Virtual(36) 
	public int ReqQryInstrumentMarginRate(Pointer<CThostFtdcQryInstrumentMarginRateField > pQryInstrumentMarginRate, int nRequestID) {
		return ReqQryInstrumentMarginRate(Pointer.getPeer(pQryInstrumentMarginRate), nRequestID);
	}
	@Virtual(36) 
	protected native int ReqQryInstrumentMarginRate(@Ptr long pQryInstrumentMarginRate, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u5408\u7ea6\u624b\u7eed\u8d39\u7387<br>
	 * Original signature : <code>int ReqQryInstrumentCommissionRate(CThostFtdcQryInstrumentCommissionRateField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:509</i>
	 */
	@Virtual(37) 
	public int ReqQryInstrumentCommissionRate(Pointer<CThostFtdcQryInstrumentCommissionRateField > pQryInstrumentCommissionRate, int nRequestID) {
		return ReqQryInstrumentCommissionRate(Pointer.getPeer(pQryInstrumentCommissionRate), nRequestID);
	}
	@Virtual(37) 
	protected native int ReqQryInstrumentCommissionRate(@Ptr long pQryInstrumentCommissionRate, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea4\u6613\u6240<br>
	 * Original signature : <code>int ReqQryExchange(CThostFtdcQryExchangeField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:512</i>
	 */
	@Virtual(38) 
	public int ReqQryExchange(Pointer<CThostFtdcQryExchangeField > pQryExchange, int nRequestID) {
		return ReqQryExchange(Pointer.getPeer(pQryExchange), nRequestID);
	}
	@Virtual(38) 
	protected native int ReqQryExchange(@Ptr long pQryExchange, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea7\u54c1<br>
	 * Original signature : <code>int ReqQryProduct(CThostFtdcQryProductField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:515</i>
	 */
	@Virtual(39) 
	public int ReqQryProduct(Pointer<CThostFtdcQryProductField > pQryProduct, int nRequestID) {
		return ReqQryProduct(Pointer.getPeer(pQryProduct), nRequestID);
	}
	@Virtual(39) 
	protected native int ReqQryProduct(@Ptr long pQryProduct, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u5408\u7ea6<br>
	 * Original signature : <code>int ReqQryInstrument(CThostFtdcQryInstrumentField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:518</i>
	 */
	@Virtual(40) 
	public int ReqQryInstrument(Pointer<CThostFtdcQryInstrumentField > pQryInstrument, int nRequestID) {
		return ReqQryInstrument(Pointer.getPeer(pQryInstrument), nRequestID);
	}
	@Virtual(40) 
	protected native int ReqQryInstrument(@Ptr long pQryInstrument, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u884c\u60c5<br>
	 * Original signature : <code>int ReqQryDepthMarketData(CThostFtdcQryDepthMarketDataField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:521</i>
	 */
	@Virtual(41) 
	public int ReqQryDepthMarketData(Pointer<CThostFtdcQryDepthMarketDataField > pQryDepthMarketData, int nRequestID) {
		return ReqQryDepthMarketData(Pointer.getPeer(pQryDepthMarketData), nRequestID);
	}
	@Virtual(41) 
	protected native int ReqQryDepthMarketData(@Ptr long pQryDepthMarketData, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6295\u8d44\u8005\u7ed3\u7b97\u7ed3\u679c<br>
	 * Original signature : <code>int ReqQrySettlementInfo(CThostFtdcQrySettlementInfoField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:524</i>
	 */
	@Virtual(42) 
	public int ReqQrySettlementInfo(Pointer<CThostFtdcQrySettlementInfoField > pQrySettlementInfo, int nRequestID) {
		return ReqQrySettlementInfo(Pointer.getPeer(pQrySettlementInfo), nRequestID);
	}
	@Virtual(42) 
	protected native int ReqQrySettlementInfo(@Ptr long pQrySettlementInfo, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u8f6c\u5e10\u94f6\u884c<br>
	 * Original signature : <code>int ReqQryTransferBank(CThostFtdcQryTransferBankField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:527</i>
	 */
	@Virtual(43) 
	public int ReqQryTransferBank(Pointer<CThostFtdcQryTransferBankField > pQryTransferBank, int nRequestID) {
		return ReqQryTransferBank(Pointer.getPeer(pQryTransferBank), nRequestID);
	}
	@Virtual(43) 
	protected native int ReqQryTransferBank(@Ptr long pQryTransferBank, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6295\u8d44\u8005\u6301\u4ed3\u660e\u7ec6<br>
	 * Original signature : <code>int ReqQryInvestorPositionDetail(CThostFtdcQryInvestorPositionDetailField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:530</i>
	 */
	@Virtual(44) 
	public int ReqQryInvestorPositionDetail(Pointer<CThostFtdcQryInvestorPositionDetailField > pQryInvestorPositionDetail, int nRequestID) {
		return ReqQryInvestorPositionDetail(Pointer.getPeer(pQryInvestorPositionDetail), nRequestID);
	}
	@Virtual(44) 
	protected native int ReqQryInvestorPositionDetail(@Ptr long pQryInvestorPositionDetail, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u5ba2\u6237\u901a\u77e5<br>
	 * Original signature : <code>int ReqQryNotice(CThostFtdcQryNoticeField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:533</i>
	 */
	@Virtual(45) 
	public int ReqQryNotice(Pointer<CThostFtdcQryNoticeField > pQryNotice, int nRequestID) {
		return ReqQryNotice(Pointer.getPeer(pQryNotice), nRequestID);
	}
	@Virtual(45) 
	protected native int ReqQryNotice(@Ptr long pQryNotice, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u7ed3\u7b97\u4fe1\u606f\u786e\u8ba4<br>
	 * Original signature : <code>int ReqQrySettlementInfoConfirm(CThostFtdcQrySettlementInfoConfirmField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:536</i>
	 */
	@Virtual(46) 
	public int ReqQrySettlementInfoConfirm(Pointer<CThostFtdcQrySettlementInfoConfirmField > pQrySettlementInfoConfirm, int nRequestID) {
		return ReqQrySettlementInfoConfirm(Pointer.getPeer(pQrySettlementInfoConfirm), nRequestID);
	}
	@Virtual(46) 
	protected native int ReqQrySettlementInfoConfirm(@Ptr long pQrySettlementInfoConfirm, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6295\u8d44\u8005\u6301\u4ed3\u660e\u7ec6<br>
	 * Original signature : <code>int ReqQryInvestorPositionCombineDetail(CThostFtdcQryInvestorPositionCombineDetailField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:539</i>
	 */
	@Virtual(47) 
	public int ReqQryInvestorPositionCombineDetail(Pointer<CThostFtdcQryInvestorPositionCombineDetailField > pQryInvestorPositionCombineDetail, int nRequestID) {
		return ReqQryInvestorPositionCombineDetail(Pointer.getPeer(pQryInvestorPositionCombineDetail), nRequestID);
	}
	@Virtual(47) 
	protected native int ReqQryInvestorPositionCombineDetail(@Ptr long pQryInvestorPositionCombineDetail, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4fdd\u8bc1\u91d1\u76d1\u7ba1\u7cfb\u7edf\u7ecf\u7eaa\u516c\u53f8\u8d44\u91d1\u8d26\u6237\u5bc6\u94a5<br>
	 * Original signature : <code>int ReqQryCFMMCTradingAccountKey(CThostFtdcQryCFMMCTradingAccountKeyField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:542</i>
	 */
	@Virtual(48) 
	public int ReqQryCFMMCTradingAccountKey(Pointer<CThostFtdcQryCFMMCTradingAccountKeyField > pQryCFMMCTradingAccountKey, int nRequestID) {
		return ReqQryCFMMCTradingAccountKey(Pointer.getPeer(pQryCFMMCTradingAccountKey), nRequestID);
	}
	@Virtual(48) 
	protected native int ReqQryCFMMCTradingAccountKey(@Ptr long pQryCFMMCTradingAccountKey, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ed3\u5355\u6298\u62b5\u4fe1\u606f<br>
	 * Original signature : <code>int ReqQryEWarrantOffset(CThostFtdcQryEWarrantOffsetField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:545</i>
	 */
	@Virtual(49) 
	public int ReqQryEWarrantOffset(Pointer<CThostFtdcQryEWarrantOffsetField > pQryEWarrantOffset, int nRequestID) {
		return ReqQryEWarrantOffset(Pointer.getPeer(pQryEWarrantOffset), nRequestID);
	}
	@Virtual(49) 
	protected native int ReqQryEWarrantOffset(@Ptr long pQryEWarrantOffset, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6295\u8d44\u8005\u54c1\u79cd/\u8de8\u54c1\u79cd\u4fdd\u8bc1\u91d1<br>
	 * Original signature : <code>int ReqQryInvestorProductGroupMargin(CThostFtdcQryInvestorProductGroupMarginField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:548</i>
	 */
	@Virtual(50) 
	public int ReqQryInvestorProductGroupMargin(Pointer<CThostFtdcQryInvestorProductGroupMarginField > pQryInvestorProductGroupMargin, int nRequestID) {
		return ReqQryInvestorProductGroupMargin(Pointer.getPeer(pQryInvestorProductGroupMargin), nRequestID);
	}
	@Virtual(50) 
	protected native int ReqQryInvestorProductGroupMargin(@Ptr long pQryInvestorProductGroupMargin, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea4\u6613\u6240\u4fdd\u8bc1\u91d1\u7387<br>
	 * Original signature : <code>int ReqQryExchangeMarginRate(CThostFtdcQryExchangeMarginRateField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:551</i>
	 */
	@Virtual(51) 
	public int ReqQryExchangeMarginRate(Pointer<CThostFtdcQryExchangeMarginRateField > pQryExchangeMarginRate, int nRequestID) {
		return ReqQryExchangeMarginRate(Pointer.getPeer(pQryExchangeMarginRate), nRequestID);
	}
	@Virtual(51) 
	protected native int ReqQryExchangeMarginRate(@Ptr long pQryExchangeMarginRate, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea4\u6613\u6240\u8c03\u6574\u4fdd\u8bc1\u91d1\u7387<br>
	 * Original signature : <code>int ReqQryExchangeMarginRateAdjust(CThostFtdcQryExchangeMarginRateAdjustField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:554</i>
	 */
	@Virtual(52) 
	public int ReqQryExchangeMarginRateAdjust(Pointer<CThostFtdcQryExchangeMarginRateAdjustField > pQryExchangeMarginRateAdjust, int nRequestID) {
		return ReqQryExchangeMarginRateAdjust(Pointer.getPeer(pQryExchangeMarginRateAdjust), nRequestID);
	}
	@Virtual(52) 
	protected native int ReqQryExchangeMarginRateAdjust(@Ptr long pQryExchangeMarginRateAdjust, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6c47\u7387<br>
	 * Original signature : <code>int ReqQryExchangeRate(CThostFtdcQryExchangeRateField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:557</i>
	 */
	@Virtual(53) 
	public int ReqQryExchangeRate(Pointer<CThostFtdcQryExchangeRateField > pQryExchangeRate, int nRequestID) {
		return ReqQryExchangeRate(Pointer.getPeer(pQryExchangeRate), nRequestID);
	}
	@Virtual(53) 
	protected native int ReqQryExchangeRate(@Ptr long pQryExchangeRate, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4e8c\u7ea7\u4ee3\u7406\u64cd\u4f5c\u5458\u94f6\u671f\u6743\u9650<br>
	 * Original signature : <code>int ReqQrySecAgentACIDMap(CThostFtdcQrySecAgentACIDMapField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:560</i>
	 */
	@Virtual(54) 
	public int ReqQrySecAgentACIDMap(Pointer<CThostFtdcQrySecAgentACIDMapField > pQrySecAgentACIDMap, int nRequestID) {
		return ReqQrySecAgentACIDMap(Pointer.getPeer(pQrySecAgentACIDMap), nRequestID);
	}
	@Virtual(54) 
	protected native int ReqQrySecAgentACIDMap(@Ptr long pQrySecAgentACIDMap, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea7\u54c1\u62a5\u4ef7\u6c47\u7387<br>
	 * Original signature : <code>int ReqQryProductExchRate(CThostFtdcQryProductExchRateField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:563</i>
	 */
	@Virtual(55) 
	public int ReqQryProductExchRate(Pointer<CThostFtdcQryProductExchRateField > pQryProductExchRate, int nRequestID) {
		return ReqQryProductExchRate(Pointer.getPeer(pQryProductExchRate), nRequestID);
	}
	@Virtual(55) 
	protected native int ReqQryProductExchRate(@Ptr long pQryProductExchRate, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea7\u54c1\u7ec4<br>
	 * Original signature : <code>int ReqQryProductGroup(CThostFtdcQryProductGroupField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:566</i>
	 */
	@Virtual(56) 
	public int ReqQryProductGroup(Pointer<CThostFtdcQryProductGroupField > pQryProductGroup, int nRequestID) {
		return ReqQryProductGroup(Pointer.getPeer(pQryProductGroup), nRequestID);
	}
	@Virtual(56) 
	protected native int ReqQryProductGroup(@Ptr long pQryProductGroup, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u505a\u5e02\u5546\u5408\u7ea6\u624b\u7eed\u8d39\u7387<br>
	 * Original signature : <code>int ReqQryMMInstrumentCommissionRate(CThostFtdcQryMMInstrumentCommissionRateField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:569</i>
	 */
	@Virtual(57) 
	public int ReqQryMMInstrumentCommissionRate(Pointer<CThostFtdcQryMMInstrumentCommissionRateField > pQryMMInstrumentCommissionRate, int nRequestID) {
		return ReqQryMMInstrumentCommissionRate(Pointer.getPeer(pQryMMInstrumentCommissionRate), nRequestID);
	}
	@Virtual(57) 
	protected native int ReqQryMMInstrumentCommissionRate(@Ptr long pQryMMInstrumentCommissionRate, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u505a\u5e02\u5546\u671f\u6743\u5408\u7ea6\u624b\u7eed\u8d39<br>
	 * Original signature : <code>int ReqQryMMOptionInstrCommRate(CThostFtdcQryMMOptionInstrCommRateField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:572</i>
	 */
	@Virtual(58) 
	public int ReqQryMMOptionInstrCommRate(Pointer<CThostFtdcQryMMOptionInstrCommRateField > pQryMMOptionInstrCommRate, int nRequestID) {
		return ReqQryMMOptionInstrCommRate(Pointer.getPeer(pQryMMOptionInstrCommRate), nRequestID);
	}
	@Virtual(58) 
	protected native int ReqQryMMOptionInstrCommRate(@Ptr long pQryMMOptionInstrCommRate, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u62a5\u5355\u624b\u7eed\u8d39<br>
	 * Original signature : <code>int ReqQryInstrumentOrderCommRate(CThostFtdcQryInstrumentOrderCommRateField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:575</i>
	 */
	@Virtual(59) 
	public int ReqQryInstrumentOrderCommRate(Pointer<CThostFtdcQryInstrumentOrderCommRateField > pQryInstrumentOrderCommRate, int nRequestID) {
		return ReqQryInstrumentOrderCommRate(Pointer.getPeer(pQryInstrumentOrderCommRate), nRequestID);
	}
	@Virtual(59) 
	protected native int ReqQryInstrumentOrderCommRate(@Ptr long pQryInstrumentOrderCommRate, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u671f\u6743\u4ea4\u6613\u6210\u672c<br>
	 * Original signature : <code>int ReqQryOptionInstrTradeCost(CThostFtdcQryOptionInstrTradeCostField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:578</i>
	 */
	@Virtual(60) 
	public int ReqQryOptionInstrTradeCost(Pointer<CThostFtdcQryOptionInstrTradeCostField > pQryOptionInstrTradeCost, int nRequestID) {
		return ReqQryOptionInstrTradeCost(Pointer.getPeer(pQryOptionInstrTradeCost), nRequestID);
	}
	@Virtual(60) 
	protected native int ReqQryOptionInstrTradeCost(@Ptr long pQryOptionInstrTradeCost, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u671f\u6743\u5408\u7ea6\u624b\u7eed\u8d39<br>
	 * Original signature : <code>int ReqQryOptionInstrCommRate(CThostFtdcQryOptionInstrCommRateField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:581</i>
	 */
	@Virtual(61) 
	public int ReqQryOptionInstrCommRate(Pointer<CThostFtdcQryOptionInstrCommRateField > pQryOptionInstrCommRate, int nRequestID) {
		return ReqQryOptionInstrCommRate(Pointer.getPeer(pQryOptionInstrCommRate), nRequestID);
	}
	@Virtual(61) 
	protected native int ReqQryOptionInstrCommRate(@Ptr long pQryOptionInstrCommRate, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u6267\u884c\u5ba3\u544a<br>
	 * Original signature : <code>int ReqQryExecOrder(CThostFtdcQryExecOrderField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:584</i>
	 */
	@Virtual(62) 
	public int ReqQryExecOrder(Pointer<CThostFtdcQryExecOrderField > pQryExecOrder, int nRequestID) {
		return ReqQryExecOrder(Pointer.getPeer(pQryExecOrder), nRequestID);
	}
	@Virtual(62) 
	protected native int ReqQryExecOrder(@Ptr long pQryExecOrder, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u8be2\u4ef7<br>
	 * Original signature : <code>int ReqQryForQuote(CThostFtdcQryForQuoteField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:587</i>
	 */
	@Virtual(63) 
	public int ReqQryForQuote(Pointer<CThostFtdcQryForQuoteField > pQryForQuote, int nRequestID) {
		return ReqQryForQuote(Pointer.getPeer(pQryForQuote), nRequestID);
	}
	@Virtual(63) 
	protected native int ReqQryForQuote(@Ptr long pQryForQuote, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u62a5\u4ef7<br>
	 * Original signature : <code>int ReqQryQuote(CThostFtdcQryQuoteField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:590</i>
	 */
	@Virtual(64) 
	public int ReqQryQuote(Pointer<CThostFtdcQryQuoteField > pQryQuote, int nRequestID) {
		return ReqQryQuote(Pointer.getPeer(pQryQuote), nRequestID);
	}
	@Virtual(64) 
	protected native int ReqQryQuote(@Ptr long pQryQuote, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u7ec4\u5408\u5408\u7ea6\u5b89\u5168\u7cfb\u6570<br>
	 * Original signature : <code>int ReqQryCombInstrumentGuard(CThostFtdcQryCombInstrumentGuardField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:593</i>
	 */
	@Virtual(65) 
	public int ReqQryCombInstrumentGuard(Pointer<CThostFtdcQryCombInstrumentGuardField > pQryCombInstrumentGuard, int nRequestID) {
		return ReqQryCombInstrumentGuard(Pointer.getPeer(pQryCombInstrumentGuard), nRequestID);
	}
	@Virtual(65) 
	protected native int ReqQryCombInstrumentGuard(@Ptr long pQryCombInstrumentGuard, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u7533\u8bf7\u7ec4\u5408<br>
	 * Original signature : <code>int ReqQryCombAction(CThostFtdcQryCombActionField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:596</i>
	 */
	@Virtual(66) 
	public int ReqQryCombAction(Pointer<CThostFtdcQryCombActionField > pQryCombAction, int nRequestID) {
		return ReqQryCombAction(Pointer.getPeer(pQryCombAction), nRequestID);
	}
	@Virtual(66) 
	protected native int ReqQryCombAction(@Ptr long pQryCombAction, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u8f6c\u5e10\u6d41\u6c34<br>
	 * Original signature : <code>int ReqQryTransferSerial(CThostFtdcQryTransferSerialField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:599</i>
	 */
	@Virtual(67) 
	public int ReqQryTransferSerial(Pointer<CThostFtdcQryTransferSerialField > pQryTransferSerial, int nRequestID) {
		return ReqQryTransferSerial(Pointer.getPeer(pQryTransferSerial), nRequestID);
	}
	@Virtual(67) 
	protected native int ReqQryTransferSerial(@Ptr long pQryTransferSerial, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u94f6\u671f\u7b7e\u7ea6\u5173\u7cfb<br>
	 * Original signature : <code>int ReqQryAccountregister(CThostFtdcQryAccountregisterField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:602</i>
	 */
	@Virtual(68) 
	public int ReqQryAccountregister(Pointer<CThostFtdcQryAccountregisterField > pQryAccountregister, int nRequestID) {
		return ReqQryAccountregister(Pointer.getPeer(pQryAccountregister), nRequestID);
	}
	@Virtual(68) 
	protected native int ReqQryAccountregister(@Ptr long pQryAccountregister, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u7b7e\u7ea6\u94f6\u884c<br>
	 * Original signature : <code>int ReqQryContractBank(CThostFtdcQryContractBankField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:605</i>
	 */
	@Virtual(69) 
	public int ReqQryContractBank(Pointer<CThostFtdcQryContractBankField > pQryContractBank, int nRequestID) {
		return ReqQryContractBank(Pointer.getPeer(pQryContractBank), nRequestID);
	}
	@Virtual(69) 
	protected native int ReqQryContractBank(@Ptr long pQryContractBank, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u9884\u57cb\u5355<br>
	 * Original signature : <code>int ReqQryParkedOrder(CThostFtdcQryParkedOrderField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:608</i>
	 */
	@Virtual(70) 
	public int ReqQryParkedOrder(Pointer<CThostFtdcQryParkedOrderField > pQryParkedOrder, int nRequestID) {
		return ReqQryParkedOrder(Pointer.getPeer(pQryParkedOrder), nRequestID);
	}
	@Virtual(70) 
	protected native int ReqQryParkedOrder(@Ptr long pQryParkedOrder, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u9884\u57cb\u64a4\u5355<br>
	 * Original signature : <code>int ReqQryParkedOrderAction(CThostFtdcQryParkedOrderActionField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:611</i>
	 */
	@Virtual(71) 
	public int ReqQryParkedOrderAction(Pointer<CThostFtdcQryParkedOrderActionField > pQryParkedOrderAction, int nRequestID) {
		return ReqQryParkedOrderAction(Pointer.getPeer(pQryParkedOrderAction), nRequestID);
	}
	@Virtual(71) 
	protected native int ReqQryParkedOrderAction(@Ptr long pQryParkedOrderAction, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u4ea4\u6613\u901a\u77e5<br>
	 * Original signature : <code>int ReqQryTradingNotice(CThostFtdcQryTradingNoticeField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:614</i>
	 */
	@Virtual(72) 
	public int ReqQryTradingNotice(Pointer<CThostFtdcQryTradingNoticeField > pQryTradingNotice, int nRequestID) {
		return ReqQryTradingNotice(Pointer.getPeer(pQryTradingNotice), nRequestID);
	}
	@Virtual(72) 
	protected native int ReqQryTradingNotice(@Ptr long pQryTradingNotice, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u7ecf\u7eaa\u516c\u53f8\u4ea4\u6613\u53c2\u6570<br>
	 * Original signature : <code>int ReqQryBrokerTradingParams(CThostFtdcQryBrokerTradingParamsField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:617</i>
	 */
	@Virtual(73) 
	public int ReqQryBrokerTradingParams(Pointer<CThostFtdcQryBrokerTradingParamsField > pQryBrokerTradingParams, int nRequestID) {
		return ReqQryBrokerTradingParams(Pointer.getPeer(pQryBrokerTradingParams), nRequestID);
	}
	@Virtual(73) 
	protected native int ReqQryBrokerTradingParams(@Ptr long pQryBrokerTradingParams, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u7ecf\u7eaa\u516c\u53f8\u4ea4\u6613\u7b97\u6cd5<br>
	 * Original signature : <code>int ReqQryBrokerTradingAlgos(CThostFtdcQryBrokerTradingAlgosField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:620</i>
	 */
	@Virtual(74) 
	public int ReqQryBrokerTradingAlgos(Pointer<CThostFtdcQryBrokerTradingAlgosField > pQryBrokerTradingAlgos, int nRequestID) {
		return ReqQryBrokerTradingAlgos(Pointer.getPeer(pQryBrokerTradingAlgos), nRequestID);
	}
	@Virtual(74) 
	protected native int ReqQryBrokerTradingAlgos(@Ptr long pQryBrokerTradingAlgos, int nRequestID);
	/**
	 * \u8bf7\u6c42\u67e5\u8be2\u76d1\u63a7\u4e2d\u5fc3\u7528\u6237\u4ee4\u724c<br>
	 * Original signature : <code>int ReqQueryCFMMCTradingAccountToken(CThostFtdcQueryCFMMCTradingAccountTokenField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:623</i>
	 */
	@Virtual(75) 
	public int ReqQueryCFMMCTradingAccountToken(Pointer<CThostFtdcQueryCFMMCTradingAccountTokenField > pQueryCFMMCTradingAccountToken, int nRequestID) {
		return ReqQueryCFMMCTradingAccountToken(Pointer.getPeer(pQueryCFMMCTradingAccountToken), nRequestID);
	}
	@Virtual(75) 
	protected native int ReqQueryCFMMCTradingAccountToken(@Ptr long pQueryCFMMCTradingAccountToken, int nRequestID);
	/**
	 * \u671f\u8d27\u53d1\u8d77\u94f6\u884c\u8d44\u91d1\u8f6c\u671f\u8d27\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqFromBankToFutureByFuture(CThostFtdcReqTransferField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:626</i>
	 */
	@Virtual(76) 
	public int ReqFromBankToFutureByFuture(Pointer<CThostFtdcReqTransferField > pReqTransfer, int nRequestID) {
		return ReqFromBankToFutureByFuture(Pointer.getPeer(pReqTransfer), nRequestID);
	}
	@Virtual(76) 
	protected native int ReqFromBankToFutureByFuture(@Ptr long pReqTransfer, int nRequestID);
	/**
	 * \u671f\u8d27\u53d1\u8d77\u671f\u8d27\u8d44\u91d1\u8f6c\u94f6\u884c\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqFromFutureToBankByFuture(CThostFtdcReqTransferField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:629</i>
	 */
	@Virtual(77) 
	public int ReqFromFutureToBankByFuture(Pointer<CThostFtdcReqTransferField > pReqTransfer, int nRequestID) {
		return ReqFromFutureToBankByFuture(Pointer.getPeer(pReqTransfer), nRequestID);
	}
	@Virtual(77) 
	protected native int ReqFromFutureToBankByFuture(@Ptr long pReqTransfer, int nRequestID);
	/**
	 * \u671f\u8d27\u53d1\u8d77\u67e5\u8be2\u94f6\u884c\u4f59\u989d\u8bf7\u6c42<br>
	 * Original signature : <code>int ReqQueryBankAccountMoneyByFuture(CThostFtdcReqQueryAccountField*, int)</code><br>
	 * <i>native declaration : ThostFtdcTraderApi.h:632</i>
	 */
	@Virtual(78) 
	public int ReqQueryBankAccountMoneyByFuture(Pointer<CThostFtdcReqQueryAccountField > pReqQueryAccount, int nRequestID) {
		return ReqQueryBankAccountMoneyByFuture(Pointer.getPeer(pReqQueryAccount), nRequestID);
	}
	@Virtual(78) 
	protected native int ReqQueryBankAccountMoneyByFuture(@Ptr long pReqQueryAccount, int nRequestID);
	public CThostFtdcTraderApi() {
		super();
	}
	public CThostFtdcTraderApi(Pointer pointer) {
		super(pointer);
	}
}
