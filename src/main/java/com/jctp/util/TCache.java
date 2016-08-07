package com.jctp.util;

import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.jctp.model.LimitQueue;
import com.jctp.model.TUserInfo;


public class TCache {
	

	//用户缓存
    private static Cache<String, List<TUserInfo>> userCache = callableCached();

    //消息缓存
    private static Cache<String, LimitQueue<String>> messageCache = callableCached();
/*    
    //错误信息缓存
    private static Cache<String, HashMap<Integer, String>> errorCache = callableCached();*/
    
    /**
     * 对需要延迟处理的可以采用这个机制；(泛型的方式封装)
     * @param <K>
     * @param <V>
     * @param key
     * @param callable
     * @return V
     * @throws Exception
     */
    public static <K,V> Cache<K , V> callableCached() {
          Cache<K, V> cache = CacheBuilder
          .newBuilder()
          .maximumSize(10)
         // .expireAfterWrite(60, TimeUnit.MINUTES)
          .build();
          return cache;
    }

    /**
     * 初始化消息队列
     * @return
     */
    public static LimitQueue<String> getMessage() {
        try {
          
          return messageCache.get("message", new Callable<LimitQueue<String>>() {
			 @Override
             public LimitQueue<String> call() throws Exception {
				   return new LimitQueue<String>(10); 
            }
           });
        } catch (ExecutionException e) {
           e.printStackTrace();
           return null;
         } 
    }
    
    public static void putMessage(String message) {
   	    getMessage().offer(message);
   }
    
    public static HashMap<Integer, String> getErrorList() {
    	try {
			  HashMap<Integer, String> hashMap=new HashMap<>();
			  SAXReader reader = new SAXReader();

		      File file=new File("lib/error.xml");
			  Document document = reader.read(file);
			  Element root = document.getRootElement();
			  List<Element> childElements = root.elements();
			  Integer key=-1;
			  String  value="";
			  for (Element child : childElements) {
				   List<Attribute> attributeList = child.attributes();
				   for (Attribute attr : attributeList) {
					   if("value".equals(attr.getName()))
						   key=Integer.valueOf(attr.getValue());
					   if("prompt".equals(attr.getName()))
						   value=attr.getValue();
				   }
				   hashMap.put(key, value);
			  }
			
			  return hashMap;
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    		return null;
    	} 
    }
    

    
    public static String getError(int key){
    	return getErrorList().get(key);
    }


    
    
    public static List<TUserInfo> getUserCache() {
    	try {
    		
    		return userCache.get("user", new Callable<List<TUserInfo>>() {
    			@Override
    			public List<TUserInfo> call() throws Exception {
    				List<TUserInfo> users=new ArrayList<TUserInfo>();
    				TUserInfo userInfo=new TUserInfo();
    				userInfo.setUser("067165");
    				userInfo.setPass("123456");
    				userInfo.setHost("tcp://180.168.146.187:10000");
    				userInfo.setBrokerId("9999");
    				userInfo.setId(1);
    				users.add(userInfo);
       				TUserInfo userInfo1=new TUserInfo();
    				userInfo1.setUser("067180");
    				userInfo1.setPass("123456");
    				userInfo1.setHost("tcp://180.168.146.187:10000");
    				userInfo1.setBrokerId("9999");
    				userInfo1.setId(2); 
    				users.add(userInfo1);
    				return users;
    			}
    		});
    	} catch (ExecutionException e) {
    		e.printStackTrace();
    		return null;
    	} 
    }

    //根据用户id查询用户
    public static TUserInfo getUser(int userId){
    	List<TUserInfo> userInfos=getUserCache();
    	for(TUserInfo userInfo:userInfos){
    		if(userInfo.getId()==userId)
    			return userInfo;
    	}
    	return null;
    }


}
