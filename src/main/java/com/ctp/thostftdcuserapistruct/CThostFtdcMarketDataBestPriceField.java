package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u884c\u60c5\u6700\u4f18\u4ef7\u5c5e\u6027<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4426</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcMarketDataBestPriceField extends StructObject {
	/**
	 * \u7533\u4e70\u4ef7\u4e00<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(0) 
	public double BidPrice1() {
		return this.io.getDoubleField(this, 0);
	}
	/**
	 * \u7533\u4e70\u4ef7\u4e00<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(0) 
	public CThostFtdcMarketDataBestPriceField BidPrice1(double BidPrice1) {
		this.io.setDoubleField(this, 0, BidPrice1);
		return this;
	}
	/**
	 * \u7533\u4e70\u91cf\u4e00<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(1) 
	public int BidVolume1() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * \u7533\u4e70\u91cf\u4e00<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(1) 
	public CThostFtdcMarketDataBestPriceField BidVolume1(int BidVolume1) {
		this.io.setIntField(this, 1, BidVolume1);
		return this;
	}
	/**
	 * \u7533\u5356\u4ef7\u4e00<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(2) 
	public double AskPrice1() {
		return this.io.getDoubleField(this, 2);
	}
	/**
	 * \u7533\u5356\u4ef7\u4e00<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(2) 
	public CThostFtdcMarketDataBestPriceField AskPrice1(double AskPrice1) {
		this.io.setDoubleField(this, 2, AskPrice1);
		return this;
	}
	/**
	 * \u7533\u5356\u91cf\u4e00<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(3) 
	public int AskVolume1() {
		return this.io.getIntField(this, 3);
	}
	/**
	 * \u7533\u5356\u91cf\u4e00<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(3) 
	public CThostFtdcMarketDataBestPriceField AskVolume1(int AskVolume1) {
		this.io.setIntField(this, 3, AskVolume1);
		return this;
	}
	public CThostFtdcMarketDataBestPriceField() {
		super();
	}
	public CThostFtdcMarketDataBestPriceField(Pointer pointer) {
		super(pointer);
	}
}
