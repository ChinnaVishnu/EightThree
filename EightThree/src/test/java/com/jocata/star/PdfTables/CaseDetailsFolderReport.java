package com.jocata.star.PdfTables;

import java.io.File;


public class CaseDetailsFolderReport {

	//......................Working Fine............................//
	
		public String strr = null;
		public String click(){
			File folder = new File("D:\\AUTOMATION REQUIRED DOCS\\MisReportsDownloads");
			File[] listOfFiles = folder.listFiles();

				if (listOfFiles[0].isFile()) {
					File lis = listOfFiles[0];
					 strr = lis.toString();
					 
					 
			
			
		}
				
				return strr;
		}
		
	public static void main(String[] args) {
		CaseDetailsFolderReport h=new CaseDetailsFolderReport();

	String p=h.click();
	System.out.println(p);
	}		
	
}
