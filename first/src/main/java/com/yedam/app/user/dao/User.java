package com.yedam.app.user.dao;

import lombok.Data;

@Data
public class User {

	String id;
	String loginId;
	String password;
	String fullName;
	String deptName;
}
