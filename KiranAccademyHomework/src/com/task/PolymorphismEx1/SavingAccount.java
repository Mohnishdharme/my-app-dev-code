package com.task.PolymorphismEx1;

public class SavingAccount extends Account {

    public SavingAccount(double accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Override the withdraw method to limit withdrawal amount
    @Override
    void withdraw(double withdrawAmount) {
        // Check if the withdrawal amount is within the balance and within limt of 40000
        if (withdrawAmount <= getBalance() && withdrawAmount <= 40000) {
            // Withdraw the specified amount
        	setBalance(getBalance() - withdrawAmount);
            System.out.println("Withdrawal successful. Remaining balance: " + getBalance());
        } else {
            // Withdrawal amount exceeds balance, so display an error message
            System.out.println("Insufficient funds. Unable to withdraw.");
        }
    }
}
