package org.springframework.debug.annotationCase.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.debug.applicationContext.TestObject;

/**
 * @auther: 胡鹏祥
 * @date: 2021/1/28
 * @description:
 */
//@Configuration
//@Configuration(value = "testConfigurationAnnotation222", proxyBeanMethods = false)
public class MyConfigurationTest {
	@Bean
	public TestObject testObject(){
		return new TestObject();
	}
}


