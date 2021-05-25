package org.designPattern.flyweight;

public class Rectangle extends Shape {

	private String label;
	
	public Rectangle() {
		label = "Rectangle";
	}

	@Override
	public void draw(int length, int breadth) {
		System.out.println
		("Drawing " + label + "with length " + length +
				" and breadth " + breadth);
	}

}
