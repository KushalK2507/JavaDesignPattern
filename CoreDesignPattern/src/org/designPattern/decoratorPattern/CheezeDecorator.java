package org.designPattern.decoratorPattern;

public class CheezeDecorator extends PizzaDecorator {
	public CheezeDecorator(Pizza pizza) {
		super(pizza);
	}

	public void bake() {
		super.bake();
		System.out.println("Cheeze Decorator");
	}

}
