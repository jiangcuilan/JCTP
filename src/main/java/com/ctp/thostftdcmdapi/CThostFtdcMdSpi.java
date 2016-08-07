package com.ctp.thostftdcmdapi;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;

import com.ctp.thostftdcuserapistruct.CThostFtdcDepthMarketDataField;
import com.ctp.thostftdcuserapistruct.CThostFtdcForQuoteRspField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRspInfoField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRspUserLoginField;
import com.ctp.thostftdcuserapistruct.CThostFtdcSpecificInstrumentField;
import com.ctp.thostftdcuserapistruct.CThostFtdcUserLogoutField;
/**
 * <i>native declaration : ThostFtdcMdApi.h:13</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thostmduserapi") 
public class CThostFtdcMdSpi extends CPPObject {
	/**
	 * \u5f53\u5ba2\u6237\u7aef\u4e0e\u4ea4\u6613\u540e\u53f0\u5efa\u7acb\u8d77\u901a\u4fe1\u8fde\u63a5\u65f6\uff08\u8fd8\u672a\u767b\u5f55\u524d\uff09\uff0c\u8be5\u65b9\u6cd5\u88ab\u8c03\u7528\u3002<br>
	 * Original signature : <code>void OnFrontConnected()</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:17</i>
	 */
	@Virtual(0) 
	native public void OnFrontConnected();
	/**
	 * 0x2003 \u6536\u5230\u9519\u8bef\u62a5\u6587<br>
	 * Original signature : <code>void OnFrontDisconnected(int)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:26</i>
	 */
	@Virtual(1) 
	native public void OnFrontDisconnected(int nReason);
	/**
	 * @param nTimeLapse \u8ddd\u79bb\u4e0a\u6b21\u63a5\u6536\u62a5\u6587\u7684\u65f6\u95f4<br>
	 * Original signature : <code>void OnHeartBeatWarning(int)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:30</i>
	 */
	@Virtual(2) 
	native public void OnHeartBeatWarning(int nTimeLapse);
	/**
	 * \u767b\u5f55\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspUserLogin(CThostFtdcRspUserLoginField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:34</i>
	 */
	@Virtual(3) 
	public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField > pRspUserLogin, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspUserLogin(Pointer.getPeer(pRspUserLogin), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(3) 
	protected native void OnRspUserLogin(@Ptr long pRspUserLogin, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u767b\u51fa\u8bf7\u6c42\u54cd\u5e94<br>
	 * Original signature : <code>void OnRspUserLogout(CThostFtdcUserLogoutField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:37</i>
	 */
	@Virtual(4) 
	public void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField > pUserLogout, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspUserLogout(Pointer.getPeer(pUserLogout), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(4) 
	protected native void OnRspUserLogout(@Ptr long pUserLogout, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u9519\u8bef\u5e94\u7b54<br>
	 * Original signature : <code>void OnRspError(CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:40</i>
	 */
	@Virtual(5) 
	public void OnRspError(Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspError(Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(5) 
	protected native void OnRspError(@Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8ba2\u9605\u884c\u60c5\u5e94\u7b54<br>
	 * Original signature : <code>void OnRspSubMarketData(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:43</i>
	 */
	@Virtual(6) 
	public void OnRspSubMarketData(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspSubMarketData(Pointer.getPeer(pSpecificInstrument), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(6) 
	protected native void OnRspSubMarketData(@Ptr long pSpecificInstrument, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u53d6\u6d88\u8ba2\u9605\u884c\u60c5\u5e94\u7b54<br>
	 * Original signature : <code>void OnRspUnSubMarketData(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:46</i>
	 */
	@Virtual(7) 
	public void OnRspUnSubMarketData(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspUnSubMarketData(Pointer.getPeer(pSpecificInstrument), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(7) 
	protected native void OnRspUnSubMarketData(@Ptr long pSpecificInstrument, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u8ba2\u9605\u8be2\u4ef7\u5e94\u7b54<br>
	 * Original signature : <code>void OnRspSubForQuoteRsp(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:49</i>
	 */
	@Virtual(8) 
	public void OnRspSubForQuoteRsp(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspSubForQuoteRsp(Pointer.getPeer(pSpecificInstrument), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(8) 
	protected native void OnRspSubForQuoteRsp(@Ptr long pSpecificInstrument, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u53d6\u6d88\u8ba2\u9605\u8be2\u4ef7\u5e94\u7b54<br>
	 * Original signature : <code>void OnRspUnSubForQuoteRsp(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:52</i>
	 */
	@Virtual(9) 
	public void OnRspUnSubForQuoteRsp(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspUnSubForQuoteRsp(Pointer.getPeer(pSpecificInstrument), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(9) 
	protected native void OnRspUnSubForQuoteRsp(@Ptr long pSpecificInstrument, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u6df1\u5ea6\u884c\u60c5\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField*)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:55</i>
	 */
	@Virtual(10) 
	public void OnRtnDepthMarketData(Pointer<CThostFtdcDepthMarketDataField > pDepthMarketData) {
		OnRtnDepthMarketData(Pointer.getPeer(pDepthMarketData));
	}
	@Virtual(10) 
	protected native void OnRtnDepthMarketData(@Ptr long pDepthMarketData);
	/**
	 * \u8be2\u4ef7\u901a\u77e5<br>
	 * Original signature : <code>void OnRtnForQuoteRsp(CThostFtdcForQuoteRspField*)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:58</i>
	 */
	@Virtual(11) 
	public void OnRtnForQuoteRsp(Pointer<CThostFtdcForQuoteRspField > pForQuoteRsp) {
		OnRtnForQuoteRsp(Pointer.getPeer(pForQuoteRsp));
	}
	@Virtual(11) 
	protected native void OnRtnForQuoteRsp(@Ptr long pForQuoteRsp);
	public CThostFtdcMdSpi() {
		super();
	}
	public CThostFtdcMdSpi(Pointer pointer) {
		super(pointer);
	}
}
