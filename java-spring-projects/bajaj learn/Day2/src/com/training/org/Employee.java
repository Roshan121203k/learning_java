package com.training.org;

public class Employee {
	private int empId;
	private String name;
	private double basicSalary;
	
	
	public Employee() {
		this.empId = 0;
		this.name = "default";
		this.basicSalary = 200000; 
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
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", basicSalary=" + basicSalary + "]";
	}
	public Employee(int empId, String name, double basicSalary) {
		
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	
}
