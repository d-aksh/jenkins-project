package com.project.spring.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.spring.SpringAnnotation.dao.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
        Employee employee=new Employee();
        
//        INSERT
//        employee.setId("emp333");
//        employee.setName("Vishal");
//        employee.setAge("23");
//        employee.setSalary("40000");
//        employee.setCity("Delhi");
//        int result=employeeDao.insert(employee);
//        
//        System.out.print("Added"+ result);
        
//        DELETE
        int result=employeeDao.delete("emp333");
        System.out.print("Deleted"+ result);
    }
}
