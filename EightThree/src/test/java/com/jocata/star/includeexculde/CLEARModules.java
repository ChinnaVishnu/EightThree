package com.jocata.star.includeexculde;

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

public class CLEARModules extends mainbaseLatest {

	
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
	
	

	@Test(priority = 35)
public void clickingCLearmodules(){
		
		ExtentTestManager.startTest("  Manage Role :  Add,Remove permissions with CLEAR Modules  ");

		sleep(5);
		
		fluentWait(By.xpath("//span[text()='Profiles']")).click();

		fluentWait(By.xpath(".//*[@id='permissionsLink']")).click();
		sleep(2);
		
		
		//.....................................................Admin...........................................................//
		
		fluentWait(By.xpath("//li[text()='Admin']")).click();
		
		fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
		
		fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]/span/span/span[2]")).click();
		
		fluentWait(By.xpath("//div[@id='savePermButton']")).click();
		sleep(2);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
		
		
		
		//......................................Audit Log.......................................................................//
		
		fluentWait(By.xpath("//div[@id='clearMultiselect-field-innerCt']//span//div//li[text()='Audit Log']")).click();
		
        fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
		
		fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]/span/span/span[2]")).click();
		
		fluentWait(By.xpath("//div[@id='savePermButton']")).click();
		sleep(2);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
		
		
		//.....................................................Bank Level.....................................................//
		
		
	fluentWait(By.xpath("//li[text()='Bank Level']")).click();
		
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
			
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]/span/span/span[2]")).click();
			
	fluentWait(By.xpath("//div[@id='savePermButton']")).click();
	sleep(2);		
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));	  	
	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
		
		
	//....................................................Branch Level.......................................................//
	
	
		fluentWait(By.xpath("//li[text()='Branch Level']")).click();
		
		
		fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
				
		fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]/span/span/span[2]")).click();
				
		fluentWait(By.xpath("//div[@id='savePermButton']")).click();
		sleep(2);		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));		
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
		
		
	//.........................................BU Level........................................................................//
		
		
		fluentWait(By.xpath("//li[text()='BU Level']")).click();
		
		
		
		fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
				
		fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]/span/span/span[2]")).click();
				
		fluentWait(By.xpath("//div[@id='savePermButton']")).click();
		sleep(2);		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));		
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
		
		
	//.............................Customer Files............................................................................//
		
		fluentWait(By.xpath("//li[text()='Customer Files']")).click();
		
		fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
		
		fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]/span/span/span[2]")).click();
				
		fluentWait(By.xpath("//div[@id='savePermButton']")).click();
		sleep(2);	
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));		
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
		
	//..................................................Deferral Tracking....................................................//
		
		
		
		fluentWait(By.xpath("//li[text()='Deferral Tracking']")).click();
		
         fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
		
		fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]/span/span/span[2]")).click();
				
		fluentWait(By.xpath("//div[@id='savePermButton']")).click();
		sleep(2);	
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));		
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
		
		//........................................FCU Tracking................................................................//
		
		
		fluentWait(By.xpath("//li[text()='FCU Tracking']")).click();
		
	    fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
		
			fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]/span/span/span[2]")).click();
					
			fluentWait(By.xpath("//div[@id='savePermButton']")).click();
			sleep(2);		
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
			.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));		
			fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
			
		
		//....................................HouseHolding...................................................................//
			
			fluentWait(By.xpath("//li[text()='HouseHolding']")).click();
			
			
			  fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
				
				fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]/span/span/span[2]")).click();
						
				fluentWait(By.xpath("//div[@id='savePermButton']")).click();
				sleep(2);		
				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));		
				fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
		
		
	//....................................KYC & AML Risk Score...................................................................//
		
		fluentWait(By.xpath("//li[text()='KYC & AML Risk Score']")).click();		
				
				
		fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
		
		fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]/span/span/span[2]")).click();
				
		fluentWait(By.xpath("//div[@id='savePermButton']")).click();
		sleep(2);		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));		
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();

		
		
		//....................................List Matching................................................................//
		
		
    fluentWait(By.xpath("//li[text()='List Matching']")).click();
		
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]/span/span/span[2]")).click();
			
	fluentWait(By.xpath("//div[@id='savePermButton']")).click();
	sleep(2);		
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));		
	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	

	//........................................On-demand Search.............................................................//
	
    fluentWait(By.xpath("//li[text()='On-demand Search']")).click();
    fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]/span/span/span[2]")).click();
			
	fluentWait(By.xpath("//div[@id='savePermButton']")).click();
	sleep(2);	
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));		
	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
    
	
	//.................................Reports............................................................................//
	
	
	fluentWait(By.xpath("//li[text()='Reports']")).click();
	
	
	 fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
		
		fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]/span/span/span[2]")).click();
				
		fluentWait(By.xpath("//div[@id='savePermButton']")).click();
		sleep(2);	
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));		
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	    
		
    //...............................Task Board............................................................................//
		
		fluentWait(By.xpath("//li[text()='Task Board']")).click();
    

		 fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
			
			fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]/span/span/span[2]")).click();
					
			fluentWait(By.xpath("//div[@id='savePermButton']")).click();
			sleep(2);	
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
			.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));		
			fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
		    
			
			
	//......................................................
			
			fluentWait(By.xpath("//li[text()='UCIC']")).click();
			
			 fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
				
				fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]/span/span/span[2]")).click();
						
				fluentWait(By.xpath("//div[@id='savePermButton']")).click();
				sleep(2);	
				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));		
				fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
			    
				
			
				ExtentTestManager.getTest().log(LogStatus.INFO,"CLEAR Modules Including and Excluding permissions performed Sucessfully");
		
		
		
	}
	
}
