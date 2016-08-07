package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u51b2\u6b63\u54cd\u5e94<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:6631</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcRspRepealField extends StructObject {
	/**
	 * \u51b2\u6b63\u65f6\u95f4\u95f4\u9694<br>
	 * C type : TThostFtdcRepealTimeIntervalType
	 */
	@Field(0) 
	public int RepealTimeInterval() {
		return this.io.getIntField(this, 0);
	}
	/**
	 * \u51b2\u6b63\u65f6\u95f4\u95f4\u9694<br>
	 * C type : TThostFtdcRepealTimeIntervalType
	 */
	@Field(0) 
	public CThostFtdcRspRepealField RepealTimeInterval(int RepealTimeInterval) {
		this.io.setIntField(this, 0, RepealTimeInterval);
		return this;
	}
	/**
	 * \u5df2\u7ecf\u51b2\u6b63\u6b21\u6570<br>
	 * C type : TThostFtdcRepealedTimesType
	 */
	@Field(1) 
	public int RepealedTimes() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * \u5df2\u7ecf\u51b2\u6b63\u6b21\u6570<br>
	 * C type : TThostFtdcRepealedTimesType
	 */
	@Field(1) 
	public CThostFtdcRspRepealField RepealedTimes(int RepealedTimes) {
		this.io.setIntField(this, 1, RepealedTimes);
		return this;
	}
	/**
	 * \u94f6\u884c\u51b2\u6b63\u6807\u5fd7<br>
	 * C type : TThostFtdcBankRepealFlagType
	 */
	@Field(2) 
	public byte BankRepealFlag() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * \u94f6\u884c\u51b2\u6b63\u6807\u5fd7<br>
	 * C type : TThostFtdcBankRepealFlagType
	 */
	@Field(2) 
	public CThostFtdcRspRepealField BankRepealFlag(byte BankRepealFlag) {
		this.io.setByteField(this, 2, BankRepealFlag);
		return this;
	}
	/**
	 * \u671f\u5546\u51b2\u6b63\u6807\u5fd7<br>
	 * C type : TThostFtdcBrokerRepealFlagType
	 */
	@Field(3) 
	public byte BrokerRepealFlag() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \u671f\u5546\u51b2\u6b63\u6807\u5fd7<br>
	 * C type : TThostFtdcBrokerRepealFlagType
	 */
	@Field(3) 
	public CThostFtdcRspRepealField BrokerRepealFlag(byte BrokerRepealFlag) {
		this.io.setByteField(this, 3, BrokerRepealFlag);
		return this;
	}
	/**
	 * \u88ab\u51b2\u6b63\u5e73\u53f0\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcPlateSerialType
	 */
	@Field(4) 
	public int PlateRepealSerial() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \u88ab\u51b2\u6b63\u5e73\u53f0\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcPlateSerialType
	 */
	@Field(4) 
	public CThostFtdcRspRepealField PlateRepealSerial(int PlateRepealSerial) {
		this.io.setIntField(this, 4, PlateRepealSerial);
		return this;
	}
	/**
	 * \u88ab\u51b2\u6b63\u94f6\u884c\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcBankSerialType
	 */
	@Array({13}) 
	@Field(5) 
	public Pointer<Byte > BankRepealSerial() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \u88ab\u51b2\u6b63\u671f\u8d27\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcFutureSerialType
	 */
	@Field(6) 
	public int FutureRepealSerial() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \u88ab\u51b2\u6b63\u671f\u8d27\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcFutureSerialType
	 */
	@Field(6) 
	public CThostFtdcRspRepealField FutureRepealSerial(int FutureRepealSerial) {
		this.io.setIntField(this, 6, FutureRepealSerial);
		return this;
	}
	/**
	 * \u4e1a\u52a1\u529f\u80fd\u7801<br>
	 * C type : TThostFtdcTradeCodeType
	 */
	@Array({7}) 
	@Field(7) 
	public Pointer<Byte > TradeCode() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u94f6\u884c\u4ee3\u7801<br>
	 * C type : TThostFtdcBankIDType
	 */
	@Array({4}) 
	@Field(8) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \u94f6\u884c\u5206\u652f\u673a\u6784\u4ee3\u7801<br>
	 * C type : TThostFtdcBankBrchIDType
	 */
	@Array({5}) 
	@Field(9) 
	public Pointer<Byte > BankBranchID() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \u671f\u5546\u4ee3\u7801<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(10) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \u671f\u5546\u5206\u652f\u673a\u6784\u4ee3\u7801<br>
	 * C type : TThostFtdcFutureBranchIDType
	 */
	@Array({31}) 
	@Field(11) 
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * \u4ea4\u6613\u65e5\u671f<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(12) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \u4ea4\u6613\u65f6\u95f4<br>
	 * C type : TThostFtdcTradeTimeType
	 */
	@Array({9}) 
	@Field(13) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \u94f6\u884c\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcBankSerialType
	 */
	@Array({13}) 
	@Field(14) 
	public Pointer<Byte > BankSerial() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \u4ea4\u6613\u7cfb\u7edf\u65e5\u671f<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(15) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 15);
	}
	/**
	 * \u94f6\u671f\u5e73\u53f0\u6d88\u606f\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(16) 
	public int PlateSerial() {
		return this.io.getIntField(this, 16);
	}
	/**
	 * \u94f6\u671f\u5e73\u53f0\u6d88\u606f\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(16) 
	public CThostFtdcRspRepealField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 16, PlateSerial);
		return this;
	}
	/**
	 * \u6700\u540e\u5206\u7247\u6807\u5fd7<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(17) 
	public byte LastFragment() {
		return this.io.getByteField(this, 17);
	}
	/**
	 * \u6700\u540e\u5206\u7247\u6807\u5fd7<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(17) 
	public CThostFtdcRspRepealField LastFragment(byte LastFragment) {
		this.io.setByteField(this, 17, LastFragment);
		return this;
	}
	/**
	 * \u4f1a\u8bdd\u53f7<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(18) 
	public int SessionID() {
		return this.io.getIntField(this, 18);
	}
	/**
	 * \u4f1a\u8bdd\u53f7<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(18) 
	public CThostFtdcRspRepealField SessionID(int SessionID) {
		this.io.setIntField(this, 18, SessionID);
		return this;
	}
	/**
	 * \u5ba2\u6237\u59d3\u540d<br>
	 * C type : TThostFtdcIndividualNameType
	 */
	@Array({51}) 
	@Field(19) 
	public Pointer<Byte > CustomerName() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \u8bc1\u4ef6\u7c7b\u578b<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(20) 
	public byte IdCardType() {
		return this.io.getByteField(this, 20);
	}
	/**
	 * \u8bc1\u4ef6\u7c7b\u578b<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(20) 
	public CThostFtdcRspRepealField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 20, IdCardType);
		return this;
	}
	/**
	 * \u8bc1\u4ef6\u53f7\u7801<br>
	 * C type : TThostFtdcIdentifiedCardNoType
	 */
	@Array({51}) 
	@Field(21) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 21);
	}
	/**
	 * \u5ba2\u6237\u7c7b\u578b<br>
	 * C type : TThostFtdcCustTypeType
	 */
	@Field(22) 
	public byte CustType() {
		return this.io.getByteField(this, 22);
	}
	/**
	 * \u5ba2\u6237\u7c7b\u578b<br>
	 * C type : TThostFtdcCustTypeType
	 */
	@Field(22) 
	public CThostFtdcRspRepealField CustType(byte CustType) {
		this.io.setByteField(this, 22, CustType);
		return this;
	}
	/**
	 * \u94f6\u884c\u5e10\u53f7<br>
	 * C type : TThostFtdcBankAccountType
	 */
	@Array({41}) 
	@Field(23) 
	public Pointer<Byte > BankAccount() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * \u94f6\u884c\u5bc6\u7801<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(24) 
	public Pointer<Byte > BankPassWord() {
		return this.io.getPointerField(this, 24);
	}
	/**
	 * \u6295\u8d44\u8005\u5e10\u53f7<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(25) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 25);
	}
	/**
	 * \u671f\u8d27\u5bc6\u7801<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(26) 
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 26);
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(27) 
	public int InstallID() {
		return this.io.getIntField(this, 27);
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(27) 
	public CThostFtdcRspRepealField InstallID(int InstallID) {
		this.io.setIntField(this, 27, InstallID);
		return this;
	}
	/**
	 * \u671f\u8d27\u516c\u53f8\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcFutureSerialType
	 */
	@Field(28) 
	public int FutureSerial() {
		return this.io.getIntField(this, 28);
	}
	/**
	 * \u671f\u8d27\u516c\u53f8\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcFutureSerialType
	 */
	@Field(28) 
	public CThostFtdcRspRepealField FutureSerial(int FutureSerial) {
		this.io.setIntField(this, 28, FutureSerial);
		return this;
	}
	/**
	 * \u7528\u6237\u6807\u8bc6<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(29) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 29);
	}
	/**
	 * \u9a8c\u8bc1\u5ba2\u6237\u8bc1\u4ef6\u53f7\u7801\u6807\u5fd7<br>
	 * C type : TThostFtdcYesNoIndicatorType
	 */
	@Field(30) 
	public byte VerifyCertNoFlag() {
		return this.io.getByteField(this, 30);
	}
	/**
	 * \u9a8c\u8bc1\u5ba2\u6237\u8bc1\u4ef6\u53f7\u7801\u6807\u5fd7<br>
	 * C type : TThostFtdcYesNoIndicatorType
	 */
	@Field(30) 
	public CThostFtdcRspRepealField VerifyCertNoFlag(byte VerifyCertNoFlag) {
		this.io.setByteField(this, 30, VerifyCertNoFlag);
		return this;
	}
	/**
	 * \u5e01\u79cd\u4ee3\u7801<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(31) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 31);
	}
	/**
	 * \u8f6c\u5e10\u91d1\u989d<br>
	 * C type : TThostFtdcTradeAmountType
	 */
	@Field(32) 
	public double TradeAmount() {
		return this.io.getDoubleField(this, 32);
	}
	/**
	 * \u8f6c\u5e10\u91d1\u989d<br>
	 * C type : TThostFtdcTradeAmountType
	 */
	@Field(32) 
	public CThostFtdcRspRepealField TradeAmount(double TradeAmount) {
		this.io.setDoubleField(this, 32, TradeAmount);
		return this;
	}
	/**
	 * \u671f\u8d27\u53ef\u53d6\u91d1\u989d<br>
	 * C type : TThostFtdcTradeAmountType
	 */
	@Field(33) 
	public double FutureFetchAmount() {
		return this.io.getDoubleField(this, 33);
	}
	/**
	 * \u671f\u8d27\u53ef\u53d6\u91d1\u989d<br>
	 * C type : TThostFtdcTradeAmountType
	 */
	@Field(33) 
	public CThostFtdcRspRepealField FutureFetchAmount(double FutureFetchAmount) {
		this.io.setDoubleField(this, 33, FutureFetchAmount);
		return this;
	}
	/**
	 * \u8d39\u7528\u652f\u4ed8\u6807\u5fd7<br>
	 * C type : TThostFtdcFeePayFlagType
	 */
	@Field(34) 
	public byte FeePayFlag() {
		return this.io.getByteField(this, 34);
	}
	/**
	 * \u8d39\u7528\u652f\u4ed8\u6807\u5fd7<br>
	 * C type : TThostFtdcFeePayFlagType
	 */
	@Field(34) 
	public CThostFtdcRspRepealField FeePayFlag(byte FeePayFlag) {
		this.io.setByteField(this, 34, FeePayFlag);
		return this;
	}
	/**
	 * \u5e94\u6536\u5ba2\u6237\u8d39\u7528<br>
	 * C type : TThostFtdcCustFeeType
	 */
	@Field(35) 
	public double CustFee() {
		return this.io.getDoubleField(this, 35);
	}
	/**
	 * \u5e94\u6536\u5ba2\u6237\u8d39\u7528<br>
	 * C type : TThostFtdcCustFeeType
	 */
	@Field(35) 
	public CThostFtdcRspRepealField CustFee(double CustFee) {
		this.io.setDoubleField(this, 35, CustFee);
		return this;
	}
	/**
	 * \u5e94\u6536\u671f\u8d27\u516c\u53f8\u8d39\u7528<br>
	 * C type : TThostFtdcFutureFeeType
	 */
	@Field(36) 
	public double BrokerFee() {
		return this.io.getDoubleField(this, 36);
	}
	/**
	 * \u5e94\u6536\u671f\u8d27\u516c\u53f8\u8d39\u7528<br>
	 * C type : TThostFtdcFutureFeeType
	 */
	@Field(36) 
	public CThostFtdcRspRepealField BrokerFee(double BrokerFee) {
		this.io.setDoubleField(this, 36, BrokerFee);
		return this;
	}
	/**
	 * \u53d1\u9001\u65b9\u7ed9\u63a5\u6536\u65b9\u7684\u6d88\u606f<br>
	 * C type : TThostFtdcAddInfoType
	 */
	@Array({129}) 
	@Field(37) 
	public Pointer<Byte > Message() {
		return this.io.getPointerField(this, 37);
	}
	/**
	 * \u6458\u8981<br>
	 * C type : TThostFtdcDigestType
	 */
	@Array({36}) 
	@Field(38) 
	public Pointer<Byte > Digest() {
		return this.io.getPointerField(this, 38);
	}
	/**
	 * \u94f6\u884c\u5e10\u53f7\u7c7b\u578b<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(39) 
	public byte BankAccType() {
		return this.io.getByteField(this, 39);
	}
	/**
	 * \u94f6\u884c\u5e10\u53f7\u7c7b\u578b<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(39) 
	public CThostFtdcRspRepealField BankAccType(byte BankAccType) {
		this.io.setByteField(this, 39, BankAccType);
		return this;
	}
	/**
	 * \u6e20\u9053\u6807\u5fd7<br>
	 * C type : TThostFtdcDeviceIDType
	 */
	@Array({3}) 
	@Field(40) 
	public Pointer<Byte > DeviceID() {
		return this.io.getPointerField(this, 40);
	}
	/**
	 * \u671f\u8d27\u5355\u4f4d\u5e10\u53f7\u7c7b\u578b<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(41) 
	public byte BankSecuAccType() {
		return this.io.getByteField(this, 41);
	}
	/**
	 * \u671f\u8d27\u5355\u4f4d\u5e10\u53f7\u7c7b\u578b<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(41) 
	public CThostFtdcRspRepealField BankSecuAccType(byte BankSecuAccType) {
		this.io.setByteField(this, 41, BankSecuAccType);
		return this;
	}
	/**
	 * \u671f\u8d27\u516c\u53f8\u94f6\u884c\u7f16\u7801<br>
	 * C type : TThostFtdcBankCodingForFutureType
	 */
	@Array({33}) 
	@Field(42) 
	public Pointer<Byte > BrokerIDByBank() {
		return this.io.getPointerField(this, 42);
	}
	/**
	 * \u671f\u8d27\u5355\u4f4d\u5e10\u53f7<br>
	 * C type : TThostFtdcBankAccountType
	 */
	@Array({41}) 
	@Field(43) 
	public Pointer<Byte > BankSecuAcc() {
		return this.io.getPointerField(this, 43);
	}
	/**
	 * \u94f6\u884c\u5bc6\u7801\u6807\u5fd7<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(44) 
	public byte BankPwdFlag() {
		return this.io.getByteField(this, 44);
	}
	/**
	 * \u94f6\u884c\u5bc6\u7801\u6807\u5fd7<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(44) 
	public CThostFtdcRspRepealField BankPwdFlag(byte BankPwdFlag) {
		this.io.setByteField(this, 44, BankPwdFlag);
		return this;
	}
	/**
	 * \u671f\u8d27\u8d44\u91d1\u5bc6\u7801\u6838\u5bf9\u6807\u5fd7<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(45) 
	public byte SecuPwdFlag() {
		return this.io.getByteField(this, 45);
	}
	/**
	 * \u671f\u8d27\u8d44\u91d1\u5bc6\u7801\u6838\u5bf9\u6807\u5fd7<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(45) 
	public CThostFtdcRspRepealField SecuPwdFlag(byte SecuPwdFlag) {
		this.io.setByteField(this, 45, SecuPwdFlag);
		return this;
	}
	/**
	 * \u4ea4\u6613\u67dc\u5458<br>
	 * C type : TThostFtdcOperNoType
	 */
	@Array({17}) 
	@Field(46) 
	public Pointer<Byte > OperNo() {
		return this.io.getPointerField(this, 46);
	}
	/**
	 * \u8bf7\u6c42\u7f16\u53f7<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(47) 
	public int RequestID() {
		return this.io.getIntField(this, 47);
	}
	/**
	 * \u8bf7\u6c42\u7f16\u53f7<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(47) 
	public CThostFtdcRspRepealField RequestID(int RequestID) {
		this.io.setIntField(this, 47, RequestID);
		return this;
	}
	/**
	 * \u4ea4\u6613ID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(48) 
	public int TID() {
		return this.io.getIntField(this, 48);
	}
	/**
	 * \u4ea4\u6613ID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(48) 
	public CThostFtdcRspRepealField TID(int TID) {
		this.io.setIntField(this, 48, TID);
		return this;
	}
	/**
	 * \u8f6c\u8d26\u4ea4\u6613\u72b6\u6001<br>
	 * C type : TThostFtdcTransferStatusType
	 */
	@Field(49) 
	public byte TransferStatus() {
		return this.io.getByteField(this, 49);
	}
	/**
	 * \u8f6c\u8d26\u4ea4\u6613\u72b6\u6001<br>
	 * C type : TThostFtdcTransferStatusType
	 */
	@Field(49) 
	public CThostFtdcRspRepealField TransferStatus(byte TransferStatus) {
		this.io.setByteField(this, 49, TransferStatus);
		return this;
	}
	/**
	 * \u9519\u8bef\u4ee3\u7801<br>
	 * C type : TThostFtdcErrorIDType
	 */
	@Field(50) 
	public int ErrorID() {
		return this.io.getIntField(this, 50);
	}
	/**
	 * \u9519\u8bef\u4ee3\u7801<br>
	 * C type : TThostFtdcErrorIDType
	 */
	@Field(50) 
	public CThostFtdcRspRepealField ErrorID(int ErrorID) {
		this.io.setIntField(this, 50, ErrorID);
		return this;
	}
	/**
	 * \u9519\u8bef\u4fe1\u606f<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	@Array({81}) 
	@Field(51) 
	public Pointer<Byte > ErrorMsg() {
		return this.io.getPointerField(this, 51);
	}
	/**
	 * \u957f\u5ba2\u6237\u59d3\u540d<br>
	 * C type : TThostFtdcLongIndividualNameType
	 */
	@Array({161}) 
	@Field(52) 
	public Pointer<Byte > LongCustomerName() {
		return this.io.getPointerField(this, 52);
	}
	public CThostFtdcRspRepealField() {
		super();
	}
	public CThostFtdcRspRepealField(Pointer pointer) {
		super(pointer);
	}
}
