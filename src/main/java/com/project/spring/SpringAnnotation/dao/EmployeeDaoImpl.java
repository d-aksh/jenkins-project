package com.project.spring.SpringAnnotation.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.project.spring.SpringAnnotation.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	JdbcTemplate jdbcTemplate;

	public int insert(Employee employee) {
		String query="insert into employee(id,name,age,salary,city) values(?,?,?,?,?)";
		int result= this.jdbcTemplate.update(query,employee.getId(), employee.getName(),employee.getAge(),employee.getSalary(),employee.getCity());
		return result;
		
	}
	public int delete(String employeeId) {
		String query="delete from employee where id=?";
		int result= this.jdbcTemplate.update(query,employeeId);
		return result;
		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

}
