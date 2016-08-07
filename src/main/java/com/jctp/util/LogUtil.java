package com.jctp.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtil {

	protected static Logger logger = LogManager.getLogger("acount");

	public static void info(String message) {
		logger.info(message);
	}

	public static void error(String message) {
		logger.error(message);
	}

	public static void warn(String message) {
		logger.warn(message);
	}


}
