package com.jocata.star.screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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




public class CustomerDetailsProfile  extends mainbaseLatest{

	
//...............................................................Customer Details – Customer Profile – More Info..................//
	
	public WebElement fluentWait(final By locator){
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        .withTimeout(50, TimeUnit.SECONDS)
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
	
	
	
	//.....................................................................	StarCase7...............................................//
	 

		
		//......................................customerprofiles........................................................................//	
			
	   @Test (priority=25)
		public void testprofiles() throws InterruptedException{
		   
		   try{

			
		Thread.sleep(3000);	

		ExtentTestManager.startTest("  Customer Details – Customer Profile – More Info "); 

			
		fluentWait(By.xpath("//span[text()='Case Files']")).click();


		
			
		fluentWait(By.xpath("//a[text()='Customer Profile']")).click();	

		
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("//img[@id='searchCustomerName']")).click();


	




		//................................................................Search for customers.........................................//

		fluentWait(By.xpath("//tr[contains(@id,'gridview-')]//div")).click();

		

		WebElement elementcus=driver.findElement(By.xpath("//div[contains(@id,'pagingtoolbar-')]//div//a[6]"));


		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementcus.getLocation().x+")");



		//Click the element

		elementcus.click();

		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("//a[contains(@id,'button-')]")).click();

		Thread.sleep(5000);	
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		
		fluentWait(By.xpath(".//*[@id='basicCusInfo_header_hd-textEl']/span")).click();
		
		
		Thread.sleep(5000);	
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		
		
		fluentWait(By.xpath("//div[contains(@id,'window-')]//following::img[2]")).click();

       // fluentWait(By.xpath("//div[contains(@id,'window-')][4]//following::img[2]")).click();
	
	
		System.out.println("pass");
	
	

			}catch(Exception e){
				
				sleep(19);
				
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
		
				
			driver.navigate().refresh();
			
			System.out.println("referesh................");
			
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Missing The Customer More info");


				}

	
	
	   }	
}
