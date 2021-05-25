package org.designPattern.adapter;

public class WeatherUi {

	public void showTemperature(int zipCode) {
		WeatherAdapter adapter = new WeatherAdapter();
		System.out.println(adapter.findTemp(zipCode));

	}
}
