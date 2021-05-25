package org.designPattern.adapter;

public class WeatherAdapter {

	public int findTemp(int zipCode) {
		String city = null;
		if (zipCode == 226016) {
			city = "Lucknow";
		}

		WeatherFinder finder = new WeatherFinderImpl();
		int temp = finder.find(city);
		return temp;
	}
}
