package com.jctp.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Hraink E-mail:Hraink@Gmail.com
 * @version 2013-1-29 下午6:44:50
 */

public class JCTPUtil {
	/**
	 * 是否为绝对路径
	 * @param path
	 * @return
	 */
	public static boolean isAbsolutePath(String path) {
		String regexVal = "[a-z|A-Z]:([\\\\|/]\\w+)+[\\\\|/]\\w*(.\\w*|)"; 
		Pattern pattern = Pattern.compile(regexVal);
		
		Matcher matcher = pattern.matcher(path);
		return matcher.find();
	}
	
	/**
	 * 是否为相对路径
	 * @param path
	 * @return
	 */
	public static boolean isRelativePath(String path) {
		//TODO 细化算法
		boolean result = true;
		
		if(!(path.indexOf("/") != -1 || path.indexOf("\\") != -1)) {
			result = false;
		}

		char[] charArray = path.toCharArray();
		if(result && (charArray[0] == '/' || charArray[0] == '\\')) {
			result = false;
		}
		
		return result;
	}
	
	public static int count(String sourceStr, String searchStr) {	
		int count = 0;
		
		Pattern pattern = Pattern.compile(searchStr);
		Matcher matcher = pattern.matcher(sourceStr);
		
		while(matcher.find()) {
			count++;
		}
		return count;
	}
}
