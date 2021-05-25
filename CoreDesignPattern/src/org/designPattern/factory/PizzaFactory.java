package org.designPattern.factory;

public class PizzaFactory {

	public static Pizza createPizza(String type) {
		Pizza p = null;
		switch (type) {
		case "cheeze":
			p = new CheezePizza();
		case "veg":
			p = new VegPizza();
		case "meat":
			p = new MeatPizza();

		}
		return p;
	}

}
