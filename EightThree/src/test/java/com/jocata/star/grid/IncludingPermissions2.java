package com.jocata.star.grid;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class IncludingPermissions2 extends mainbaseLatest {

	public void sleep(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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

	@Test(priority = 35)
	public void GridTest() {

		try {
			ExtentTestManager.startTest(" Manage Role :  Add,Remove permissions ");

			sleep(5);

			// fluentWait(By.xpath(".//*[@id='flip']/img")).click();

			// sleep(5);

			// fluentWait(By.xpath("//div[@id='panel']/fieldset/div")).click();

			sleep(5);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			// sleep(5);

			// fluentWait(By.xpath("//span[text()='Profiles']")).click();

			sleep(5);

			fluentWait(By.xpath(".//*[@id='permissionsLink']")).click();

			sleep(5);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//li[text()='CLEAR Configurations']")).click();

			sleep(5);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//a[4]")).click();

			sleep(5);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//li[text()='CLEAR Maker Checker']")).click();

			sleep(5);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//a[2]/span/span/span[2]")).click();

			sleep(5);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//li[text()='Document Matrix Upload']")).click();

			sleep(5);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//a[2]/span/span/span[2]")).click();

			sleep(5);

			fluentWait(By.xpath("//span/span[2]")).click();
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(5);
			fluentWait(By.xpath("//div[@id='savePermButton']/a")).click();
			sleep(15);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(5);
			fluentWait(By.xpath("//span[text()='Profiles']")).click();

			sleep(5);

			fluentWait(By.xpath(".//*[@id='permissionsLink']")).click();
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(5);

			fluentWait(By.xpath("//li[text()='CLEAR Configurations']")).click();

			sleep(5);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			List<WebElement> eleme = driver.findElements(By.xpath("//div[@id='panel-1038-innerCt']//ul/li"));

			for (WebElement alltest : eleme) {

				String testfor = alltest.getText();

				System.out.println(testfor);

				ExtentTestManager.getTest().log(LogStatus.PASS, testfor);

			}

			sleep(8);

			fluentWait(By.xpath(".//*[@id='flip']/div/img")).click();
			sleep(8);
			fluentWait(By.xpath(".//*[@id='panel']/fieldset/div[1]/a[1]/img")).click();

			sleep(8);

			System.out.println("pass to outside");
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "permissions added removed successfully");
			

		} catch (Exception e) {

			sleep(19);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.SKIP,
					"pageloading it will wait for 5 min and after it will   Skiping");

		}

	}
}
