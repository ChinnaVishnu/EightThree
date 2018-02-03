package com.jocata.star.scripts;

import java.util.List;
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

public class StarCase8Jocata extends mainbaseLatest {

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

	// ................................................................Starcase8.....................................................//

	// .......................... . . . . . . . Network
	// Analysis.......................................................//

	@Test(priority = 7)
	public void test() throws InterruptedException {

		Thread.sleep(4000);

		ExtentTestManager.startTest("  Network  Analysis  :  NetWork Summary ");

		try {

			fluentWait(By.xpath("//span[text()='Case Files']")).click();

			Thread.sleep(7000);

			fluentWait(By.xpath("//a[text()='Network Analysis']")).click();

			Thread.sleep(7000);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			String Network = driver.findElement(By.xpath("//div[text()='Network Graph']")).getText();

			// ExtentExtentTestManager.getTest()Manager.getExtentTestManager.getTest()().log(LogStatus.INFO,
			// Network);
			ExtentTestManager.getTest().log(LogStatus.INFO, Network);

			fluentWait(By.xpath("//img[@id='searchCustomerName']")).click();

			Thread.sleep(7000);

			List<WebElement> RuleLibrary = driver.findElements(By.xpath("//tbody[@id='gridview-1018-body']//tr"));

			for (WebElement eleRuleLibrary : RuleLibrary) {

				String texteleRuleLibrary = eleRuleLibrary.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, texteleRuleLibrary);

			}

			fluentWait(By.xpath("//tr[contains(@id,'gridview-')]//div")).click();

			fluentWait(By.xpath("//div[contains(@id,'pagingtoolbar-')]//div//a[6]")).click();

			fluentWait(By.xpath("//a[contains(@id,'button-')]")).click();

			Thread.sleep(15000);
			// ..........................................clicking the
			// NetworkGraph .......................................

			// String Graph =driver.findElement(By.xpath("//div[text()='John
			// Wright']")).getText();

			// ExtentTestManager.getTest().log(LogStatus.INFO, Graph );
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath(".//*[@id='infovis-canvas']")).click();

			Thread.sleep(16000);

			fluentWait(By.xpath("//div//div[@id='rightclick-menu']")).click();

			try {

				fluentWait(By.xpath("//a[text()='Network Summary']")).click();

				String Networksummary = driver.findElement(By.xpath("//a[text()='Network Summary']")).getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, Networksummary);

				Thread.sleep(9000);

				List<WebElement> allprofilesone = driver
						.findElements(By.xpath("//div[@id='rightclick-menu']/ul//li/a"));

				for (WebElement elenones : allprofilesone) {

					String textones = elenones.getText();

					ExtentTestManager.getTest().log(LogStatus.INFO, textones);

				}

				Thread.sleep(9000);

			} catch (org.openqa.selenium.ElementNotVisibleException e) {

				String Summary = driver.findElement(By.xpath("//span[text()='Network Summary']")).getText();
				ExtentTestManager.getTest().log(LogStatus.INFO, Summary);

				String CustomerId = driver.findElement(By.xpath("//div[@id='networkSummaryDetails_table']//tr[2]"))
						.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, CustomerId);

				String BusinessCompany = driver.findElement(By.xpath("//tr[contains(@id,'gridview-')]")).getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, BusinessCompany);

				Thread.sleep(9000);
				driver.findElement(By.xpath("//img[contains(@id,'tool-')]")).click();

				System.out.println("Sucess ");

				Thread.sleep(2000);

				System.out.println("This is customer profile ");

				Thread.sleep(2000);

				JavascriptExecutor jseNetworkAn = (JavascriptExecutor) driver;

				jseNetworkAn.executeScript("window.scrollBy(0,-350)", "");

				Thread.sleep(2000);

				System.out.println("NetWork Summary Showing Successfully");
				
				ExtentTestManager.getTest().log(LogStatus.INFO, " NetWork Summary Showing Successfully");

			}

		} catch (Exception e) {

			sleep(19);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.FAIL, "text area missing");

		}

	}

}
