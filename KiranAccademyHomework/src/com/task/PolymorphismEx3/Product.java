package com.task.PolymorphismEx3;
import java.util.Scanner;

public class Product {
	
	//Attributes
	private String name;
	private String description;
	private double price;
	private int choose;
	
	//default constructor
	Product(){	
	}
	
	//Constructor
	Product(String name,String description , double price){
		this.name=name;
		this.description=description;
		this.price=price;
		
	}
	
	//Calculate discount method
	public void calculateDiscount(){
		
	}
	
	//Display information of product
	public void displayInformation() {
		// Display electronic product information
        System.out.println("Electronic Product Information:");
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
        

	}
	
	//Choose product to sell
	public void chooseProductToSell (){
		
		//Which item user want to sell
				System.out.println("Which product do you want to sell");
				System.out.println("press 1 for Electronic \npress 2 for cloathing");
				
		//take input from user to select item to sell		
		Scanner chooseProduct =  new Scanner(System.in);
		int choose = chooseProduct.nextInt();
		this.choose=choose;
		//consume the nextline leaved 
		chooseProduct.nextLine();
		
		//if else 
		//1 for electronic product 
		//2 for clothing (if else properly encapsulated? Try catch needs to be implemented)
		
		if (choose == 1) {
			//enter product name
			System.out.println("Enter produt name");
			String nameOfProduct = chooseProduct.nextLine();
			
			//enter description of product
			System.out.println("Enter product description");
			String descriptionOfProduct = chooseProduct.nextLine();
			
			//enter price of product 
			System.out.println("Enter produt price");
			double priceOfProduct = chooseProduct.nextDouble();
			
			//consume the nextline leaved 
			chooseProduct.nextLine();
			
			//enter product warranty period
			System.out.println("Enter produt Warranty in int");
			String warrantyOfProduct = chooseProduct.nextLine();
			
			//enter the brand of the product
			System.out.println("Enter produt brand");
			String brandOfProduct = chooseProduct.nextLine();
			
			Electronic save1 = new Electronic( nameOfProduct, descriptionOfProduct, priceOfProduct, warrantyOfProduct, brandOfProduct  );	
			save1.displayInformation();
		}
		else if (choose ==2){
			//enter product name
			System.out.println("Enter produt name");
			String nameOfProduct = chooseProduct.nextLine();
			
			//enter description of product
			System.out.println("Enter product description");
			String descriptionOfProduct = chooseProduct.nextLine();
			
			//enter price of product 
			System.out.println("Enter produt price");
			double priceOfProduct = chooseProduct.nextDouble();
			
			//consume the nextline leaved 
			chooseProduct.nextLine();
			
			//enter size of product 
			System.out.println("Enter the size of product");
			String sizeOfProduct = chooseProduct.nextLine();
			
			//enter the color of the product
			System.out.println("Enter produt color");
			String colorOfProduct = chooseProduct.nextLine();
			
			//enter the material of the product
			System.out.println("Enter produt material");
			String materialOfProduct = chooseProduct.nextLine();
			
			Cloathing save = new Cloathing( nameOfProduct, descriptionOfProduct, priceOfProduct,sizeOfProduct, colorOfProduct, materialOfProduct  );	
			save.displayInformation();
		}
		
		//re-enter the value
		else {
			System.out.println("plz re-enter the number");
			chooseProductToSell();
		}
	}	
	
	//main method from here
	public static void main(String[] args) {
		
		//Welcome message 
		System.out.println("welcome to the Kiran Web Services");
		
		//Take input from user to determine which product to sell and info of it
		Product call = new Product();
		call.chooseProductToSell();
		
		
		}
	
}
