package com.task.overloadingOverridingEx2;

public class DVD extends LibraryItem{
	//Additional attributes
	private String director;
	private double runTime;

	
	public DVD(String title, String director, String location, String genere, double runTime) {
		super(title,  location, genere);
		this.director=director;
		this.runTime=runTime;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();		
		System.out.println("Name of the direcotr" + director);
		System.out.println("the runtime of the movie is " + runTime );

	}

	
	

}
