package com.jocata.star.scripts;

import java.io.IOException;
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

public class StarNavigationJocata extends mainbaseLatest {

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

	// .........................................................................StarNavigation......................................//

	@Test(priority = 8)
	public void loginNavigation() throws IOException {

		ExtentTestManager.startTest("  STAR Navigation ");

		// driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("l3_user");
		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Star@1234");
		// driver.findElement(By.xpath("//span[@id='loginButtonExt-btnIconEl']")).click();
		clickDashboardNavigation();
	}

	public void clickDashboardNavigation() throws IOException {

		// .............................Rules and
		// pattern...........................................................................//

		try {

			sleep(6);

			fluentWait(By.xpath("//span[text()='Rules and Patterns']")).click();
			sleep(3);

			fluentWait(By.xpath("//a[text()='Rule Builder']")).click();
			sleep(3);

			ExtentTestManager.getTest().log(LogStatus.PASS, "RULES AND PATTERN : RULE BULIDER");

			List<WebElement> rulebulider = driver.findElements(By.xpath("//form[@id='ruleBuilderForm']/div/div"));

			for (WebElement elerulebulider : rulebulider) {

				String texteleRulebulider = elerulebulider.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, texteleRulebulider);

			}

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			// String screenshortpath=GetScreenshort.capture(driver,
			// "ScreenshortForExtentReport");

			// ExtentTestManager.getTest().addScreenCapture(screenshortpath);
			// ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow
			// :"+ExtentTestManager.getTest().addScreenCapture(screenshortpath));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			sleep(3);

			fluentWait(By.xpath("//span[text()='Rules and Patterns']")).click();

			fluentWait(By.xpath("//a[text()='Rule Library']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, "RULES AND PATTERN : RULE LIBRARY");

			List<WebElement> RuleLibrary = driver.findElements(By.xpath("//div[@id='content']/div[2]"));

			for (WebElement eleRuleLibrary : RuleLibrary) {

				String texteleRuleLibrary = eleRuleLibrary.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, texteleRuleLibrary);

			}

			// String screenshortpathruleLibaray=GetScreenshort.capture(driver,
			// "ScreenshortForExtentReport");

			// ExtentTestManager.getTest().addScreenCapture(screenshortpath);
			// ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow
			// :"+ExtentTestManager.getTest().addScreenCapture(screenshortpathruleLibaray));

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			/*
			 * fluentWait(By.xpath("//span[text()='Rules and Patterns']"
			 * )).click();
			 * 
			 * 
			 * 
			 * fluentWait(By.xpath("//a[text()='Peer Grouping']")).click();
			 * 
			 * sleep(38);
			 */

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//span[text()='Rules and Patterns']")).click();

			fluentWait(By.xpath("//a[text()='Rule Simulator']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, "RULE SIMULATION ");

			String RuleSimulation = driver.findElement(By.xpath("//td[text()='Rule Name']")).getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, RuleSimulation);

			String BenchMarkId = driver.findElement(By.xpath("//td[text()='Benchmark ID']")).getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, BenchMarkId);

			String SimuylationGroup = driver.findElement(By.xpath("//td[text()='Simulation Group ID']")).getText();
			ExtentTestManager.getTest().log(LogStatus.INFO, SimuylationGroup);

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			driver.findElement(By.xpath("//span[text()='Dashboard']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, "DASHBOARD ");

			String Investigation = driver.findElement(By.xpath("//span[text()='Investigation Summary']")).getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, Investigation);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			// ........................click the
			// casefiles...........................................................................//

			// driver.findElement(By.xpath("//span[text()='Case
			// Files']")).click();

			//

			// driver.findElement(By.xpath("//a[text()='User
			// Mapping']")).click();

			// ExtentTestManager.getTest().log(LogStatus.PASS, " USER MAPPING
			// ");

			/*
			 * String
			 * Users=driver.findElement(By.xpath("//span[text()='Users']")).
			 * getText();
			 * 
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO, Users);
			 * 
			 * 
			 * String
			 * Selected=driver.findElement(By.xpath("//span[text()='Selected']")
			 * ).getText();
			 * 
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO, Selected);
			 * 
			 * 
			 * 
			 * 
			 * String Available=driver.findElement(By.xpath(
			 * "//span[text()='Available']")).getText();
			 * 
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO, Available);
			 * 
			 * 
			 * 
			 * List<WebElement>usermappinglist=driver.findElements(By.xpath(
			 * "//ul[@class='x-list-plain']/li"));
			 * 
			 * 
			 * for (WebElement eleusermapp : usermappinglist) {
			 * 
			 * 
			 * String textusermapping=eleusermapp.getText();
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO, textusermapping);
			 * 
			 * 
			 * }
			 * 
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO,
			 * "Screenshortbelow :"
			 * +ExtentTestManager.getTest().addScreenCapture(GetScreenshort.
			 * capture(driver, "ScreenshortForExtentReport")));
			 * 
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO,
			 * "***************************************************************************************"
			 * );
			 * 
			 */

			//
			//
			//
			// driver.findElement(By.xpath("//span[text()='Case
			// Files']")).click();
			//
			//
			// driver.findElement(By.xpath("//a[text()='Add Manual
			// Event']")).click();
			//
			// ExtentTestManager.getTest().log(LogStatus.PASS, " ADD MANUAL
			// EVENT ");
			//
			//
			//
			//
			// List<WebElement>AddManualEvent=driver.findElements(By.xpath("//form[@id='addManualEvent']//tr"));
			//
			//
			// for (WebElement eleAdd : AddManualEvent) {
			//
			//
			// String textAddmanual=eleAdd.getText();
			//
			// ExtentTestManager.getTest().log(LogStatus.INFO, textAddmanual);
			//
			//
			// }
			//
			//
			//
			// ExtentTestManager.getTest().log(LogStatus.INFO,
			// "***************************************************************************************");
			//
			//
			//
			//
			//
			//
			//

			fluentWait(By.xpath("//span[text()='Case Files']")).click();

			fluentWait(By.xpath("//a[text()='Case Assignment']")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, " CASE ASSIGNMENT ");

			String Usersassign = driver.findElement(By.xpath("//span[text()='Users']")).getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, Usersassign);

			String Selectedassign = driver.findElement(By.xpath("//span[text()='Selected']")).getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, Selectedassign);

			String Availableassign = driver.findElement(By.xpath("//span[text()='Available']")).getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, Availableassign);

			List<WebElement> caseAssisgmnent = driver.findElements(By.xpath("//ul[@class='x-list-plain']/li"));

			for (WebElement eleusermappassign : caseAssisgmnent) {

				String textuseassign = eleusermappassign.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textuseassign);

			}

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//span[text()='Case Files']")).click();

			fluentWait(By.xpath("//a[text()='Task Board']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, " TASK BOARD ");

			String Activity = driver.findElement(By.xpath("//label[text()='Activity Period']")).getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, Activity);

			String Last = driver.findElement(By.xpath("//label[text()='Last Updated Period']")).getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, Last);

			String Case = driver.findElement(By.xpath("//label[text()='Case ID']")).getText();
			ExtentTestManager.getTest().log(LogStatus.INFO, Case);

			String Customer = driver.findElement(By.xpath("//label[text()='Customer Type']")).getText();
			ExtentTestManager.getTest().log(LogStatus.INFO, Customer);

			String Assigned = driver.findElement(By.xpath("//label[text()='Assigned To']")).getText();
			ExtentTestManager.getTest().log(LogStatus.INFO, Assigned);

			String Name = driver.findElement(By.xpath("//label[text()='Customer Name']")).getText();
			ExtentTestManager.getTest().log(LogStatus.INFO, Name);

			String ID = driver.findElement(By.xpath("//label[text()='Customer ID']")).getText();
			ExtentTestManager.getTest().log(LogStatus.INFO, ID);

			String Branch = driver.findElement(By.xpath("//label[text()='Branch']")).getText();
			ExtentTestManager.getTest().log(LogStatus.INFO, Branch);

			String Score = driver.findElement(By.xpath("//label[text()='Score']")).getText();
			ExtentTestManager.getTest().log(LogStatus.INFO, Score);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//span[text()='Case Files']")).click();

			fluentWait(By.xpath("//a[text()='False Positives']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, " FALSE POSITIVE");

			List<WebElement> falseposiitve = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement eleusefalsepositive : falseposiitve) {

				String textfalseposiitve = eleusefalsepositive.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textfalseposiitve);

			}

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			/*
			 * fluentWait(By.xpath("//span[text()='Case Files']")).click();
			 * 
			 * 
			 * 
			 * fluentWait(By.xpath("//a[text()='Case Audit']")).click();
			 * 
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.PASS, "CASE AUDIT");
			 * 
			 * String CaseAudit=driver.findElement(By.xpath(
			 * "//h4[text()='Sorry. Server could not locate the page you were looking for. Please try again. You may contact the administrator if the problem persists.']"
			 * )).getText();
			 * 
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO, CaseAudit);
			 * 
			 * 
			 * fluentWait(By.xpath("//a[text()='here']")).click();
			 * 
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO,
			 * "Screenshortbelow :"
			 * +ExtentTestManager.getTest().addScreenCapture(GetScreenshort.
			 * capture(driver, "ScreenshortForExtentReport")));
			 * 
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO,
			 * "***************************************************************************************"
			 * );
			 * 
			 * 
			 * 
			 */

			fluentWait(By.xpath("//span[text()='Case Files']")).click();

			fluentWait(By.xpath("//a[text()='Customer Profile']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, " CUSTOMER PROFILE ");

			String Customerprofile = driver.findElement(By.xpath(".//*[@id='container']/div[2]/div[2]/label"))
					.getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, Customerprofile);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//span[text()='Case Files']")).click();

			fluentWait(By.xpath("//a[text()='Network Analysis']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, " NETWORK ANALYSIS ");

			String NetworkAnalysis = driver.findElement(By.xpath("//div[text()='Network Graph']")).getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, NetworkAnalysis);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//span[text()='Case Files']")).click();

			fluentWait(By.xpath("//a[text()='Transaction Details']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, " TRANSACTION DETAILS ");

			String Transactiondetails = driver.findElement(By.xpath("//td[text()='Customer ID']")).getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, Transactiondetails);

			String ActivityPeriod = driver.findElement(By.xpath("//td[text()='Activity Period']")).getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, ActivityPeriod);

			String Branchsecond = driver.findElement(By.xpath("//td[text()='Branch']")).getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, Branchsecond);

			/*
			 * 
			 * List<WebElement>TRANSACTION=driver.findElements(By.xpath(
			 * "//table[contains(@id,'gridview-')]/colgroup"));
			 * 
			 * 
			 * for (WebElement eleuseTRANSACTION : TRANSACTION) {
			 * 
			 * 
			 * String texteleuseTRANSACTION=eleuseTRANSACTION.getText();
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO,
			 * texteleuseTRANSACTION);
			 * 
			 * 
			 * }
			 */

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//span[text()='Case Files']")).click();

			fluentWait(By.xpath("//a[text()='Case Re-allocation']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, " CASE REALLOCATION ");

			sleep(4);

			String caseReallocation = driver.findElement(By.xpath("//b[text()='Users Available for Reallocation ']"))
					.getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, caseReallocation);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			// ...........................................................click
			// on the CENTRA..........................................//

			fluentWait(By.xpath("//span[text()='CENTRA']")).click();

			fluentWait(By.xpath("//a[text()='Regulatory Reports']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, " REGULATORY REPORTS ");

			/*
			 * String RegulatoryReports=driver.findElement(By.xpath(
			 * "//span[text()='Suspicious Transaction Reports']")).getText();
			 * 
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO,
			 * RegulatoryReports);
			 */

			List<WebElement> LABELALLREP = driver.findElements(By.xpath("//div/label"));

			for (WebElement eleuselabel : LABELALLREP) {

				String texteleuselabel = eleuselabel.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, texteleuselabel);

			}

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//span[text()='CENTRA']")).click();

			fluentWait(By.xpath("//a[text()='MIS Reports']")).click();

			sleep(4);

			ExtentTestManager.getTest().log(LogStatus.PASS, " MIS REPORTS ");

			/*List<WebElement> MISREPORTS = driver.findElements(By.xpath("//div/label"));

			for (WebElement eleMISREPORTS : MISREPORTS) {

				String texteleMISREPORTS = eleMISREPORTS.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, texteleMISREPORTS);

			}*/

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//span[text()='CENTRA']")).click();

			fluentWait(By.xpath("//a[text()='Report Downloads']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, "  REPORT DOWNLOAD ");

			/*List<WebElement> REPORTDOWNLOAD = driver.findElements(By.xpath("//div/label"));

			for (WebElement eleREPORTDOWNLOAD : REPORTDOWNLOAD) {

				String texteleleREPORTDOWNLOAD = eleREPORTDOWNLOAD.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, texteleleREPORTDOWNLOAD);

			}
*/
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//span[text()='CENTRA']")).click();

			fluentWait(By.xpath("//a[text()='CCR Data']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, "  CCR Data ");

			/*List<WebElement> CCRData = driver.findElements(By.xpath("//div/label"));

			for (WebElement eleCCRData : CCRData) {

				String texteleCCRData = eleCCRData.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, texteleCCRData);

			}
*/
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			// .........................click on the
			// administartion..................................................................//
			fluentWait(By.xpath("//span[text()='Administration']")).click();

			fluentWait(By.xpath("//a[text()='System Configurations']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, "  SYSTEM CONFIGURATION ");

			String Systemconfiguration = driver.findElement(By.xpath("//div[text()='Notification Configurations']"))
					.getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, Systemconfiguration);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//span[text()='Administration']")).click();

			fluentWait(By.xpath("//a[text()='Maker Checker']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, "  MARKER CHECKER ");

			/*List<WebElement> MakerChecker = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr//td"));

			for (WebElement eleMakerChecker : MakerChecker) {

				String texteleMakerChecker = eleMakerChecker.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, texteleMakerChecker);

			}
*/
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//span[text()='Administration']")).click();

			fluentWait(By.xpath("//a[text()='Audit Log']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, "  AUDIT LOG ");

			sleep(4);

			/*List<WebElement> auditLogGrid = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr//td"));

			for (WebElement eleMakerauditLogGrid : auditLogGrid) {

				String texteleMakerauditLogGrid = eleMakerauditLogGrid.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, texteleMakerauditLogGrid);

			}*/

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			fluentWait(By.xpath("//span[text()='Administration']")).click();

			fluentWait(By.xpath("//a[text()='Case Scoring']")).click();

			ExtentTestManager.getTest().log(LogStatus.PASS, "  CASE SCORNING ");

			String CaseScroing = driver.findElement(By.xpath("//span[text()='CTR Count']")).getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, CaseScroing);
/*
			List<WebElement> casescroing = driver.findElements(By.xpath("//div[@id='CTRcaseScrePanel-innerCt']/table"));

			for (WebElement elecasescoring : casescroing) {

				String textcasescoing = elecasescoring.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, textcasescoing);

			}*/

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

			/*
			 * fluentWait(By.xpath("//span[text()='Administration']")).click();
			 * 
			 * 
			 * 
			 * fluentWait(By.xpath("//a[text()='Exclusions List']")).click();
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.PASS,
			 * "  EXCLUSIONS LIST ");
			 * 
			 * 
			 * 
			 * 
			 * List<WebElement>Exclusions=driver.findElements(By.xpath(
			 * "//tbody[contains(@id,'gridview-')]//tr"));
			 * 
			 * 
			 * for (WebElement eleMakerauditExclusions : Exclusions) {
			 * 
			 * 
			 * String texteleExclusions=eleMakerauditExclusions.getText();
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO,
			 * texteleExclusions);
			 * 
			 * 
			 * }
			 */

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"***************************************************************************************");

		} catch (org.openqa.selenium.StaleElementReferenceException e) {

			ExtentTestManager.getTest().log(LogStatus.INFO, " Refresh the page  ");

		} catch (Exception e) {

			sleep(19);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.FAIL, "Star Navigation Missing some modules  ");

		}

	}

}
