package com.task.PolymorphismEx2;

public class Book extends LibraryItem{
	
	//Additional Attributes
	private String genere;
	private int noOfPages;
	
	
	public Book(String title, String author, String location , String genere , int noOfPages) {
		super(title, author, location);
		this.genere=genere;
		this.noOfPages=noOfPages;
		// TODO Auto-generated constructor stub
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("the genere of the book is " + genere);
		System.out.println("No of pages " + noOfPages);

	}
	

}
