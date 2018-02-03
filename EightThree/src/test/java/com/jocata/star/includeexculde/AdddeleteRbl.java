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

public class AdddeleteRbl extends mainbaseLatest {


	public String user="13302";
	
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

	
	@Test(priority = 13)
  public void clickadddelete() throws IOException{
	
		ExtentTestManager.startTest(" Add - Delete  :   Comments,Evidences, Functionality verification ");

		sleep(3);
		fluentWait(By.xpath("//span[text()='Case Files']")).click();
		sleep(3);
		fluentWait(By.xpath("//a[text()='Task Board']")).click();

		By loadingImage = By.xpath("//div[text()='Loading...']");

		long timeOutInSeconds =9000;
		
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		

		WebDriverWait waitse = new WebDriverWait(driver,30000);
		waitse.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='casesTypesCombo-inputEl']")));
	    
	    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	    sleep(3);

		fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();
		
		fluentWait(By.xpath("//li[text()='My Past Cases']")).click();
		
		sleep(3);
		fluentWait(By.xpath(".//*[@id='caseId']")).sendKeys(user);
		
		fluentWait(By.xpath(".//*[@id='btnSearch']")).click();
		
		fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();
		
		fluentWait(By.xpath("//div[contains(@id,'workflowBtn')]/a")).click();
		
	//...........................................clicking the Comments........................................................//  
		sleep(5);
		WebElement elementssss = fluentWait(By.xpath("//iframe[@id='comment-inputCmp-iframeEl']"));

		driver.switchTo().frame(elementssss);

		driver.findElement(By.xpath("html/body")).sendKeys("HHHH");

		driver.switchTo().defaultContent();
		
		fluentWait(By.xpath("//div[2]/div/div/a/span/span/span[2]")).click();
		
		sleep(3);
		
		 String textarea=driver.findElement(By.xpath("//div[@class='comments-panel']//following::div[contains(@id,'commentsdata')][2]//span")).getText();
		 System.out.println("imge is "+textarea);
		
		 ExtentTestManager.getTest().log(LogStatus.INFO, "L1 user added to the comments "+textarea);
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
			.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		 WebElement image1 = driver.findElement(By.xpath("//div[3]/div[2]/div/span/img"));
		   
		   Boolean imageLoaded1 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", image1);
		   if (!imageLoaded1)
		   {
		        System.out.println("1. Image is not present");
		   }
		   else
		   {
		       System.out.println("1. Got it Image is present X");
		       System.out.println("L1 user added to the comments ");
		       ExtentTestManager.getTest().log(LogStatus.INFO, "L1 user added to the comments, it's permissible for delete are present");
		       
		       
		   }
		 
		 
		 
		 
		 
		
	//.........................................Evidences.....................................................................//
		
		sleep(5);
		fluentWait(By.xpath("(//a[contains(text(),'Add New')])[3]")).click();

		sleep(3);
		fluentWait(By.xpath(".//*[@id='upload']")).click();

		sleep(8);

		ProcessBuilder bulidersecond = new ProcessBuilder(
				"D:\\AUTOMATION REQUIRED DOCS\\Autoit\\batch12_upload.exe");
		bulidersecond.start();

		sleep(3);

		fluentWait(By.xpath("//input[@id='fileName']")).sendKeys("RaghuRamYadav");

		

		fluentWait(By.xpath(".//*[@id='fileDesc']")).sendKeys("HiRaghuHowAreYou");

		fluentWait(By.xpath("//div[@id='uploadButton']")).click();
		
		
		
		
String Evidencedate=driver.findElement(By.xpath(".//*[@id='13302evidencedocuments']/div/div[5]")).getText();
System.out.println("evidence date "+Evidencedate);

ExtentTestManager.getTest().log(LogStatus.INFO, "L1 user added to the Evidences "+Evidencedate);

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
		 ExtentTestManager.getTest().log(LogStatus.INFO, "L1 user added to the Evidences it's permissible for delete are present ");

    
}


		sleep(4);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
        fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();
		
		fluentWait(By.xpath("//div[@id='flip']")).click();
		
		fluentWait(By.xpath("//a[text()='Log Out']")).click();
		
		System.out.println("..................................................");
		
		logintoseconduser();
		
		logintosameuser();
	  
  }
	
	
	public void logintoseconduser(){
		
		
		fluentWait(By.xpath("//a[text()='here']")).click();
		
		fluentWait(By.xpath("//input[@id='unme']")).sendKeys("Admin");

		fluentWait(By.xpath("//input[@id='pwdt']")).sendKeys("Jocata@123");
		
		fluentWait(By.xpath("//div[@id='loginButton']/a")).click();
		
		fluentWait(By.xpath("//div[@id='flip']")).click();
		
		fluentWait(By.xpath(".//*[@id='panel']/fieldset/div[1]/a[1]/img")).click();
		
		fluentWait(By.xpath("//span[text()='Case Files']")).click();
		
		 sleep(3);
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Login to Admin");
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
			.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("//a[text()='Task Board']")).click();

		By loadingImage = By.xpath("//div[text()='Loading...']");

		long timeOutInSeconds =9000;
		
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		

		WebDriverWait waitse = new WebDriverWait(driver,30000);
		waitse.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='casesTypesCombo-inputEl']")));
	    
			

		fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();
		
		fluentWait(By.xpath("//li[text()='Other Cases']")).click();
		
		
       fluentWait(By.xpath(".//*[@id='caseId']")).sendKeys(user);
		
		fluentWait(By.xpath(".//*[@id='btnSearch']")).click();
		
		fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();
		
		fluentWait(By.xpath("//div[contains(@id,'workflowBtn')]/a")).click();
		
		
		 String textarea=driver.findElement(By.xpath("//div[@class='comments-panel']//following::div[contains(@id,'commentsdata')][2]//span")).getText();
		 System.out.println("imge is "+textarea);
		
		 String Evidencedate=driver.findElement(By.xpath(".//*[@id='13302evidencedocuments']/div/div[5]")).getText();
		 System.out.println("evidence date "+Evidencedate);
		 
		 
		 sleep(3);
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
			.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
		
		 
		
		 try{
		 
		 
		 WebElement image1 = driver.findElement(By.xpath("//div[3]/div[2]/div/span/img"));
		   
		   Boolean imageLoaded1 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", image1);
		   if (!imageLoaded1)
		   {
		        System.out.println("1. Image is not present");
		   }
		   else
		   {
		       System.out.println("1. Got it Image is present X");
		       System.out.println("L1 user added to the comments ");
		       ExtentTestManager.getTest().log(LogStatus.INFO, "L1 user added to the comments, it's permissible for delete are present");
		       
		       
		   }
		 }catch(Exception e){
				System.out.println("no image X ");
				 System.out.println("L2 user no permissions  to delete the Evidences");
				 ExtentTestManager.getTest().log(LogStatus.INFO, "Admin user no permissions  to delete the comments");
				
			}
		 
		 
		 
		 try{
		 
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
		 		 ExtentTestManager.getTest().log(LogStatus.INFO, "L1 user added to the Evidences it's permissible for delete are present ");

		     
		 }
		 
		 
		 }catch(Exception e){
				System.out.println("no image X ");
				 System.out.println("L2 user no permissions  to delete the Evidences");
				 ExtentTestManager.getTest().log(LogStatus.INFO, "Admin user no permissions  to delete the Evidences");
				
			}
		 
		 
		sleep(6);
        fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();
		
        
        fluentWait(By.xpath("//div[@id='flip']")).click();
		
		fluentWait(By.xpath("//a[text()='Log Out']")).click();
		
	}
	
	
	
	public void logintosameuser(){
		
		fluentWait(By.xpath("//a[text()='here']")).click();
		
		fluentWait(By.xpath("//input[@id='unme']")).sendKeys("reviewer02");

		fluentWait(By.xpath("//input[@id='pwdt']")).sendKeys("Jocata@1234");
		
		fluentWait(By.xpath("//div[@id='loginButton']/a")).click();
		
		
        fluentWait(By.xpath("//div[@id='flip']")).click();
		
		fluentWait(By.xpath(".//*[@id='panel']/fieldset/div[1]/a[1]/img")).click();
		
		fluentWait(By.xpath("//span[text()='Case Files']")).click();

		fluentWait(By.xpath("//a[text()='Task Board']")).click();

		By loadingImage = By.xpath("//div[text()='Loading...']");

		long timeOutInSeconds =9000;
		
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		

		WebDriverWait waitse = new WebDriverWait(driver,30000);
		waitse.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='casesTypesCombo-inputEl']")));
	    
	    

		fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();
		
		
       fluentWait(By.xpath("//li[text()='My Past Cases']")).click();
		
		
		fluentWait(By.xpath(".//*[@id='caseId']")).sendKeys(user);
		
		fluentWait(By.xpath(".//*[@id='btnSearch']")).click();
		
		fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();
		
		fluentWait(By.xpath("//div[contains(@id,'workflowBtn')]/a")).click();
		
		
		//............................delete the comments and evidences....................................................//
		
		
		fluentWait(By.xpath("//div[3]/div[2]/div/span/img")).click();
		
		fluentWait(By.xpath("//div[3]/div/div/a[2]/span/span/span[2]")).click();
		
		fluentWait(By.xpath("//div[2]/div/div[5]/img")).click();
		
		fluentWait(By.xpath("//div[3]/div/div/a[2]/span/span/span[2]")).click();
		
		sleep(6);
        fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();
	}
	
	
	
	
	
}
