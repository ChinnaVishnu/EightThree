package com.jocata.star.workflow;

import java.io.IOException;
import java.util.List;
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





public class WorkFlowClose  extends  mainbaseLatest  {

	


	public static void scrollTo(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
    }
	
	
	//..............Forward.......................................................................................................//
		public WebElement fluentWait(final By locator){
			
			
		    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(20, TimeUnit.SECONDS)
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
		
		
		@Test(priority=9)
		public void login() throws IOException{
				
		
			 ExtentTestManager.startTest("  Workflow and Disposition :  Close  ");
			
		
				clickDashboard();
					}

					public  void clickDashboard() throws IOException{
						
						//try{
						sleep(8);
						fluentWait(By.xpath("//span[text()='Case Files']")).click();
						

						fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();
						
			//..........................................................Case Type............................................................//
						
	
						// Find an element

						WebElement elementToClick = fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']"));



						// Scroll the browser to the element's Y position

						((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementToClick.getLocation().y+")");



						// Click the element

						elementToClick.click();
						
						
						
						
						//fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();
			     
						
						
						
			//.................................................................Search.......................................................//
					
					
					
				fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
				
				
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		
		sleep(10);
		
		 List<WebElement> jocata=driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));
			
			for (WebElement ele : jocata) {
				
				
		String text=ele.getText();
		
		ExtentTestManager.getTest().log(LogStatus.INFO, text);	

				
			}
		
				
				
				
				
				fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();
				
				
				
				//............................................clicking the workflow...........................................................//

	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
		
				
				

				//
				
				fluentWait(By.xpath("//*[contains(@id,'workflowBtn')]")).click();
				
				
ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
				

                
                
               


				fluentWait(By.xpath(".//*[@id='closureCommCombo-inputEl']")).click();
				
				
				fluentWait(By.xpath("//div[contains(@id,'boundlist-')][2]//ul/li")).click();
				
				fluentWait(By.xpath("//div[2]/div/div/a/span/span/span[2]")).click();
				
				fluentWait(By.xpath("//span/a/span/span/span")).click();
				
				
				ExtentTestManager.getTest().log(LogStatus.INFO, "  Workflow and Disposition Actions are Performed");
/*
						}catch(Exception e){
							
							sleep(19);
							
					ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
					
							
						driver.navigate().refresh();
						
						System.out.println("referesh................");
						
						ExtentTestManager.getTest().log(LogStatus.SKIP, "pageloading it will wait for 5 min and after it will   Skiping");


							}
*/
}
}