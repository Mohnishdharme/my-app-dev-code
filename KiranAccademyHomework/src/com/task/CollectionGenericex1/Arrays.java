package com.task.CollectionGenericex1;

import java.util.ArrayList;

public class Arrays {
	
	public static void main(String[] args) {
		ArrayList<Integer> aal = new ArrayList<>();
		aal.add(434);
		aal.add(434);
		aal.add(434);
		aal.add(434);
		aal.add(43654);
		aal.add(68434);
		aal.add(434);
		aal.add(43654);
		aal.add(4834);
		aal.add(4384);
		for (Integer integer : aal) {
			System.out.println(integer);
			
		}
		
		Collage d = new Collage();
		ArrayList<Student> akshay = d.dudu();
		for (Student student : akshay) {
			System.out.println(student);
		}
		
	}
	
}
