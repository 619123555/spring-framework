package org.springframework.debug.dynamicProxyCase.cglib;

import java.lang.reflect.Method;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * @auther: 胡鹏祥
 * @date: 2021/3/8
 * @description:
 */
public class CglibDynamicProxyTest {

	public static void main(String[] args) {
		// 动态代理创建的class文件存储到本地
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "d:\\");
		Enhancer enhancer = new Enhancer();
		// 设置Enhancer对象的父类
		enhancer.setSuperclass(Person.class);
		// 设置enhancer的回调对象
		enhancer.setCallback(new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects,
					MethodProxy methodProxy) throws Throwable {
				Object o1 = methodProxy.invokeSuper(o, objects);
				return o1;
			}
		});
		// 创建代理对象
		Person person = (Person) enhancer.create();
		// 通过代理对象调用目标方法
		person.eat();
		System.out.println(person.getClass());
	}
}
