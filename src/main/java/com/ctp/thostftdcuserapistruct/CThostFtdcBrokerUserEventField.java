package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u67e5\u8be2\u7ecf\u7eaa\u516c\u53f8\u7528\u6237\u4e8b\u4ef6<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4939</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcBrokerUserEventField extends StructObject {
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
	 * \u7528\u6237\u4ee3\u7801<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(1) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u7528\u6237\u4e8b\u4ef6\u7c7b\u578b<br>
	 * C type : TThostFtdcUserEventTypeType
	 */
	@Field(2) 
	public byte UserEventType() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * \u7528\u6237\u4e8b\u4ef6\u7c7b\u578b<br>
	 * C type : TThostFtdcUserEventTypeType
	 */
	@Field(2) 
	public CThostFtdcBrokerUserEventField UserEventType(byte UserEventType) {
		this.io.setByteField(this, 2, UserEventType);
		return this;
	}
	/**
	 * \u7528\u6237\u4e8b\u4ef6\u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(3) 
	public int EventSequenceNo() {
		return this.io.getIntField(this, 3);
	}
	/**
	 * \u7528\u6237\u4e8b\u4ef6\u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(3) 
	public CThostFtdcBrokerUserEventField EventSequenceNo(int EventSequenceNo) {
		this.io.setIntField(this, 3, EventSequenceNo);
		return this;
	}
	/**
	 * \u4e8b\u4ef6\u53d1\u751f\u65e5\u671f<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(4) 
	public Pointer<Byte > EventDate() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \u4e8b\u4ef6\u53d1\u751f\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > EventTime() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \u7528\u6237\u4e8b\u4ef6\u4fe1\u606f<br>
	 * C type : TThostFtdcUserEventInfoType
	 */
	@Array({1025}) 
	@Field(6) 
	public Pointer<Byte > UserEventInfo() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \u6295\u8d44\u8005\u4ee3\u7801<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(7) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u5408\u7ea6\u4ee3\u7801<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(8) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 8);
	}
	public CThostFtdcBrokerUserEventField() {
		super();
	}
	public CThostFtdcBrokerUserEventField(Pointer pointer) {
		super(pointer);
	}
}
