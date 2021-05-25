package org.designPattern.factory;

public class VegPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepare Veg");
	}

	@Override
	public void bake() {
		System.out.println("Bake Veg");
	}

	@Override
	public void cut() {
		System.out.println("Cut Veg");
	}

}
