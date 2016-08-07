package com.jctp.md;

import static com.jctp.util.JCTPStructUtil.getStructObject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Virtual;

import com.ctp.thostftdcmdapi.CThostFtdcMdSpi;
import com.ctp.thostftdcuserapistruct.CThostFtdcDepthMarketDataField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRspInfoField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRspUserLoginField;
import com.ctp.thostftdcuserapistruct.CThostFtdcSpecificInstrumentField;
import com.ctp.thostftdcuserapistruct.CThostFtdcUserLogoutField;

/**
 * MdSpi适配器类
 * 
 * @author Hraink E-mail:Hraink@Gmail.com
 * @version 2013-1-27 上午11:31:12
 */

public final class JCTPMdSpiAdapter extends CThostFtdcMdSpi{
	
	JCTPMdSpi mdSpi;
	
	public JCTPMdSpiAdapter(JCTPMdSpi mdSpi) {
		BridJ.protectFromGC(this);
		this.mdSpi = mdSpi;
	}
	@Override
	@Virtual(0)
	public void OnFrontConnected() {
		mdSpi.onFrontConnected();
	}

	@Override
	@Virtual(1)
	public void OnFrontDisconnected(int nReason) {
		mdSpi.onFrontDisconnected(nReason);
	}

	@Override
	@Virtual(2)
	public void OnHeartBeatWarning(int nTimeLapse) {
		mdSpi.onHeartBeatWarning(nTimeLapse);
	}

	@Override
	@Virtual(3)
	public void OnRspUserLogin(
			Pointer<CThostFtdcRspUserLoginField> pRspUserLogin,
			Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID,
			boolean bIsLast) {
		mdSpi.onRspUserLogin(getStructObject(pRspUserLogin), getStructObject(pRspInfo), nRequestID, bIsLast);
	}

	@Override
	@Virtual(4)
	public void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField> pUserLogout,
			Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID,
			boolean bIsLast) {
		mdSpi.onRspUserLogout(getStructObject(pUserLogout), getStructObject(pRspInfo), nRequestID, bIsLast);
	}

	@Override
	@Virtual(5)
	public void OnRspError(Pointer<CThostFtdcRspInfoField> pRspInfo,
			int nRequestID, boolean bIsLast) {
		mdSpi.onRspError(getStructObject(pRspInfo), nRequestID, bIsLast);
	}

	@Override
	@Virtual(6)
	public void OnRspSubMarketData(
			Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument,
			Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID,
			boolean bIsLast) {
		mdSpi.onRspSubMarketData(getStructObject(pSpecificInstrument), getStructObject(pRspInfo), nRequestID, bIsLast);
	}

	@Override
	@Virtual(7)
	public void OnRspUnSubMarketData(
			Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument,
			Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID,
			boolean bIsLast) {
		mdSpi.onRspUnSubMarketData(getStructObject(pSpecificInstrument), getStructObject(pRspInfo), nRequestID, bIsLast);
	}

	@Override
	@Virtual(8)
	public void OnRtnDepthMarketData(
			Pointer<CThostFtdcDepthMarketDataField> pDepthMarketData) {
		mdSpi.onRtnDepthMarketData(getStructObject(pDepthMarketData));
	}
	
	/**
	 * 获得Field
	 * 
	 * 对可能出现的null值做处理
	 * @param <T>
	 * @param field field的指针对象
	 * @return
	 */
	private <T extends StructObject> T getField(Pointer<T> field) {
		return field == null ? null : field.get();
	}
}
