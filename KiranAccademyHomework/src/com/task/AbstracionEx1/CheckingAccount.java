package com.task.AbstracionEx1;

public class CheckingAccount extends BankAccount{

	//Attributes
	protected double overDraftLimit;
	public CheckingAccount(String accountNumber, String accountHolderName, double overDraftLimit) {
		super(accountNumber, accountHolderName);
		this.overDraftLimit=overDraftLimit;
		
	}
	
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
	        super.balance += amount;
	        System.out.println("Deposited: " + amount);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (super.balance - amount >= -overDraftLimit) {
	            super.balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient balance for withdrawal.");
	        }
	    }

}
