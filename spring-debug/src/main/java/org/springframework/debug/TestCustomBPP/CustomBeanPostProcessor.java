package org.springframework.debug.TestCustomBPP;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @auther: 胡鹏祥
 * @date: 2021/2/3
 * @description: 自定义Bean后置处理器
 */
public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("BPP before start");
		System.out.println("BPP before end");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("BPP after start");
		System.out.println("BPP after end");
		return null;
	}
}
