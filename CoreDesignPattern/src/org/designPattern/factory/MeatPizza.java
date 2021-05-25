package org.designPattern.factory;

public class MeatPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepare Meat");
	}

	@Override
	public void bake() {
		System.out.println("Bake Meat");
	}

	@Override
	public void cut() {
		System.out.println("Cut Meat");
	}

}
