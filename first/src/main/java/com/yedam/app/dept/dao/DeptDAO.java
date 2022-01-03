package com.yedam.app.dept.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDAO {
	
	@Autowired SqlSession sqlSession;
	
	public List<Map> find(){
		return sqlSession.selectList("dept.find");
	}
	
	public Department findById(Department dept){
		return sqlSession.selectOne("dept.findById", dept);
	}
	
	public List<Department> findByName(Department dept) {
		return sqlSession.selectList("dept.findByName", dept);
	}
	
	public int insert(Department dept) {
		return sqlSession.insert("dept.insert", dept);
	}
}
