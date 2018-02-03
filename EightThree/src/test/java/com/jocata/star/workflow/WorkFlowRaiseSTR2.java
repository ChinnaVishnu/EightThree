package com.jocata.star.workflow;

import java.io.IOException;
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

public class WorkFlowRaiseSTR2 extends mainbaseLatest {

	public static void scrollTo(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}

	// ..............Forward.......................................................................................................//
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

	@Test(priority = 11)
	public void login() throws IOException {

		ExtentTestManager.startTest("  Taskboard  : Case - Raise STR  ");

		clickDashboard();
	}

	public void clickDashboard() throws IOException {

		try {
			// sleep(14);

			sleep(10);

			fluentWait(By.xpath("//span[text()='Case Files']")).click();
			// sleep(11);

			sleep(10);

			fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

			// ..........................................................Case
			// Type............................................................//

			sleep(10);
			fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();

			sleep(10);

			// .................................................................Search.......................................................//

			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(14);

			List<WebElement> jocata = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement ele : jocata) {

				String text = ele.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, text);

			}

			fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();

			sleep(12);

			// ............................................clicking the
			// workflow...........................................................//

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			//

			fluentWait(By.xpath("//*[contains(@id,'workflowBtn')]")).click();

			sleep(10);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(10);

			WebElement elementssssd = fluentWait(By.xpath("//iframe[@id='comment-inputCmp-iframeEl']"));

			driver.switchTo().frame(elementssssd);

			driver.findElement(By.xpath("html/body")).sendKeys("HHHH");

			driver.switchTo().defaultContent();

			sleep(10);

			fluentWait(By.xpath("//div[2]/div/div/a/span/span/span[2]")).click();

			sleep(10);

			// fluentWait(By.xpath(".//*[@id='closureCommCombo-inputEl']")).click();

			// fluentWait(By.xpath("//div[contains(@id,'boundlist-')][2]//ul/li")).click();

			// fluentWait(By.xpath("//span[text()='Add Comments']")).click();

			// fluentWait(By.xpath("//div[2]/div/div/a/span/span/span[2]")).click();

			// sleep(10);

			fluentWait(By.xpath("//div[@id='strSearch_header-innerCt']//img")).click();

			/*
			 * ((JavascriptExecutor) driver) .executeScript(
			 * "window.scrollTo(0, document.body.scrollHeight)");
			 */

			sleep(10);
			WebElement elementse = driver.findElement(By.xpath("//div[contains(@id,'window-')]"));

			/*
			 * Actions action=new Actions(driver);
			 * 
			 * action.moveToElement(elementse).sendKeys(Keys.DOWN).build().
			 * perform();
			 */

			scrollTo(driver, elementse);

			scrollTo(driver, elementse);

			sleep(15);
			WebElement elementssss = driver.findElement(By.xpath("//iframe[@id='narrative-inputCmp-iframeEl']"));

			driver.switchTo().frame(elementssss);

			driver.findElement(By.xpath("html/body")).sendKeys("sfadsef");

			driver.switchTo().defaultContent();
			sleep(15);
			driver.findElement(By.xpath("//div/div/div/div/div/div[2]/div/a[2]/span/span/span")).click();

			sleep(15);
			WebElement elementzzzz = driver.findElement(By.xpath("//iframe[@id='summary-inputCmp-iframeEl']"));

			driver.switchTo().frame(elementzzzz);

			driver.findElement(By.xpath("html/body")).sendKeys("sfadsefaaaa");

			sleep(15);

			driver.switchTo().defaultContent();

			sleep(15);

			fluentWait(By.linkText("Save")).click();

			// fluentWait(By.xpath("//span[4]/a")).click();

			fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[1]")).click();

			sleep(15);

			// ...............................................clicking the
			// WorkFLow.....................................................//

			fluentWait(By.xpath("//div[2]/div/div/ul/li/a/span")).click();
			sleep(10);

			fluentWait(By.xpath("//li[4]/a/span[2]")).click();
			sleep(10);

			fluentWait(By.xpath("//li/ul/li[4]/ul/li[4]/a")).click();

			sleep(10);
			fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[2]")).click();

			sleep(79);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			JavascriptExecutor jse = (JavascriptExecutor) driver;

			jse.executeScript("window.scrollBy(0,900)", "");

			fluentWait(By.xpath("//a[contains(@id,'closeBn')]")).click();

			sleep(4);

			JavascriptExecutor jseramm = (JavascriptExecutor) driver;
			jseramm.executeScript("scroll(0, -650);");

			ExtentTestManager.getTest().log(LogStatus.INFO,
					" Workflow and Disposition : Raise STR SucessFully completed  ");
			System.out.println("Sucess");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Raised STR Sucessfully");

			
			/*
			 * fluentWait(By.xpath("//div[2]/div/div[2]/div/div/a")).click();
			 * sleep(15);
			 * fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a")).
			 * click();
			 * 
			 * sleep(10);
			 * 
			 * fluentWait(By.xpath("//span[4]/a")).click();
			 * 
			 * fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a[2]")).
			 * click();
			 * 
			 */

			/*
			 * sleep(79);
			 * 
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO,
			 * "Screenshortbelow :"
			 * +ExtentTestManager.getTest().addScreenCapture(GetScreenshort.
			 * capture(driver, "ScreenshortForExtentReport")));
			 * 
			 * 
			 * JavascriptExecutor jse = (JavascriptExecutor)driver;
			 * 
			 * jse.executeScript("window.scrollBy(0,900)", "");
			 * 
			 * 
			 * fluentWait(By.xpath("//a[contains(@id,'closeBn')]")).click();
			 * 
			 * 
			 * sleep(4);
			 * 
			 * 
			 * 
			 * 
			 * JavascriptExecutor jseramm = (JavascriptExecutor)driver;
			 * jseramm.executeScript("scroll(0, -650);");
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO,
			 * " Workflow and Disposition : Raise STR SucessFully completed  ");
			 * System.out.println("Sucess");
			 */

		} catch (Exception e) {

			sleep(19);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.FAIL,
					"Changeing The Workflow ");

		}

	}
}