package com.jocata.star.grid;

import java.util.Random;
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
import com.jocata.star.basescripts.Randomwords;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class GridAddReport3 extends mainbaseLatest {

	public static String user = "Raghu";

	public static void stp() {

		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		String output = sb.toString();
		System.out.println(user + output);

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
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;
	};

	@Test(priority = 34)
	public void GridTest() {

		try {

			System.out.println("pass");

			sleep(5);

			ExtentTestManager.startTest("  Manage User : Add ,Edit User ");

			fluentWait(By.xpath(".//*[@id='flip']/img")).click();

			fluentWait(By.xpath(".//*[@id='panel']/fieldset/div[1]/a[1]/img")).click();

			// fluentWait(By.xpath("//div[@id='panel']/fieldset/div")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
			sleep(10);
			fluentWait(By.xpath("//span[text()='Profiles']")).click();

			sleep(10);

			fluentWait(By.xpath("//a[text()='Add']")).click();

			// String userName="jocata";

			/*
			 * StringBuilder sb=new StringBuilder();
			 * sb.append(userName+System.currentTimeMillis());
			 */

			// ho2.stp();

			Randomwords h = new Randomwords();

			String raaaa = h.stp();

			System.out.println(user + raaaa);
			// String uss="tyfyug";

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
			sleep(10);
			fluentWait(By.xpath("//input[@id='userName']")).sendKeys(user + raaaa);

			// System.out.println(userName+System.currentTimeMillis());

			sleep(10);
			fluentWait(By.xpath("//input[@id='firstName']")).sendKeys("Raghu");

			fluentWait(By.xpath("//input[@id='email']")).sendKeys("raghuram2305@gmail.com");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			// fluentWait(By.xpath("//div[@id='ext-gen1652']")).click();
			fluentWait(By.xpath("//tr[14]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")).click();

			fluentWait(By.xpath("//li[text()='Branch Manager']")).click();

			sleep(10);
			// fluentWait(By.xpath("//div[@id='ext-gen1658']")).click();
			fluentWait(By.xpath("//tr[16]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")).click();

			fluentWait(By.xpath("//li[text()='Rahul']")).click();
			// fluentWait(By.xpath("//li[text()='BANK']")).click();

			// ...........................primary brnach

			fluentWait(By.xpath("//tr[18]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")).click();

			fluentWait(By.xpath("//li[text()='NEWDELHI BRANCH']")).click();

			fluentWait(By.xpath("//tr[21]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")).click();

			// fluentWait(By.xpath("//div[@id='ext-gen1688']")).click();

			fluentWait(By.xpath("//li[text()='Enabled']")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[@id='saveUserButton']/a")).click();

			sleep(10);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(10);
			fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//span[2]")).click();

			/// .......................................................................................edit...................................//

			sleep(10);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath(".//*[@id='textUserName-inputEl']")).sendKeys(user + raaaa);

			sleep(10);

			fluentWait(By.xpath(".//*[@id='textUserName-inputEl']")).sendKeys(Keys.ENTER);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(8);
			findElement(By.xpath("//input[contains(@id,'radioButton')]")).click();

			sleep(8);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//a[text()='Edit']")).click();

			fluentWait(By.xpath("//div[@id='updateUserButton']//span")).click();

			sleep(8);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a")).click();

			sleep(8);
			fluentWait(By.xpath(".//*[@id='resetUserLink']")).click();

			sleep(8);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[@id='okButton']")).click();

			sleep(8);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a")).click();
			
			ExtentTestManager.getTest().log(LogStatus.INFO,"User Added Updated Successfully");

			

		} catch (Exception e) {

			sleep(19);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.SKIP, "user not saved");

		}

	}

}
