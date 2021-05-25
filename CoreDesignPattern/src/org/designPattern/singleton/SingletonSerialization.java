package org.designPattern.singleton;

import java.io.Serializable;

public class SingletonSerialization implements Serializable {

	private static final long serialVersionUID = 1L;
	private static SingletonSerialization instance = new SingletonSerialization();

	private SingletonSerialization() {

	}

	public static SingletonSerialization getInstance() {
		return instance;
	}

	public Object readResolve() {
		return instance;
	}
}
