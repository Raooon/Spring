package com.yedam.app.emp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.emp.dao.Employee;
import com.yedam.app.emp.dao.EmployeeMapper;
import com.yedam.app.emp.dao.EmployeeSearch;
import com.yedam.app.emp.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired EmployeeMapper mapper;
//	LogAspect log = new LogAspect();
	@Override
	public List<Employee> find(EmployeeSearch emp) {
//		log.printLog();
		System.out.println("empService find");
		return mapper.find(emp);
	}

	@Override
	public Employee findById(Employee emp) {
		return mapper.findById(emp);
	}

}
