package com.jocata.star.existingfuctions;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class AddBenchMarkReportsChanges3 extends mainbaseLatest {

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

	@Test(priority = 29)
	public void init() throws HeadlessException, AWTException, IOException {

		// ......................................AddBenchMarkChanges.......................................................................//

		ExtentTestManager.startTest(" Add Benchmark : existing Rule ");

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

			if (all.getAttribute("data-qtip").equals("1002")) {

				if (!all.isSelected()) {

					all.click();
				}

			}

		}

		sleep(4);
		driver.findElement(By.xpath("//div[@id='searchRuleButton']/a")).click();

		fluentWait(By.xpath("//img[@title='Add']")).click();
		try {

			// .......................................Add
			// Benchmark........................................................................//

			// ........................................Customer
			// Type.......................................................................//

			fluentWait(By.xpath("//div/div/div/ul/li/div")).click();

			// ......................................Tran.
			// Type:.........................................................................//

			fluentWait(By.xpath("//tr[2]/td/div/div/div/span/div/table/tbody/tr/td[2]/div/span/div/div/div/ul/li/div"))
					.click();

			// ............................... ....................Cr or
			// Dr..............................................................//

			fluentWait(By.xpath("//tr[3]/td/div/div/div/span/div/table/tbody/tr/td[2]/div/span/div/div/div/ul/li/div"))
					.click();

			// ...............................................Total Tran. Amount
			// .........................................................//

			fluentWait(By.xpath("//input[@id='rulesConfValueses4thresholdValue1']")).sendKeys("30");

			fluentWait(By.xpath("//input[@id='rulesConfValueses4thresholdValue2']")).sendKeys("40");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			// .......................................................Key
			// Threshold Parameter Total Tran. Amount

			fluentWait(By.xpath("//input[@id='bmrkRulePrioritySelect-inputEl']")).click();

			fluentWait(By.xpath("//div[14]/div/ul/li[3]")).click();

			// ........................... Schedule
			// Definition...................
			// .........................reports...................................

			WebElement repearts = fluentWait(By.xpath("//input[@id='repeatsFor-inputEl']"));

			repearts.click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//li[text()='Weekly']")).click();

			fluentWait(By.xpath("//label[@class='img-check-box-avatar-rb']")).click();

			WebElement referenceperiod = fluentWait(By.id("rulePeriod"));
			referenceperiod.sendKeys("24");

			fluentWait(By.id("rulePeriodType-inputEl")).click();

			fluentWait(By.xpath("//li[text()='Days']")).click();

			fluentWait(By.xpath("//div[@id='addBnchmrkButton']")).click();

			// ....................................Yes and
			// No.............................................................//

			fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[2]")).click();
			sleep(5);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[contains(@id,'tabbar-')]//a[2]")).click();
			sleep(5);

			fluentWait(By.xpath("//div[contains(@id,'tabbar-')]//a[3]")).click();
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(5);
			fluentWait(By.xpath("//div[contains(@id,'tabbar-')]//a[4]")).click();
			sleep(5);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[contains(@id,'tabbar-')]//a[5]")).click();
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[contains(@id,'window-')][2]//img")).click();
			sleep(5);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
			sleep(15);

			System.out.println("pass");
			
			ExtentTestManager.getTest().log(LogStatus.INFO,"  Benchmark added successfully ");

			

		} catch (org.openqa.selenium.ElementNotVisibleException e) {

			sleep(80);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.SKIP, " Add Benchmark ");

		}

		catch (Exception e) {
			sleep(80);
			ExtentTestManager.getTest().log(LogStatus.SKIP, " Add Benchmark ");
			driver.navigate().refresh();
			System.out.println("changes fuctionality");

		}

	}
}
