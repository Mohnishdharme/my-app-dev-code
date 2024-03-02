package com.task.PolymorphismEx2;

public class LibraryItem {
	
	//Attributes for book 
	private String title;
	private String author;
	private String location;
	
	//Constructor 
	public LibraryItem (String title , String author, String location){
		this.title=title;
		this.author=author;
		this.location=location;
		
	}

	
	
	//display information
	public void displayInfo() {
		System.out.println("The title of the book is " + title);
		System.out.println("The author of the book is " + author);
		System.out.println("The book is in " + location  );
			}
	
	
	//main method
	public static void main(String[] args) {
		//
		LibraryItem book1 = new LibraryItem("GUTON", "Gyuton", "section D");
	    book1.displayInfo();
	    System.out.println("\n");

	    // Extend to class Book
	    Book book2 = new Book("how to influnce pepole", "martin", "section D", "Psychology", 343);
	    book2.displayInfo();
	    System.out.println("\n");

	    // Extend to class EBook
	    EBook book3 = new EBook("rich dad poor dad", "Robert t", "section e","General Knowledge",230, "pdf", 20);
	    book3.displayInfo();
	    System.out.println("\n");

	    // Extend to class DVD
	    DVD caset1 = new DVD("loki ", "martin", "section d", "science fiction ", 43.34);
	    caset1.displayInfo();
	    System.out.println("\n");
	}
	
	

}
