package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u8d44\u91d1\u8d26\u6237<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:549</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcTradingAccountField extends StructObject {
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
	 * \u6295\u8d44\u8005\u5e10\u53f7<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u4e0a\u6b21\u8d28\u62bc\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(2) 
	public double PreMortgage() {
		return this.io.getDoubleField(this, 2);
	}
	/**
	 * \u4e0a\u6b21\u8d28\u62bc\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(2) 
	public CThostFtdcTradingAccountField PreMortgage(double PreMortgage) {
		this.io.setDoubleField(this, 2, PreMortgage);
		return this;
	}
	/**
	 * \u4e0a\u6b21\u4fe1\u7528\u989d\u5ea6<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(3) 
	public double PreCredit() {
		return this.io.getDoubleField(this, 3);
	}
	/**
	 * \u4e0a\u6b21\u4fe1\u7528\u989d\u5ea6<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(3) 
	public CThostFtdcTradingAccountField PreCredit(double PreCredit) {
		this.io.setDoubleField(this, 3, PreCredit);
		return this;
	}
	/**
	 * \u4e0a\u6b21\u5b58\u6b3e\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public double PreDeposit() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \u4e0a\u6b21\u5b58\u6b3e\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public CThostFtdcTradingAccountField PreDeposit(double PreDeposit) {
		this.io.setDoubleField(this, 4, PreDeposit);
		return this;
	}
	/**
	 * \u4e0a\u6b21\u7ed3\u7b97\u51c6\u5907\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(5) 
	public double PreBalance() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \u4e0a\u6b21\u7ed3\u7b97\u51c6\u5907\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(5) 
	public CThostFtdcTradingAccountField PreBalance(double PreBalance) {
		this.io.setDoubleField(this, 5, PreBalance);
		return this;
	}
	/**
	 * \u4e0a\u6b21\u5360\u7528\u7684\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(6) 
	public double PreMargin() {
		return this.io.getDoubleField(this, 6);
	}
	/**
	 * \u4e0a\u6b21\u5360\u7528\u7684\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(6) 
	public CThostFtdcTradingAccountField PreMargin(double PreMargin) {
		this.io.setDoubleField(this, 6, PreMargin);
		return this;
	}
	/**
	 * \u5229\u606f\u57fa\u6570<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(7) 
	public double InterestBase() {
		return this.io.getDoubleField(this, 7);
	}
	/**
	 * \u5229\u606f\u57fa\u6570<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(7) 
	public CThostFtdcTradingAccountField InterestBase(double InterestBase) {
		this.io.setDoubleField(this, 7, InterestBase);
		return this;
	}
	/**
	 * \u5229\u606f\u6536\u5165<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(8) 
	public double Interest() {
		return this.io.getDoubleField(this, 8);
	}
	/**
	 * \u5229\u606f\u6536\u5165<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(8) 
	public CThostFtdcTradingAccountField Interest(double Interest) {
		this.io.setDoubleField(this, 8, Interest);
		return this;
	}
	/**
	 * \u5165\u91d1\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(9) 
	public double Deposit() {
		return this.io.getDoubleField(this, 9);
	}
	/**
	 * \u5165\u91d1\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(9) 
	public CThostFtdcTradingAccountField Deposit(double Deposit) {
		this.io.setDoubleField(this, 9, Deposit);
		return this;
	}
	/**
	 * \u51fa\u91d1\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(10) 
	public double Withdraw() {
		return this.io.getDoubleField(this, 10);
	}
	/**
	 * \u51fa\u91d1\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(10) 
	public CThostFtdcTradingAccountField Withdraw(double Withdraw) {
		this.io.setDoubleField(this, 10, Withdraw);
		return this;
	}
	/**
	 * \u51bb\u7ed3\u7684\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(11) 
	public double FrozenMargin() {
		return this.io.getDoubleField(this, 11);
	}
	/**
	 * \u51bb\u7ed3\u7684\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(11) 
	public CThostFtdcTradingAccountField FrozenMargin(double FrozenMargin) {
		this.io.setDoubleField(this, 11, FrozenMargin);
		return this;
	}
	/**
	 * \u51bb\u7ed3\u7684\u8d44\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public double FrozenCash() {
		return this.io.getDoubleField(this, 12);
	}
	/**
	 * \u51bb\u7ed3\u7684\u8d44\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public CThostFtdcTradingAccountField FrozenCash(double FrozenCash) {
		this.io.setDoubleField(this, 12, FrozenCash);
		return this;
	}
	/**
	 * \u51bb\u7ed3\u7684\u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(13) 
	public double FrozenCommission() {
		return this.io.getDoubleField(this, 13);
	}
	/**
	 * \u51bb\u7ed3\u7684\u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(13) 
	public CThostFtdcTradingAccountField FrozenCommission(double FrozenCommission) {
		this.io.setDoubleField(this, 13, FrozenCommission);
		return this;
	}
	/**
	 * \u5f53\u524d\u4fdd\u8bc1\u91d1\u603b\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(14) 
	public double CurrMargin() {
		return this.io.getDoubleField(this, 14);
	}
	/**
	 * \u5f53\u524d\u4fdd\u8bc1\u91d1\u603b\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(14) 
	public CThostFtdcTradingAccountField CurrMargin(double CurrMargin) {
		this.io.setDoubleField(this, 14, CurrMargin);
		return this;
	}
	/**
	 * \u8d44\u91d1\u5dee\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(15) 
	public double CashIn() {
		return this.io.getDoubleField(this, 15);
	}
	/**
	 * \u8d44\u91d1\u5dee\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(15) 
	public CThostFtdcTradingAccountField CashIn(double CashIn) {
		this.io.setDoubleField(this, 15, CashIn);
		return this;
	}
	/**
	 * \u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(16) 
	public double Commission() {
		return this.io.getDoubleField(this, 16);
	}
	/**
	 * \u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(16) 
	public CThostFtdcTradingAccountField Commission(double Commission) {
		this.io.setDoubleField(this, 16, Commission);
		return this;
	}
	/**
	 * \u5e73\u4ed3\u76c8\u4e8f<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(17) 
	public double CloseProfit() {
		return this.io.getDoubleField(this, 17);
	}
	/**
	 * \u5e73\u4ed3\u76c8\u4e8f<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(17) 
	public CThostFtdcTradingAccountField CloseProfit(double CloseProfit) {
		this.io.setDoubleField(this, 17, CloseProfit);
		return this;
	}
	/**
	 * \u6301\u4ed3\u76c8\u4e8f<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(18) 
	public double PositionProfit() {
		return this.io.getDoubleField(this, 18);
	}
	/**
	 * \u6301\u4ed3\u76c8\u4e8f<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(18) 
	public CThostFtdcTradingAccountField PositionProfit(double PositionProfit) {
		this.io.setDoubleField(this, 18, PositionProfit);
		return this;
	}
	/**
	 * \u671f\u8d27\u7ed3\u7b97\u51c6\u5907\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(19) 
	public double Balance() {
		return this.io.getDoubleField(this, 19);
	}
	/**
	 * \u671f\u8d27\u7ed3\u7b97\u51c6\u5907\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(19) 
	public CThostFtdcTradingAccountField Balance(double Balance) {
		this.io.setDoubleField(this, 19, Balance);
		return this;
	}
	/**
	 * \u53ef\u7528\u8d44\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(20) 
	public double Available() {
		return this.io.getDoubleField(this, 20);
	}
	/**
	 * \u53ef\u7528\u8d44\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(20) 
	public CThostFtdcTradingAccountField Available(double Available) {
		this.io.setDoubleField(this, 20, Available);
		return this;
	}
	/**
	 * \u53ef\u53d6\u8d44\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(21) 
	public double WithdrawQuota() {
		return this.io.getDoubleField(this, 21);
	}
	/**
	 * \u53ef\u53d6\u8d44\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(21) 
	public CThostFtdcTradingAccountField WithdrawQuota(double WithdrawQuota) {
		this.io.setDoubleField(this, 21, WithdrawQuota);
		return this;
	}
	/**
	 * \u57fa\u672c\u51c6\u5907\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(22) 
	public double Reserve() {
		return this.io.getDoubleField(this, 22);
	}
	/**
	 * \u57fa\u672c\u51c6\u5907\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(22) 
	public CThostFtdcTradingAccountField Reserve(double Reserve) {
		this.io.setDoubleField(this, 22, Reserve);
		return this;
	}
	/**
	 * \u4ea4\u6613\u65e5<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(23) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * \u7ed3\u7b97\u7f16\u53f7<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(24) 
	public int SettlementID() {
		return this.io.getIntField(this, 24);
	}
	/**
	 * \u7ed3\u7b97\u7f16\u53f7<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(24) 
	public CThostFtdcTradingAccountField SettlementID(int SettlementID) {
		this.io.setIntField(this, 24, SettlementID);
		return this;
	}
	/**
	 * \u4fe1\u7528\u989d\u5ea6<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(25) 
	public double Credit() {
		return this.io.getDoubleField(this, 25);
	}
	/**
	 * \u4fe1\u7528\u989d\u5ea6<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(25) 
	public CThostFtdcTradingAccountField Credit(double Credit) {
		this.io.setDoubleField(this, 25, Credit);
		return this;
	}
	/**
	 * \u8d28\u62bc\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(26) 
	public double Mortgage() {
		return this.io.getDoubleField(this, 26);
	}
	/**
	 * \u8d28\u62bc\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(26) 
	public CThostFtdcTradingAccountField Mortgage(double Mortgage) {
		this.io.setDoubleField(this, 26, Mortgage);
		return this;
	}
	/**
	 * \u4ea4\u6613\u6240\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(27) 
	public double ExchangeMargin() {
		return this.io.getDoubleField(this, 27);
	}
	/**
	 * \u4ea4\u6613\u6240\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(27) 
	public CThostFtdcTradingAccountField ExchangeMargin(double ExchangeMargin) {
		this.io.setDoubleField(this, 27, ExchangeMargin);
		return this;
	}
	/**
	 * \u6295\u8d44\u8005\u4ea4\u5272\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(28) 
	public double DeliveryMargin() {
		return this.io.getDoubleField(this, 28);
	}
	/**
	 * \u6295\u8d44\u8005\u4ea4\u5272\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(28) 
	public CThostFtdcTradingAccountField DeliveryMargin(double DeliveryMargin) {
		this.io.setDoubleField(this, 28, DeliveryMargin);
		return this;
	}
	/**
	 * \u4ea4\u6613\u6240\u4ea4\u5272\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(29) 
	public double ExchangeDeliveryMargin() {
		return this.io.getDoubleField(this, 29);
	}
	/**
	 * \u4ea4\u6613\u6240\u4ea4\u5272\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(29) 
	public CThostFtdcTradingAccountField ExchangeDeliveryMargin(double ExchangeDeliveryMargin) {
		this.io.setDoubleField(this, 29, ExchangeDeliveryMargin);
		return this;
	}
	/**
	 * \u4fdd\u5e95\u671f\u8d27\u7ed3\u7b97\u51c6\u5907\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(30) 
	public double ReserveBalance() {
		return this.io.getDoubleField(this, 30);
	}
	/**
	 * \u4fdd\u5e95\u671f\u8d27\u7ed3\u7b97\u51c6\u5907\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(30) 
	public CThostFtdcTradingAccountField ReserveBalance(double ReserveBalance) {
		this.io.setDoubleField(this, 30, ReserveBalance);
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
	 * \u4e0a\u6b21\u8d27\u5e01\u8d28\u5165\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(32) 
	public double PreFundMortgageIn() {
		return this.io.getDoubleField(this, 32);
	}
	/**
	 * \u4e0a\u6b21\u8d27\u5e01\u8d28\u5165\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(32) 
	public CThostFtdcTradingAccountField PreFundMortgageIn(double PreFundMortgageIn) {
		this.io.setDoubleField(this, 32, PreFundMortgageIn);
		return this;
	}
	/**
	 * \u4e0a\u6b21\u8d27\u5e01\u8d28\u51fa\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(33) 
	public double PreFundMortgageOut() {
		return this.io.getDoubleField(this, 33);
	}
	/**
	 * \u4e0a\u6b21\u8d27\u5e01\u8d28\u51fa\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(33) 
	public CThostFtdcTradingAccountField PreFundMortgageOut(double PreFundMortgageOut) {
		this.io.setDoubleField(this, 33, PreFundMortgageOut);
		return this;
	}
	/**
	 * \u8d27\u5e01\u8d28\u5165\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(34) 
	public double FundMortgageIn() {
		return this.io.getDoubleField(this, 34);
	}
	/**
	 * \u8d27\u5e01\u8d28\u5165\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(34) 
	public CThostFtdcTradingAccountField FundMortgageIn(double FundMortgageIn) {
		this.io.setDoubleField(this, 34, FundMortgageIn);
		return this;
	}
	/**
	 * \u8d27\u5e01\u8d28\u51fa\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(35) 
	public double FundMortgageOut() {
		return this.io.getDoubleField(this, 35);
	}
	/**
	 * \u8d27\u5e01\u8d28\u51fa\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(35) 
	public CThostFtdcTradingAccountField FundMortgageOut(double FundMortgageOut) {
		this.io.setDoubleField(this, 35, FundMortgageOut);
		return this;
	}
	/**
	 * \u8d27\u5e01\u8d28\u62bc\u4f59\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(36) 
	public double FundMortgageAvailable() {
		return this.io.getDoubleField(this, 36);
	}
	/**
	 * \u8d27\u5e01\u8d28\u62bc\u4f59\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(36) 
	public CThostFtdcTradingAccountField FundMortgageAvailable(double FundMortgageAvailable) {
		this.io.setDoubleField(this, 36, FundMortgageAvailable);
		return this;
	}
	/**
	 * \u53ef\u8d28\u62bc\u8d27\u5e01\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(37) 
	public double MortgageableFund() {
		return this.io.getDoubleField(this, 37);
	}
	/**
	 * \u53ef\u8d28\u62bc\u8d27\u5e01\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(37) 
	public CThostFtdcTradingAccountField MortgageableFund(double MortgageableFund) {
		this.io.setDoubleField(this, 37, MortgageableFund);
		return this;
	}
	/**
	 * \u7279\u6b8a\u4ea7\u54c1\u5360\u7528\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(38) 
	public double SpecProductMargin() {
		return this.io.getDoubleField(this, 38);
	}
	/**
	 * \u7279\u6b8a\u4ea7\u54c1\u5360\u7528\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(38) 
	public CThostFtdcTradingAccountField SpecProductMargin(double SpecProductMargin) {
		this.io.setDoubleField(this, 38, SpecProductMargin);
		return this;
	}
	/**
	 * \u7279\u6b8a\u4ea7\u54c1\u51bb\u7ed3\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(39) 
	public double SpecProductFrozenMargin() {
		return this.io.getDoubleField(this, 39);
	}
	/**
	 * \u7279\u6b8a\u4ea7\u54c1\u51bb\u7ed3\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(39) 
	public CThostFtdcTradingAccountField SpecProductFrozenMargin(double SpecProductFrozenMargin) {
		this.io.setDoubleField(this, 39, SpecProductFrozenMargin);
		return this;
	}
	/**
	 * \u7279\u6b8a\u4ea7\u54c1\u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(40) 
	public double SpecProductCommission() {
		return this.io.getDoubleField(this, 40);
	}
	/**
	 * \u7279\u6b8a\u4ea7\u54c1\u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(40) 
	public CThostFtdcTradingAccountField SpecProductCommission(double SpecProductCommission) {
		this.io.setDoubleField(this, 40, SpecProductCommission);
		return this;
	}
	/**
	 * \u7279\u6b8a\u4ea7\u54c1\u51bb\u7ed3\u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(41) 
	public double SpecProductFrozenCommission() {
		return this.io.getDoubleField(this, 41);
	}
	/**
	 * \u7279\u6b8a\u4ea7\u54c1\u51bb\u7ed3\u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(41) 
	public CThostFtdcTradingAccountField SpecProductFrozenCommission(double SpecProductFrozenCommission) {
		this.io.setDoubleField(this, 41, SpecProductFrozenCommission);
		return this;
	}
	/**
	 * \u7279\u6b8a\u4ea7\u54c1\u6301\u4ed3\u76c8\u4e8f<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(42) 
	public double SpecProductPositionProfit() {
		return this.io.getDoubleField(this, 42);
	}
	/**
	 * \u7279\u6b8a\u4ea7\u54c1\u6301\u4ed3\u76c8\u4e8f<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(42) 
	public CThostFtdcTradingAccountField SpecProductPositionProfit(double SpecProductPositionProfit) {
		this.io.setDoubleField(this, 42, SpecProductPositionProfit);
		return this;
	}
	/**
	 * \u7279\u6b8a\u4ea7\u54c1\u5e73\u4ed3\u76c8\u4e8f<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(43) 
	public double SpecProductCloseProfit() {
		return this.io.getDoubleField(this, 43);
	}
	/**
	 * \u7279\u6b8a\u4ea7\u54c1\u5e73\u4ed3\u76c8\u4e8f<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(43) 
	public CThostFtdcTradingAccountField SpecProductCloseProfit(double SpecProductCloseProfit) {
		this.io.setDoubleField(this, 43, SpecProductCloseProfit);
		return this;
	}
	/**
	 * \u6839\u636e\u6301\u4ed3\u76c8\u4e8f\u7b97\u6cd5\u8ba1\u7b97\u7684\u7279\u6b8a\u4ea7\u54c1\u6301\u4ed3\u76c8\u4e8f<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(44) 
	public double SpecProductPositionProfitByAlg() {
		return this.io.getDoubleField(this, 44);
	}
	/**
	 * \u6839\u636e\u6301\u4ed3\u76c8\u4e8f\u7b97\u6cd5\u8ba1\u7b97\u7684\u7279\u6b8a\u4ea7\u54c1\u6301\u4ed3\u76c8\u4e8f<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(44) 
	public CThostFtdcTradingAccountField SpecProductPositionProfitByAlg(double SpecProductPositionProfitByAlg) {
		this.io.setDoubleField(this, 44, SpecProductPositionProfitByAlg);
		return this;
	}
	/**
	 * \u7279\u6b8a\u4ea7\u54c1\u4ea4\u6613\u6240\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(45) 
	public double SpecProductExchangeMargin() {
		return this.io.getDoubleField(this, 45);
	}
	/**
	 * \u7279\u6b8a\u4ea7\u54c1\u4ea4\u6613\u6240\u4fdd\u8bc1\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(45) 
	public CThostFtdcTradingAccountField SpecProductExchangeMargin(double SpecProductExchangeMargin) {
		this.io.setDoubleField(this, 45, SpecProductExchangeMargin);
		return this;
	}
	public CThostFtdcTradingAccountField() {
		super();
	}
	public CThostFtdcTradingAccountField(Pointer pointer) {
		super(pointer);
	}
}
