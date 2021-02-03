package org.springframework.debug.TestCustomBFPP;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @auther: 胡鹏祥
 * @date: 2021/2/3
 * @description: 自定义BeanFactory后置处理器
 */
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BFPP start postProcessBeanFactory");
		System.out.println("BFPP end postProcessBeanFactory");
	}


}
