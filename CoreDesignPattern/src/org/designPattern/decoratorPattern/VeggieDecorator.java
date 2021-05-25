package org.designPattern.decoratorPattern;

public class VeggieDecorator extends PizzaDecorator {
	public VeggieDecorator(Pizza pizza) {
		super(pizza);
	}

	public void bake() {
		super.bake();
		System.out.println("Veggie Decorator");
	}

}
