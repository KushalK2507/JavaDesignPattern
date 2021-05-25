package org.designPattern.abstractFactory;

public class DBDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving DB Dept");
	}

}
