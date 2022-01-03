package com.yedam.app.emp.dao;

import lombok.Data;

@Data
public class Employee {

	String employeeId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String hireDate;
	String jobId;
	String salary;
	String commissionPct;
	String managerId;
	String departmentId;
}
