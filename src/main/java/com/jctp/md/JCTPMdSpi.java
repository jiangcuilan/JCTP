package com.jctp.md;

import com.ctp.thostftdcuserapistruct.CThostFtdcDepthMarketDataField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRspInfoField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRspUserLoginField;
import com.ctp.thostftdcuserapistruct.CThostFtdcSpecificInstrumentField;
import com.ctp.thostftdcuserapistruct.CThostFtdcUserLogoutField;

/**
 * JCTPMdSpi
 * 
 * @author Hraink E-mail:Hraink@Gmail.com
 * @version 2013-1-27 上午12:05:18
 */

public class JCTPMdSpi {
	
	/**
	 * 当客户端与交易后台建立起通信连接时（还未登录前），该方法被调用
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
	 * 错误应答
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 订阅行情应答
	 * @param pSpecificInstrument
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 取消订阅行情应答
	 * @param pSpecificInstrument
	 * @param pRspInfo
	 * @param nRequestID
	 * @param bIsLast
	 */
	public void onRspUnSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
	}
	
	/**
	 * 深度行情通知
	 * @param pDepthMarketData
	 */
	public void onRtnDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData) {
	}
}
