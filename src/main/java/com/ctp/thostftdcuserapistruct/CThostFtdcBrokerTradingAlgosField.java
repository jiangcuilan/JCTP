package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u7ecf\u7eaa\u516c\u53f8\u4ea4\u6613\u7b97\u6cd5<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:5680</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcBrokerTradingAlgosField extends StructObject {
	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u4ea4\u6613\u6240\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u5408\u7ea6\u4ee3\u7801<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u6301\u4ed3\u5904\u7406\u7b97\u6cd5\u7f16\u53f7<br>
	 * C type : TThostFtdcHandlePositionAlgoIDType
	 */
	@Field(3) 
	public byte HandlePositionAlgoID() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \u6301\u4ed3\u5904\u7406\u7b97\u6cd5\u7f16\u53f7<br>
	 * C type : TThostFtdcHandlePositionAlgoIDType
	 */
	@Field(3) 
	public CThostFtdcBrokerTradingAlgosField HandlePositionAlgoID(byte HandlePositionAlgoID) {
		this.io.setByteField(this, 3, HandlePositionAlgoID);
		return this;
	}
	/**
	 * \u5bfb\u627e\u4fdd\u8bc1\u91d1\u7387\u7b97\u6cd5\u7f16\u53f7<br>
	 * C type : TThostFtdcFindMarginRateAlgoIDType
	 */
	@Field(4) 
	public byte FindMarginRateAlgoID() {
		return this.io.getByteField(this, 4);
	}
	/**
	 * \u5bfb\u627e\u4fdd\u8bc1\u91d1\u7387\u7b97\u6cd5\u7f16\u53f7<br>
	 * C type : TThostFtdcFindMarginRateAlgoIDType
	 */
	@Field(4) 
	public CThostFtdcBrokerTradingAlgosField FindMarginRateAlgoID(byte FindMarginRateAlgoID) {
		this.io.setByteField(this, 4, FindMarginRateAlgoID);
		return this;
	}
	/**
	 * \u8d44\u91d1\u5904\u7406\u7b97\u6cd5\u7f16\u53f7<br>
	 * C type : TThostFtdcHandleTradingAccountAlgoIDType
	 */
	@Field(5) 
	public byte HandleTradingAccountAlgoID() {
		return this.io.getByteField(this, 5);
	}
	/**
	 * \u8d44\u91d1\u5904\u7406\u7b97\u6cd5\u7f16\u53f7<br>
	 * C type : TThostFtdcHandleTradingAccountAlgoIDType
	 */
	@Field(5) 
	public CThostFtdcBrokerTradingAlgosField HandleTradingAccountAlgoID(byte HandleTradingAccountAlgoID) {
		this.io.setByteField(this, 5, HandleTradingAccountAlgoID);
		return this;
	}
	public CThostFtdcBrokerTradingAlgosField() {
		super();
	}
	public CThostFtdcBrokerTradingAlgosField(Pointer pointer) {
		super(pointer);
	}
}
