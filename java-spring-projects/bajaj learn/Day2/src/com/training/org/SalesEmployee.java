package com.training.org;

public class SalesEmployee extends Employee{
	private int sales;
	private double commission;
	private double netSalary;
	
	public SalesEmployee(int empId,String name,double basicSalary,int sales) {
		super(empId,name,basicSalary);
		System.out.println("Parameterized Constructor of child");
		this.sales = sales;
		this.commission = 0;
		this.netSalary = 0;
		this.calculateNetSalary();
	}
	public SalesEmployee() {
		super();
		System.out.println("Default Constructor of child");
		this.sales = 0;
		this.netSalary = 0;
		this.commission = 0;
	}
	
	public void calculateNetSalary() {
		if(sales < 5000) {
			this.commission = 0.05*super.getBasicSalary();
		}else if(sales >= 5000 && sales <10000) {
			this.commission = 0.10*super.getBasicSalary();
		}else if(sales >= 10000 && sales < 15000) {
			this.commission = 0.15*super.getBasicSalary();
		}else if(sales >= 15000 && sales < 50000) {
			this.commission = 0.25*super.getBasicSalary();
		}else {
			this.commission = 0.50 * super.getBasicSalary();
		}
		
		this.netSalary = this.commission + super.getBasicSalary();
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	@Override
	public String toString() {
		
		super.toString();
		return sales + "----" + commission + "-----" + netSalary;
	}
	
}
