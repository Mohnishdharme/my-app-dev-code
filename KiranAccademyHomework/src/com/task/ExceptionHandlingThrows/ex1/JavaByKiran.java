package com.task.ExceptionHandlingThrows.ex1;

public class JavaByKiran extends Infosysi {
	void m1 ()  throws ClassNotFoundException {
		Class.forName("Tsc");
	}	
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("jhelo");
		JavaByKiran j = new JavaByKiran();
		j.m1();
		throw new MiNaiKarat();
	}

}
