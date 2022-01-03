package com.yedam.app.jdbc;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.yedam.app.dept.dao.Department;

@RunWith(SpringRunner.class)
@ContextConfiguration({"/config/*-context.xml"})
public class MybatisTest {

	@Autowired SqlSession sqlSession;
	
//	@Test
	public void select() {
		List<Map> list = 
				sqlSession.selectList("DeptDAO.find");
		System.out.println(list);
	}
	
//	@Test
	public void findById() {
		Map map = sqlSession.selectOne("DeptDAO.findById", 10);
		System.out.println(map);
	}
	
//	@Test
	public void findByName() {
		Department dept = new Department();
		dept.setDepartmentName("min");
		List<Department> list = 
				sqlSession.selectList("DeptDAO.findByName", dept);
		System.out.println(list);
	}
	
	@Test
	public void insert() {
		Department dept = new Department();
		dept.setDepartmentId("991");
		dept.setDepartmentName("총무");
		int result = sqlSession.insert("DeptDAO.insert", dept);
		System.out.println(result + "건 처리됨");
	}
}
