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

public class StarCase7Jocata extends mainbaseLatest {

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

	public void sleep(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// .....................................................................
	// StarCase7...............................................//

	// ......................................customerprofiles........................................................................//

	@Test(priority = 6)
	public void testprofiles() throws InterruptedException {

		Thread.sleep(7000);

		ExtentTestManager.startTest(" Navigate - Customer  Profile ");

		try {

			fluentWait(By.xpath("//span[text()='Case Files']")).click();

			fluentWait(By.xpath("//a[text()='Customer Profile']")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//img[@id='searchCustomerName']")).click();

			Thread.sleep(5000);

			/*
			 * List<WebElement> customers=driver.findElements(By.xpath(
			 * "//table[contains(@id,'gridview-')]/colgroup"));
			 * 
			 * for (WebElement elenew : customers) {
			 * 
			 * 
			 * String textcustomers=elenew.getText();
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO, textcustomers);
			 * 
			 * 
			 * }
			 */

			// ................................................................Search
			// for customers.........................................//

			fluentWait(By.xpath("//tr[contains(@id,'gridview-')]//div")).click();

			Thread.sleep(8000);

			WebElement elementcus = driver.findElement(By.xpath("//div[contains(@id,'pagingtoolbar-')]//div//a[6]"));

			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementcus.getLocation().x + ")");

			// Click the element

			elementcus.click();

			fluentWait(By.xpath("//a[contains(@id,'button-')]")).click();

			/*
			 * List<WebElement> customersinfor=driver.findElements(By.xpath(
			 * "//table[contains(@id,'gridview-')]/colgroup"));
			 * 
			 * for (WebElement elenewinf : customersinfor) {
			 * 
			 * 
			 * String textcusinfor=elenewinf.getText();
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO, textcusinfor);
			 * 
			 * 
			 * }
			 */

			// .....................................................................Customer Risk.......................................//

			fluentWait(By.xpath(".//*[@id='kycriskInfo_header']")).click();

			Thread.sleep(6000);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			List<WebElement> Riskcategory = driver
					.findElements(By.xpath("//table[@class='customer_risk_data_table_contant_risk']/tbody/tr"));

			for (WebElement elenrisk : Riskcategory) {

				String textriskr = elenrisk.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textriskr);

			}

			// ..........................................Customer Profile.................................................................

			fluentWait(By.xpath(".//*[@id='cusPeerHeader_header']")).click();

			Thread.sleep(6000);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			List<WebElement> allprofiles = driver.findElements(By.xpath("//tbody[@id='gridview-1966-body']/tr"));

			for (WebElement elenprofile : allprofiles) {

				String textprofiles = elenprofile.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textprofiles);

			}

			// ................................................................List of Rules................................................//

			
			  driver.findElement(By.xpath(".//*[@id='rulediv_header']")).click(
			 );
			  
			  Thread.sleep(6000);
			  
			  ExtentTestManager.getTest().log(LogStatus.INFO,
			  "Screenshortbelow :"
			  +ExtentTestManager.getTest().addScreenCapture(GetScreenshort.
			  capture(driver, "ScreenshortForExtentReport")));
			  
			  List<WebElement> allprofilesone=driver.findElements(By.xpath(
			  "//tbody[@id='gridview-1576-body']/tr"));
			  
			  for (WebElement elenones : allprofilesone) {
			  
			  
			  String textones=elenones.getText();
			  
			  ExtentTestManager.getTest().log(LogStatus.INFO, textones);
			  
			  
			  }
			 

			// ............................................................False Positives.................................................//

			fluentWait(By.xpath(".//*[@id='falsePositvesCustdiv_header']")).click();

			Thread.sleep(4000);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			String falsepostive = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, falsepostive);

			Thread.sleep(3000);

			System.out.println("This is customer profile ");

			Thread.sleep(3000);

			JavascriptExecutor jseNetworkAn = (JavascriptExecutor) driver;

			jseNetworkAn.executeScript("window.scrollBy(0,-350)", "");

			Thread.sleep(3000);

			driver.navigate().refresh();

			Thread.sleep(3000);

			System.out.println("SucessFully created a customer profiles");

			ExtentTestManager.getTest().log(LogStatus.INFO, " Customer Profile  Showing Successfully");

			
			
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
