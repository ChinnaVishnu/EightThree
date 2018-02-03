package com.jocata.star.includeexculde;

import java.util.List;
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
import com.google.common.base.Predicate;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class CaseReassign extends mainbaseLatest {

	
	private static Function<WebDriver,WebElement> elementIdentified(final By locator) {
	    return new Function<WebDriver, WebElement>() {
	        @Override
	        public WebElement apply(WebDriver driver) {
	            return driver.findElement(locator);
	        }
	    };
	}
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
	public void clickcasereassign() {
		
		String user="";

		fluentWait(By.xpath("//span[text()='Case Files']")).click();

		fluentWait(By.xpath("//a[text()='Task Board']")).click();


		WebDriverWait wait = new WebDriverWait(driver,30000);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='casesTypesCombo-inputEl']")));
		
		fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();

		// .................................................................Search.......................................................//

		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

		fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();
		
		WebElement web=driver.findElement(By.xpath("//div[text()='Loading...']"));
		
		try{
			
			 if (web != null) {
			      WebDriverWait waitse = new WebDriverWait(driver, 60);
			      waitse.until(ExpectedConditions.invisibilityOfElementLocated(
			                 By.xpath("//div[text()='Loading...']"))
			            );
			        }
			
			 
			}catch(Exception e){
				System.out.println("hi");
				
			}
		

		WebDriverWait waitss = new WebDriverWait(driver,60);
		waitss.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@id,'workflowBtn')]/a")));
		waitss.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id,'workflowBtn')]/a")));
		waitss.until(elementIdentified(By.xpath("//div[contains(@id,'workflowBtn')]/a")));
		
		//fluentWait(By.xpath("//*[contains(@id,'workflowBtn')]")).click();

		WebDriverWait waitsses = new WebDriverWait(driver,60);
		waitsses.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='escalCommCombo-inputEl']")));
		fluentWait(By.xpath(".//*[@id='escalCommCombo-inputEl']")).click();

		fluentWait(By.xpath("//div[contains(@id,'boundlist-')][2]//ul/li")).click();

		fluentWait(By.xpath("//div[4]/div/div[2]/div/div/a/span/span/span[2]")).click();

		fluentWait(By.xpath("//span[text()='Re-Assign']")).click();

		fluentWait(By.xpath("//div[@id='accBrnchPanel-body']//div/div")).click();

		fluentWait(By.xpath("//a[@id='assgnBtn']")).click();

		fluentWait(By.xpath("//div[contains(@id,'messagebox-')]/a")).click();
		
		try {

			user = fluentWait(By.xpath("//div[3]/div/table/tbody/tr/td/table/tbody/tr/td[2]/div")).getText();

			System.out.println(user);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("no element");

		}
		
	fluentWait(By.xpath("//div[2]/img")).click();
	fluentWait(By.xpath(".//*[@id='casesTypesCombo-triggerWrap']")).click();
	fluentWait(By.xpath("//li[text()='My Past Cases']")).click();
	
	fluentWait(By.xpath(".//*[@id='caseId']")).sendKeys(user);
	
	fluentWait(By.xpath(".//*[@id='btnSearch']")).click();
		
		
		

	}



}
