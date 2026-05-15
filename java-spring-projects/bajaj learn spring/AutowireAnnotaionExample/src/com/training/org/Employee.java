package com.training.org;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int empId;
	private String name;
	
	private Organization department;
	@Autowired
	public Employee() {
		super();
		System.out.println("employee default constructor");
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", department=" + department + "]";
	}

	public Employee(int empId, String name, Organization department) {
		super();
		System.out.println("employee parameterized constructor");
		this.empId = empId;
		this.name = name;
		this.department = department;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Organization getDepartment() {
		return department;
	}
	@Autowired
	public void setDepartment(Organization department) {
		System.out.println("called");
		this.department = department;
	}
	
	
	
	 
}
