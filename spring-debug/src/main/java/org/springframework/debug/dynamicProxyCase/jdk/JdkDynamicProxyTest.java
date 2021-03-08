package org.springframework.debug.dynamicProxyCase.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxyTest {

	public static void main(String[] args) {
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		Person person = new Person();
		ClassLoader classLoader = person.getClass().getClassLoader();
		Class<?>[] interfaces = person.getClass().getInterfaces();
		InvocationHandler invocationHandler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				Object result = null;
				try{
					result = method.invoke(person, args);
				}catch (Exception e){

				}
				return result;
			}
		};
		Object proxy = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
		Human h = (Human) proxy;
		h.eat();
	}
}
