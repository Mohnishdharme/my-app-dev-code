package com.task.CollectionGenericex2;

import java.util.ArrayList;

public class TakingArrayData1 {
	
	public static void main(String[] args) {
		EmployeData impo1 =  new EmployeData();
		ArrayList<Employee> impo2 = impo1.data();
		
		for (Employee employee : impo2) {
			System.out.println("**************All Employee***********");
			System.out.println(employee);
		}
		
		
		TakingArrayData2 dd = new TakingArrayData2();
		System.out.println("*************Employee from pune**************");
		dd.m1();
		
	}
	
	

}
