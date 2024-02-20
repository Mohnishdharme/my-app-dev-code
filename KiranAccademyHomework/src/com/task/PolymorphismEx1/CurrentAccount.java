package com.task.PolymorphismEx1;

public class CurrentAccount extends Account {

	public CurrentAccount(double accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
		// TODO Auto-generated constructor stub
	}
	
	 void withdraw(double withdrawAmount) {
	        // Check if the withdrawal amount is within the balance
	        if (withdrawAmount <= getBalance()) {
	            // Withdraw the specified amount
	            setBalance(getBalance() - withdrawAmount);
	            System.out.println("Withdrawal successful. Remaining balance: " + getBalance());
	        } else {
	            // Withdrawal amount exceeds balance, so display an error message
	            System.out.println("Insufficient funds. Unable to withdraw.");
	        }
	    }

}
