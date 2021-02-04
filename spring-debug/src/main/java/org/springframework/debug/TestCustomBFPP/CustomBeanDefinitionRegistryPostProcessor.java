package org.springframework.debug.TestCustomBFPP;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @auther: 胡鹏祥
 * @date: 2021/2/3
 * @description: 自定义非常规BeanFactory后置处理器
 */
public class CustomBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BDRPP start postProcessBeanFactory");
		System.out.println("BDRPP end postProcessBeanFactory");
	}


	@Override
	public void postProcessBeanDefinitionRegistry(
			BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("BDRPP start postProcessBeanFactory");
		System.out.println("BDRPP end postProcessBeanFactory");
	}
}
