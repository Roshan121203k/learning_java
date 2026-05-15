package com.bank.demo;

import java.util.List;

public class SBI extends Bank{
	int savingBankInterestRate;
	int currentAccountInterestRate;
	int fdRates;
	List<Customer> list;
	
	
	public SBI(String bankName,String banklocation,int savingBankInterestRate, int currentAccountInterestRate, List<Customer> list) {
		super(bankName,banklocation);
		this.savingBankInterestRate = savingBankInterestRate;
		this.currentAccountInterestRate = currentAccountInterestRate;
		
		this.list = list;
	}


	public int getSavingBankInterestRate() {
		return savingBankInterestRate;
	}


	public void setSavingBankInterestRate(int savingBankInterestRate) {
		this.savingBankInterestRate = savingBankInterestRate;
	}


	public int getCurrentAccountInterestRate() {
		return currentAccountInterestRate;
	}


	public void setCurrentAccountInterestRate(int currentAccountInterestRate) {
		this.currentAccountInterestRate = currentAccountInterestRate;
	}


	public int getFdRates() {
		return fdRates;
	}


	public void setFdRates(int fdRates) {
		this.fdRates = fdRates;
	}


	public List<Customer> getList() {
		return list;
	}


	public void setList(List<Customer> list) {
		this.list = list;
	}


	public int calculateRateOfInterestforFD(int duration) {
		if(duration  == 1) {
			return 10;
		}else {
			return 20;
		}
	}
}
