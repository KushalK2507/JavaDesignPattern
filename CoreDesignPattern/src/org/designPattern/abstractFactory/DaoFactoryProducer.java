package org.designPattern.abstractFactory;

public class DaoFactoryProducer {

	public static DaoAbstractFactory factoryType(String factoryType) {
		DaoAbstractFactory daf = null;
		switch (factoryType) {
		case "xml":
			daf = new XmlDaoFactory();
			break;
		case "db":
			daf = new DbDaoFactory();
			break;
		}
		return daf;
	}
}
