package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u6c47\u7387<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:1073</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcExchangeRateField extends StructObject {
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
	 * \u6e90\u5e01\u79cd<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(1) 
	public Pointer<Byte > FromCurrencyID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u6e90\u5e01\u79cd\u5355\u4f4d\u6570\u91cf<br>
	 * C type : TThostFtdcCurrencyUnitType
	 */
	@Field(2) 
	public double FromCurrencyUnit() {
		return this.io.getDoubleField(this, 2);
	}
	/**
	 * \u6e90\u5e01\u79cd\u5355\u4f4d\u6570\u91cf<br>
	 * C type : TThostFtdcCurrencyUnitType
	 */
	@Field(2) 
	public CThostFtdcExchangeRateField FromCurrencyUnit(double FromCurrencyUnit) {
		this.io.setDoubleField(this, 2, FromCurrencyUnit);
		return this;
	}
	/**
	 * \u76ee\u6807\u5e01\u79cd<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(3) 
	public Pointer<Byte > ToCurrencyID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u6c47\u7387<br>
	 * C type : TThostFtdcExchangeRateType
	 */
	@Field(4) 
	public double ExchangeRate() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \u6c47\u7387<br>
	 * C type : TThostFtdcExchangeRateType
	 */
	@Field(4) 
	public CThostFtdcExchangeRateField ExchangeRate(double ExchangeRate) {
		this.io.setDoubleField(this, 4, ExchangeRate);
		return this;
	}
	public CThostFtdcExchangeRateField() {
		super();
	}
	public CThostFtdcExchangeRateField(Pointer pointer) {
		super(pointer);
	}
}
