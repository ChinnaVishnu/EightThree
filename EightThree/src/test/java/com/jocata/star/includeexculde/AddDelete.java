package com.jocata.star.includeexculde;

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
import com.jocata.star.basescripts.mainbaseLatest;

public class AddDelete extends mainbaseLatest {

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


	
@Test	
public void clickadddelete(){
	
	fluentWait(By.xpath("//span[text()='Case Files']")).click();

	fluentWait(By.xpath("//a[text()='Task Board']")).click();


	WebDriverWait wait = new WebDriverWait(driver,30000);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='casesTypesCombo-inputEl']")));
	
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
   String deleteicon=driver.findElement(By.xpath("//div[5]/div[2]/div[1]/span/img")).getText();
   System.out.println("imge"+deleteicon);
   

   WebElement image1 = driver.findElement(By.xpath("//div[5]/div[2]/div[1]/span/img"));
   
   Boolean imageLoaded1 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", image1);
   if (!imageLoaded1)
   {
        System.out.println("1. Image is not present");
   }
   else
   {
       System.out.println("1. Got it");
   }
	
	
	
	fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();
	
	
	
	fluentWait(By.xpath("//div[@id='flip']")).click();
	fluentWait(By.xpath("//a[text()='Log Out']")).click();
	fluentWait(By.xpath("//a[text()='here']")).click();
	
	
	fluentWait(By.xpath(".//*[@id='unme']")).sendKeys(Repository.getProperty("app_username"));
	fluentWait(By.xpath(".//*[@id='pwdt']")).sendKeys(Repository.getProperty("app_password"));
	
	fluentWait(By.xpath(".//*[@id='loginButtonExt']")).click();
	
	
	fluentWait(By.xpath("//span[text()='Case Files']")).click();
	fluentWait(By.xpath("//a[text()='Task Board']")).click();
	sleep(9);
	fluentWait(By.xpath(".//*[@id='casesTypesCombo-triggerWrap']")).click();
	fluentWait(By.xpath("//li[text()='Other Cases']")).click();
	fluentWait(By.xpath(".//*[@id='caseId']")).sendKeys(user);
	fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
	fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();
	sleep(9);
	fluentWait(By.xpath("//*[contains(@id,'workflowBtn')]")).click();
	sleep(9);
	
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
		System.out.println("no image ");
	}
	   
	   
	System.out.println("pass");
	
	fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();
	
	
	
}
	
	
	
	
}
