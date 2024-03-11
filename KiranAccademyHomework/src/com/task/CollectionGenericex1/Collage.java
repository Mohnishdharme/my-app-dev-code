package com.task.CollectionGenericex1;

import java.util.ArrayList;

public class Collage {
	
	;
	ArrayList<Student> dudu(){
		Student s1 = new Student();
		s1.setAge(32);
		s1.setLoc("nagpur");
		s1.setName("Prajwal");
		
		Student s2 = new Student();
		s2.setAge(12);
		s2.setLoc("katol");
		s2.setName("Sumit");
		
		Student s3 = new Student();
		s3.setAge(52);
		s3.setLoc("pune");
		s3.setName("Mohanish");
		
		Student s4 = new Student();
		s4.setAge(22);
		s4.setLoc("nagpur");
		s4.setName("Mohanish");
		
		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		al1.add(s4);
		
		
		return al1;
		
		
		
	}

	

}
