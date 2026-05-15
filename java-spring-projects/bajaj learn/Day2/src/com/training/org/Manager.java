package com.training.org;

import java.time.LocalDate;
import java.util.List;

public class Manager extends Employee{
	
	@Override
	public String toString() {
		super.toString();
		return "Manager [empAL=" + empAL + ", proAL=" + proAL + "]";
	}

	public Manager(int empId,String name,double basicSalary,List<Employee> empAL, LocalDate startDate, List<Project> proAL) {
		super(empId,name,basicSalary);
		this.empAL = empAL;

		this.proAL = proAL;
	}
	List<Employee> empAL;

	List<Project> proAL;

	public List<Employee> getEmpAL() {
		return empAL;
	}

	public void setEmpAL(List<Employee> empAL) {
		this.empAL = empAL;
	}

	public List<Project> getProAL() {
		return proAL;
	}

	public void setProAL(List<Project> proAL) {
		this.proAL = proAL;
	}

	
	
	
}
