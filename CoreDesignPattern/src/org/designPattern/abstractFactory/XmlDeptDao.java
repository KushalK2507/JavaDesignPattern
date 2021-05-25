package org.designPattern.abstractFactory;

public class XmlDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving XML Dept");
	}
}
