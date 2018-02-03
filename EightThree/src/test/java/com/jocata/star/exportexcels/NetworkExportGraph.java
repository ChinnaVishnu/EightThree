package com.jocata.star.exportexcels;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class NetworkExportGraph extends mainbaseLatest {

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS)
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

	@Test(priority = 32)
	public void login() throws HeadlessException, AWTException, IOException {

		clickDashboard();
	}

	public void clickDashboard() throws HeadlessException, AWTException, IOException {

		ExtentTestManager.startTest(" Export  :  NetWork Summary ");

		fluentWait(By.xpath("//span[text()='Case Files']")).click();

		try {

			fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

			// ..........................................................Case
			// Type............................................................//

			sleep(9);
			fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();

			sleep(8);
			fluentWait(By.xpath("//li[text()='Other Cases']")).click();

			// .................................................................Search.......................................................//

			sleep(8);
			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
			sleep(8);
			fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();

			sleep(20);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.findElement(By.xpath(".//*[@id='graph']")).click();

			sleep(22);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.findElement(By.xpath("//a[text()='Network Summary Export']")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a")).click();

			sleep(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;

			jse.executeScript("scroll(0, -450);");

			sleep(10);
			fluentWait(By.xpath("//div[contains(@id,'window-')]//img")).click();

			System.out.println("pass");
			
			ExtentTestManager.getTest().log(LogStatus.INFO," NetWork Summary exported successfully ");

			
			
		} catch (org.openqa.selenium.ElementNotVisibleException e) {

			sleep(80);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.SKIP, " Network Graph close button getting not visible");

		} catch (Exception e) {
			sleep(40);
			driver.navigate().refresh();
			ExtentTestManager.getTest().log(LogStatus.ERROR, " Network Graph close button getting not visible");
		}

	}
}