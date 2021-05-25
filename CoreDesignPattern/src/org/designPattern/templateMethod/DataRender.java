package org.designPattern.templateMethod;

public abstract class DataRender {

	public void render() {
		String readData = readData();
		String processData = processData(readData);
		System.out.println(processData);
	}

	public abstract String readData();

	public abstract String processData(String data);
}
