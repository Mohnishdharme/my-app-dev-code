package com.task.AbstracionEx1;

public class SavingsAccount extends BankAccount{
	
	protected double intreastRate;
	
	public SavingsAccount(String accountNumber, String accountHolderName, double intreastRate) {
		super(accountNumber, accountHolderName);
		
		// TODO Auto-generated constructor stub
	}
	//Attributes
	private float intreatrate;
	
	@Override
	public String getAccountNumber() {
		return super.accountNumber;
		}
	
	@Override
	public String getAccountHolderName() {
		return super.accountHolderName;
		}
	
	@Override
	public double getBalance() {
		return super.balance;
		}
	@Override
	public void deposit(double amount) {
		super.balance +=amount;
		System.out.println(super.balance);
		
		
	}
	@Override
	public void withdraw(double amount) {
		if (super.balance>=amount) {
			super.balance -= amount;
			System.out.println("Withdrawn: " + amount);
		}	
		else {
			System.out.println("not enough balance");
		}
		
		
	}

}
