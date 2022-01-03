package com.yedam.app.emp.dao;

import java.util.List;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class EmployeeSearch extends Employee {

	//페이징
	//정렬
	List<String> employeeIds;
	
}
