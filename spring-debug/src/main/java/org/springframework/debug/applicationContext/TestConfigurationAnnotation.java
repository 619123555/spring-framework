package org.springframework.debug.applicationContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther: 胡鹏祥
 * @date: 2021/1/28
 * @description:
 */
@Configuration
public class TestConfigurationAnnotation {
	@Bean
	public TestObject testObject(){
		return new TestObject();
	}
}
