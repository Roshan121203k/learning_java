package com.bank.demo;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		SBI bank = new SBI("RamNagar","Chandrapur",12,12,new ArrayList<>());
		
		Customer obj = new Customer("hjhkj","chandrapur","202020",20000);
		
		obj.bookFd(2, bank);
		
		bank.getList().stream().forEach((t)->System.out.println(t));
	}
}
