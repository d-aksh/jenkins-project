package com.project.spring.SpringAnnotation.dao;

import com.project.spring.SpringAnnotation.Employee;

public interface EmployeeDao {

	public int insert(Employee employee);

	public int delete(String employeeId);
}
