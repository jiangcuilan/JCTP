package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u5f53\u524d\u671f\u6743\u5408\u7ea6\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2608</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcOptionInstrMarginAdjustField extends StructObject {
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
	public CThostFtdcOptionInstrMarginAdjustField InvestorRange(byte InvestorRange) {
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
	 * \u6295\u673a\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(4) 
	public double SShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \u6295\u673a\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(4) 
	public CThostFtdcOptionInstrMarginAdjustField SShortMarginRatioByMoney(double SShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 4, SShortMarginRatioByMoney);
		return this;
	}
	/**
	 * \u6295\u673a\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(5) 
	public double SShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \u6295\u673a\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(5) 
	public CThostFtdcOptionInstrMarginAdjustField SShortMarginRatioByVolume(double SShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 5, SShortMarginRatioByVolume);
		return this;
	}
	/**
	 * \u4fdd\u503c\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(6) 
	public double HShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 6);
	}
	/**
	 * \u4fdd\u503c\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(6) 
	public CThostFtdcOptionInstrMarginAdjustField HShortMarginRatioByMoney(double HShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 6, HShortMarginRatioByMoney);
		return this;
	}
	/**
	 * \u4fdd\u503c\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(7) 
	public double HShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 7);
	}
	/**
	 * \u4fdd\u503c\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(7) 
	public CThostFtdcOptionInstrMarginAdjustField HShortMarginRatioByVolume(double HShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 7, HShortMarginRatioByVolume);
		return this;
	}
	/**
	 * \u5957\u5229\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(8) 
	public double AShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 8);
	}
	/**
	 * \u5957\u5229\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(8) 
	public CThostFtdcOptionInstrMarginAdjustField AShortMarginRatioByMoney(double AShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 8, AShortMarginRatioByMoney);
		return this;
	}
	/**
	 * \u5957\u5229\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(9) 
	public double AShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 9);
	}
	/**
	 * \u5957\u5229\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(9) 
	public CThostFtdcOptionInstrMarginAdjustField AShortMarginRatioByVolume(double AShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 9, AShortMarginRatioByVolume);
		return this;
	}
	/**
	 * \u662f\u5426\u8ddf\u968f\u4ea4\u6613\u6240\u6536\u53d6<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(10) 
	public int IsRelative() {
		return this.io.getIntField(this, 10);
	}
	/**
	 * \u662f\u5426\u8ddf\u968f\u4ea4\u6613\u6240\u6536\u53d6<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(10) 
	public CThostFtdcOptionInstrMarginAdjustField IsRelative(int IsRelative) {
		this.io.setIntField(this, 10, IsRelative);
		return this;
	}
	/**
	 * \u505a\u5e02\u5546\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(11) 
	public double MShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 11);
	}
	/**
	 * \u505a\u5e02\u5546\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(11) 
	public CThostFtdcOptionInstrMarginAdjustField MShortMarginRatioByMoney(double MShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 11, MShortMarginRatioByMoney);
		return this;
	}
	/**
	 * \u505a\u5e02\u5546\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public double MShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 12);
	}
	/**
	 * \u505a\u5e02\u5546\u7a7a\u5934\u4fdd\u8bc1\u91d1\u8c03\u6574\u7cfb\u6570<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public CThostFtdcOptionInstrMarginAdjustField MShortMarginRatioByVolume(double MShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 12, MShortMarginRatioByVolume);
		return this;
	}
	public CThostFtdcOptionInstrMarginAdjustField() {
		super();
	}
	public CThostFtdcOptionInstrMarginAdjustField(Pointer pointer) {
		super(pointer);
	}
}
