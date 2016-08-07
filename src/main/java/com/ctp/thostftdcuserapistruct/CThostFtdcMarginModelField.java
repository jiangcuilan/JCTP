package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u6295\u8d44\u8005\u4fdd\u8bc1\u91d1\u7387\u6a21\u677f<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:5843</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcMarginModelField extends StructObject {
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
	 * \u4fdd\u8bc1\u91d1\u7387\u6a21\u677f\u4ee3\u7801<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > MarginModelID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u6a21\u677f\u540d\u79f0<br>
	 * C type : TThostFtdcCommModelNameType
	 */
	@Array({161}) 
	@Field(2) 
	public Pointer<Byte > MarginModelName() {
		return this.io.getPointerField(this, 2);
	}
	public CThostFtdcMarginModelField() {
		super();
	}
	public CThostFtdcMarginModelField(Pointer pointer) {
		super(pointer);
	}
}
