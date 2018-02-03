package com.jocata.star.PdfTables;

import java.io.File;


public class RuleSummeryDetailsFloder {

	
	//......................Working Fine............................//
	
		public String strr = null;
		public String clickthrid(){
			File folder = new File("D:\\AUTOMATION REQUIRED DOCS\\MisReportsDownloads");
			File[] listOfFiles = folder.listFiles();

				if (listOfFiles[0].isFile()) {
					File lis = listOfFiles[0];
					 strr = lis.toString();
					 
					 
			
			
		}
				
				return strr;
		}
		
	public static void main(String[] args) {
		RuleSummeryDetailsFloder h=new RuleSummeryDetailsFloder();

	String p=h.clickthrid();
	System.out.println(p);
	}	
}
