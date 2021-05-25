package org.designPattern.templateMethod;

public class CSVDataRender extends DataRender {

	@Override
	public String readData() {
		return "CSV Data";
	}

	@Override
	public String processData(String data) {
		return "processed" + data;
	}

}
