package com.task.ExceptionHandlingThrows.ex1;

public class JavaByKiran extends Infosysi {
	void m1 ()  throws ClassNotFoundException {
		Class.forName("Tsc");
	}	
	public static void main(String[] args){
		System.out.println("jhelo");
		
		throw new MiNaiKarat();
	}

}
