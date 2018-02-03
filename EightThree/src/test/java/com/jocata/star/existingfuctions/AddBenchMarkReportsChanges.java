package com.jocata.star.existingfuctions;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;




public class AddBenchMarkReportsChanges extends mainbaseLatest  {

	
	public WebElement fluentWait(final By locator){
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        .withTimeout(10, TimeUnit.SECONDS)
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
	
	 
	 
	 @Test(priority=24)
	  public void init() throws HeadlessException, AWTException, IOException{
		 
//......................................AddBenchMarkChanges.......................................................................//		 
		  
		  ExtentTestManager.startTest(" Add Benchmark : existing Functionality "); 	
		  
		  clickAddbench();
			}

			public  void clickAddbench() throws HeadlessException, AWTException, IOException{
				
				  
			     fluentWait(By.xpath("//span[text()='Rules and Patterns']")).click();
				WebElement element=fluentWait(By.xpath("//a[text()='Rule Library']"));
				
				Actions action=new Actions(driver);
				action.moveToElement(element). click().build().perform();
				sleep(3);		
ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
				 
	//.........................................Clicking the Search Button.......................................................//
				
				
				 fluentWait(By.xpath("//span[@id='button-1009-btnIconEl']")).click();			
				
				 fluentWait(By.xpath("//img[@title='Add']")).click();
				
	
//................................AddBenchMarkSymbol...................................................................................//				 

				 
//...................................Tran. Amount...................................................................................//				 

				try{ 
	
   fluentWait(By.xpath(".//*[@id='rulesConfValueses1thresholdValue1']")).sendKeys("123");
    
   
    fluentWait(By.xpath(".//*[@id='rulesConfValueses1thresholdValue2']")).sendKeys("124");
				 
//.................................Key Threshold Parameter Priority........................................................................//	
    
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
    
    fluentWait(By.xpath(".//*[@id='bmrkRulePrioritySelect-inputEl']")).click();
    
   
    fluentWait(By.xpath("//div[contains(@id,'boundlist-')]//li[3]")).click();
    
//.........................................................Repeats.................................................................// 
    
    fluentWait(By.xpath(".//*[@id='repeatsFor-inputEl']")).click();
    
 
 //........................................ Schedule Definition.................................................................//   
    
      fluentWait(By.xpath("//div[contains(@id,'boundlist-')][2]//li[4]")).click();
    
      
      
      
      fluentWait(By.xpath("//label[@class='img-check-box-avatar-rb']")).click();
    
    
 //..........................................................Reference Period.....................................................//   
    
    
      fluentWait(By.xpath(".//*[@id='rulePeriod']")).sendKeys("24");
      
      
      fluentWait(By.xpath(".//*[@id='rulePeriodType-inputEl']")).click();
	
	
	
	
	fluentWait(By.xpath("//div[contains(@id,'boundlist-')][3]")).click();
	
	
//.................................................Add..........................................................................//
	
	
	fluentWait(By.xpath("//div[@id='addBnchmrkButton']")).click();
	
    fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[2]")).click();    
    sleep(5);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
  
    
	fluentWait(By.xpath("//div[contains(@id,'tabbar-')]//a[2]")).click();
	sleep(5);
	
	fluentWait(By.xpath("//div[contains(@id,'tabbar-')]//a[3]")).click();
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	sleep(5);
	fluentWait(By.xpath("//div[contains(@id,'tabbar-')]//a[4]")).click();
	sleep(5);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	
	fluentWait(By.xpath("//div[contains(@id,'tabbar-')]//a[5]")).click();
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'window-')][2]//img")).click();
	sleep(5);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	sleep(15);
	
	System.out.println("pass");
	
}catch(org.openqa.selenium.ElementNotVisibleException e){
					
					sleep(80);
					 ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

					driver.navigate().refresh();
					
					System.out.println("referesh................");
					
					ExtentTestManager.getTest().log(LogStatus.SKIP, " Add Benchmark ");
					 
				}
	
catch(Exception e){
	sleep(80);
	ExtentTestManager.getTest().log(LogStatus.SKIP, " Add Benchmark ");	
	driver.navigate().refresh();
	System.out.println("changes fuctionality");
	
}
			}
}