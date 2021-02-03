package org.springframework.debug.applicationContext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.debug.TestCustomBFPP.CustomBeanFactoryPostProcessor;
import org.springframework.debug.TestCustomBFPP.CustomBeanFactoryRegistryPostProcessor;
import org.springframework.debug.TestCustomBPP.CustomBeanPostProcessor;

/**
 * @auther: 胡鹏祥
 * @date: 2021/1/28
 * @description:
 */
public class MyApplicationContext extends ClassPathXmlApplicationContext {

	public MyApplicationContext(String... configLocations) throws BeansException {
		super(configLocations);
	}

	@Override
	public String getId() {
		return "testId";
	}

	// 获取应用系统属性或系统环境信息
	@Override
	protected void initPropertySources() {
		System.out.println(getEnvironment().getPropertySources().get("systemProperties").getProperty("user.name"));
		super.initPropertySources();
	}

	// 在spring预留给用户的扩展方法中,可以将Bean或BeanFactory的后置处理器添加到工厂对象中.
	// 或者直接通过xml将BPP或BFPP直接定义为bean也可以.
	@Override
	protected void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) {
		beanFactory.addBeanPostProcessor(new CustomBeanPostProcessor());
		addBeanFactoryPostProcessor(new CustomBeanFactoryPostProcessor());
		addBeanFactoryPostProcessor(new CustomBeanFactoryRegistryPostProcessor());
		super.postProcessBeanFactory(beanFactory);
	}
}
