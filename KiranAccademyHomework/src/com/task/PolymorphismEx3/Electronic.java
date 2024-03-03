package com.task.PolymorphismEx3;

public class Electronic extends Product{
	
	//Attributes
		private String warrantyPeriod;
		private String brand;
	
	//Constructor overloaded
	
	Electronic(String name, String description, double price, String warrantyPeriod, String brand) {
		super(name, description, price);
		this.warrantyPeriod=warrantyPeriod;
		this.brand=brand;
		
	}

	
	
	public void calculateDiscount(){
		
	}
}
