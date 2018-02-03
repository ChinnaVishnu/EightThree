package com.jocata.star.RunStar;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

public class AddBenchMark_01 extends mainbaseLatest {

	
	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;
	};

	public void sleep(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 1)
	public void init() throws HeadlessException, AWTException, IOException {

		// ......................................AddBenchMarkChanges.......................................................................//

		ExtentTestManager.startTest("  Add Benchmark ");

		clickAddbench();
	}

	public void clickAddbench() throws HeadlessException, AWTException, IOException {

		fluentWait(By.xpath("//span[text()='Rules and Patterns']")).click();
		WebElement element = fluentWait(By.xpath("//a[text()='Rule Library']"));

		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		sleep(3);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		// .........................................Clicking the Search
		// Button.......................................................//

		fluentWait(By.xpath("//table[@id='rulesIdCombo-triggerWrap']")).click();

		List<WebElement> elements = driver.findElements(By.xpath("//ul/li/div"));

		for (WebElement all : elements) {

			System.out.println(all.getAttribute("data-qtip").toString());

			if (all.getAttribute("data-qtip").equals("1104")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

		}

		sleep(4);

		fluentWait(By.xpath("//div[@id='searchRuleButton']/a")).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("//img[@title='Add']")).click();

		sleep(8);

		// ....................................Account
		// Age...............................................................................//
		try {

			fluentWait(By.xpath(".//*[@id='rulesConfValueses1thresholdValue1']")).sendKeys("25");

			fluentWait(By.xpath(".//*[@id='rulesConfValueses1thresholdValue2']")).sendKeys("35");

			// .......................................Merchant Type:
			fluentWait(By.xpath("//div/div/div/ul/li/div")).click();

			fluentWait(By.xpath("//tr[3]/td/div/div/div/span/div/table/tbody/tr/td[2]/div/span/div/div/div/ul/li/div"))
					.click();


			// ................................Schedule
			// Definition...................................................................//

			fluentWait(By.xpath("//td[3]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")).click();

			fluentWait(By.xpath("//li[text()='Weekly']")).click();

			fluentWait(By.xpath("//div[@id='ruleEveryForWeekly']/label")).click();

			sleep(7);
			WebElement referenceperiod = fluentWait(By.id("rulePeriod"));
			referenceperiod.sendKeys("24");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		

			fluentWait(By.id("rulePeriodType-inputEl")).click();

			fluentWait(By.xpath("//li[text()='Days']")).click();

			fluentWait(By.xpath("//div[@id='addBnchmrkButton']")).click();

			try {
				WebElement elementnn = fluentWait(By.xpath("//div[contains(@id,'-toolbar')]//div//a[3]"));

				// JavascriptExecutor js =(JavascriptExecutor)driver;
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementnn.getLocation().y + ")");
				elementnn.click();

				sleep(6);
				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
						.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			} catch (org.openqa.selenium.NoSuchElementException e) {

				System.out.println("no element");

			}

			try {
				fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a")).click();

				String Addbench = fluentWait(By.xpath("//tr[@id='gridview-1038-record-ext-record-7']")).getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, " Add Benchmark ");

				ExtentTestManager.getTest().log(LogStatus.PASS, Addbench);

			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("no element");

				ExtentTestManager.getTest().log(LogStatus.SKIP, " MISSING WINDOW POPUP ");

			} catch (org.openqa.selenium.WebDriverException e) {
				System.out.println("hi");

			}

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			System.out.println("This is Create a New Bench Mark");

			sleep(4);

			JavascriptExecutor jseNetworkAn = (JavascriptExecutor) driver;

			jseNetworkAn.executeScript("window.scrollBy(0,-900)", "");

			sleep(4);

			System.out.println("SucessFully created a bench mark");
			
			
	String createddate=	driver.findElement(By.xpath("//tr[2]/td/table/tbody/tr/td[7]/div")).getText();
			System.out.println(createddate);//10/10/15
			ExtentTestManager.getTest().log(LogStatus.INFO,  " Benchmark Added By  "+createddate);	
			 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
			Date date = formatter.parse(createddate);
			Calendar c = Calendar.getInstance(); 
			c.setTime(date); 
			c.add(Calendar.DATE, 0);
			date = c.getTime();
			  String Todaydate=      formatter.format(date);
		      System.out.println(" Today "+ Todaydate);
		      
		      
		  	if (createddate.equals(Todaydate)) {
				System.out.println("pass");
				ExtentTestManager.getTest().log(LogStatus.PASS,  " Benchmark Added Successfully ");
				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
				
				
			}else{
				System.out.println("fail;");
				
				ExtentTestManager.getTest().log(LogStatus.FAIL,  " Benchmark not  added  ");
				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			fluentWait(By.xpath("//tr[2]/td/table/tbody/tr/td[10]/div/a[2]/img")).click();
			sleep(4);
			fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a[2]")).click();
			sleep(4);
			fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();
			
			
		//	ExtentTestManager.getTest().log(LogStatus.INFO,  " Benchmark Added Successfully ");

		
			
			
			
			

		} catch (Exception e) {

			sleep(19);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.FAIL, "Add Bench Mark Missing Mark");

		}

	}
	
	
}
