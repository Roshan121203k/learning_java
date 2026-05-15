package com.abstractdemo;

public class Intern extends Employee{
	private double hourlyRate;
	private int hoursWorked;
	
	public Intern(int id,String name,double hourlyRate,int hoursWorked) {
		super(id,name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		
	}
	@Override
	public String toString() {
		super.toString();
		return "Intern [hourlyRate=" + hourlyRate + ", hoursWorked=" + hoursWorked + "]";
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return hourlyRate*hoursWorked;
	}
	
}
