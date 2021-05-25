package org.designPattern.singleton;

public class SingletonLazyInitialization {

	private static SingletonLazyInitialization instance;

	private SingletonLazyInitialization() {
	}

	public static SingletonLazyInitialization getInstance() {
		if (instance == null) {
			return new SingletonLazyInitialization();
		}
		return instance;
	}
}
