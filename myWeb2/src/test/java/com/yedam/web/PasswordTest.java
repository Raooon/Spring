package com.yedam.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration({"/config/*-context.xml"})
public class PasswordTest {
	
	@Autowired BCryptPasswordEncoder bcrypt;
	@Test
	public void test() {
		String pw = bcrypt.encode("1234");
		System.out.println(pw);
		pw = bcrypt.encode("1234");
		System.out.println(pw);
	}

}
