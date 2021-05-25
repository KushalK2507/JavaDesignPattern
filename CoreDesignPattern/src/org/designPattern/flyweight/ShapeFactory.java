package org.designPattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	private static Map<String, Shape> shapes = 
			new HashMap<>();

	public static Shape getShape(String type) {
		Shape shape = null;
		if (shapes.get(type) != null) {
			shape = shapes.get(type);
		}
		switch (type) {
		case "Circle":
			shape = new Circle();
		case "Rectangle":
			shape = new Rectangle();
		}
		shapes.put(type, shape);
		return shape;
	}
}
