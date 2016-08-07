package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u4ea4\u6613\u6240\u6210\u4ea4<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:1683</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcExchangeTradeField extends StructObject {
	/**
	 * \u4ea4\u6613\u6240\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u6210\u4ea4\u7f16\u53f7<br>
	 * C type : TThostFtdcTradeIDType
	 */
	@Array({21}) 
	@Field(1) 
	public Pointer<Byte > TradeID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u4e70\u5356\u65b9\u5411<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(2) 
	public byte Direction() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * \u4e70\u5356\u65b9\u5411<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(2) 
	public CThostFtdcExchangeTradeField Direction(byte Direction) {
		this.io.setByteField(this, 2, Direction);
		return this;
	}
	/**
	 * \u62a5\u5355\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(3) 
	public Pointer<Byte > OrderSysID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u4f1a\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(4) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \u5ba2\u6237\u4ee3\u7801<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(5) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \u4ea4\u6613\u89d2\u8272<br>
	 * C type : TThostFtdcTradingRoleType
	 */
	@Field(6) 
	public byte TradingRole() {
		return this.io.getByteField(this, 6);
	}
	/**
	 * \u4ea4\u6613\u89d2\u8272<br>
	 * C type : TThostFtdcTradingRoleType
	 */
	@Field(6) 
	public CThostFtdcExchangeTradeField TradingRole(byte TradingRole) {
		this.io.setByteField(this, 6, TradingRole);
		return this;
	}
	/**
	 * \u5408\u7ea6\u5728\u4ea4\u6613\u6240\u7684\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(7) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u5f00\u5e73\u6807\u5fd7<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(8) 
	public byte OffsetFlag() {
		return this.io.getByteField(this, 8);
	}
	/**
	 * \u5f00\u5e73\u6807\u5fd7<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(8) 
	public CThostFtdcExchangeTradeField OffsetFlag(byte OffsetFlag) {
		this.io.setByteField(this, 8, OffsetFlag);
		return this;
	}
	/**
	 * \u6295\u673a\u5957\u4fdd\u6807\u5fd7<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(9) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 9);
	}
	/**
	 * \u6295\u673a\u5957\u4fdd\u6807\u5fd7<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(9) 
	public CThostFtdcExchangeTradeField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 9, HedgeFlag);
		return this;
	}
	/**
	 * \u4ef7\u683c<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(10) 
	public double Price() {
		return this.io.getDoubleField(this, 10);
	}
	/**
	 * \u4ef7\u683c<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(10) 
	public CThostFtdcExchangeTradeField Price(double Price) {
		this.io.setDoubleField(this, 10, Price);
		return this;
	}
	/**
	 * \u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public int Volume() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public CThostFtdcExchangeTradeField Volume(int Volume) {
		this.io.setIntField(this, 11, Volume);
		return this;
	}
	/**
	 * \u6210\u4ea4\u65f6\u671f<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(12) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \u6210\u4ea4\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(13) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \u6210\u4ea4\u7c7b\u578b<br>
	 * C type : TThostFtdcTradeTypeType
	 */
	@Field(14) 
	public byte TradeType() {
		return this.io.getByteField(this, 14);
	}
	/**
	 * \u6210\u4ea4\u7c7b\u578b<br>
	 * C type : TThostFtdcTradeTypeType
	 */
	@Field(14) 
	public CThostFtdcExchangeTradeField TradeType(byte TradeType) {
		this.io.setByteField(this, 14, TradeType);
		return this;
	}
	/**
	 * \u6210\u4ea4\u4ef7\u6765\u6e90<br>
	 * C type : TThostFtdcPriceSourceType
	 */
	@Field(15) 
	public byte PriceSource() {
		return this.io.getByteField(this, 15);
	}
	/**
	 * \u6210\u4ea4\u4ef7\u6765\u6e90<br>
	 * C type : TThostFtdcPriceSourceType
	 */
	@Field(15) 
	public CThostFtdcExchangeTradeField PriceSource(byte PriceSource) {
		this.io.setByteField(this, 15, PriceSource);
		return this;
	}
	/**
	 * \u4ea4\u6613\u6240\u4ea4\u6613\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(16) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \u672c\u5730\u62a5\u5355\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(17) 
	public Pointer<Byte > OrderLocalID() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \u7ed3\u7b97\u4f1a\u5458\u7f16\u53f7<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(18) 
	public Pointer<Byte > ClearingPartID() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \u4e1a\u52a1\u5355\u5143<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(19) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(20) 
	public int SequenceNo() {
		return this.io.getIntField(this, 20);
	}
	/**
	 * \u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(20) 
	public CThostFtdcExchangeTradeField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 20, SequenceNo);
		return this;
	}
	/**
	 * \u6210\u4ea4\u6765\u6e90<br>
	 * C type : TThostFtdcTradeSourceType
	 */
	@Field(21) 
	public byte TradeSource() {
		return this.io.getByteField(this, 21);
	}
	/**
	 * \u6210\u4ea4\u6765\u6e90<br>
	 * C type : TThostFtdcTradeSourceType
	 */
	@Field(21) 
	public CThostFtdcExchangeTradeField TradeSource(byte TradeSource) {
		this.io.setByteField(this, 21, TradeSource);
		return this;
	}
	public CThostFtdcExchangeTradeField() {
		super();
	}
	public CThostFtdcExchangeTradeField(Pointer pointer) {
		super(pointer);
	}
}
