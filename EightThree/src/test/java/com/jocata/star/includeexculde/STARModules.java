package com.jocata.star.includeexculde;

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
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class STARModules extends mainbaseLatest {

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
	
	

	@Test(priority = 37)
public void clickingStarmodules(){
	
	ExtentTestManager.startTest("  Manage Role :  Add,Remove permissions with STAR Modules  ");
	
	/*fluentWait(By.xpath(".//*[@id='flip']/img")).click();

	fluentWait(By.xpath("//div[@id='panel']/fieldset/div")).click();

	fluentWait(By.xpath("//span[text()='Profiles']")).click();*/
	
	sleep(5);
	
	//fluentWait(By.xpath("//span[text()='Profiles']")).click();

	//fluentWait(By.xpath(".//*[@id='permissionsLink']")).click();
	
	
	
	//............................................Administration...............................................................//
	
	fluentWait(By.xpath("//li[text()='Administration']")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	
	//...............................CENTRA - CCR Data..........................................................................//
	sleep(2);
	fluentWait(By.xpath("//li[text()='CENTRA - CCR Data']")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	//.........................Case Assignment................................................................................//
	sleep(2);
	
	fluentWait(By.xpath("//li[text()='Case Assignment']")).click();
	
	
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	sleep(2);
	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	
	//....................................................Case Files..........................................................//
	fluentWait(By.xpath("//li[text()='Case Files']")).click();
	
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	sleep(2);
	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	//..................................CaseMovement..........................................................................//
	fluentWait(By.xpath("//li[text()='Case Movement']")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(10);
	
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	sleep(2);
	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	//.................................Cash Transaction Reports.................................................................//
	
	
	fluentWait(By.xpath("//li[text()='Cash Transaction Reports']")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	sleep(2);
	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	//........................................Counterfeit Currency Report........................................................//
	
	fluentWait(By.xpath("//li[text()='Counterfeit Currency Report']")).click();
	
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(10);
	
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	sleep(2);
	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	
	//............................................................Cross Border Wire Transfer Report...............................//
	
	fluentWait(By.xpath("//li[text()='Cross Border Wire Transfer Report']")).click();
	
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	sleep(2);
	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	
	//..................................Dashboard................................................................................//
	fluentWait(By.xpath("//div[@id='starMultiselect-field-innerCt']//ul//li[9]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	sleep(2);
	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	
	
	
	//................................................Disposition and Narrative.................................................//
	
	fluentWait(By.xpath("//li[text()='Disposition and Narrative']")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
	sleep(2);
	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	
	//.................................................False Positives......................................................//
	
	fluentWait(By.xpath("//li[text()='False Positives']")).click();
	
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	//..............................................MIS Reports...........................................................//
	
	fluentWait(By.xpath("//li[text()='MIS Reports']")).click();
	
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	
	//.............................MIS Reports List...........................................................................//
	
	fluentWait(By.xpath("//li[text()='MIS Reports List']")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	//...........................................Network Analysis............................................................//
	
	fluentWait(By.xpath("//li[text()='Network Analysis']")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	
	
	//...........................................Non-Profit Organization Transaction Report............................................................//

	fluentWait(By.xpath("//li[text()='Non-Profit Organization Transaction Report']")).click();
	
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	//...........................................Other Reports............................................................//

	fluentWait(By.xpath("//li[text()='Other Reports']")).click();
	
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	
	//.............................................Pattern Library.........................................................//
	
	fluentWait(By.xpath("//li[text()='Pattern Library']")).click(); 
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	//.....................................Peer Grouping...................................................................//
	
	fluentWait(By.xpath("//li[text()='Peer Grouping']")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	
	//..................................................Rule Builder........................................................//
	
	fluentWait(By.xpath("//li[text()='Rule Builder']")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	sleep(10);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();

	  WebDriverWait wait = new WebDriverWait(driver,3000000);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@id,'messagebox')]/a")));
	  sleep(10);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
		.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	
	//............................................................Rule Library...........................................................//
	
	fluentWait(By.xpath("//li[text()='Rule Library']")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	
	//................................................RuleSimulation..........................................................//
	
	fluentWait(By.xpath("//li[text()='Rule Simulation']")).click();
	
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	
	//..........................................Suspicious Transaction Reports................................................//
	
	fluentWait(By.xpath("//li[text()='Suspicious Transaction Reports']")).click();
	
	
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	//..........................................Task Board................................................//

	fluentWait(By.xpath("//li[text()='Task Board']")).click();
	
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	//.............................Verification Role..........................................................................//
	
	fluentWait(By.xpath("//li[text()='Verification Role']")).click();
	

	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	
	//......................................Verification Workflow Role.....................................................//
	
	fluentWait(By.xpath("//li[text()='Verification Workflow Role']")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	
	//........................................'Workflow.....................................................................//
	fluentWait(By.xpath("//li[text()='Workflow']")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a/span/span/span[2]")).click();
	sleep(2);
	fluentWait(By.xpath("//tr[2]/td[3]/div/div/div/table/tbody/tr/td[2]/div/div/div/div/div/div/a[4]")).click();
	sleep(2);
	fluentWait(By.xpath("//div[2]/a/span/span/span[2]")).click();
	sleep(2);
	sleep(10);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
	.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	sleep(2);
	ExtentTestManager.getTest().log(LogStatus.INFO,"STAR Modules Including and Excluding permissions performed Sucessfully");
	
	sleep(8);

	fluentWait(By.xpath(".//*[@id='flip']/div/img")).click();
	sleep(8);
	fluentWait(By.xpath(".//*[@id='panel']/fieldset/div[1]/a[1]/img")).click();

	sleep(8);

	System.out.println("pass to outside");
	
	
}
	
	
	
	
}
