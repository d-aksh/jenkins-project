package com.project.spring.SpringAnnotation;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.project.spring.SpringAnnotation.dao.EmployeeDao;
import com.project.spring.SpringAnnotation.dao.EmployeeDaoImpl;

@Configuration
public class JdbcConfig {
	
	@Bean(name= {"ds"})
	public DataSource getDatasource() {
		
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springcore");
		ds.setUsername("root");
		ds.setPassword("Daksh123@#!");
		return ds;
		
	}
	
	@Bean(name= {"jdbcTemplate"})
	public JdbcTemplate getJdbcTemplate() {
		
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDatasource());
		return jdbcTemplate;
	}
	
	@Bean(name= {"employeeDao"})
	public EmployeeDao getEmployeeDao(){
		
	  EmployeeDaoImpl empDao=new EmployeeDaoImpl();
	  empDao.setJdbcTemplate(getJdbcTemplate());
	  return empDao;
	  
	}

}
