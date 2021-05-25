package org.designPattern.decoratorPattern;

public class PizzaShop {

	public static void main(String[] args) {

		// In this we wrapped Plain Pizza into Cheezedecorator
		Pizza pizza = new CheezeDecorator(new PlainPizza());
		pizza.bake();

		System.out.println("---------------------");
		// In this Plain pizza wrapped to Cheeze and Cheeze wrapped to Veggie Pizza
		Pizza pizza1 = new VeggieDecorator(new CheezeDecorator(new PlainPizza()));
		pizza1.bake();
	}
}
