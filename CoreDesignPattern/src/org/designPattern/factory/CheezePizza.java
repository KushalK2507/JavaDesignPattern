package org.designPattern.factory;

public class CheezePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepare Cheeze");
	}

	@Override
	public void bake() {
		System.out.println("Bake Cheeze");
	}

	@Override
	public void cut() {
		System.out.println("Cut Cheeze");
	}

}
