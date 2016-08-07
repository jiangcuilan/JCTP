package com.jctp.md;

import org.bridj.BridJ;
import org.bridj.Pointer;

import com.ctp.thostftdcmdapi.CThostFtdcMdApi;
import com.ctp.thostftdcmdapi.CThostFtdcMdSpi;
import com.ctp.thostftdcuserapistruct.CThostFtdcReqUserLoginField;
import com.ctp.thostftdcuserapistruct.CThostFtdcUserLogoutField;
import com.jctp.util.JCTPLibraryUtil;

/**
 * CThostFtdcMdApi封装类
 * 
 * @author Hraink E-mail:Hraink@Gmail.com
 * @version 2013-1-26 下午11:44:50
 */

public class JCTPMdApi {
	static {
		try {
			JCTPLibraryUtil.initLibrary();
			BridJ.register(CThostFtdcMdApi.class);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	//CTP Trader API
	CThostFtdcMdApi mdApi;
	
	public JCTPMdApi(CThostFtdcMdApi mdApi) {
		this.mdApi = mdApi;
	}
	
	/**
	 * 创建TraderApi
	 * 
	 * <pre>
	 * 订阅信息文件存贮在根目录
	 * </pre>
	 * @return 创建出的UserApi
	 */
	public static JCTPMdApi createFtdcTraderApi() {
		return createFtdcTraderApi("", false);
	}
	
	/**
	 * 创建TraderApi
	 * @param pszFlowPath 存贮订阅信息文件的目录
	 * @param bIsUsingUdp 
	 * @return 创建出的UserApi
	 */
	public static JCTPMdApi createFtdcTraderApi(String pszFlowPath, boolean bIsUsingUdp) {
		Pointer<CThostFtdcMdApi> mdApiPtr = CThostFtdcMdApi.CreateFtdcMdApi(Pointer.pointerToCString(pszFlowPath), false,true);
		CThostFtdcMdApi cThostFtdcMdApi = mdApiPtr.get();
		return new JCTPMdApi(cThostFtdcMdApi);
	}
	
	/**
	 * 删除接口对象本身
	 * 
	 * <pre>
	 * 不再使用本接口对象时,调用该函数删除接口对象
	 * </pre>
	 */
	public void Release() {
		mdApi.Release();
		JCTPLibraryUtil.release();
	}
	
	/**
	 * 初始化
	 * 
	 * <pre>
	 * 初始化运行环境,只有调用后,接口才开始工作
	 * </pre>
	 */
	public void Init() {
		mdApi.Init();
	}
	
	/**
	 * 等待接口线程结束运行
	 * @return 线程退出代码
	 */
	public int Join() {
		return mdApi.Join();
	}
	
	/**
	 * 获取当前交易日
	 * 
	 * <pre>
	 * 只有登录成功后,才能得到正确的交易日
	 * </pre>
	 * @return 获取到的交易日
	 */
	public String getTradingDay() {
		Pointer<Byte> tradingDay = mdApi.GetTradingDay();
		return tradingDay.getCString();
	}

	/**
	 * 注册前置机网络地址
	 * 
	 * <pre>
	 * 网络地址的格式为：“protocol://ipaddress:port”，如：”tcp://127.0.0.1:17001”。 
	 * “tcp”代表传输协议，“127.0.0.1”代表服务器地址。”17001”代表服务器端口号
	 * </pre>
	 * 
	 * @param pszFrontAddress：前置机网络地址。
	 */
	public void registerFront(String pszFrontAddress) {
		mdApi.RegisterFront(Pointer.pointerToCString(pszFrontAddress));
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
	 * @param pszNsAddress 名字服务器网络地址
	 */
	public void registerNameServer(String pszNsAddress) {
		mdApi.RegisterNameServer(Pointer.pointerToCString(pszNsAddress));
	}
	
	/**
	 * 注册回调接口
	 * @param pSpi 派生自回调接口类的实例
	 */
	public void registerSpi(JCTPMdSpi pSpi) {
		CThostFtdcMdSpi mdSpi = new JCTPMdSpiAdapter(pSpi);
		mdApi.RegisterSpi(Pointer.pointerTo(mdSpi));
	}
	/**
	 * 订阅行情
	 * @param ppInstrumentID 合约ID
	 * @param nCount 要订阅/退订行情的合约个数
	 * @return
	 */
	public int subscribeMarketData(String... ppInstrumentID) {
		return mdApi.SubscribeMarketData(Pointer.pointerToCStrings(ppInstrumentID), ppInstrumentID.length);
	}
	
	/**
	 * 退订行情
	 * @param ppInstrumentID 合约ID
	 * @param nCount 要订阅/退订行情的合约个数
	 * @return
	 */
	public int unSubscribeMarketData(String... ppInstrumentID) {
		return mdApi.UnSubscribeMarketData(Pointer.pointerToCStrings(ppInstrumentID), ppInstrumentID.length);
	}
	
	/**
	 * 用户登录请求
	 * @param pReqUserLoginField
	 * @param nRequestID
	 * @return
	 */
	public int reqUserLogin(CThostFtdcReqUserLoginField pReqUserLoginField, int nRequestID) {
		return mdApi.ReqUserLogin(Pointer.pointerTo(pReqUserLoginField), nRequestID);
	}
	
	/**
	 * 登出请求
	 * @param pUserLogout
	 * @param nRequestID
	 * @return
	 */
	public int reqUserLogout(CThostFtdcUserLogoutField pUserLogout, int nRequestID) {
		return mdApi.ReqUserLogout(Pointer.pointerTo(pUserLogout), nRequestID);
	}
}
