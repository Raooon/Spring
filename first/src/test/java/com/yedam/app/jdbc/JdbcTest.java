package com.yedam.app.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.yedam.app.dept.dao.Department;

@RunWith(SpringRunner.class)
@ContextConfiguration({"/config/*-context.xml"})
public class JdbcTest {

	@Autowired DataSource dataSource;
	@Autowired JdbcTemplate jdbcTemplate;
	
	final String INSERT_DEPT = "insert into departments(department_id, department_name) values(?,?)";
	
	@Test
	public void insertTest() {
		jdbcTemplate.update(INSERT_DEPT, new String[] {"985", "인사"});
	}
	
//	@Test
	public void templateTest() {
		List<Department> list = 
				jdbcTemplate.query("select * from departments", (rs, rowNum) -> {
						Department dept = new Department();
						dept.setDepartmentId(rs.getString("department_id"));
						dept.setDepartmentName(rs.getString("department_name"));
						return dept;
					}, null);
		System.out.println(list);
	}
	
//	@Test
	public void dataSourceTest() {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from departments");
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();	// connetion pool에 반납
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
