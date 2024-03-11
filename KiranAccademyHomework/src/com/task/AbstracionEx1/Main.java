package com.task.AbstracionEx1;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123", "John Doe", 0.05);
        CheckingAccount checkingAccount = new CheckingAccount("CA456", "Jane Smith", 1000);

        savingsAccount.deposit(1000);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        savingsAccount.withdraw(500);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        checkingAccount.deposit(2000);
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());

        checkingAccount.withdraw(1500);
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }
}
