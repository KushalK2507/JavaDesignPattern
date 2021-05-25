package org.designPattern.templateMethod;

public class XMLDataRender extends DataRender {

	@Override
	public String readData() {
		return "XML Data";
	}

	@Override
	public String processData(String data) {
		return "processed" + data;
	}

}
