package org.designPattern.abstractFactory;

public class DBEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving DB Emp");
	}

}
