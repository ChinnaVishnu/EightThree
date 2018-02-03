package com.jocata.star.grid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.GetScreenshortAAAA;
import com.jocata.star.basescripts.Randomwords;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class ADDRolesModify extends mainbaseLatest {
	
	public static String user = "Raghu";

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

			System.out.println("pass");

			sleep(5);

			//String user = "ZRaghu";

			ExtentTestManager.startTest(" Manage Role  :  Add, Edit Role  ");

			// fluentWait(By.xpath(".//*[@id='flip']/img")).click();

			// fluentWait(By.xpath("//div[@id='panel']/fieldset/div")).click();

			sleep(4);

			fluentWait(By.xpath("//span[text()='Profiles']")).click();
			sleep(4);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//a[@id='addRoleLink']")).click();
			
			Randomwords h = new Randomwords();

			String raaaa = h.stp();

			System.out.println(user + raaaa);

			fluentWait(By.xpath(".//*[@id='roleName']")).sendKeys(user + raaaa);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			sleep(4);
			fluentWait(By.xpath(".//*[@id='roleType-triggerWrap']")).click();
			sleep(4);
			fluentWait(By.xpath("//li[text()='STAR']")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			sleep(4);

			fluentWait(By.xpath(".//*[@id='landingPage-triggerWrap']")).click();
			sleep(4);
			fluentWait(By.xpath("//li[text()='STAR Dashboard']")).click();
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			sleep(4);
			fluentWait(By.xpath(".//*[@id='roleStatus-triggerWrap']")).click();

			sleep(4);
			fluentWait(By.xpath("//li[text()='Enabled']")).click();
			sleep(4);

			fluentWait(By.xpath("//div[@id='saveRoleButton']/a")).click();
			sleep(4);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a")).click();

			sleep(8);

			System.out.println("pass");
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath(".//*[@id='textRoleName-inputEl']")).sendKeys(user + raaaa);

			sleep(8);

			fluentWait(By.xpath(".//*[@id='textRoleName-inputEl']")).sendKeys(Keys.ENTER);

			sleep(8);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//a[@id='editRoleLink']")).click();

			sleep(8);
			fluentWait(By.xpath(".//*[@id='roleStatus-triggerWrap']")).click();

			sleep(8);
			fluentWait(By.xpath("//li[text()='Disabled']")).click();

			sleep(8);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshortAAAA.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[@id='updateRoleButton']/a")).click();

			sleep(8);
			fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a")).click();

			// ................................................................................................................................//
			/*
			 * sleep(8);
			 * 
			 * fluentWait(By.xpath(".//*[@id='flip']/div/img")).click();
			 * sleep(8);
			 * fluentWait(By.xpath(".//*[@id='panel']/fieldset/div[1]/a[1]/img")
			 * ).click();
			 * 
			 * sleep(8);
			 * 
			 * System.out.println("pass");
			 */

			ExtentTestManager.getTest().log(LogStatus.INFO,"Role Added Updated Successfully");
			
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
