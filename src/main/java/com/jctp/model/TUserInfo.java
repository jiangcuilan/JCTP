package com.jctp.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.jctp.trader.JCTPTraderApi;
import com.jctp.trader.MyJCTPTraderSpi;
import com.min.DateFormatUtil;

public class TUserInfo {

	//用户逐渐
	private int  id;

	//用户名
	private  String user;
	//密码
	private  String pass;
	//服务器地址
	private  String host;
	//市场代码
	private  String brokerId;
	//是否需要验证
	private  String needAuth;
	//产品信息
	private  String prodInfo;
	//认证码
	private  String authCode;
	//连接方式，目前只有上期ctp
	private  String connType;
	//主账户还是从账户
	private  String tag;
	//账户排序，主账户从1..2正数排序，从账户从-1，-2 开始排序
	private  int sort;
    //登录返回值
	private int frontId;
	//登录返回值
	private int sessionId;
	//登录返回值
	private String orderRef;
	//最近一次登录时间
	private  int    lastTick;
	//跟随账户
	private  List<TUserInfo> follows;
	//创建好的TraderApi
	private  JCTPTraderApi  trApi;
	//创建好的TraderSpi
	private MyJCTPTraderSpi trSpi;
	//登录状态
	private int loginState;
	//跟单设置
	private TFollowSet followSet;
	//账户的当前报单
	private List<TOrderInfo> tOrders=new ArrayList<>(); 
	//是否是账单日
	private boolean isConfirmDate;
	//操作标识，在每个resq开始前设置为false，resp后设置为true
	private HashMap<Integer, Boolean> opKeys=new HashMap<>();
	
	
	public void check(){
		try {
			
			while (DateFormatUtil.currentTimeStamp() - lastTick<1) {
				Thread.sleep(10);
			}
			lastTick = DateFormatUtil.currentTimeStamp();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void setKey(int key,boolean value){
		getOpKeys().put(key, value);
	}
	
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	
	public HashMap<Integer, Boolean> getOpKeys() {
		return opKeys;
	}
	public void setOpKeys(HashMap<Integer, Boolean> opKeys) {
		this.opKeys = opKeys;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public TFollowSet getFollowSet() {
		return followSet;
	}
	public void setFollowSet(TFollowSet followSet) {
		this.followSet = followSet;
	}
	
	
	public List<TOrderInfo> gettOrders() {
		return tOrders;
	}
	
	
	public void settOrders(List<TOrderInfo> tOrders) {
		this.tOrders = tOrders;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getBrokerId() {
		return brokerId;
	}
	public void setBrokerId(String brokerId) {
		this.brokerId = brokerId;
	}
	public String getNeedAuth() {
		return needAuth;
	}
	public void setNeedAuth(String needAuth) {
		this.needAuth = needAuth;
	}
	public String getProdInfo() {
		return prodInfo;
	}
	public void setProdInfo(String prodInfo) {
		this.prodInfo = prodInfo;
	}
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getConnType() {
		return connType;
	}
	public void setConnType(String connType) {
		this.connType = connType;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public int getLastTick() {
		return lastTick;
	}
	public void setLastTick(int lastTick) {
		this.lastTick = lastTick;
	}
	public List<TUserInfo> getFollows() {
		return follows;
	}
	public void setFollows(List<TUserInfo> follows) {
		this.follows = follows;
	}
	public JCTPTraderApi getTrApi() {
		return trApi;
	}
	public void setTrApi(JCTPTraderApi trApi) {
		this.trApi = trApi;
	}
	public int getLoginState() {
		return loginState;
	}
	public void setLoginState(int loginState) {
		this.loginState = loginState;
	}
	public boolean getIsConfirmDate() {
		return isConfirmDate;
	}
	public void setIsConfirmDate(boolean isConfirmDate) {
		this.isConfirmDate = isConfirmDate;
	}
	public int getFrontId() {
		return frontId;
	}

	public void setFrontId(int frontId) {
		this.frontId = frontId;
	}

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public String getOrderRef() {
		return orderRef;
	}

	public void setOrderRef(String orderRef) {
		this.orderRef = orderRef;
	}

	public MyJCTPTraderSpi getTrSpi() {
		return trSpi;
	}

	public void setTrSpi(MyJCTPTraderSpi trSpi) {
		this.trSpi = trSpi;
	}
	
}
