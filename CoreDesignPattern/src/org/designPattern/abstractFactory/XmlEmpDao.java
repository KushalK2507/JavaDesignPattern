package org.designPattern.abstractFactory;

public class XmlEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Emp to XML");
	}
}
