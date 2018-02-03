package com.jocata.star.RunStar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Autoincrementingdate {

public static void main(String[] args) throws ParseException {
	 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
	  String dateInString="10/10/15";
	  System.out.println("Today date "+dateInString);
	Date date = formatter.parse(dateInString);
	//Date dt = new Date();
	Calendar c = Calendar.getInstance(); 
	c.setTime(date); 
	c.add(Calendar.DATE, 0);
	date = c.getTime();

	//System.out.println(date);
	
	 System.out.println(formatter.format(date));
	 
	   String datesecond=      formatter.format(date);
	      System.out.println(" Tomorrow "+ datesecond);
	
}	
	
}
