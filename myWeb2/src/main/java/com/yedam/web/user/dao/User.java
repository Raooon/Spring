package com.yedam.web.user.dao;

import lombok.Data;

@Data
public class User {
	private String name;
	private String email;
	private String password;
	private String checkPassword;
}
