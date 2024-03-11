package com.task.CollectionGenericex1;

public class Student {
	private String name;
	private int age;
	private String loc;
	
	
	//Getter setter method here
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", loc=" + loc + "]";
	}
	
	
	
	
	
	

}
