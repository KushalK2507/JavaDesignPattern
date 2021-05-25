package org.designPattern.singleton;

public class SingletonThreadHandling {

	private static SingletonThreadHandling instance;

	private SingletonThreadHandling() {
	}

	public static SingletonThreadHandling getInstance() {
		synchronized (SingletonThreadHandling.class) {
			if (null == instance) {
				return new SingletonThreadHandling();
			}
			return instance;
		}
	}
}
