package org.springframework.debug.dynamicProxyCase.jdk;

public class Person implements Human {

	@Override
	public void eat() {
		System.out.println("eat");
	}

	@Override
	public void drink() {
		System.out.println("drink");
	}

	@Override
	public void play() {
		System.out.println("play");
	}

	@Override
	public void happy() {
		System.out.println("happy");
	}
}
