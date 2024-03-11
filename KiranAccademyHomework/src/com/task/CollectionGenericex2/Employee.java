package com.task.CollectionGenericex2;

public class Employee {
	
	//Attributes
	private String employeName;
	private String loc;
	private int age;
	
	
	public String getEmploye() {
		return employeName;
	}
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [employeName=" + employeName + ", loc=" + loc + ", age=" + age + "]";
	}
	
	
	
	
			
			
			
}
