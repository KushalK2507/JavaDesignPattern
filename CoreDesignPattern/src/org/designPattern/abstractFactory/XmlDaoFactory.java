package org.designPattern.abstractFactory;

public class XmlDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {

		Dao dao = null;
		switch (type) {
		case "emp":
			dao = new XmlEmpDao();
			break;
		case "dept":
			dao = new XmlDeptDao();
		}
		return dao;
	}
}
