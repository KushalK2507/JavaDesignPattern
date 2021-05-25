package org.designPattern.abstractFactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		DaoAbstractFactory factoryType = DaoFactoryProducer.factoryType("xml");
		Dao createDao = factoryType.createDao("emp");
		createDao.save();
	}
}
