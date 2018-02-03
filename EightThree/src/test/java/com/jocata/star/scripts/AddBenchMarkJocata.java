package com.jocata.star.scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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




public class AddBenchMarkJocata  extends mainbaseLatest{
	
	

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
	
	
	
	//.........................................................AddBenchMark...........................................................//			
	
	
	  
	 @Test (priority=1)
	  public void init(){
		  
		  ExtentTestManager.startTest("  Add Benchmark "); 	
		  
			/*driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("l3_user");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Star@1234");*/
			//driver.findElement(By.xpath("//span[@id='loginButtonExt-btnIconEl']")).click();
		  clickAddbench();
			}

			public  void clickAddbench(){
				
				
				try{
				
				  sleep(12);
				driver.findElement(By.xpath("//span[text()='Rules and Patterns']")).click();
				
				  sleep(10);
				WebElement element=driver.findElement(By.xpath("//a[text()='Rule Library']"));
				
				Actions action=new Actions(driver);
				
				
				action.moveToElement(element).build().perform();
				
				  sleep(10);
			    driver.findElement(By.xpath("//a[text()='Rule Library']")).click();
			    
			    
				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			    
			    String ruletemplete=driver.findElement(By.xpath("//label[text()='Rule Template']")).getText();
			    
			    ExtentTestManager.getTest().log(LogStatus.INFO, ruletemplete);
			    
			    
	           String  RuleSource=driver.findElement(By.xpath("//label[text()=' Rule Source']")).getText();
			    
			   ExtentTestManager.getTest().log(LogStatus.INFO, RuleSource);
			    
			    
	            String  RuleStatus=driver.findElement(By.xpath("//label[text()=' Rule Status']")).getText();
			    
	            ExtentTestManager.getTest().log(LogStatus.INFO, RuleStatus);
			    
			    
			    driver.findElement(By.xpath("//input[@id='rulesModelCombo-inputEl']")).click();
			    sleep(10);
			    driver.findElement(By.xpath("//div[starts-with(@id,'boundlist-')]/ancestor::div[1]//span")).click();
			    
			   // sleep(12);
			    
			    
			    
			    
			    
			    //driver.findElement(By.xpath("//span[@id='button-1009-btnIconEl']")).click();
	/*		    driver.findElement(By.xpath("//img[@title='Add']")).click();


	//........................clicking the Add Benchmark...................................................................//
		    
			    
			    
		    driver.findElement(By.xpath("//li[@class='x-boundlist-item']")).click();
		    

		    //......... clicking the Occupation//
		    
		    driver.findElement(By.xpath("//div[@id='rulesConfValuesesVal12thresholdValue-innerCt']//li")).click();
		    
	     
		    JavascriptExecutor jsenature = (JavascriptExecutor)driver;
		    jsenature.executeScript("window.scrollBy(0,250)", "");
		    
		    driver.findElement(By.xpath("//span[@id='rulesConfValuesesVal13thresholdValue-outerCt']//li")).click();
		    
		    //..................................clicking the Risk Rating:......................................//
		    

		   driver.findElement(By.xpath("//div[@id='rulesConfValuesesVal14thresholdValue-innerCt']//li")).click(); 
		    

		   driver.findElement(By.xpath("//span[@id='rulesConfValuesesVal15thresholdValue-outerCt']//li")).click();
		   
		   //.............................Product Code..........................................//
		   
		   driver.findElement(By.xpath("//span[@id='rulesConfValuesesVal16thresholdValue-outerCt']//li")).click();
		   
		   //...................................Tran. Amount...........................................//
		   
		   driver.findElement(By.xpath("//input[@id='rulesConfValueses7thresholdValue1']")).sendKeys("100");
		   
		   //............................Repearts..........................................................//
		   
	WebElement repearts=driver.findElement(By.xpath("//select[@id='repeatsFor']"));

	Select select=new Select(repearts);

	select.selectByVisibleText("Weekly");
		   
		   driver.findElement(By.id("offsetPeriod")).sendKeys("0");

		   
		   driver.findElement(By.id("rulePeriod")).sendKeys("24");
		   
		   
		   
		WebElement referenceperiod=   driver.findElement(By.id("rulePeriodType"));
		   
		   
		   Select selectseond=new Select(referenceperiod);
		   selectseond.selectByVisibleText("Rolling Months");
	*/	   
			    sleep(3);

		   
		   fluentWait(By.xpath("//label[@for='ruleId']")).click();
		   

		 //.................................................Rule ID...........................................................//
		   
		   fluentWait(By.xpath("//input[@id='rulesIdCombo-inputEl']")).click();
		   
		   

		   //fluentWait(By.xpath("//div[@id='boundlist-1014']//span")).click();
		   
		   fluentWait(By.xpath("//div[starts-with(@id,'boundlist-')]//ancestor::div[3]//span")).click();
		   

		   fluentWait(By.xpath("//label[@for='ruleName']")).click();
		   

		   
	  //............................clicking the rulename.....................................................................//
		   
		   fluentWait(By.id("rulesNameCombo-inputEl")).click();
		   
		   

		   fluentWait(By.xpath("//div[@id='boundlist-1016']/div/span")).click();
		   
		   

		   
	//.........................................Rule Template..................................................................//
		   
		  fluentWait(By.id("rulesTemplateCombo-inputEl")).click(); 
		  
		   

		  fluentWait(By.xpath("//div[@id='boundlist-1018']//span")).click(); 
		   
		   

		   
		   fluentWait(By.xpath("//label[@for='searchBranch']")).click();
	  
		   
		   fluentWait(By.xpath("//label[@class='img-check-box-avatar']")).click();
		   
		   

		    fluentWait(By.xpath("//label[@for='Active']")).click();
		  
		   

		    fluentWait(By.xpath("//span[@id='button-1009-btnIconEl']")).click();
		   
		    
		    
		    
		    
		    sleep(12);
		    
		    List<WebElement> addvalues=driver.findElements(By.xpath("//tr[contains(@id,'gridview-')]/td"));
		   		
		   		for (WebElement eleaddvalues : addvalues) {
		   			
		   			
		   	String texteleaddvalues=eleaddvalues.getText();
		   	
		   	ExtentTestManager.getTest().log(LogStatus.INFO, texteleaddvalues);	


		   			
		   		}
		   	    
		   		
		    
		   		
		    
		   		sleep(8);

		    fluentWait(By.xpath("//img[@title='Add']")).click();
		    
		  //........................clicking the Add Benchmark...................................................................//
		    
		    sleep(8);
		    
	    fluentWait(By.xpath("//li[@class='x-boundlist-item']")).click();
	   

	    //......... clicking the Occupation..........................................................//
	    
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	    
		sleep(8);
	    fluentWait(By.xpath("//div[@id='rulesConfValuesesVal12thresholdValue-innerCt']//li")).click();
	   
	 
	    JavascriptExecutor jsenature = (JavascriptExecutor)driver;
	    jsenature.executeScript("window.scrollBy(0,250)", "");
	    
	    sleep(8);
	    fluentWait(By.xpath("//span[@id='rulesConfValuesesVal13thresholdValue-outerCt']//li")).click();
	    
	    //..................................clicking the Risk Rating:......................................//
	    sleep(8);

	   fluentWait(By.xpath("//div[@id='rulesConfValuesesVal14thresholdValue-innerCt']//li")).click(); 
	   

	   fluentWait(By.xpath("//span[@id='rulesConfValuesesVal15thresholdValue-outerCt']//li")).click();
	   
	   //.............................Product Code..........................................//
	   
	   fluentWait(By.xpath("//span[@id='rulesConfValuesesVal16thresholdValue-outerCt']//li")).click();
	   
	  //................................Tran. Sub-Type..................................................//
	   
	   
	   
	   fluentWait(By.xpath("//div[@data-qtip='Cash - Cash']")).click();
	   
	   
	   sleep(8);
	   //...................................Tran. Amount...........................................//
	   
	   fluentWait(By.xpath("//input[@id='rulesConfValueses7thresholdValue1']")).sendKeys("100");
	   
	  //....................................RiskRating........................................................................//
	   
	   
	   
	  // fluentWait(By.xpath("//div[@id='boundlist-1440']//li")).click();
	   
	   
	   fluentWait(By.xpath("//div[@id='rulesConfValuesesVal19thresholdValue-innerCt']//li")).click();

	  
	   //fluentWait(By.xpath("//div[@id='boundlist-1242-listEl']//li")).click();
	   
	   
	   //............................Repearts..........................................................//
	   
	WebElement repearts=fluentWait(By.xpath("//input[@id='repeatsFor-inputEl']"));

	repearts.click();

	 
	
	fluentWait(By.xpath("//li[text()='Weekly']")).click();


	 
	fluentWait(By.xpath("//label[@class='img-check-box-avatar-rb']")).click();

	/*Select select=new Select(repearts);

	select.selectByVisibleText("Weekly");
	*/   
	
	 
	 
	   fluentWait(By.id("offsetPeriod")).sendKeys("0");

	   
	   
	   fluentWait(By.id("rulePeriod")).sendKeys("24");
	   
	   
	   
	   
	   
	WebElement referenceperiod=   fluentWait(By.id("rulePeriodType"));
	referenceperiod.sendKeys("24");


	   
	/*   Select selectseond=new Select(referenceperiod);
	   selectseond.selectByVisibleText("Rolling Months");
	*/   

	
	 
	
	fluentWait(By.id("rulePeriodType-inputEl")).click();

	 
	
	fluentWait(By.xpath("//li[text()='Days']")).click();




	 


	fluentWait(By.xpath("//div[@id='addBnchmrkButton']")).click();
		    
	 
	 
	try{
	WebElement elementnn=fluentWait(By.xpath("//div[contains(@id,'-toolbar')]//div//a[3]"));


	//JavascriptExecutor js =(JavascriptExecutor)driver;
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementnn.getLocation().y+")");
	elementnn.click();

	 sleep(8);

	}catch(org.openqa.selenium.NoSuchElementException e){
		
	System.out.println("no element");

	}

	try{
	fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a")).click();


	String Addbench=fluentWait(By.xpath("//tr[@id='gridview-1038-record-ext-record-7']")).getText();

	ExtentTestManager.getTest().log(LogStatus.INFO, " Add Benchmark ");

	ExtentTestManager.getTest().log(LogStatus.PASS, Addbench);




	}catch(org.openqa.selenium.NoSuchElementException e){
		System.out.println("no element");
		
		ExtentTestManager.getTest().log(LogStatus.SKIP, " MISSING WINDOW POPUP ");

		
	}catch(org.openqa.selenium.WebDriverException e){
		System.out.println("hi");
		
	}



	 

	System.out.println("This is Create a New Bench Mark");

	sleep(12);

	JavascriptExecutor jseNetworkAn = (JavascriptExecutor)driver;


	jseNetworkAn.executeScript("window.scrollBy(0,-900)", "");

	sleep(14);

	System.out.println("SucessFully created a bench mark");



	/*
	//boolean elemetpresent=true;	

	WebElement elemetpresent =driver.findElement(By.xpath("//a[@id='button-1005']"));

	elemetpresent.click();
	*/

				}catch(Exception e){
					
					sleep(19);
					
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
			
					
				driver.navigate().refresh();
				
				System.out.println("referesh................");
				
				ExtentTestManager.getTest().log(LogStatus.FAIL, "Add Bench Mark Missing Mark");


					}




			}

	
	
	
}
