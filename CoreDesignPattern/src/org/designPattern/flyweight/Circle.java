package org.designPattern.flyweight;

public class Circle extends Shape {

	private String label;

	public Circle() {
		label = "Circle";
	}

	@Override
	public void draw(int radius) {

		System.out.println("Drawing " + label + " with " + radius);
	}

}
