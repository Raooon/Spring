package com.yedam.app.emp.service;

import java.util.List;

import com.yedam.app.emp.dao.Employee;
import com.yedam.app.emp.dao.EmployeeSearch;

public interface EmpService {
	
	List<Employee> find(EmployeeSearch emp);
	Employee findById(Employee emp);
}
