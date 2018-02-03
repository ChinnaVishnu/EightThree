package com.jocata.star.ExportReports;

import java.awt.AWTException;
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
import com.jocata.star.DatabaseReports.DBUserCaseDetailsReport;
import com.jocata.star.PdfReports.UserDetailsPdfReports;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class UserDetailsReportExport extends mainbaseLatest {

	
	
	public void sleep(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(40, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;
	};


	
	
	
	@Test(priority=23)
	public void clickUserDetailsReport() throws IOException, InterruptedException, AWTException{
		
		
/*		sleep(5);
		fluentWait(By.xpath("//span[text()='CENTRA']")).click();
		sleep(5);

		fluentWait(By.xpath("//a[text()='MIS Reports']")).click();

		// ...................................UserCaseDetailsReport........................................................//
		sleep(5);

		fluentWait(By.xpath("(//img[@title='VIEW'])[1]")).click();
	   	
		 */
		
		
		ExtentTestManager.startTest(" MIS Reports :  UserCaseDetails ReportExport  ");
		sleep(5);

		fluentWait(By.xpath("//span[text()='CENTRA']")).click();
		sleep(5);
		fluentWait(By.xpath("//a[text()='MIS Reports']")).click();
		sleep(5);
		// ...................................UserCaseReportBenchMarkReport........................................................//

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("(//img[@title='VIEW'])[1]")).click();

		
		 try{
		WebElement elementuser=driver.findElement(By.xpath("//div[text()='Generating report, please wait...']"));
		
		if(elementuser!=null){
		      WebDriverWait waitse = new WebDriverWait(driver, 8000);
		      waitse.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[text()='Generating report, please wait...']")));
		                 
		}
		 }catch(Exception e){
			 System.out.println("no element");
		 }

		 //Thread.sleep(8000);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
				+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));
		
		Runtime.getRuntime().exec("D:\\AutoitDownloadsSecond\\batch12_upload.exe");
		
		Thread.sleep(12000);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
				+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_END);

		Thread.sleep(2000);

		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		robot.keyRelease(KeyEvent.VK_END);

		Thread.sleep(13000);
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

		ExtentTestManager.getTest().log(LogStatus.INFO, "UsercaseDetailsReport downloaded sucessfully");
	
		//.......................................clicking..............................................................//
		
		sleep(8);
		fluentWait(By.xpath("//span[text()='CENTRA']")).click();

		fluentWait(By.xpath("//a[text()='MIS Reports']")).click();

		// ...................................UserCaseReportBenchMarkReport........................................................//

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		
		fluentWait(By.xpath("(//img[@title='VIEW'])[1]")).click();
		
		 try{
				WebElement elementuser=driver.findElement(By.xpath("//div[text()='Generating report, please wait...']"));
				
				if(elementuser!=null){
				      WebDriverWait waitse = new WebDriverWait(driver, 8000);
				      waitse.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[text()='Generating report, please wait...']")));
				                 
				}
				 }catch(Exception e){
					 System.out.println("no element");
				 }

				 //Thread.sleep(8000);
				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
						+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));
	Runtime.getRuntime().exec("D:\\AUTOMATION REQUIRED DOCS\\WebDriverdownloads\\batch12_upload.exe");
	
	Thread.sleep(20000);
		System.out.println("start");
UserDetailsPdfReports ss = new UserDetailsPdfReports();
	String pp = ss.Start();
	System.out.println(pp);
	
	ExtentTestManager.getTest().log(LogStatus.INFO,  "No Of Records in PDF file"+pp);

	Thread.sleep(8000);
	System.out.println("passs");
	
	String rr=	  DBUserCaseDetailsReport.getEmployeesFromDataBase(); 
	System.out.println(" No of Reords in Database"+rr);
	ExtentTestManager.getTest().log(LogStatus.INFO," No of Reords in Database"+rr);


	if(pp.equals(rr)){
		System.out.println("pass");
		ExtentTestManager.getTest().log(LogStatus.PASS,  "Both Records are Same ");
	}else{
		System.out.println("fail");
		ExtentTestManager.getTest().log(LogStatus.FAIL,"Both Records are not  Same");

	
	
		
	}
	
}

		
		
		
	}
	
	
	
	
	
	

