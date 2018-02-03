package com.jocata.star.PdfReports;

import java.io.File;
import java.util.List;

import com.giaybac.traprange.entity.Table;

import com.jocata.star.PdfTables.BenchMarkRunReportFloder;
import com.jocata.star.PdfTables.PDFTableExtractor;


public class BenchMarkRunPdfReport {
	
	BenchMarkRunReportFloder hv = new BenchMarkRunReportFloder();


	PDFTableExtractor extractor = new PDFTableExtractor();
	public String strr = null;

	public String click() {
		File folder = new File("D:\\AUTOMATION REQUIRED DOCS\\MisReportsDownloads");
		File[] listOfFiles = folder.listFiles();

		if (listOfFiles[1].isFile()) {
			File lis = listOfFiles[1];
			strr = lis.toString();

		}

		return strr;
	}
	
	

	public String Start() {
		String p = hv.clickthridff();
		//System.out.println(p);
		List<Table> tables = extractor.setSource(p)

		.extract();

		int vv = tables.size();
		System.out.println("lastpagesize"+vv);

		String pp = tables.get(vv - 1).toString();

		 String[] linesArray=pp.split("\\n");
		   String lastLineString= linesArray[linesArray.length-2];
		   String[] str=lastLineString.split(" ");
		   System.out.println(" last line number " + str[0]);
		   
		 String [] aa=  str[0].toString().split(";");

		String [] ss=aa[0].split("");
		System.out.println(ss[0]+ss[1]+ss[2]);
		
		return ss[0]+ss[1]+ss[2];

	}

	public static void main(String[] args) {
		BenchMarkRunPdfReport ss = new BenchMarkRunPdfReport();
		String pp = ss.Start();
		System.out.println(pp);
	}

}
