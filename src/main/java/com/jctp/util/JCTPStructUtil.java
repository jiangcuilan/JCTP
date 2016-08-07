package com.jctp.util;

import org.bridj.Pointer;
import org.bridj.StructObject;

/**
 * 结构体工具类
 * @author Hraink E-mail:Hraink@Gmail.com
 * @version 2013-2-27 上午11:35:54
 */

public class JCTPStructUtil {
	/**
	 * 获得Field
	 * 
	 * 对可能出现的null值做处理
	 * @param <T>
	 * @param field field的指针对象
	 * @return
	 */
	public static <T extends StructObject> T getStructObject(Pointer<T> field) {
		return field == null ? null : field.get();
	}
}
