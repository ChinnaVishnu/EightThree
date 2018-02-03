package com.jocata.star.scripts;

public class Spp {

public static void main(String[] args) {

	
	String text="Displaying 1 - 25 of 300";
	
	
	String[] cutting=text.split(" ");

	System.out.println(cutting[5]);//300
	
	
	SeleniumDataBaseTesting sele=new SeleniumDataBaseTesting();
	sele.getEmployeesFromDataBase();
	
	
	
	
	
}

	
}
