package com.jocata.star.PdfTables;

import java.io.File;


public class BenchMarkRunReportFloder {


	//......................Working Fine............................//
	
	public String strr = null;
	public String clickthridff(){
		File folder = new File("D:\\AUTOMATION REQUIRED DOCS\\MisReportsDownloads");
		File[] listOfFiles = folder.listFiles();

			if (listOfFiles[1].isFile()) {
				File lis = listOfFiles[1];
				 strr = lis.toString();
				 
				 
		
		
	}
			
			return strr;
	}
	
public static void main(String[] args) {
	BenchMarkRunReportFloder h=new BenchMarkRunReportFloder();

String p=h.clickthridff();
System.out.println(p);
}	
	
}
