package com.jocata.star.DatabaseReports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCaseDetailsReport {

	

	   private static Connection connection;
	   private static Statement statement;
	   private static ResultSet rs;

	  
	    public  static void setUp() {
	            String databaseURL = "jdbc:sqlserver://192.168.0.21:1433";
	            String user = "reader";
	            String password = "k&jh(^&%FG";
	            connection = null;
	            try {
	                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	               // System.out.println("Connecting to Database...");
	                connection = DriverManager.getConnection(databaseURL, user, password);
	                if (connection != null) {
	                    //System.out.println("Connected to the Database...");
	                }
	            } catch (SQLException ex) {
	               ex.printStackTrace();
	            }
	            catch (ClassNotFoundException ex) {
	               ex.printStackTrace();
	            }
	    }

	    
	    public static  String  getEmployeesFromDataBase() {
	    	setUp();
	    	
	    	String EmpName = null;
	    	
	        try {
	            String query = "select count(*) from jocata_star.tbl_cases";
	            statement = connection.createStatement();
	            rs = statement.executeQuery(query);
	            
	            while(rs.next()){
	                 EmpName= rs.getString("");
	                //System.out.println(EmpName);
	                
	            }
	        } catch (SQLException ex) {
	           ex.printStackTrace();
	        }
			return EmpName;
			
	    }

	   
	    public  static void tearDown() {
	      if (connection != null) {
	                try {
	                    System.out.println("Closing Database Connection...");
	                    connection.close();
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                }
	            }
	      }	
	
	    
	  public static void main(String[] args) {
		
	String rr=	  DBCaseDetailsReport.getEmployeesFromDataBase(); 
	System.out.println(rr);	  
	
	}  
	    
		
	
}
