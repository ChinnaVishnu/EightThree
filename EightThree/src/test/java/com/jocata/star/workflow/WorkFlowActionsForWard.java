package com.jocata.star.workflow;

import java.io.IOException;
import java.util.List;
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




public class WorkFlowActionsForWard extends mainbaseLatest {


//..............Forward.......................................................................................................//
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
	
	
	@Test(priority=12)
	public void login() throws IOException{
			
	
		ExtentTestManager.startTest("  WorkFlowDispiration : ForWard  ");
		
		/*		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("l3_user");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Star@123");
				driver.findElement(By.xpath("//span[@id='loginButtonExt-btnIconEl']")).click();
		*/		clickDashboard();
				}

				public  void clickDashboard() throws IOException{
					//driver.findElement(By.xpath("//span[text()='Rules and Patterns']")).click();
					//driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
					
					//sleep(14);
					
					try{
					sleep(10);
					
					fluentWait(By.xpath("//span[text()='Case Files']")).click();
					//sleep(11);

					sleep(9);
					
					fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();
					
		//..........................................................Case Type............................................................//
					sleep(10);
					
					fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();
		     
					sleep(10);
				//fluentWait(By.xpath("//div[@id='boundlist-1015-listEl']/ul/li[3]")).click();	
					
					
					
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
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(10);
			
			//............................................clicking the workflow...........................................................//


			//
			
			fluentWait(By.xpath("//*[contains(@id,'workflowBtn')]")).click();

			
			sleep(9);
			
			
			fluentWait(By.xpath(".//*[@id='escalCommCombo-inputEl']")).click();
			
			sleep(9);
			fluentWait(By.xpath("//div[contains(@id,'boundlist-')][2]//ul/li")).click();
			
			sleep(8);
			fluentWait(By.xpath("//div[4]/div/div[2]/div/div/a/span/span/span[2]")).click();
	
			sleep(8);
			
			
			
			fluentWait(By.xpath("//div[2]/span[3]/a/span/span/span")).click();
			
			sleep(2);
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			
			fluentWait(By.xpath("//div[3]/div/table/tbody/tr/td/div/div")).click();
			
			fluentWait(By.xpath("//span[@id='assgnBtn-btnEl']/span[2]")).click();
			sleep(2);
			fluentWait(By.xpath("//div[3]/div/div/a/span/span/span[2]")).click();
			
			sleep(2);
			
			System.out.println("Sucess");
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Workflow and Disposition : Forward  are Performed");	
			

					}catch(Exception e){
						
						sleep(19);
						
				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
				
						
					driver.navigate().refresh();
					
					System.out.println("referesh................");
					
					ExtentTestManager.getTest().log(LogStatus.SKIP, "pageloading it will wait for 5 min and after it will   Skiping");


						}

}
}