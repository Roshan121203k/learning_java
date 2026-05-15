package com.training.org;

public class WageEmployee extends Employee{
	int noOfWorkingHrs;
	String month;
	public int getNoOfWorkingHrs() {
		return noOfWorkingHrs;
	}
	public void setNoOfWorkingHrs(int noOfWorkingHrs) {
		this.noOfWorkingHrs = noOfWorkingHrs;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public WageEmployee(int noOfWorkingHrs, String month,int empId,String name,double basicSalary) {
		super(empId,name,basicSalary);
		this.noOfWorkingHrs = noOfWorkingHrs;
		this.month = month;
	}
	
	
	public void printWages() {
		int getDays = Utility.getDays(this.month);
		
		 System.out.println((super.getBasicSalary()/(8*getDays))*this.noOfWorkingHrs);
	}
	
}
