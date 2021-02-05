package org.springframework.debug.annotationCase.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * @auther: 胡鹏祥
 * @date: 2021/2/5
 * @description:
 */
//@Configuration
//@ComponentScans({@ComponentScan("org.springframework.debug.TestCustomBFPP")})
// 先处理外部类的注解
public class MyComponentScanTest {
	// 再处理内部类的注解

	@Configuration
	@ComponentScan("org.springframework.debug.TestCustomBPP")
	// 排个序
	@Order(1)
	public class MyComponentScanInnerTest1 {
	}

	@Configuration
	@ComponentScan("org.springframework.debug.TestCustomBPP")
	// 排个序
	@Order(2)
	public class MyComponentScanInnerTest2 {
	}
}
