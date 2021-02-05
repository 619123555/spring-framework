package org.springframework.debug.annotationCase.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @auther: 胡鹏祥
 * @date: 2021/2/5
 * @description:
 */
//@Component
@PropertySource("classpath:db.properties")
public class MyPropertySourceTest {

	@Value("${jdbc.url}")
	private String url;
}
