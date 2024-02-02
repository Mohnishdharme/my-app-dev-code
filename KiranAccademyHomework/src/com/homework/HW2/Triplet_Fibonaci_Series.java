package com.homework.HW2;

public class Triplet_Fibonaci_Series {
	public static void main (String args[]) {
		int num1= 0;
		int num2= 0;
		int num3= 1;
		int num4;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		int input_value;
		int limit = 10;
		for (input_value = 0;  input_value<= limit; input_value++) {
			num4=num1+num2+num3;
			System.out.println(num4);
			num1=num2;
			num2=num3;
			num3=num4;
			
			
		}
	}
	
	
	
	

}
