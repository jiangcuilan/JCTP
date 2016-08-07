package com.jctp.trader;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;

import com.ctp.thostftdctraderapi.CThostFtdcTraderApi;
import com.ctp.thostftdctraderapi.CThostFtdcTraderSpi;
import com.ctp.thostftdcuserapidatatype.ThostFtdcUserApiDataTypeLibrary.THOST_TE_RESUME_TYPE;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcInputOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcParkedOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcParkedOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryAccountregisterField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryBrokerTradingAlgosField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryBrokerTradingParamsField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryCFMMCTradingAccountKeyField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryContractBankField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryDepthMarketDataField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryEWarrantOffsetField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryExchangeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInstrumentCommissionRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInstrumentField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInstrumentMarginRateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInvestorField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInvestorPositionCombineDetailField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInvestorPositionDetailField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryInvestorPositionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryNoticeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryParkedOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryParkedOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQrySettlementInfoConfirmField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQrySettlementInfoField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryTradeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryTradingAccountField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryTradingCodeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryTradingNoticeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryTransferBankField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQryTransferSerialField;
import com.ctp.thostftdcuserapistruct.CThostFtdcQueryMaxOrderVolumeField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRemoveParkedOrderActionField;
import com.ctp.thostftdcuserapistruct.CThostFtdcRemoveParkedOrderField;
import com.ctp.thostftdcuserapistruct.CThostFtdcReqAuthenticateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcReqQueryAccountField;
import com.ctp.thostftdcuserapistruct.CThostFtdcReqTransferField;
import com.ctp.thostftdcuserapistruct.CThostFtdcReqUserLoginField;
import com.ctp.thostftdcuserapistruct.CThostFtdcSettlementInfoConfirmField;
import com.ctp.thostftdcuserapistruct.CThostFtdcTradingAccountPasswordUpdateField;
import com.ctp.thostftdcuserapistruct.CThostFtdcUserLogoutField;
import com.ctp.thostftdcuserapistruct.CThostFtdcUserPasswordUpdateField;
import com.jctp.util.JCTPLibraryUtil;

/**
 * CThostFtdcTrader封装类
 * 
 * @author Hraink E-mail:Hraink@Gmail.com
 * @version 2013-1-21 下午11:44:50
 */

public class JCTPTraderApi {
	static {
		JCTPLibraryUtil.initLibrary();
		BridJ.register(CThostFtdcTraderApi.class);
	}

	/** CTP Trader API **/
	CThostFtdcTraderApi traderApi;

	public JCTPTraderApi(CThostFtdcTraderApi traderApi) {
		this.traderApi = traderApi;
	}

	/**
	 * 创建TraderApi
	 * 
	 * <pre>
	 * 订阅信息文件存贮在根目录
	 * </pre>
	 * 
	 * @return 创建出的UserApi
	 */
	public static JCTPTraderApi createFtdcTraderApi() {
		return createFtdcTraderApi("");
	}

	/**
	 * 创建TraderApi
	 * 
	 * <pre>
	 * 指定的文件夹必须已存在，否则jvm会崩溃
	 * 此问题下一版解决
	 * 
	 * 信息文件目录格式：
	 * 	"c:/ctpdata/"     = "c:/ctpdata/QueryRsp.con"
	 * 	"c:/ctpdata"      = "c:/ctpdataQueryRsp.con"
	 * 	"ctpdata/879243"  = "%PROJECT_HOME%/ctpdata/879243QueryRsp.con"
	 * 	"ctpdata/879243/" = "%PROJECT_HOME%/ctpdata/879243/QueryRsp.con"
	 * </pre>
	 * 
	 * @param pszFlowPath
	 *            存贮订阅信息文件的目录
	 * @return 创建出的UserApi
	 */
	public static JCTPTraderApi createFtdcTraderApi(String pszFlowPath) {
		Pointer<CThostFtdcTraderApi> traderApiPtr = CThostFtdcTraderApi
				.CreateFtdcTraderApi(Pointer.pointerToCString(pszFlowPath));
		CThostFtdcTraderApi cThostFtdcTraderApi = traderApiPtr.get();
		return new JCTPTraderApi(cThostFtdcTraderApi);
	}

	/**
	 * 删除接口对象本身
	 * 
	 * <pre>
	 * 不再使用本接口对象时,调用该函数删除接口对象
	 * </pre>
	 */
	public void release() {
		traderApi.Release();
	}

	/**
	 * 初始化运行环境
	 * 
	 * <pre>
	 * 只有调用后,接口才开始工作
	 * </pre>
	 */
	public void init() {
		traderApi.Init();
	}

	/**
	 * 等待接口线程结束运行
	 * 
	 * @return 线程退出代码
	 */
	public int join() {
		return traderApi.Join();
	}

	/**
	 * 获取当前交易日
	 * 
	 * <pre>
	 * 只有登录成功后,才能得到正确的交易日
	 * </pre>
	 * 
	 * @return 获取到的交易日
	 */
	public String getTradingDay() {
		Pointer<Byte> tradingDay = traderApi.GetTradingDay();
		return tradingDay.getCString();
	}

	/**
	 * 注册前置机网络地址
	 * 
	 * <pre>
	 * 网络地址的格式为：“protocol://ipaddress:port”，如：”tcp://127.0.0.1:17001”
	 * “tcp”代表传输协议，“127.0.0.1”代表服务器地址。”17001”代表服务器端口号
	 * </pre>
	 * 
	 * @param pszFrontAddress
	 *            前置机网络地址
	 */
	public void registerFront(String pszFrontAddress) {
		traderApi.RegisterFront(Pointer.pointerToCString(pszFrontAddress));
	}

	/**
	 * 注册名字服务器网络地址
	 * 
	 * <pre>
	 * 网络地址的格式为：“protocol://ipaddress:port”，如：”tcp://127.0.0.1:12001”
	 * “tcp”代表传输协议，“127.0.0.1”代表服务器地址。”12001”代表服务器端口号
	 * RegisterNameServer优先于RegisterFront
	 * </pre>
	 * 
	 * @param pszNsAddress
	 *            名字服务器网络地址
	 */
	public void registerNameServer(String pszNsAddress) {
		traderApi.RegisterNameServer(Pointer.pointerToCString(pszNsAddress));
	}

	/**
	 * 注册回调接口
	 * 
	 * @param pSpi
	 *            派生自回调接口类的实例
	 */
	public void registerSpi(JCTPTraderSpi pSpi) {
		CThostFtdcTraderSpi spiAdapter = new JCTPTraderSpiAdapter(pSpi);
		traderApi.RegisterSpi(Pointer.pointerTo(spiAdapter));
	}

	/**
	 * 订阅私有流 该方法要在Init方法前调用。若不调用则不会收到私有流的数据。
	 * 
	 * @param nResumeType
	 *            私有流重传方式 </br> THOST_TERT_RESTART:从本交易日开始重传 </br>
	 *            THOST_TERT_RESUME:从上次收到的续传 </br> THOST_TERT_QUICK:只传送登录后私有流的内容
	 */
	public void subscribePrivateTopic(
			IntValuedEnum<THOST_TE_RESUME_TYPE> nResumeType) {
		// TODO 考虑自定义枚举类型
		traderApi.SubscribePrivateTopic(nResumeType);
	}

	/**
	 * 订阅公共流 该方法要在Init方法前调用。若不调用则不会收到私有流的数据。
	 * 
	 * @param nResumeType
	 *            公共流重传方式 </br> THOST_TERT_RESTART:从本交易日开始重传 </br>
	 *            THOST_TERT_RESUME:从上次收到的续传 </br> THOST_TERT_QUICK:只传送登录后私有流的内容
	 */
	public void subscribePublicTopic(
			IntValuedEnum<THOST_TE_RESUME_TYPE> nResumeType) {
		// TODO 考虑自定义枚举类型
		traderApi.SubscribePublicTopic(nResumeType);
	}

	/**
	 * 客户端认证请求
	 * 
	 * @param pReqAuthenticateField
	 * @param nRequestID
	 * @return 请求发送状态
	 */
	public int reqAuthenticate(
			CThostFtdcReqAuthenticateField pReqAuthenticateField, int nRequestID) {
		return traderApi.ReqAuthenticate(
				Pointer.pointerTo(pReqAuthenticateField), nRequestID);
	}

	/**
	 * 用户登录请求
	 * 
	 * @param pReqUserLoginField
	 * @param nRequestID
	 * @return 请求发送状态
	 */
	public int reqUserLogin(CThostFtdcReqUserLoginField pReqUserLoginField,
			int nRequestID) {
		return traderApi.ReqUserLogin(Pointer.pointerTo(pReqUserLoginField),
				nRequestID);
	}

	/**
	 * 登出请求
	 * 
	 * @param pUserLogout
	 * @param nRequestID
	 * @return 请求发送状态
	 */
	public int reqUserLogout(CThostFtdcUserLogoutField pUserLogout,
			int nRequestID) {
		return traderApi.ReqUserLogout(Pointer.pointerTo(pUserLogout),
				nRequestID);
	}

	/**
	 * 用户口令更新请求
	 * 
	 * @param pUserPasswordUpdate
	 * @param nRequestID
	 * @return 请求发送状态
	 */
	public int reqUserPasswordUpdate(
			CThostFtdcUserPasswordUpdateField pUserPasswordUpdate,
			int nRequestID) {
		return traderApi.ReqUserPasswordUpdate(
				Pointer.pointerTo(pUserPasswordUpdate), nRequestID);
	}

	/**
	 * 资金账户口令更新请求
	 * 
	 * @param pTradingAccountPasswordUpdate
	 * @param nRequestID
	 * @return 请求发送状态
	 */
	public int reqTradingAccountPasswordUpdate(
			CThostFtdcTradingAccountPasswordUpdateField pTradingAccountPasswordUpdate,
			int nRequestID) {
		return traderApi.ReqTradingAccountPasswordUpdate(
				Pointer.pointerTo(pTradingAccountPasswordUpdate), nRequestID);
	}

	/**
	 * 报单录入请求
	 * 
	 * @param pInputOrder
	 * @param nRequestID
	 * @return
	 */
	public int reqOrderInsert(CThostFtdcInputOrderField pInputOrder,
			int nRequestID) {
		return traderApi.ReqOrderInsert(Pointer.pointerTo(pInputOrder),
				nRequestID);
	}

	/**
	 * 预埋单录入请求
	 * 
	 * @param pParkedOrder
	 * @param nRequestID
	 * @return
	 */
	public int reqParkedOrderInsert(CThostFtdcParkedOrderField pParkedOrder,
			int nRequestID) {
		return traderApi.ReqParkedOrderInsert(Pointer.pointerTo(pParkedOrder),
				nRequestID);
	}

	/**
	 * 预埋撤单录入请求
	 * 
	 * @param pParkedOrderAction
	 * @param nRequestID
	 * @return
	 */
	public int reqParkedOrderAction(
			CThostFtdcParkedOrderActionField pParkedOrderAction, int nRequestID) {
		return traderApi.ReqParkedOrderAction(
				Pointer.pointerTo(pParkedOrderAction), nRequestID);
	}

	/**
	 * 报单操作请求
	 * 
	 * @param pInputOrderAction
	 * @param nRequestID
	 * @return
	 */
	public int reqOrderAction(
			CThostFtdcInputOrderActionField pInputOrderAction, int nRequestID) {

		return traderApi.ReqOrderAction(Pointer.pointerTo(pInputOrderAction),
				nRequestID);
	}

	/**
	 * 查询最大报单数量请求
	 * 
	 * @param pQueryMaxOrderVolume
	 * @param nRequestID
	 * @return
	 */
	public int reqQueryMaxOrderVolume(
			CThostFtdcQueryMaxOrderVolumeField pQueryMaxOrderVolume,
			int nRequestID) {

		return traderApi.ReqQueryMaxOrderVolume(
				Pointer.pointerTo(pQueryMaxOrderVolume), nRequestID);
	}

	/**
	 * 投资者结算结果确认
	 * 
	 * @param pSettlementInfoConfirm
	 * @param nRequestID
	 * @return
	 */
	public int reqSettlementInfoConfirm(
			CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm,
			int nRequestID) {

		return traderApi.ReqSettlementInfoConfirm(
				Pointer.pointerTo(pSettlementInfoConfirm), nRequestID);
	}

	/**
	 * 请求删除预埋单
	 * 
	 * @param pRemoveParkedOrder
	 * @param nRequestID
	 * @return
	 */
	public int reqRemoveParkedOrder(
			CThostFtdcRemoveParkedOrderField pRemoveParkedOrder, int nRequestID) {

		return traderApi.ReqRemoveParkedOrder(
				Pointer.pointerTo(pRemoveParkedOrder), nRequestID);
	}

	/**
	 * 请求删除预埋撤单
	 * 
	 * @param pRemoveParkedOrderAction
	 * @param nRequestID
	 * @return
	 */
	public int reqRemoveParkedOrderAction(
			CThostFtdcRemoveParkedOrderActionField pRemoveParkedOrderAction,
			int nRequestID) {

		return traderApi.ReqRemoveParkedOrderAction(
				Pointer.pointerTo(pRemoveParkedOrderAction), nRequestID);
	}

	/**
	 * 请求查询报单
	 * 
	 * @param pQryOrder
	 * @param nRequestID
	 * @return
	 */
	public int reqQryOrder(CThostFtdcQryOrderField pQryOrder, int nRequestID) {

		return traderApi.ReqQryOrder(Pointer.pointerTo(pQryOrder), nRequestID);
	}

	/**
	 * 请求查询成交
	 * 
	 * @param pQryTrade
	 * @param nRequestID
	 * @return
	 */
	public int reqQryTrade(CThostFtdcQryTradeField pQryTrade, int nRequestID) {

		return traderApi.ReqQryTrade(Pointer.pointerTo(pQryTrade), nRequestID);
	}

	/**
	 * 请求查询投资者持仓
	 * 
	 * @param pQryInvestorPosition
	 * @param nRequestID
	 * @return
	 */
	public int reqQryInvestorPosition(
			CThostFtdcQryInvestorPositionField pQryInvestorPosition,
			int nRequestID) {

		return traderApi.ReqQryInvestorPosition(
				Pointer.pointerTo(pQryInvestorPosition), nRequestID);
	}

	/**
	 * 请求查询资金账户
	 * 
	 * @param pQryTradingAccount
	 * @param nRequestID
	 * @return
	 */
	public int reqQryTradingAccount(
			CThostFtdcQryTradingAccountField pQryTradingAccount, int nRequestID) {

		return traderApi.ReqQryTradingAccount(
				Pointer.pointerTo(pQryTradingAccount), nRequestID);
	}

	/**
	 * 请求查询投资者
	 * 
	 * @param pQryInvestor
	 * @param nRequestID
	 * @return
	 */
	public int reqQryInvestor(CThostFtdcQryInvestorField pQryInvestor,
			int nRequestID) {

		return traderApi.ReqQryInvestor(Pointer.pointerTo(pQryInvestor),
				nRequestID);
	}

	/**
	 * 请求查询交易编码
	 * 
	 * @param pQryTradingCode
	 * @param nRequestID
	 * @return
	 */
	public int reqQryTradingCode(CThostFtdcQryTradingCodeField pQryTradingCode,
			int nRequestID) {

		return traderApi.ReqQryTradingCode(Pointer.pointerTo(pQryTradingCode),
				nRequestID);
	}

	/**
	 * 请求查询合约保证金率
	 * 
	 * @param pQryInstrumentMarginRate
	 * @param nRequestID
	 * @return
	 */
	public int reqQryInstrumentMarginRate(
			CThostFtdcQryInstrumentMarginRateField pQryInstrumentMarginRate,
			int nRequestID) {

		return traderApi.ReqQryInstrumentMarginRate(
				Pointer.pointerTo(pQryInstrumentMarginRate), nRequestID);
	}

	/**
	 * 请求查询合约手续费率
	 * 
	 * @param pQryInstrumentCommissionRate
	 * @param nRequestID
	 * @return
	 */
	public int reqQryInstrumentCommissionRate(
			CThostFtdcQryInstrumentCommissionRateField pQryInstrumentCommissionRate,
			int nRequestID) {

		return traderApi.ReqQryInstrumentCommissionRate(
				Pointer.pointerTo(pQryInstrumentCommissionRate), nRequestID);
	}

	/**
	 * 请求查询交易所
	 * 
	 * @param pQryExchange
	 * @param nRequestID
	 * @return
	 */
	public int reqQryExchange(CThostFtdcQryExchangeField pQryExchange,
			int nRequestID) {

		return traderApi.ReqQryExchange(Pointer.pointerTo(pQryExchange),
				nRequestID);
	}

	/**
	 * 请求查询合约
	 * 
	 * @param pQryInstrument
	 * @param nRequestID
	 * @return
	 */
	public int reqQryInstrument(CThostFtdcQryInstrumentField pQryInstrument,
			int nRequestID) {

		return traderApi.ReqQryInstrument(Pointer.pointerTo(pQryInstrument),
				nRequestID);
	}

	/**
	 * 请求查询行情
	 * 
	 * @param pQryDepthMarketData
	 * @param nRequestID
	 * @return
	 */
	public int reqQryDepthMarketData(
			CThostFtdcQryDepthMarketDataField pQryDepthMarketData,
			int nRequestID) {

		return traderApi.ReqQryDepthMarketData(
				Pointer.pointerTo(pQryDepthMarketData), nRequestID);
	}

	/**
	 * 请求查询投资者结算结果
	 * 
	 * @param pQrySettlementInfo
	 * @param nRequestID
	 * @return
	 */
	public int reqQrySettlementInfo(
			CThostFtdcQrySettlementInfoField pQrySettlementInfo, int nRequestID) {

		return traderApi.ReqQrySettlementInfo(
				Pointer.pointerTo(pQrySettlementInfo), nRequestID);
	}

	/**
	 * 请求查询转帐银行
	 * 
	 * @param pQryTransferBank
	 * @param nRequestID
	 * @return
	 */
	public int reqQryTransferBank(
			CThostFtdcQryTransferBankField pQryTransferBank, int nRequestID) {

		return traderApi.ReqQryTransferBank(
				Pointer.pointerTo(pQryTransferBank), nRequestID);
	}

	/**
	 * 请求查询投资者持仓明细
	 * 
	 * @param pQryInvestorPositionDetail
	 * @param nRequestID
	 * @return
	 */
	public int reqQryInvestorPositionDetail(
			CThostFtdcQryInvestorPositionDetailField pQryInvestorPositionDetail,
			int nRequestID) {

		return traderApi.ReqQryInvestorPositionDetail(
				Pointer.pointerTo(pQryInvestorPositionDetail), nRequestID);
	}

	/**
	 * 请求查询客户通知
	 * 
	 * @param pQryNotice
	 * @param nRequestID
	 * @return
	 */
	public int reqQryNotice(CThostFtdcQryNoticeField pQryNotice, int nRequestID) {

		return traderApi
				.ReqQryNotice(Pointer.pointerTo(pQryNotice), nRequestID);
	}

	/**
	 * 请求查询结算信息确认
	 * 
	 * @param pQrySettlementInfoConfirm
	 * @param nRequestID
	 * @return
	 */
	public int reqQrySettlementInfoConfirm(
			CThostFtdcQrySettlementInfoConfirmField pQrySettlementInfoConfirm,
			int nRequestID) {

		return traderApi.ReqQrySettlementInfoConfirm(
				Pointer.pointerTo(pQrySettlementInfoConfirm), nRequestID);
	}

	/**
	 * 请求查询投资者持仓明细
	 * 
	 * @param pQryInvestorPositionCombineDetail
	 * @param nRequestID
	 * @return
	 */
	public int reqQryInvestorPositionCombineDetail(
			CThostFtdcQryInvestorPositionCombineDetailField pQryInvestorPositionCombineDetail,
			int nRequestID) {

		return traderApi.ReqQryInvestorPositionCombineDetail(
				Pointer.pointerTo(pQryInvestorPositionCombineDetail),
				nRequestID);
	}

	/**
	 * 请求查询保证金监管系统经纪公司资金账户密钥
	 * 
	 * @param pQryCFMMCTradingAccountKey
	 * @param nRequestID
	 * @return
	 */
	public int reqQryCFMMCTradingAccountKey(
			CThostFtdcQryCFMMCTradingAccountKeyField pQryCFMMCTradingAccountKey,
			int nRequestID) {

		return traderApi.ReqQryCFMMCTradingAccountKey(
				Pointer.pointerTo(pQryCFMMCTradingAccountKey), nRequestID);
	}

	/**
	 * 请求查询仓单折抵信息
	 * 
	 * @param pQryEWarrantOffset
	 * @param nRequestID
	 * @return
	 */
	public int reqQryEWarrantOffset(
			CThostFtdcQryEWarrantOffsetField pQryEWarrantOffset, int nRequestID) {

		return traderApi.ReqQryEWarrantOffset(
				Pointer.pointerTo(pQryEWarrantOffset), nRequestID);
	}

	/**
	 * 请求查询转帐流水
	 * 
	 * @param pQryTransferSerial
	 * @param nRequestID
	 * @return
	 */
	public int reqQryTransferSerial(
			CThostFtdcQryTransferSerialField pQryTransferSerial, int nRequestID) {

		return traderApi.ReqQryTransferSerial(
				Pointer.pointerTo(pQryTransferSerial), nRequestID);
	}

	/**
	 * 请求查询银期签约关系
	 * 
	 * @param pQryAccountregister
	 * @param nRequestID
	 * @return
	 */
	public int reqQryAccountregister(
			CThostFtdcQryAccountregisterField pQryAccountregister,
			int nRequestID) {

		return traderApi.ReqQryAccountregister(
				Pointer.pointerTo(pQryAccountregister), nRequestID);
	}

	/**
	 * 请求查询签约银行
	 * 
	 * @param pQryContractBank
	 * @param nRequestID
	 * @return
	 */
	public int reqQryContractBank(
			CThostFtdcQryContractBankField pQryContractBank, int nRequestID) {

		return traderApi.ReqQryContractBank(
				Pointer.pointerTo(pQryContractBank), nRequestID);
	}

	/**
	 * 请求查询预埋单
	 * 
	 * @param pQryParkedOrder
	 * @param nRequestID
	 * @return
	 */
	public int reqQryParkedOrder(CThostFtdcQryParkedOrderField pQryParkedOrder,
			int nRequestID) {

		return traderApi.ReqQryParkedOrder(Pointer.pointerTo(pQryParkedOrder),
				nRequestID);
	}

	/**
	 * 请求查询预埋撤单
	 * 
	 * @param pQryParkedOrderAction
	 * @param nRequestID
	 * @return
	 */
	public int reqQryParkedOrderAction(
			CThostFtdcQryParkedOrderActionField pQryParkedOrderAction,
			int nRequestID) {

		return traderApi.ReqQryParkedOrderAction(
				Pointer.pointerTo(pQryParkedOrderAction), nRequestID);
	}

	/**
	 * 请求查询交易通知
	 * 
	 * @param pQryTradingNotice
	 * @param nRequestID
	 * @return
	 */
	public int reqQryTradingNotice(
			CThostFtdcQryTradingNoticeField pQryTradingNotice, int nRequestID) {
		return traderApi.ReqQryTradingNotice(
				Pointer.pointerTo(pQryTradingNotice), nRequestID);
	}

	/**
	 * 请求查询经纪公司交易参数
	 * 
	 * @param pQryBrokerTradingParams
	 * @param nRequestID
	 * @return
	 */
	public int reqQryBrokerTradingParams(
			CThostFtdcQryBrokerTradingParamsField pQryBrokerTradingParams,
			int nRequestID) {
		return traderApi.ReqQryBrokerTradingParams(
				Pointer.pointerTo(pQryBrokerTradingParams), nRequestID);
	}

	/**
	 * 请求查询经纪公司交易算法
	 * 
	 * @param pQryBrokerTradingAlgos
	 * @param nRequestID
	 * @return
	 */
	public int reqQryBrokerTradingAlgos(
			CThostFtdcQryBrokerTradingAlgosField pQryBrokerTradingAlgos,
			int nRequestID) {
		return traderApi.ReqQryBrokerTradingAlgos(
				Pointer.pointerTo(pQryBrokerTradingAlgos), nRequestID);
	}

	/**
	 * 期货发起银行资金转期货请求
	 * 
	 * @param pReqTransfer
	 * @param nRequestID
	 * @return
	 */
	public int reqFromBankToFutureByFuture(
			CThostFtdcReqTransferField pReqTransfer, int nRequestID) {
		return traderApi.ReqFromBankToFutureByFuture(
				Pointer.pointerTo(pReqTransfer), nRequestID);
	}

	/**
	 * 期货发起期货资金转银行请求
	 * 
	 * @param pReqTransfer
	 * @param nRequestID
	 * @return
	 */
	public int reqFromFutureToBankByFuture(
			CThostFtdcReqTransferField pReqTransfer, int nRequestID) {
		return traderApi.ReqFromFutureToBankByFuture(
				Pointer.pointerTo(pReqTransfer), nRequestID);
	}

	/**
	 * 期货发起查询银行余额请求
	 * 
	 * @param pReqQueryAccount
	 * @param nRequestID
	 * @return
	 */
	public int reqQueryBankAccountMoneyByFuture(
			CThostFtdcReqQueryAccountField pReqQueryAccount, int nRequestID) {
		return traderApi.ReqQueryBankAccountMoneyByFuture(
				Pointer.pointerTo(pReqQueryAccount), nRequestID);
	}
}
