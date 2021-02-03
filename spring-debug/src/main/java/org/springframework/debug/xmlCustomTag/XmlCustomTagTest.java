package org.springframework.debug.xmlCustomTag;

import org.springframework.debug.applicationContext.MyApplicationContext;

/**
 * @auther: 胡鹏祥
 * @date: 2021/1/28
 * @description: 自定义标签测试类
 */
public class XmlCustomTagTest {

	public static void main(String[] args) {
		MyApplicationContext myApplicationContext = new MyApplicationContext("xmlCustomTag/applicationContext.xml");
	}
}
