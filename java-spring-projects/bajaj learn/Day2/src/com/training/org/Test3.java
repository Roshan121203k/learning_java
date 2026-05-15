package com.training.org;

public class Test3 {

	public static void main(String[] args) {
		SalesEmployee png = new SalesEmployee(1,"gagan",40000,7000);
//		System.out.println(png);
		WageEmployee obj = new WageEmployee(200, "Jan", 1, "rahul", 40000);
		obj.printWages();
	}

}
