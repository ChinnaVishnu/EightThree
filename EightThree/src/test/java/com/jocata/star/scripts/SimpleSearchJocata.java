package com.jocata.star.scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class SimpleSearchJocata extends mainbaseLatest {

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(80, TimeUnit.SECONDS)
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

	// .............................................simplesearch.....................................................................//

	@Test(priority = 5)
	public void loginsimple() {

		ExtentTestManager.startTest("  TaskBoard : Search ");

		/*
		 * driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(
		 * "l3_user");
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
		 * "Star@1234");
		 * driver.findElement(By.xpath("//span[@id='loginButtonExt-btnIconEl']")
		 * ).click()
		 */;
		clickDashboardsimple();
	}

	public void clickDashboardsimple() {

		try {

			fluentWait(By.xpath("//span[text()='Case Files']")).click();

			fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

			sleep(10);

			// ..................................................clicking the
			// activaity period..........................................//

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			WebElement elementToClick = driver.findElement(By.xpath("//input[@id='activityPeriod']"));
			// Scroll the browser to the element's Y position
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementToClick.getLocation().y + ")");
			// Click the element

			elementToClick.click();

			fluentWait(By.xpath("//li[text()='Custom Range']")).click();

			sleep(9);

			// select the data

			driver.findElement(By.xpath(".//*[@id='ext-gen1018']/div[5]/div[2]/table/thead/tr[1]/th[2]/select[2]"))
					.click();
			sleep(9);

			WebElement element = driver
					.findElement(By.xpath(".//*[@id='ext-gen1018']/div[5]/div[2]/table/thead/tr[1]/th[2]/select[2]"));
			Select select = new Select(element);
			select.selectByIndex(44);
			sleep(9);

			// driver.findElement(By.xpath("//td[text()='11']")).click();

			fluentWait(By.xpath("//button[text()='Submit']")).click();
			sleep(9);

			ExtentTestManager.getTest().log(LogStatus.PASS, " ACTIVITY PERIOD  ");

			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			sleep(9);

			List<WebElement> jocata = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement ele : jocata) {

				String text = ele.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, text);

			}

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-expand-bottom']")).click();

			fluentWait(By.xpath("//div[@class='resetButton']")).click();
			// .............................................................................................................................//
			// ........................clicking the Last Updated
			// Period..................................................................................//

			sleep(9);

			WebElement elementToLast = driver.findElement(By.xpath("//input[@id='updatedPeriodRange']"));
			// Scroll the browser to the element's Y position

			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementToLast.getLocation().y + ")");
			// Click the element
			elementToLast.click();

			fluentWait(By.xpath("//div[@class='ranges']//following::ul/li[3]")).click();

			sleep(9);

			ExtentTestManager.getTest().log(LogStatus.PASS, " LAST UPDATED PERIOD  ");

			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			sleep(9);

			List<WebElement> jocatabutton = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement elesecond : jocatabutton) {

				String textsecond = elesecond.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textsecond);

			}

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			// sleep(9);

			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-expand-bottom']")).click();
			sleep(9);

			fluentWait(By.xpath("//div[@class='resetButton']")).click();

			// .....................................CASE
			// ID................................................................................//

			fluentWait(By.xpath("//input[@id='caseId']")).sendKeys("23525");

			ExtentTestManager.getTest().log(LogStatus.PASS, " CASE ID ");

			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			sleep(9);

			List<WebElement> jocatacustomer = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement elesecondcustom : jocatacustomer) {

				String textsecondcustom = elesecondcustom.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textsecondcustom);

			}

			// String textcaseid=driver.findElement(By.xpath("//div[text()='No
			// Matching Records']")).getText();

			// ExtentTestManager.getTest().log(LogStatus.INFO, textcaseid);

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-expand-bottom']")).click();

			sleep(9);

			fluentWait(By.xpath("//div[@class='resetButton']")).click();

			// .............................clicking the
			// CustomerType.................................................................//

			fluentWait(By.xpath("//input[@id='customerTypeCombo-inputEl']")).click();

			sleep(9);

			List<WebElement> elements = driver.findElements(By.xpath("//ul/li/div"));

			for (WebElement all : elements) {

				System.out.println(all.getAttribute("data-qtip").toString());

				if (all.getAttribute("data-qtip").equals("Associations and Body of Individuals")) {

					if (!all.isSelected()) {

						all.click();
					}

				}

				if (all.getAttribute("data-qtip").equals("Business Entity")) {

					if (!all.isSelected()) {

						all.click();
					}

				}

				if (all.getAttribute("data-qtip").equals("Financial Institution")) {

					if (!all.isSelected()) {

						all.click();
					}

				}

				if (all.getAttribute("data-qtip").equals("Individual")) {

					if (!all.isSelected()) {

						all.click();
					}

				}

			}

			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			sleep(9);

			List<WebElement> jocatacustomercuu = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement elesecondcustomzz : jocatacustomercuu) {

				String textsecondcustomav = elesecondcustomzz.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textsecondcustomav);

			}

			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-expand-bottom']")).click();

			fluentWait(By.xpath("//div[@class='resetButton']")).click();

			// driver.findElement(By.xpath("//div[@class='x-boundlist
			// x-boundlist-floating x-layer x-boundlist-default
			// x-border-box']//span")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, " CUSTOMER TYPE ");

			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			sleep(9);

			List<WebElement> jocatacustomertype = driver
					.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement elesecondcustomss : jocatacustomertype) {

				String textsecondcustomdd = elesecondcustomss.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textsecondcustomdd);

			}

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-expand-bottom']")).click();

			fluentWait(By.xpath("//div[@class='resetButton']")).click();

			// .........................................clicking the Assign to
			// me...........................................................//

			fluentWait(By.xpath("//img[@id='searchAsignUsersId']")).click();

			sleep(3);

			fluentWait(By.xpath("//tbody[contains(@id,'gridview-')]/tr[8]/td/div")).click();

			// driver.findElement(By.xpath("//input[@id='userIdText-inputEl']")).sendKeys("l1_user");

			sleep(8);

			ExtentTestManager.getTest().log(LogStatus.PASS, " ASSIGNED TO ");

			WebElement elementToAssign = driver
					.findElement(By.xpath("//div[starts-with(@id,'pagingtoolbar-')]//a[6]//span"));

			elementToAssign.click();

			sleep(9);

			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			sleep(9);

			List<WebElement> jocatacustomerassign = driver
					.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement elesecondcustomassign : jocatacustomerassign) {

				String textsecondcustomassign = elesecondcustomassign.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textsecondcustomassign);

			}
			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-expand-bottom']")).click();

			fluentWait(By.xpath("//div[@class='resetButton']")).click();

			// .....................................CustomerName.....................................................................//

			fluentWait(By.xpath("//input[@id='searchCusName']")).sendKeys("ankita aaa");

			sleep(3);
			ExtentTestManager.getTest().log(LogStatus.PASS, " Customer Name ");

			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			sleep(9);

			List<WebElement> jocatacustomernamezz = driver
					.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement elesecondcustomzz : jocatacustomernamezz) {

				String textsecondcustomvvvxx = elesecondcustomzz.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textsecondcustomvvvxx);

			}

			// String textcaseid=driver.findElement(By.xpath("//div[text()='No
			// Matching Records']")).getText();

			// ExtentTestManager.getTest().log(LogStatus.INFO, textcaseid);

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-expand-bottom']")).click();

			fluentWait(By.xpath("//div[@class='resetButton']")).click();

			// ..........................................Customer
			// ID........................................................................//

			fluentWait(By.xpath("//input[@id='searchCusId']")).sendKeys("JOCATA937");

			sleep(9);

			ExtentTestManager.getTest().log(LogStatus.PASS, " CUSTOMER ID ");

			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			sleep(9);

			List<WebElement> jocatacustomerwwwww = driver
					.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement elesecondcustomsssq : jocatacustomerwwwww) {

				String textsecondcustomaaaz = elesecondcustomsssq.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textsecondcustomaaaz);

			}
			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-expand-bottom']")).click();
			sleep(9);

			fluentWait(By.xpath("//div[@class='resetButton']")).click();

			// ................................................Branuch.................................................................//

			fluentWait(By.xpath("//img[@id='searchBranchName']")).click();

			fluentWait(By.xpath("//div[@id='branchgrid-body']//td/div")).click();

			sleep(9);

			WebElement elementTobranuch = driver.findElement(By.xpath(
					"//a[@class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']/span"));
			// Scroll the browser to the element's Y position

			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementTobranuch.getLocation().y + ")");
			// Click the element
			elementTobranuch.click();

			// driver.findElement(By.xpath("//span[@id='button-1112-btnIconEl']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, " BRANCH ");

			sleep(9);
			try {

				fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

				sleep(9);
			} catch (org.openqa.selenium.NoSuchElementException e) {

				String CustomerNameBranuch = driver.findElement(By.xpath("//div[text()='No Matching Records']"))
						.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, CustomerNameBranuch);
			}

			sleep(5);

			List<WebElement> jocatacustomerbranch = driver
					.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement elesecondbranch : jocatacustomerbranch) {

				String textsecondbranch = elesecondbranch.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textsecondbranch);

			}

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-expand-bottom']")).click();

			fluentWait(By.xpath("//div[@class='resetButton']")).click();

			// ...............................................................Score.......................................................//

			sleep(9);

			fluentWait(By.xpath("//input[@id='fromCaseScore']")).sendKeys("28");

			sleep(9);

			ExtentTestManager.getTest().log(LogStatus.PASS, " SCORE ");

			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			sleep(9);

			List<WebElement> jocataScore = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement elesecondscore : jocataScore) {

				String textsecondscore = elesecondscore.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textsecondscore);

			}

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-expand-bottom']")).click();

			fluentWait(By.xpath("//div[@class='resetButton']")).click();

			// .......................................clicking the case
			// type.........................................................//

			sleep(9);

			fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();

			sleep(8);

			fluentWait(By.xpath("//li[text()='My Current Cases']")).click();

			sleep(9);

			ExtentTestManager.getTest().log(LogStatus.PASS, " CASE TYPE ");

			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			sleep(9);

			List<WebElement> jocatacasetype = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement elesecondscoretype : jocatacasetype) {

				String textcasetype = elesecondscoretype.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textcasetype);

			}

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-expand-bottom']")).click();

			fluentWait(By.xpath("//div[@class='resetButton']")).click();

			// .................................Workflow
			// Sub-Status.................................................................//
			sleep(3);

			fluentWait(By.xpath("//input[@id='workflowSubStatusCombo-inputEl']")).click();

			sleep(9);

			WebElement elementWorkflow = driver.findElement(By.xpath(
					"//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box']//span"));
			JavascriptExecutor Workflow = (JavascriptExecutor) driver;
			Workflow.executeScript("arguments[0].click();", elementWorkflow);

			sleep(3);

			ExtentTestManager.getTest().log(LogStatus.PASS, " WORKFLOW SUBSTATUS ");

			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			sleep(9);

			List<WebElement> Workflowsubstates = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement elesecondsubstates : Workflowsubstates) {

				String textsubstaes = elesecondsubstates.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textsubstaes);

			}

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-expand-bottom']")).click();

			fluentWait(By.xpath("//div[@class='resetButton']")).click();
			
			
			ExtentTestManager.getTest().log(LogStatus.INFO,	" search with all filters performed successfully"); 


		} catch (Exception e) {

			sleep(19);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.FAIL, "Simple Search Fail");

		}

	}

}
