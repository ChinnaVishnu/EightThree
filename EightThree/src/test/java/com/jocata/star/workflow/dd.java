package com.jocata.star.workflow;

import java.util.Calendar;
import java.util.Date;

public class dd {

	
public static  void click(){
	Date dt = new Date();
	Calendar c = Calendar.getInstance(); 
	c.setTime(dt); 
	c.add(Calendar.DATE, 1);
	dt = c.getTime();
	System.out.println(dt);
	
	
}
	
	public static void main(String[] args) {
		
dd.click();
	}
	
}
