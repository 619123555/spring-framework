package org.springframework.debug.applicationContext;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: 胡鹏祥
 * @date: 2021/1/28
 * @description:
 */
public class MyApplicationContext extends ClassPathXmlApplicationContext {

	public MyApplicationContext(String... configLocations) throws BeansException {
		super(configLocations);
	}


	// 获取应用系统属性或系统环境信息
	@Override
	protected void initPropertySources() {
		System.out.println(getEnvironment().getPropertySources().get("systemProperties").getProperty("user.name"));
		super.initPropertySources();
	}
}
