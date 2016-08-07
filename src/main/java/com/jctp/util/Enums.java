package com.jctp.util;

public class Enums {
	public static enum loginState{
		isNone(-2),isConnected(-1),isLogining(0),isLogined(1),isLoginFail(2);
		private Integer value;
		
		private loginState(int value){
			this.value = value;
		}
	
		public Integer getValue(){
			return value;
		}
	}
	public static enum opKey{
		w_Order(1),w_QryPrice(2),w_Login(3),w_DrawOrder(4),w_QryMaxAmount(5),w_Logout(6),w_QryOrder(7),w_QryPosition(8);
		private Integer value;
		
		private opKey(Integer value){
			this.value = value;
		}
	
		public Integer getValue(){
			return value;
		}
	}
	
}
