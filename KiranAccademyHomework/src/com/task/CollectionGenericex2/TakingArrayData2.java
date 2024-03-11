package com.task.CollectionGenericex2;

import java.util.ArrayList;

public class TakingArrayData2 {
	
	//method
	ArrayList<Employee> m1 () {
		EmployeData s1  = new EmployeData();
		ArrayList<Employee> s2 = s1.data();
		for (Employee employee : s2) {
			if ("Pune".equals(employee.getLoc())) {
				System.out.println(employee);
			}
		}
		
		
		
	}
	

	
	
}
