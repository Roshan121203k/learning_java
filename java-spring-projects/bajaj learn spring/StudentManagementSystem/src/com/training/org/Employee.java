package com.training.org;

import java.util.List;

public class Employee {
	private int id;
	private String Name;
	private double salary;
	private String phoneNo;
	private String designation;
	private List<String> address;
	private List<String> technologies;
	private List<Project> projects;
	private List<Certification> certifications;
	private Payslip payslip;
	public Payslip getPayslip() {
		return payslip;
	}

	public void setPayslip(Payslip payslip) {
		this.payslip = payslip;
	}

	public Employee(int id, String name, double salary, String phoneNo, String designation, List<String> address,
			List<String> technologies) {
		super();
		this.id = id;
		Name = name;
		salary = salary;
		this.phoneNo = phoneNo;
		this.designation = designation;
		this.address = address;
		this.technologies = technologies;
	}
	
	public List<Project> getProjects() {
	    return projects;
	}

	public void setProjects(List<Project> projects) {
	    this.projects = projects;
	}

	public List<Certification> getCertifications() {
	    return certifications;
	}

	public void setCertifications(List<Certification> certifications) {
	    this.certifications = certifications;
	}
	
	
	
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPhoneNo() {  
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", salary=" + salary + ", phoneNo=" + phoneNo
				+ ", designation=" + designation + ", address=" + address + ", technologies=" + technologies
				+ ", projects=" + projects + ", certifications=" + certifications + ", payslip=" + payslip + "]";
	}

	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
}
