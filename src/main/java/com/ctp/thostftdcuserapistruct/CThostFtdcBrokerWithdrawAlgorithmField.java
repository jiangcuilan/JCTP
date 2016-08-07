package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u7ecf\u7eaa\u516c\u53f8\u53ef\u63d0\u8d44\u91d1\u7b97\u6cd5\u8868<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4793</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcBrokerWithdrawAlgorithmField extends StructObject {
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
	 * \u53ef\u63d0\u8d44\u91d1\u7b97\u6cd5<br>
	 * C type : TThostFtdcAlgorithmType
	 */
	@Field(1) 
	public byte WithdrawAlgorithm() {
		return this.io.getByteField(this, 1);
	}
	/**
	 * \u53ef\u63d0\u8d44\u91d1\u7b97\u6cd5<br>
	 * C type : TThostFtdcAlgorithmType
	 */
	@Field(1) 
	public CThostFtdcBrokerWithdrawAlgorithmField WithdrawAlgorithm(byte WithdrawAlgorithm) {
		this.io.setByteField(this, 1, WithdrawAlgorithm);
		return this;
	}
	/**
	 * \u8d44\u91d1\u4f7f\u7528\u7387<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(2) 
	public double UsingRatio() {
		return this.io.getDoubleField(this, 2);
	}
	/**
	 * \u8d44\u91d1\u4f7f\u7528\u7387<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(2) 
	public CThostFtdcBrokerWithdrawAlgorithmField UsingRatio(double UsingRatio) {
		this.io.setDoubleField(this, 2, UsingRatio);
		return this;
	}
	/**
	 * \u53ef\u63d0\u662f\u5426\u5305\u542b\u5e73\u4ed3\u76c8\u5229<br>
	 * C type : TThostFtdcIncludeCloseProfitType
	 */
	@Field(3) 
	public byte IncludeCloseProfit() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \u53ef\u63d0\u662f\u5426\u5305\u542b\u5e73\u4ed3\u76c8\u5229<br>
	 * C type : TThostFtdcIncludeCloseProfitType
	 */
	@Field(3) 
	public CThostFtdcBrokerWithdrawAlgorithmField IncludeCloseProfit(byte IncludeCloseProfit) {
		this.io.setByteField(this, 3, IncludeCloseProfit);
		return this;
	}
	/**
	 * \u672c\u65e5\u65e0\u4ed3\u4e14\u65e0\u6210\u4ea4\u5ba2\u6237\u662f\u5426\u53d7\u53ef\u63d0\u6bd4\u4f8b\u9650\u5236<br>
	 * C type : TThostFtdcAllWithoutTradeType
	 */
	@Field(4) 
	public byte AllWithoutTrade() {
		return this.io.getByteField(this, 4);
	}
	/**
	 * \u672c\u65e5\u65e0\u4ed3\u4e14\u65e0\u6210\u4ea4\u5ba2\u6237\u662f\u5426\u53d7\u53ef\u63d0\u6bd4\u4f8b\u9650\u5236<br>
	 * C type : TThostFtdcAllWithoutTradeType
	 */
	@Field(4) 
	public CThostFtdcBrokerWithdrawAlgorithmField AllWithoutTrade(byte AllWithoutTrade) {
		this.io.setByteField(this, 4, AllWithoutTrade);
		return this;
	}
	/**
	 * \u53ef\u7528\u662f\u5426\u5305\u542b\u5e73\u4ed3\u76c8\u5229<br>
	 * C type : TThostFtdcIncludeCloseProfitType
	 */
	@Field(5) 
	public byte AvailIncludeCloseProfit() {
		return this.io.getByteField(this, 5);
	}
	/**
	 * \u53ef\u7528\u662f\u5426\u5305\u542b\u5e73\u4ed3\u76c8\u5229<br>
	 * C type : TThostFtdcIncludeCloseProfitType
	 */
	@Field(5) 
	public CThostFtdcBrokerWithdrawAlgorithmField AvailIncludeCloseProfit(byte AvailIncludeCloseProfit) {
		this.io.setByteField(this, 5, AvailIncludeCloseProfit);
		return this;
	}
	/**
	 * \u662f\u5426\u542f\u7528\u7528\u6237\u4e8b\u4ef6<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(6) 
	public int IsBrokerUserEvent() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \u662f\u5426\u542f\u7528\u7528\u6237\u4e8b\u4ef6<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(6) 
	public CThostFtdcBrokerWithdrawAlgorithmField IsBrokerUserEvent(int IsBrokerUserEvent) {
		this.io.setIntField(this, 6, IsBrokerUserEvent);
		return this;
	}
	/**
	 * \u5e01\u79cd\u4ee3\u7801<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(7) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u8d27\u5e01\u8d28\u62bc\u6bd4\u7387<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(8) 
	public double FundMortgageRatio() {
		return this.io.getDoubleField(this, 8);
	}
	/**
	 * \u8d27\u5e01\u8d28\u62bc\u6bd4\u7387<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(8) 
	public CThostFtdcBrokerWithdrawAlgorithmField FundMortgageRatio(double FundMortgageRatio) {
		this.io.setDoubleField(this, 8, FundMortgageRatio);
		return this;
	}
	/**
	 * \u6743\u76ca\u7b97\u6cd5<br>
	 * C type : TThostFtdcBalanceAlgorithmType
	 */
	@Field(9) 
	public byte BalanceAlgorithm() {
		return this.io.getByteField(this, 9);
	}
	/**
	 * \u6743\u76ca\u7b97\u6cd5<br>
	 * C type : TThostFtdcBalanceAlgorithmType
	 */
	@Field(9) 
	public CThostFtdcBrokerWithdrawAlgorithmField BalanceAlgorithm(byte BalanceAlgorithm) {
		this.io.setByteField(this, 9, BalanceAlgorithm);
		return this;
	}
	public CThostFtdcBrokerWithdrawAlgorithmField() {
		super();
	}
	public CThostFtdcBrokerWithdrawAlgorithmField(Pointer pointer) {
		super(pointer);
	}
}
