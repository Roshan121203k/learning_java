package com.bank.demo;

public class Bank {
	String bankName;
	String bankLocation;
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public Bank(String bankName, String bankLocation) {
		super();
		this.bankName = bankName;
		this.bankLocation = bankLocation;
	}
	
	public String getBankLocation() {
		return bankLocation;
	}
	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}
}
