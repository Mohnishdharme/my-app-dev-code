package com.task.PolymorphismEx3;

public class Cloathing extends Product{
	
	//Attributes 
	private String size;
	private String color;
	private String material;

	Cloathing(String name, String description, double price, String size, String color, String material) {
		super(name, description, price);
		this.size=size;
		this.color=color;
		this.material=material;
		
	}
	
	public void displayInformation() {
		// Display electronic product information
        super.displayInformation();
        System.out.println("Warranty: " + size);
        System.out.println("Brand: " + color);
        System.out.println("material" + material);

	}

}
