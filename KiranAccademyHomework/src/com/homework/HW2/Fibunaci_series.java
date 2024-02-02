package com.homework.HW2;

public class Fibunaci_series {
	public static void main (String args[]) {
		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.println(num1);
		System.out.println(num2);
		int limit = 10;
		for (int input_value = 0;  input_value<= limit; input_value++) {
			num3 = num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
		
		
		
	}

}
