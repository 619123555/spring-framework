package org.springframework.debug.dynamicProxyCase.cglib;

import org.springframework.debug.dynamicProxyCase.jdk.Human;

public class Person{

	public void eat() {
		System.out.println("eat");
	}

	public void drink() {
		System.out.println("drink");
	}

	public void play() {
		System.out.println("play");
	}

	public void happy() {
		System.out.println("happy");
	}
}
