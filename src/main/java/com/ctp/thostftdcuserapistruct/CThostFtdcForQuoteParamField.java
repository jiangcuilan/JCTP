package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u8be2\u4ef7\u4ef7\u5dee\u53c2\u6570<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4205</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcForQuoteParamField extends StructObject {
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
	 * \u5408\u7ea6\u4ee3\u7801<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(1) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u4ea4\u6613\u6240\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u6700\u65b0\u4ef7<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(3) 
	public double LastPrice() {
		return this.io.getDoubleField(this, 3);
	}
	/**
	 * \u6700\u65b0\u4ef7<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(3) 
	public CThostFtdcForQuoteParamField LastPrice(double LastPrice) {
		this.io.setDoubleField(this, 3, LastPrice);
		return this;
	}
	/**
	 * \u4ef7\u5dee<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(4) 
	public double PriceInterval() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \u4ef7\u5dee<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(4) 
	public CThostFtdcForQuoteParamField PriceInterval(double PriceInterval) {
		this.io.setDoubleField(this, 4, PriceInterval);
		return this;
	}
	public CThostFtdcForQuoteParamField() {
		super();
	}
	public CThostFtdcForQuoteParamField(Pointer pointer) {
		super(pointer);
	}
}
