package com.task.AbstracionEx1;

public abstract class BankAccount {
	
	//Attributes
	protected String accountNumber;
    protected String accountHolderName;
    protected double balance;
	
	//constructor
	public BankAccount(String accountNumber, String accountHolderName) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
	}
	
	public abstract String getAccountNumber();
	public abstract String getAccountHolderName();
	public abstract double getBalance();
	public abstract void deposit(double ammount);
	public abstract void withdraw(double ammount);
	
}
