package com.yedam.app.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.yedam.app.user.dao.User;
import com.yedam.app.user.service.UserService;

@RunWith(SpringRunner.class)
@ContextConfiguration({"/config/*-context.xml"})
public class UserServiceTest {

	@Autowired UserService userService;
	
	@Test
	public void userInsert() {
		User user = new User();
		user.setId("4");
		user.setLoginId("jeong");
		user.setPassword("1234");
		user.setFullName("seokjin");
		user.setDeptName("IT");
		Boolean rs = userService.insert(user);
		System.out.println(rs);
	}
}
