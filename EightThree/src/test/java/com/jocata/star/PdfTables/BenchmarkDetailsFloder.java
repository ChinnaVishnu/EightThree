package com.jocata.star.PdfTables;

import java.io.File;


public class BenchmarkDetailsFloder {

	
	
	public String strr = null;
	public String clickthridff(){
		File folder = new File("D:\\AUTOMATION REQUIRED DOCS\\MisReportsDownloads");
		File[] listOfFiles = folder.listFiles();

			if (listOfFiles[0].isFile()) {
				File lis = listOfFiles[0];
				 strr = lis.toString();
				 
				 
		
		
	}
			
			return strr;
	}
	
public static void main(String[] args) {
	BenchmarkDetailsFloder h=new BenchmarkDetailsFloder();

String p=h.clickthridff();
System.out.println(p);
}	
}
