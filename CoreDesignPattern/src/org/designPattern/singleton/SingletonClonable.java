package org.designPattern.singleton;

public class SingletonClonable {
	private static SingletonClonable instance = new SingletonClonable();

	private SingletonClonable() {
	}

	public static SingletonClonable getInstance() {
		return instance;
	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
