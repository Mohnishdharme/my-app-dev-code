package com.task.PolymorphismEx2;

public class EBook extends Book{
	//Adittional attribute 
	private String format;
	private int size;

	public EBook(String title, String author, String location, String genere, int noOfPages , String format , int size) {
		super(title, author, location, genere, noOfPages);
		this.format=format;
		this.size=size;
	}
	public void displayInfo(boolean isPdf) {
		super.displayInfo();
		System.out.println("Format of the book is " + format);
		System.out.println("the size of the" + format + "is " +size);
	}


}
