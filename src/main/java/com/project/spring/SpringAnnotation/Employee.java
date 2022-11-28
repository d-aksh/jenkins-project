package com.project.spring.SpringAnnotation;

public class Employee {

	private String id;
	private String name;
	private String age;
	private String Salary;
	private String city;

	public Employee() {

	}

	public Employee(String id, String name, String age, String salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Salary = salary;
		this.city = city;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", Salary=" + Salary + ", city=" + city + "]";
	}

}
