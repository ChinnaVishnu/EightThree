package com.jocata.star.ExportReports;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.DatabaseReports.DBBenchMarkRunReport;
import com.jocata.star.PdfReports.BenchMarkRunPdfReport;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class BenchmarksRunReportExport extends mainbaseLatest {

	
	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;
	};

	public void sleep(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority=27)
	public void clicingmisreports() throws InterruptedException, HeadlessException, AWTException, IOException {

		ExtentTestManager.startTest(" MIS Reports :  Benchmark Run ReportExport   ");

		fluentWait(By.xpath("//span[text()='CENTRA']")).click();

		fluentWait(By.xpath("//a[text()='MIS Reports']")).click();

		// ...................................UserCaseReportBenchMarkReport........................................................//

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("(//img[@title='VIEW'])[6]")).click();

		
		 try{
		WebElement elementuser=driver.findElement(By.xpath("//div[text()='Generating report, please wait...']"));
		
		if(elementuser!=null){
		      WebDriverWait waitse = new WebDriverWait(driver, 5000);
		      waitse.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[text()='Generating report, please wait...']")));
		                 
		}
		 }catch(Exception e){
			 System.out.println("no element");
		 }

		 Thread.sleep(3000);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
				+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));
		
		
		Robot robot = new Robot();  // Robot class throws AWT Exception	
        Thread.sleep(2000); // Thread.sleep throws InterruptedException	
        robot.keyPress(KeyEvent.VK_UP);  // press arrow down key of keyboard to navigate and select Save radio button	
        
        Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_ENTER);	
    // press enter key of keyboard to perform above selected action	
		
	//	Runtime.getRuntime().exec("D:\\AUTOMATION REQUIRED DOCS\\WebDriverThrid");
		
		Thread.sleep(12000);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
				+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

		Robot robotvv = new Robot();

		robotvv.keyPress(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		robotvv.keyPress(KeyEvent.VK_END);

		Thread.sleep(2000);

		robotvv.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		robotvv.keyRelease(KeyEvent.VK_END);

		Thread.sleep(15000);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
				+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

		robot.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_F4);

		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_F4);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ALT);

		System.out.println("pass from frist Second ");

		ExtentTestManager.getTest().log(LogStatus.INFO, "Benchmarks Report downloaded sucessfully");
	
	
		//.......................................clicking..............................................................//
		
		sleep(8);
		fluentWait(By.xpath("//span[text()='CENTRA']")).click();

		fluentWait(By.xpath("//a[text()='MIS Reports']")).click();

		// ...................................UserCaseReportBenchMarkReport........................................................//

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		
		fluentWait(By.xpath("(//img[@title='VIEW'])[6]")).click();
		
		 try{
				WebElement elementuser=driver.findElement(By.xpath("//div[text()='Generating report, please wait...']"));
				
				if(elementuser!=null){
				      WebDriverWait waitse = new WebDriverWait(driver, 5000);
				      waitse.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[text()='Generating report, please wait...']")));
				                 
				}
				 }catch(Exception e){
					 System.out.println("no element");
				 }

				 Thread.sleep(3000);
				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
						+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));
	Runtime.getRuntime().exec("D:\\AUTOMATION REQUIRED DOCS\\WebDriverdownloads\\batch12_upload.exe");
	
	Thread.sleep(20000);
		System.out.println("start");
		
		BenchMarkRunPdfReport ss = new BenchMarkRunPdfReport();
		String pp = ss.Start();
		System.out.println(pp);
	
	ExtentTestManager.getTest().log(LogStatus.INFO,  "No Of Records in PDF file"+pp);

	Thread.sleep(8000);
	System.out.println("passs");
	
	String rr=	  DBBenchMarkRunReport.getEmployeesFromDataBase(); 
	System.out.println(" No of Reords in Database"+rr);
	ExtentTestManager.getTest().log(LogStatus.INFO," No of Reords in Database"+rr);
	Thread.sleep(8000);

	if(pp.equals(rr)){
		System.out.println("pass");
		ExtentTestManager.getTest().log(LogStatus.PASS,  "Both Records are Same ");
	}else{
		System.out.println("fail");
		ExtentTestManager.getTest().log(LogStatus.FAIL,"Both Records are not  Same");

	
	
		
	}
	
}

	
}
