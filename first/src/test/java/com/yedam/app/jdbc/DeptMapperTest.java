package com.yedam.app.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.yedam.app.dept.dao.DeptMapper;

@RunWith(SpringRunner.class)
@ContextConfiguration({"/config/*-context.xml"})
public class DeptMapperTest {

	@Autowired DeptMapper mapper;
	
	@Test
	public void find() {
		System.out.println(mapper.find().get(0));
	}
}
