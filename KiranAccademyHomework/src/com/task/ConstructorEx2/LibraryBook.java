package com.task.ConstructorEx2;

public class LibraryBook {
	//Attributes
	private String title;
	private String author;
	private String isbn;
	private boolean available=true;
	
	//Constructor
	private LibraryBook (String title, String author, String isbn){
		this.title=title;
		this.author=author;
		this.isbn=isbn;	
	}
	
	//method to borrow books
	void borrowBook () {
		
		if (available == true) {
			System.out.println("The book is availabe");
			available = false;
		}
		else {
			System.out.println("book is unavailable");
		}
		
	}
	
	//method to return book
	void returnBook () {
		if (available == false) {
			System.out.println("Thank you for returning");
			available = false;
		}
		else {
			System.out.println("already availavle");
		}
	}
	public static void main(String[] args) {
		
		//creating new objects books
		LibraryBook book1 = new LibraryBook("Rich dad poor dad","ek mhatara buda","ISB1");
		LibraryBook book2 = new LibraryBook("how to influence pepole","mait nai kon lihli","ISB2");
		
		//updating borrow and return
		book1.borrowBook();
		book2.borrowBook();
		book1.borrowBook();
		book1.returnBook();
		book2.returnBook();
		
		
		
	}
	

}
