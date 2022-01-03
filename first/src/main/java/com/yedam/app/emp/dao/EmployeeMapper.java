package com.yedam.app.emp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface EmployeeMapper {
	List<Employee> find(EmployeeSearch emp);
	
	@Select("select * from employees where employee_id = #{employeeId}")
	Employee findById(Employee emp);
}
