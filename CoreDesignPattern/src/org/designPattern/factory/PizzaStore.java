package org.designPattern.factory;

public class PizzaStore {

	public Pizza orderedPizza(String type) {
		
		Pizza p = PizzaFactory.createPizza(type);

		p.prepare();
		p.bake();
		p.cut();
		return p;
	}

}
