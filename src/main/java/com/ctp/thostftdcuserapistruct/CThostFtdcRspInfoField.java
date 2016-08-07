package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u54cd\u5e94\u4fe1\u606f<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:299</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcRspInfoField extends StructObject {
	/**
	 * \u9519\u8bef\u4ee3\u7801<br>
	 * C type : TThostFtdcErrorIDType
	 */
	@Field(0) 
	public int ErrorID() {
		return this.io.getIntField(this, 0);
	}
	
	public int getErrorID() {
		return ErrorID();
	}
	
	public void setErrorID(int errorID) {
		ErrorID(errorID);
	}
	
	/**
	 * \u9519\u8bef\u4ee3\u7801<br>
	 * C type : TThostFtdcErrorIDType
	 */
	@Field(0) 
	public CThostFtdcRspInfoField ErrorID(int ErrorID) {
		this.io.setIntField(this, 0, ErrorID);
		return this;
	}
	/**
	 * \u9519\u8bef\u4fe1\u606f<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	@Array({81}) 
	@Field(1) 
	public Pointer<Byte > ErrorMsg() {
		return this.io.getPointerField(this, 1);
	}
	
	@Array({81})
	@Field(1)
	public void setErrorMsg(String errorMsg) {
		this.io.getPointerField(this, 1).setCString(errorMsg);
	}

	public String getErrorMsg() {
		return ErrorMsg().getCString();
	}
	
	public CThostFtdcRspInfoField() {
		super();
	}
	public CThostFtdcRspInfoField(Pointer pointer) {
		super(pointer);
	}
}
