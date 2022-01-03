package com.yedam.app.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.yedam.app.dept.dao.DeptDAO;

@RunWith(SpringRunner.class)
@ContextConfiguration({"/config/*-context.xml"})
public class DeptDAOTest {
	
	
	@Autowired DeptDAO dao;
	
	@Test
	public void find() {
		System.out.println(dao.find().get(0).get("departmentName"));
	}
	
}
