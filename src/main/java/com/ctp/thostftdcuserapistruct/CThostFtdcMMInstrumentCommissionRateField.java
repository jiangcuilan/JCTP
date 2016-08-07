package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u505a\u5e02\u5546\u5408\u7ea6\u624b\u7eed\u8d39\u7387<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4260</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcMMInstrumentCommissionRateField extends StructObject {
	/**
	 * \u5408\u7ea6\u4ee3\u7801<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(0) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u6295\u8d44\u8005\u8303\u56f4<br>
	 * C type : TThostFtdcInvestorRangeType
	 */
	@Field(1) 
	public byte InvestorRange() {
		return this.io.getByteField(this, 1);
	}
	/**
	 * \u6295\u8d44\u8005\u8303\u56f4<br>
	 * C type : TThostFtdcInvestorRangeType
	 */
	@Field(1) 
	public CThostFtdcMMInstrumentCommissionRateField InvestorRange(byte InvestorRange) {
		this.io.setByteField(this, 1, InvestorRange);
		return this;
	}
	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u6295\u8d44\u8005\u4ee3\u7801<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u5f00\u4ed3\u624b\u7eed\u8d39\u7387<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(4) 
	public double OpenRatioByMoney() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \u5f00\u4ed3\u624b\u7eed\u8d39\u7387<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(4) 
	public CThostFtdcMMInstrumentCommissionRateField OpenRatioByMoney(double OpenRatioByMoney) {
		this.io.setDoubleField(this, 4, OpenRatioByMoney);
		return this;
	}
	/**
	 * \u5f00\u4ed3\u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(5) 
	public double OpenRatioByVolume() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \u5f00\u4ed3\u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(5) 
	public CThostFtdcMMInstrumentCommissionRateField OpenRatioByVolume(double OpenRatioByVolume) {
		this.io.setDoubleField(this, 5, OpenRatioByVolume);
		return this;
	}
	/**
	 * \u5e73\u4ed3\u624b\u7eed\u8d39\u7387<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(6) 
	public double CloseRatioByMoney() {
		return this.io.getDoubleField(this, 6);
	}
	/**
	 * \u5e73\u4ed3\u624b\u7eed\u8d39\u7387<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(6) 
	public CThostFtdcMMInstrumentCommissionRateField CloseRatioByMoney(double CloseRatioByMoney) {
		this.io.setDoubleField(this, 6, CloseRatioByMoney);
		return this;
	}
	/**
	 * \u5e73\u4ed3\u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(7) 
	public double CloseRatioByVolume() {
		return this.io.getDoubleField(this, 7);
	}
	/**
	 * \u5e73\u4ed3\u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(7) 
	public CThostFtdcMMInstrumentCommissionRateField CloseRatioByVolume(double CloseRatioByVolume) {
		this.io.setDoubleField(this, 7, CloseRatioByVolume);
		return this;
	}
	/**
	 * \u5e73\u4eca\u624b\u7eed\u8d39\u7387<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(8) 
	public double CloseTodayRatioByMoney() {
		return this.io.getDoubleField(this, 8);
	}
	/**
	 * \u5e73\u4eca\u624b\u7eed\u8d39\u7387<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(8) 
	public CThostFtdcMMInstrumentCommissionRateField CloseTodayRatioByMoney(double CloseTodayRatioByMoney) {
		this.io.setDoubleField(this, 8, CloseTodayRatioByMoney);
		return this;
	}
	/**
	 * \u5e73\u4eca\u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(9) 
	public double CloseTodayRatioByVolume() {
		return this.io.getDoubleField(this, 9);
	}
	/**
	 * \u5e73\u4eca\u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(9) 
	public CThostFtdcMMInstrumentCommissionRateField CloseTodayRatioByVolume(double CloseTodayRatioByVolume) {
		this.io.setDoubleField(this, 9, CloseTodayRatioByVolume);
		return this;
	}
	public CThostFtdcMMInstrumentCommissionRateField() {
		super();
	}
	public CThostFtdcMMInstrumentCommissionRateField(Pointer pointer) {
		super(pointer);
	}
}
