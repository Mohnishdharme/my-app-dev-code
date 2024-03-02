package com.task.ExceptionHandling.ex1;

public class TryAndCatch {
	public static void main(String[] args) {
		System.out.println(2);
		System.out.println(343);
		try {
			System.out.println(34/0);
			
		} catch (ArithmeticException mawshiChiTang) {
			// TODO: handle exception
			System.out.println("sorry babu we cannot divide in our ");
		}
		finally {
			System.out.println("clear catch");
		}
	}
}
