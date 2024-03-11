package com.task.CollectionGenericex2;

import java.util.ArrayList;

public class EmployeData {
	
	ArrayList<Employee> data () {
		
		Employee s1 = new Employee();
		s1.setAge(20);
		s1.setLoc("Pune");
		s1.setEmployeName("Mohanish");
		
		Employee s2 = new Employee();
		s2.setAge(20);
		s2.setLoc("Nagpur");
		s2.setEmployeName("prajwal");
		
		Employee s3 = new Employee();
		s3.setAge(18);
		s3.setLoc("katol");
		s3.setEmployeName("Sumit");
		
		Employee s4 = new Employee();
		s4.setAge(20);
		s4.setLoc("Pune");
		s4.setEmployeName("Gayatri");
		
		ArrayList<Employee> empdata = new ArrayList<>();
		empdata.add(s1);
		empdata.add(s2);
		empdata.add(s3);
		empdata.add(s4);
		return empdata;
	}
	
	
	
	
	

}
