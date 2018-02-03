package com.jocata.star.reportsdownload;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;




public class MisReportsDownload extends mainbaseLatest{

	public static void   open() throws IOException{
		 File file=new File("D:\\AUTOMATION REQUIRED DOCS\\MisReportsDownloads");
	        
	        //first check if Desktop is supported by Platform or not
	        if(!Desktop.isDesktopSupported()){
	            System.out.println("Desktop is not supported");
	            return;
	        }
	        
	        Desktop desktop = Desktop.getDesktop();
	        if(file.exists()) desktop.open(file);
	        
	        //let's try to open PDF file
	        file = new File("D:\\AUTOMATION REQUIRED DOCS\\MisReportsDownloads");
	        
	        if(file.exists()) desktop.open(file);
	        
           
	       
	    }	
	
	
	public WebElement fluentWait(final By locator){
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        .withTimeout(69, TimeUnit.SECONDS)
	        .pollingEvery(5, TimeUnit.SECONDS)
	        .ignoring(NoSuchElementException.class);

	    WebElement foo = wait.until(
	        new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	                return driver.findElement(locator);
	            }
	        }
	    );
	    return foo;
	};

	
	public void sleep(int seconds){
		   
		   try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	
	@Test(priority=36)
public void ZZZZZ() throws InterruptedException, IOException, HeadlessException, AWTException{
	
		
		ExtentTestManager.startTest(" Add Report :  Download All Reports  ");
		
		   sleep(16);
	
		fluentWait(By.xpath("//span[text()='CENTRA']")).click();

		
		 sleep(12);

		   fluentWait(By.xpath("//a[text()='MIS Reports']")).click();
		
	
		   sleep(15);

 //...................................UserCaseReportBenchMarkReport........................................................//		   
		   




// fluentWait(By.xpath(".//*[@id='deleteReportLink']")).click();

// fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[2]")).click();
ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));


fluentWait(By.xpath("(//img[@title='VIEW'])[1]")).click();


   Thread.sleep(30000);
   
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));
 
   
   
driver.navigate().refresh();
	


  Runtime.getRuntime().exec("D:\\AUTOMATION REQUIRED DOCS\\WebDriverdownloads\\batch12_upload.exe");
	
   sleep(20);
   
   
System.out.println("UserCaseReportBenchMarkReport");  		   
		   
	
ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

		   
//...............................................................................................................................//		   
		   




//fluentWait(By.xpath(".//*[@id='deleteReportLink']")).click();

//  fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[2]")).click();
 
ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	
	
		fluentWait(By.xpath("(//img[@title='VIEW'])[2]")).click();
		
		
		 Thread.sleep(30000);	   
ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));


		   driver.navigate().refresh();

			
		   Runtime.getRuntime().exec("D:\\AUTOMATION REQUIRED DOCS\\WebDriverdownloads\\batch12_upload.exe");
			
		   sleep(15);
		   
		   
System.out.println("RuleSummaryDetailsReport");		
		   
		   
//...................................EventDetailsReport........................................................//		   
		   

/*ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));


fluentWait(By.xpath("(//img[@title='VIEW'])[3]")).click();


 Thread.sleep(40000);	   
ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));


   driver.navigate().refresh();

	
   Runtime.getRuntime().exec("D:\\WebDriverdownloads\\batch12_upload.exe");
	
   sleep(15);
   
   
System.out.println("RuleSummaryDetailsReport");		
*/












/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
sleep(8);



// fluentWait(By.xpath(".//*[@id='deleteReportLink']")).click();

//fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[2]")).click();
 
 
ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	
	
	fluentWait(By.xpath("(//img[@title='VIEW'])[3]")).click();
	
	
	
	
	
	   Thread.sleep(60000);
	   
ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));
	   
	   
	   
driver.findElement(By.xpath("//div[contains(@id,'messagebox-')]//a")).click();

ExtentTestManager.getTest().log(LogStatus.ERROR, "Not Download");

		
	   //Runtime.getRuntime().exec("D:\\WebDriverdownloads\\batch12_upload.exe");
		
	   sleep(10);
	   
	   
System.out.println("EventDetailsReport");	




//..................................................................................................................................//   




sleep(8);





// fluentWait(By.xpath(".//*[@id='deleteReportLink']")).click();

// fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[2]")).click();

ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));


fluentWait(By.xpath("(//img[@title='VIEW'])[4]")).click();


Thread.sleep(50000);
   
   ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

   
   fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a")).click();

   ExtentTestManager.getTest().log(LogStatus.ERROR, "Not Download");

	
  // Runtime.getRuntime().exec("D:\\WebDriverdownloads\\batch12_upload.exe");
	
   sleep(10);
   
   
System.out.println("DashBoardDetailsReport");




//..................................................................................................................................//   



sleep(8);


   
 //  fluentWait(By.xpath(".//*[@id='deleteReportLink']")).click();
   
  // fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[2]")).click();
    
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	
	
	fluentWait(By.xpath("(//img[@title='VIEW'])[5]")).click();
	
	
	Thread.sleep(30000);
	
	   ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));
	   
	   driver.navigate().refresh();

		
	   Runtime.getRuntime().exec("D:\\AUTOMATION REQUIRED DOCS\\WebDriverdownloads\\batch12_upload.exe");
		
	   sleep(10);
	   
	   
System.out.println("CaseDetailsReport");		 
		

//...................................BenchMarkReport........................................................//		   



sleep(8);



// fluentWait(By.xpath(".//*[@id='deleteReportLink']")).click();

// fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[2]")).click();

ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));


fluentWait(By.xpath("(//img[@title='VIEW'])[6]")).click();


Thread.sleep(100000);
   
   ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

   
   driver.navigate().refresh();

	
   Runtime.getRuntime().exec("D:\\AUTOMATION REQUIRED DOCS\\WebDriverdownloads\\batch12_upload.exe");
	
   sleep(10);
   
   
System.out.println("BenchMarkReport");	
		   
		   
		   
		   
		   
		   
		   
		   

		   
			   
			   
			   
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			   
			fluentWait(By.xpath("(//img[@title='VIEW'])[7]")).click();
			
			
			
			
			Thread.sleep(30000);
			
 ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));
   
		   driver.navigate().refresh();

		   
		   Runtime.getRuntime().exec("D:\\AUTOMATION REQUIRED DOCS\\WebDriverdownloads\\batch12_upload.exe");
		   
		   
			
		 /*  sleep(47);
		   
		   
		   open();
		   
		   
		   sleep(47);*/
		   
		   sleep(11);
		   
		   ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));
	   
		   
		   
		   System.out.println("BenchMarkrun");		 
		 
			
//.................................................................................................................................//		   
		   
	

		   sleep(11);
fluentWait(By.xpath("//div[contains(@id,'gridcolumn-')]//span")).click();

//................................................................................................................................//...

ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));


sleep(10);
fluentWait(By.xpath("//a[@id='deleteReportLink']")).click();

//.....................................................................................................................//


System.out.println("pass");

sleep(10);

fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[2]")).click();

ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

//.....................................................................................................................//
sleep(10);

System.out.println("PASS");

	
sleep(20);

open();

sleep(4);

ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

sleep(8);

System.out.println("Pass");






}
}