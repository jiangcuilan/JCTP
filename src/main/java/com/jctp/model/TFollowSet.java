package com.jctp.model;

import java.math.BigDecimal;

/**
 * 用户跟单设置
 * @author Administrator
 *
 */
public class TFollowSet {

    //用户id
	private int userId;
	//跟单类型
	private int followType;
	//价格类型
	private int priceType;
	//多空类型
	private int bsType;
	//数量比例
	private BigDecimal amountRate;
	//重新委托时间
	private  int reOrderSec;
	//品种过滤
	private String blackCode;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFollowType() {
		return followType;
	}
	public void setFollowType(int followType) {
		this.followType = followType;
	}
	public int getPriceType() {
		return priceType;
	}
	public void setPriceType(int priceType) {
		this.priceType = priceType;
	}
	public int getBsType() {
		return bsType;
	}
	public void setBsType(int bsType) {
		this.bsType = bsType;
	}
	public BigDecimal getAmountRate() {
		return amountRate;
	}
	public void setAmountRate(BigDecimal amountRate) {
		this.amountRate = amountRate;
	}
	public int getReOrderSec() {
		return reOrderSec;
	}
	public void setReOrderSec(int reOrderSec) {
		this.reOrderSec = reOrderSec;
	}
	public String getBlackCode() {
		return blackCode;
	}
	public void setBlackCode(String blackCode) {
		this.blackCode = blackCode;
	}
	
}
