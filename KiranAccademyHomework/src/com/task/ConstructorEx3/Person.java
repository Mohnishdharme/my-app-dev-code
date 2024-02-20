package com.task.ConstructorEx3;

public class Person {
	//Attributes
	String name;
	int age;
	
	//Constructor
	Person (String name , int age){
		this.name=name;
		this.age=age;
	}
	
	void personDetail () {
		System.out.println("Name " + name);
		System.out.println("age " + age);
	}
	public static void main(String[] args) {
		
		//Create persons detail
		Person person1 = new Person("mohnish" , 21);
		Person person2 = new Person("Sumit" , 21);
		
		//show persons detail
		person1.personDetail();
		person2.personDetail();
	}

}
