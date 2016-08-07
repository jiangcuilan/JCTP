package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u4ea4\u6613\u6240\u6279\u91cf\u62a5\u5355\u64cd\u4f5c<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:3957</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcExchangeBatchOrderActionField extends StructObject {
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
	 * \u64cd\u4f5c\u65e5\u671f<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > ActionDate() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u64cd\u4f5c\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > ActionTime() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u4ea4\u6613\u6240\u4ea4\u6613\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(3) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(4) 
	public int InstallID() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(4) 
	public CThostFtdcExchangeBatchOrderActionField InstallID(int InstallID) {
		this.io.setIntField(this, 4, InstallID);
		return this;
	}
	/**
	 * \u64cd\u4f5c\u672c\u5730\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(5) 
	public Pointer<Byte > ActionLocalID() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \u4f1a\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(6) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \u5ba2\u6237\u4ee3\u7801<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(7) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u4e1a\u52a1\u5355\u5143<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(8) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \u62a5\u5355\u64cd\u4f5c\u72b6\u6001<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(9) 
	public byte OrderActionStatus() {
		return this.io.getByteField(this, 9);
	}
	/**
	 * \u62a5\u5355\u64cd\u4f5c\u72b6\u6001<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(9) 
	public CThostFtdcExchangeBatchOrderActionField OrderActionStatus(byte OrderActionStatus) {
		this.io.setByteField(this, 9, OrderActionStatus);
		return this;
	}
	/**
	 * \u7528\u6237\u4ee3\u7801<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(10) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * IP\u5730\u5740<br>
	 * C type : TThostFtdcIPAddressType
	 */
	@Array({16}) 
	@Field(11) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * Mac\u5730\u5740<br>
	 * C type : TThostFtdcMacAddressType
	 */
	@Array({21}) 
	@Field(12) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 12);
	}
	public CThostFtdcExchangeBatchOrderActionField() {
		super();
	}
	public CThostFtdcExchangeBatchOrderActionField(Pointer pointer) {
		super(pointer);
	}
}
