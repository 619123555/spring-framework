package org.springframework.debug;

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
}
