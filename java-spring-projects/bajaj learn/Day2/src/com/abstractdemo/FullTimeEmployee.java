package com.abstractdemo;

public class FullTimeEmployee extends Employee{
	private double monthlySalary;
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return monthlySalary;
	}
	public FullTimeEmployee(int id,String name,double monthlySalary) {
		super(id,name);
		this.monthlySalary = monthlySalary;
	}
	@Override
	public String toString() {
		super.toString();
		return "FullTimeEmployee [monthlySalary=" + monthlySalary + "]";
	}
	
}
