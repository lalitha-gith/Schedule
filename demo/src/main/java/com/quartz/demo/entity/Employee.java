package com.quartz.demo.entity;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private String id;
	private String name;
	
	private String department;

	public String getId() {
		return id;
	}

	public Employee() {
		
	}
	
	public Employee( String name, String department) {
		
		this.name = name;
		this.department = department;
	}
	public Employee(String id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
