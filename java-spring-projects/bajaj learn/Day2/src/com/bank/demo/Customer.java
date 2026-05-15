package com.bank.demo;

import java.util.Scanner;

public class Customer {
	String custName;
	String custAddress;
	String mobileNo;
	int accountBalance;
	
	
	public void withdraw() {
		if(this.accountBalance != 0) {
			Scanner sc = new Scanner(System.in);
			int amount = sc.nextInt();
		accountBalance = accountBalance - amount;
		System.out.println("Debited");
		}else {
			System.out.println("low balance");
		}
	}
	
	public void Deposit(int amount) {
		accountBalance = accountBalance + amount;
		
		System.out.println("Credited");
	}
	
	public void bookFd(int duration,SBI obj) {
		int data = obj.calculateRateOfInterestforFD(duration);
		obj.getList().add(this);
		System.out.println("FD is Booked");
		
	}

	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", custAddress=" + custAddress + ", mobileNo=" + mobileNo
				+ ", accountBalance=" + accountBalance + "]";
	}

	public Customer(String custName, String custAddress, String mobileNo, int accountBalance) {
		super();
		this.custName = custName;
		this.custAddress = custAddress;
		this.mobileNo = mobileNo;
		this.accountBalance = accountBalance;
	}
	
	
}
