package com.task.ExceptionHandling.Ex2;

public class FrontDeskEmployee  extends Employee{
	
	//Attributes
	private int noOfCustomer;
	private double totalSale;

	FrontDeskEmployee(String fullName, int age, String qualification, int noOfCustomer, double totalSale) {
		super(fullName, age, qualification);
		this.noOfCustomer = noOfCustomer;
		this.totalSale = totalSale;
	}

}
