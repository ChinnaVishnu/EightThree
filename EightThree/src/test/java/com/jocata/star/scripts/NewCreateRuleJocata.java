package com.jocata.star.scripts;

import java.util.Date;
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






public class NewCreateRuleJocata extends mainbaseLatest {

	public WebElement fluentWait(final By locator){
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        .withTimeout(100, TimeUnit.SECONDS)
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
	
	
	
	
	//..................................................................................NewCreateRule...............................................//	 
	
	
	 @Test (priority=4)
	public void loginNew(){
		
		ExtentTestManager.startTest("  Create New Rule "); 	
		
		//Newcreateruleexcel ruleSheet =new Newcreateruleexcel("Frist");
	//driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("l3_user");
	//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Star@123");
	//driver.findElement(By.xpath("//span[@id='loginButtonExt-btnIconEl']")).click();
	
		//sleep(10);
		
    String ruleName="rule";	
    
    
	for(int i=2;i<3;i++){
	
	//for(String ruleName:ruleSheet.getData()){
		/*	int ruleNameincrementor = 0;--Databahasse
	    
	    connect to database
	    to the table that has this value
	    fetch the the updated value
	    
	    ruleNameincrementor = updated value;
			
			ruleNameincrementor++;
			ruleName = ruleName + ruleNameincrementor;
			updATE THIS VALUE TO DB AGAIN
			*/
		
		ruleName=ruleName +new Date().getTime();
		System.out.println("ruleName"+ruleName);
		
		 ExtentTestManager.getTest().log(LogStatus.PASS, ruleName);
		 ExtentTestManager.getTest().log(LogStatus.INFO, "New Rule ");
		
		//System.out.println();
		 
			sleep(8);
		clickDashboard(ruleName);
	}
	
	
/*	if(){
		
	}
*/	
	
	
	//String name = "Vishnuvaradhanyadav"+count;
	//count++;
	//new StringBuilder().append("Vishnuvaradhanyadav").append("Vishnuvaradhanyadav"+count).toString();

	//clickDashboard(name);
	}

	public  void clickDashboard(String name){
		
		sleep(8);
		
		
		try{
		driver.findElement(By.xpath("//span[text()='Rules and Patterns']")).click();
		
		sleep(8);
		
		
        driver.findElement(By.xpath("//a[text()='Rule Builder']")).click();

       
        sleep(13);
        fluentWait(By.xpath("//a[@class='add-icon icon']")).click();
        
        sleep(8);
        fluentWait(By.xpath("//input[@id='ruleTemplateCombo-inputEl']")).click();
        sleep(8);
       
        fluentWait(By.xpath("//div[@data-qtip='Transaction Determination']")).click();
        
       
        sleep(8);
        fluentWait(By.xpath("//input[@id='ruleModel-inputEl']")).click();
        
        
        
        fluentWait(By.xpath("//li[text()='Cash and Structuring']")).click(); 
        
 /* WebElement element =driver.findElement(By.xpath("//input[@id='ruleModel-inputEl']"));
  Select select=new Select(element);
  select.selectByVisibleText("Cash and Structuring");
  
  
 */ 
       
       sleep(13);
       fluentWait(By.xpath("//input[@id='ruleName']")).sendKeys(name);
  
  //clicking Desception//
       fluentWait(By.xpath("//textarea[@id='ruleDescription']")).sendKeys(" how are you");
  
  //clicking the Referencenumber//
 
  fluentWait(By.xpath("//input[@id='ruleReferenceNmbr']")).sendKeys("1234455");
  
  //selecting the level//
  
  fluentWait(By.xpath("//input[@id='investigationLevel-inputEl']")).click();
  
  fluentWait(By.xpath("//li[text()='L1 User']")).click();
  
  
  //clicking the priority levels //
  
  fluentWait(By.xpath("//input[@id='rulePriority-inputEl']")).click();
  
 
  fluentWait(By.xpath("//li[text()='4']")).click();
  
 
  fluentWait(By.xpath("//input[@id='valDetRulePeriod']")).sendKeys("23");
  
  //clickcing the key parameter//
  
  sleep(14);
  fluentWait(By.xpath("//input[@id='keyParameter-inputEl']")).click();
  
  sleep(14);
  

  
  
  try{
	  fluentWait(By.xpath("//div[@data-qtip='Tran. Amount']")).click();
  
  
  //clicking the  status//
  fluentWait(By.xpath("//input[@id='ruleStatus-inputEl']")).click();
  fluentWait(By.xpath("//li[text()='Inactive']")).click();
  
  
  
  /*try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 */ //clicking the Thresholdparamater//
WebDriverWait wait=new WebDriverWait(driver, 60);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("temp_ruleBldrVOThreshholdTransDetList[0].thresholdTransDetFilterVal-inputEl")));
  


fluentWait(By.id("temp_ruleBldrVOThreshholdTransDetList[0].thresholdTransDetFilterVal-inputEl")).click();
  fluentWait(By.xpath("//li[text()='Tran. Amount']")).click();
  
  
  
	

  
  
  WebElement elementTothreshold = driver.findElement(By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[0].thresholdTransDetFilterFromVal']"));
//Scroll the browser to the element's Y position

((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementTothreshold.getLocation().y+")");
//Click the element
elementTothreshold.sendKeys("32");

  
  
 //driver.findElement(By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[0].thresholdTransDetFilterFromVal']")).sendKeys("32"); 
  
  /*WebDriverWait wait2=new WebDriverWait(driver, 60);
  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("ruleBldrVOThreshholdValDetList[0].thresholdValDetFilterFromVal")));

  driver.findElement(By.id("ruleBldrVOThreshholdValDetList[0].thresholdValDetFilterFromVal")).sendKeys("32");
*/  
sleep(14);


  WebElement elementTothresholdsecond = driver.findElement(By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[0].thresholdTransDetFilterToVal']"));
//Scroll the browser to the element's Y position

((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementTothresholdsecond.getLocation().y+")");
//Click the element
elementTothresholdsecond.sendKeys("47");

ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
  
 // driver.findElement(By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[0].thresholdTransDetFilterToVal']")).sendKeys("47");
/*  WebDriverWait wait3=new WebDriverWait(driver, 60);
  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("ruleBldrVOThreshholdValDetList[0].thresholdValDetFilterToVal")));

  driver.findElement(By.id("ruleBldrVOThreshholdValDetList[0].thresholdValDetFilterToVal")).sendKeys("47");
  
*/  	
  
sleep(14);

  
  //clicking the Save rule//
  
fluentWait(By.xpath("//div[@id='createRuleTransDet']//span")).click();
  
  //sucessfully created
  
  sleep(14);
  
  fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();
  
  sleep(14);
  
  System.out.println("Suceess fully Created");
  }catch(org.openqa.selenium.NoSuchElementException e){
	  
	  ExtentTestManager.getTest().log(LogStatus.INFO, "New Rule is Created Sucessfully");
	  
  }
  
  
  

		}catch(Exception e){
			
			sleep(19);
			
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	
			
		driver.navigate().refresh();
		
		System.out.println("referesh................");
		
		ExtentTestManager.getTest().log(LogStatus.SKIP, "pageloading it will wait for 5 min and after it will   Skiping");


			}

 }			
	

	
}
