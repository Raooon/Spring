package com.yedam.app.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.yedam.app.emp.dao.EmployeeSearch;
import com.yedam.app.emp.service.EmpService;

@RunWith(SpringRunner.class)
@ContextConfiguration({"/config/*-context.xml"})
public class EmpServiceTest {

	@Autowired EmpService service;
	
	@Test
	public void find() {
		EmployeeSearch emp = new EmployeeSearch();
		emp.setDepartmentId("50");
		service.find(emp);
	}
}
