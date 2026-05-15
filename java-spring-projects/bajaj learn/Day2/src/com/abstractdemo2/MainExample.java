package com.abstractdemo2;

public class MainExample {
		public static void main(String[] args) {
			
			BankAccount obj = new SavingAccount();
			obj.deposit(9000);
			obj.withdraw(39989);
			
			obj = new CurrentAccount();
			obj.deposit(400);
			obj.withdraw(890); 
			
		}
}


abstract class BankAccount {
	protected double balance;
	public BankAccount() {
		
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public abstract void withdraw(double amount);
	
	@Override
	public String toString() {
		return "BankAccount [balnce=" + balance + "]";
	}
}


class SavingAccount extends BankAccount {

	@Override
	public void withdraw(double amount) {
		if(balance < amount) {
			System.out.println("balance low");
		}else {
			balance -= amount;
			System.out.println("withdraw succesful");
		}
		
	}
	
}

class CurrentAccount extends BankAccount {
	private double overDraftAmount = 5000.0;
	@Override
	public void withdraw(double amount) {
		if(balance + overDraftAmount < amount) {
			System.out.println("Balance is low");
		}
		else {
			balance -= amount;
			System.out.println("withdraw succesful");
		}
	}
}
	
	
