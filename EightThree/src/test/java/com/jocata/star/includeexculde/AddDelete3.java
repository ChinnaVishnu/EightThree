package com.jocata.star.includeexculde;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class AddDelete3 extends mainbaseLatest {

	public String user="";
	
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


	
@Test(priority = 15)
public void clickadddelete() throws IOException{
	
	ExtentTestManager.startTest(" Add - Delete  :   Comments,Evidences, Functionality verification ");
	
	fluentWait(By.xpath("//span[text()='Case Files']")).click();

	fluentWait(By.xpath("//a[text()='Task Board']")).click();


	WebDriverWait wait = new WebDriverWait(driver,30000);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='casesTypesCombo-inputEl']")));
    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();
	
	fluentWait(By.xpath("//li[text()='My Past Cases']")).click();

	// .................................................................Search.......................................................//

	fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();


	try {

		 user = fluentWait(By.xpath("//div[3]/div/table/tbody/tr/td/table/tbody/tr/td[2]/div")).getText();

		System.out.println(user);

	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println("no element");

	}
	
	
	fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();
	
	sleep(9);
	
	fluentWait(By.xpath("//*[contains(@id,'workflowBtn')]")).click();
	sleep(9);
	fluentWait(By.xpath(".//*[@id='closureCommCombo-triggerWrap']")).click();
	
	fluentWait(By.xpath("//li[text()='Comment 1']")).click();
	
	fluentWait(By.xpath("//div[2]/div/div/a/span/span/span[2]")).click();
	


	sleep(9);
	
	   String textarea=driver.findElement(By.xpath("//div[@class='comments-panel']//following::div[contains(@id,'commentsdata')][2]//span")).getText();
	   System.out.println("imge"+textarea);
	   
       ExtentTestManager.getTest().log(LogStatus.INFO, "L1 user added to the comments text");

	
	
   String deleteicon=driver.findElement(By.xpath("//div[5]/div[2]/div[1]/span/img")).getText();
   System.out.println("imge"+deleteicon);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

   WebElement image1 = driver.findElement(By.xpath("//div[5]/div[2]/div[1]/span/img"));
   
   Boolean imageLoaded1 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", image1);
   if (!imageLoaded1)
   {
        System.out.println("1. Image is not present");
   }
   else
   {
       System.out.println("1. Got it Image is present X");
       System.out.println("L1 user added to the comments ");
       ExtentTestManager.getTest().log(LogStatus.INFO, "L1 user added to the comments");
       
       
   }
	
  //...........................................................................................................................//
	// ...............................AddEvidence...............................................................................//

	sleep(4);
	fluentWait(By.xpath("(//a[contains(text(),'Add New')])[3]")).click();

	sleep(4);
	fluentWait(By.xpath(".//*[@id='upload']")).click();

	sleep(4);

	ProcessBuilder bulidersecond = new ProcessBuilder(
			"D:\\AUTOMATION REQUIRED DOCS\\Autoit\\batch12_upload.exe");
	bulidersecond.start();

	sleep(4);

	fluentWait(By.xpath("//input[@id='fileName']")).sendKeys("RaghuRamYadav");

	

	fluentWait(By.xpath(".//*[@id='fileDesc']")).sendKeys("Test Autoamtion");

	fluentWait(By.xpath("//div[@id='uploadButton']")).click();

	sleep(4);

	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));


	String atculaimage=fluentWait(By.xpath("//div[2]/div/div[5]/img")).getText();
   System.out.println(atculaimage);
   
 WebElement image1eviden = driver.findElement(By.xpath("//div[2]/div/div[5]/img"));
   
   Boolean imageLoaded1evidence = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", image1eviden);
   if (!imageLoaded1evidence)
   {
        System.out.println("1. Image is not present evidence");
   }
   else
   {
       System.out.println("1. Got it Image is present evidence X");
       
       System.out.println("L1 user added to the Evidences ");
		 ExtentTestManager.getTest().log(LogStatus.INFO, "L1 user added to the Evidences ");

       
   }
   
   
   //.......................................links.............................................................................//
   
   
  
	
//............................................................................................................................//	
   
   
   
   
	
	fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();
	
	
	
	fluentWait(By.xpath("//div[@id='flip']")).click();
	fluentWait(By.xpath("//a[text()='Log Out']")).click();
	fluentWait(By.xpath("//a[text()='here']")).click();
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	
	fluentWait(By.xpath(".//*[@id='unme']")).sendKeys(Repository.getProperty("app_username"));
	fluentWait(By.xpath(".//*[@id='pwdt']")).sendKeys(Repository.getProperty("app_password"));
	
	fluentWait(By.xpath(".//*[@id='loginButtonExt']")).click();
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	
	fluentWait(By.xpath("//span[text()='Case Files']")).click();
	fluentWait(By.xpath("//a[text()='Task Board']")).click();
	sleep(9);
	
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	ExtentTestManager.getTest().log(LogStatus.INFO, "Login to L2 user");
	
	fluentWait(By.xpath(".//*[@id='casesTypesCombo-triggerWrap']")).click();
	fluentWait(By.xpath("//li[text()='Other Cases']")).click();
	fluentWait(By.xpath(".//*[@id='caseId']")).sendKeys(user);
	fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
	fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();
	sleep(9);
	fluentWait(By.xpath("//*[contains(@id,'workflowBtn')]")).click();
	sleep(9);
	
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	String deleteiconss=driver.findElement(By.xpath("//div[5]/div[2]/div[1]/span")).getText();
	   System.out.println("imge"+deleteiconss);
	
	try{

	   WebElement image1in  = driver.findElement(By.xpath("//div[5]/div[2]/div[1]/span/img"));
	   
	   Boolean imageLoaded1second = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", image1in);
	   if (!imageLoaded1second)
	   {
	        System.out.println("1. Image is not present");
	   }
	   else
	   {
	       System.out.println("1. Got it");
	   }
	
	   
	}catch(Exception e){
		System.out.println("no image X ");
		System.out.println("L2 user no permissions  to delete the comments");
		 ExtentTestManager.getTest().log(LogStatus.INFO, "L2 user no permissions  to delete the comments");

		
	}
	   
	   
	System.out.println("pass");
	
//..............................................................................................................................//
	
	try{
	
	WebElement image1evidencesecond = driver.findElement(By.xpath("//div[2]/div/div[5]/img"));
	   
	   Boolean imageLoaded1evisec = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", image1evidencesecond);
	   if (!imageLoaded1evisec)
	   {
	        System.out.println("1. Image is not present evidence");
	   }
	   else
	   {
	       System.out.println("1. Got it Image is present evidence X");
	       
	       System.out.println("L2 user no permissions  to delete the Evidences");
	       
	   }
	
	
	   
		}catch(Exception e){
			System.out.println("no image X ");
			 System.out.println("L2 user no permissions  to delete the Evidences");
			 ExtentTestManager.getTest().log(LogStatus.INFO, "L2 user no permissions  to delete the Evidences");
			
		}
	
	
	
	
	
	
	fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();
	
	
	//.......................................login to l1 user................................................................//
	
	fluentWait(By.xpath(".//*[@id='flip']/img")).click();
	
	fluentWait(By.xpath("//a[text()='Log Out']")).click();
	fluentWait(By.xpath("//a[text()='here']")).click();
	
	fluentWait(By.xpath(".//*[@id='unme']")).sendKeys(Repository.getProperty("username"));
	fluentWait(By.xpath(".//*[@id='pwdt']")).sendKeys(Repository.getProperty("password"));
	
	fluentWait(By.xpath(".//*[@id='loginButtonExt']")).click();
	
	
	
	
	
}
	
	
	
	
}
