package org.designPattern.singleton;

public class SingletonEagerInitialization {

	private static SingletonEagerInitialization instance = new SingletonEagerInitialization();

	private SingletonEagerInitialization() {
	}

	public static SingletonEagerInitialization getInstance() {
		return instance;
	}
}
