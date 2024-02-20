package com.task.ConstructorEx1;

public class Product {
	
	//Attributes
	int productId;
	String productName;
	double price;
	int quantityInStock;

	
    // Parameterized Constructor
    public Product(int productId, String productName, double price, int quantityInStock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    // Default Constructor
    public Product() {
        this.productId = 0;
        this.productName = "";
        this.price = 0.0;
        this.quantityInStock = 0;
    }
    //Method to call product info
    void product_Info () {
    	System.out.println("Product ID " + productId);
    	System.out.println("Product Name " + productName);
    	System.out.println("Product Price " + price);
    	System.out.println("Product Quantity in Stock " + quantityInStock);
    }
    
    //Update the Quantity in Stock
    void UpdateQuantityInStock (int quantityINStock) {
    	this.quantityInStock = quantityInStock;
    }
   
    //Main method
    public static void main(String[] args) {
    	
    	//create product object using 
    	Product product = new Product();
		Product product1 = new Product(712,"smartTv",10000.0,13);
		Product product2 = new Product(713,"smartWactch",1000.0,115);
		
		//product info before update
		product1.product_Info();
		product2.product_Info();
		
		//update product info
		product1.UpdateQuantityInStock(9);
		product2.UpdateQuantityInStock(100);
		
		//Show updated value
		product1.product_Info();
		product2.product_Info();
		
		
	
	}
}
