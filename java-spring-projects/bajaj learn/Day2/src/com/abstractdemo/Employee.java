package com.abstractdemo;

public abstract class Employee {
	private int empId;
	private String name;
	
	
	public abstract double calculateSalary();
	
	public Employee() {
		this.empId = 0;
		this.name = "default";
		
	}
	public int getEmpId() {
		return empId;
	}
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name ;
	}
	public Employee(int empId, String name, double basicSalary) {
		
		this.empId = empId;
		this.name = name;
	}
	
	
}
