package com.task.PolymorphismEx1;

public class Account {
	//Attributes
	private double accountNumber;
	private String accountHolder;
	private double balance;
	public Account (double accountNumber, String accountHolder, double balance){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	//deposit Method 
	void deposit(double accountHolder , double deposit) {
		balance += deposit;
		
	}
	
	//withdraw method
	void withdraw (double withdraw) {
		balance -= withdraw;
		
		
	}
	
	//Get value to for balance 
	public double getBalance() {
		
		return balance;
	}
	public void setBalance (double balance) {
		this.balance=balance;
		
	}
	
	//Display account Info method 
	void displayAccountInfo () {
		System.out.println(accountNumber  + accountHolder  + balance);
	
	}
	
	public static void main(String[] args) {
		Account user1 = new Account(3446554,"Mohnish",34.4);
		Account user2 = new Account(3446434,"Sumit",35.4);
		
		
		
		//Extend the Account class to Saving Account
		SavingAccount user3 = new SavingAccount (3243, "ramlal", 720);
		//Withdraw money from saving account
		user3.withdraw(720);
		
		
		
		//Extend the account class to Current Account 
		CurrentAccount user4 =new CurrentAccount(720, "panalal", 100000);
		user4.withdraw(45356);
		
	}
}
