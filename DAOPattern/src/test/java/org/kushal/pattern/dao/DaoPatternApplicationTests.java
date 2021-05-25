package org.kushal.pattern.dao;

import org.junit.jupiter.api.Test;
import org.kushal.pattern.dao.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DaoPatternApplicationTests {

	@Autowired
	EmployeeDao employeeDao;
	@Test
	void testCreate() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Kushal");
		employeeDao.create(employee);
	}

}
