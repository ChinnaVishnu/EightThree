package com.jocata.star.workflow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class VerifyAdddelete extends mainbaseLatest{

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
	
	
	@Test
	public void clickadddelete(){
		
		fluentWait(By.xpath("//span[text()='Case Files']")).click();
		
		fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();
		
		By loadingImage = By.xpath("//div[text()='Loading...']");

		long timeOutInSeconds =9000;
		
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		
		fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();
		
		fluentWait(By.xpath("//li[text()='My Past Cases']")).click();
		
		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
		
		fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();
		
		fluentWait(By.xpath("//div[contains(@id,'workflowBtn')]/a")).click();
		
		fluentWait(By.xpath("//div[2]/div/div/a")).click();
		
		
		
	}
	
	
	
	
}
