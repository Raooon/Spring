package com.yedam.app.dept.dao;

import java.util.List;
import java.util.Map;

public interface DeptMapper {
	
	List<Map> find();
	Map findById(Department dept);
	List<Department> findByName(Department dept);
	int insert(Department dept);
}
