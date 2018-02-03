package com.jocata.star.existingfuctions;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

public class AddruleChangesFuctionaltiy extends mainbaseLatest {

	public void clickComboItem(WebElement input, String target) {
		input.click(); // click input to pop up the combo list
		List<WebElement> comboItems = driver.findElements(
				By.xpath("//div[@id='ruleBldrVOThreshholdTransDetList[7].thresholdTransDetFilterSubValitem-innerCt']"));
		for (int i = 1; i <= comboItems.size(); i++) {

			WebElement item = comboItems.get(i);
			System.out.println(item.getText());
			if (item.getText().equals(target)) {
				item.click();
				break;
			}
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

	public void sleep(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 28)
	public void loginNew() throws InterruptedException {

		ExtentTestManager.startTest("  Create New  Rule  :  Using All Threshold Parameters ");

		// Newcreateruleexcel ruleSheet =new Newcreateruleexcel("Frist");
		// driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("l3_user");
		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Star@123");
		// driver.findElement(By.xpath("//span[@id='loginButtonExt-btnIconEl']")).click();

		// sleep(10);

		String ruleName = "rule";

		for (int i = 2; i < 3; i++) {

			// for(String ruleName:ruleSheet.getData()){
			/*
			 * int ruleNameincrementor = 0;--Databahasse
			 * 
			 * connect to database to the table that has this value fetch the
			 * the updated value
			 * 
			 * ruleNameincrementor = updated value;
			 * 
			 * ruleNameincrementor++; ruleName = ruleName + ruleNameincrementor;
			 * updATE THIS VALUE TO DB AGAIN
			 */

			ruleName = ruleName + new Date().getTime();
			System.out.println("ruleName" + ruleName);

			ExtentTestManager.getTest().log(LogStatus.PASS, ruleName);
			ExtentTestManager.getTest().log(LogStatus.INFO, "New Rule ");

			// System.out.println();

			sleep(1);
			clickDashboard(ruleName);
		}

		/*
		 * if(){
		 * 
		 * }
		 */

		// String name = "Vishnuvaradhanyadav"+count;
		// count++;
		// new
		// StringBuilder().append("Vishnuvaradhanyadav").append("Vishnuvaradhanyadav"+count).toString();

		// clickDashboard(name);
	}

	public void clickDashboard(String name) throws InterruptedException {

		// try{

		sleep(7);

		driver.findElement(By.xpath("//span[text()='Rules and Patterns']")).click();

		driver.findElement(By.xpath("//a[text()='Rule Builder']")).click();

		fluentWait(By.xpath("//a[@class='add-icon icon']")).click();

		fluentWait(By.xpath("//input[@id='ruleTemplateCombo-inputEl']")).click();

		fluentWait(By.xpath("//div[@data-qtip='Transaction Determination']")).click();

		fluentWait(By.xpath("//input[@id='ruleModel-inputEl']")).click();

		fluentWait(By.xpath("//li[text()='Cash and Structuring']")).click();

		/*
		 * WebElement element
		 * =driver.findElement(By.xpath("//input[@id='ruleModel-inputEl']"));
		 * Select select=new Select(element); select.selectByVisibleText(
		 * "Cash and Structuring");
		 * 
		 * 
		 */
		// ..................................................Rule
		// Name..................................................................//

		fluentWait(By.xpath("//input[@id='ruleName']")).sendKeys(name);

		// clicking Desception//

		fluentWait(By.xpath("//textarea[@id='ruleDescription']")).sendKeys(" how are you");

		// clicking the Referencenumber//

		fluentWait(By.xpath("//input[@id='ruleReferenceNmbr']")).sendKeys("1234455");

		// selecting the level//

		fluentWait(By.xpath("//input[@id='investigationLevel-inputEl']")).click();

		// fluentWait(By.xpath("//li[text()='L1 User']")).click();

		fluentWait(By.xpath("//li[text()='Analyst']")).click();

		// clicking the priority levels //

		fluentWait(By.xpath("//input[@id='rulePriority-inputEl']")).click();

		fluentWait(By.xpath("//li[text()='4']")).click();

		fluentWait(By.xpath("//input[@id='valDetRulePeriod']")).sendKeys("23");

		// clickcing the key parameter//

		fluentWait(By.xpath("//input[@id='keyParameter-inputEl']")).click();

		// ...................................Key
		// Parameter......................................................................//
		sleep(9);
		fluentWait(By.xpath("//div[@data-qtip='Tran. Amount']")).click();

		// clicking the status//

		fluentWait(By.xpath("//input[@id='ruleStatus-inputEl']")).click();

		fluentWait(By.xpath("//li[text()='Inactive']")).click();

		// ..................................................Customer/Account
		// Filter...................................................//

		fluentWait(By.xpath(".//*[@id='temp_ruleBldrVOAccCusTransDetList[0].custAccTransDetFilterVal-triggerWrap']"))
				.click();

		// ............................................................Account
		// Age.................................................//

		fluentWait(By.xpath("//div[contains(@id,'boundlist-')][7]//li[2]")).click();

		fluentWait(By.xpath(".//*[@id='ruleBldrVOAccCusTransDetList[0].custAccTransDetFilterFromVal']")).sendKeys("23");

		fluentWait(By.xpath(".//*[@id='ruleBldrVOAccCusTransDetList[0].custAccTransDetFilterToVal']")).sendKeys("34");

		fluentWait(By.xpath("(//a[contains(text(),'Add Condition')])[3]")).click();

		fluentWait(By.xpath("//input[@id='temp_ruleBldrVOAccCusTransDetList[1].custAccTransDetFilterVal-inputEl']"))
				.click();

		// .........................................................Account
		// Balance..................................................//

		/*
		 * Thread.sleep(9000);
		 * //fluentWait(By.xpath("//div[contains(@id,'boundlist-')][8]//li[3]"))
		 * .click();
		 * 
		 * fluentWait(By.xpath("//div[@id='boundlist-1033-listEl']//li[3]")).
		 * click();
		 * 
		 * 
		 * fluentWait(By.xpath(
		 * ".//*[@id='ruleBldrVOAccCusTransDetList[1].custAccTransDetFilterFromVal']"
		 * )).sendKeys("66");
		 * 
		 * 
		 * fluentWait(By.xpath(
		 * ".//*[@id='ruleBldrVOAccCusTransDetList[1].custAccTransDetFilterToVal']"
		 * )).sendKeys("77");
		 */

		// ................................... Threshold
		// Parameters........................................................................//

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.id("temp_ruleBldrVOThreshholdTransDetList[0].thresholdTransDetFilterVal-inputEl")));

		fluentWait(By.id("temp_ruleBldrVOThreshholdTransDetList[0].thresholdTransDetFilterVal-inputEl")).click();

		fluentWait(By.xpath("//li[text()='Tran. Amount']")).click();

		WebElement elementTothreshold = fluentWait(
				By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[0].thresholdTransDetFilterFromVal']"));
		// Scroll the browser to the element's Y position

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementTothreshold.getLocation().y + ")");
		// Click the element
		elementTothreshold.sendKeys("32");

		WebElement elementTothresholdsecond = fluentWait(
				By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[0].thresholdTransDetFilterToVal']"));
		// Scroll the browser to the element's Y position

		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + elementTothresholdsecond.getLocation().y + ")");
		// Click the element
		elementTothresholdsecond.sendKeys("47");

		fluentWait(By.xpath("(//a[contains(text(),'Add Condition')])[4]")).click();

		fluentWait(By
				.xpath("//table[@id='temp_ruleBldrVOThreshholdTransDetList[1].thresholdTransDetFilterVal-triggerWrap']//following::div[1]"))
						.click();

		// fluentWait(By.xpath(".//*[@id='temp_ruleBldrVOThreshholdTransDetList[1].thresholdTransDetFilterVal-inputEl']")).click();

		// fluentWait(By.xpath("//div[contains(@id,'boundlist-')][3]//li[2]")).click();

		fluentWait(By.xpath("//div[@id='boundlist-1035-listEl']//li[2]")).click();

		// fluentWait(By.xpath("//div[@id='boundlist-1035-listEl']//li[2]")).click();

		fluentWait(By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[1].thresholdTransDetFilterSubVal-inputEl']"))
				.click();

		fluentWait(By.xpath("//div[@data-qtip='Debit Card']")).click();

		// fluentWait(By.xpath("//b[text()='Threshold Parameters']")).click();

		fluentWait(By.xpath("(//a[contains(text(),'Add Condition')])[4]")).click();

		// .........................................................ThridType............................................................//

		fluentWait(By
				.xpath("//table[@id='temp_ruleBldrVOThreshholdTransDetList[2].thresholdTransDetFilterVal']//following::div[2]"))
						.click();

		fluentWait(By.xpath("//div[@id='boundlist-1037-listEl']//li[3]")).click();

		fluentWait(By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[2].thresholdTransDetFilterSubVal-inputEl']"))
				.click();

		fluentWait(By.xpath("//div[@data-qtip='ATM']")).click();

		fluentWait(By.xpath("(//a[contains(text(),'Add Condition')])[4]")).click();

		// ..................................................FourthType................................................................//
		// .................................................CounterCountry.............................................................//

		fluentWait(By
				.xpath("//table[@id='temp_ruleBldrVOThreshholdTransDetList[3].thresholdTransDetFilterVal-triggerWrap']//following::div"))
						.click();

		fluentWait(By.xpath("//div[@id='boundlist-1039-listEl']//li[4]")).click();

		fluentWait(By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[3].thresholdTransDetFilterSubVal-inputEl']"))
				.click();

		fluentWait(By.xpath("//div[@data-qtip='Angola']")).click();

		fluentWait(By.xpath("(//a[contains(text(),'Add Condition')])[4]")).click();

		// ....................................................FiveType................................................................//
		// ...................................................CounteryRisk.................................................................//

		fluentWait(By
				.xpath("//table[@id='temp_ruleBldrVOThreshholdTransDetList[4].thresholdTransDetFilterVal-triggerWrap']//following::div"))
						.click();

		fluentWait(By.xpath("//div[@id='boundlist-1041-listEl']//li[5]")).click();

		fluentWait(By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[4].thresholdTransDetFilterSubVal-inputEl']"))
				.click();

		fluentWait(By.xpath("//div[@data-qtip='Low']")).click();

		fluentWait(By.xpath("(//a[contains(text(),'Add Condition')])[4]")).click();

		// ..................................................SixType................................................................//
		// ..................................................CR or
		// DR................................................................//

		fluentWait(By
				.xpath("//table[@id='temp_ruleBldrVOThreshholdTransDetList[5].thresholdTransDetFilterVal-triggerWrap']//following::div"))
						.click();

		fluentWait(By.xpath("//div[@id='boundlist-1043-listEl']//li[6]")).click();

		fluentWait(By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[5].thresholdTransDetFilterSubVal-inputEl']"))
				.click();

		fluentWait(By.xpath("//div[@data-qtip='Cr']")).click();

		fluentWait(By.xpath("(//a[contains(text(),'Add Condition')])[4]")).click();

		// ..................................................SixType................................................................//
		// ......................................................In
		// stumentType.........................................................//
		fluentWait(By
				.xpath("//table[@id='temp_ruleBldrVOThreshholdTransDetList[6].thresholdTransDetFilterVal-triggerWrap']//following::div"))
						.click();

		fluentWait(By.xpath("//div[@id='boundlist-1045-listEl']//li[7]")).click();

		fluentWait(By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[6].thresholdTransDetFilterSubVal-inputEl']"))
				.click();

		fluentWait(By.xpath("//div[@data-qtip='0']")).click();

		fluentWait(By.xpath("(//a[contains(text(),'Add Condition')])[4]")).click();

		// ..................................................SevenType................................................................//

		fluentWait(By
				.xpath("//table[@id='temp_ruleBldrVOThreshholdTransDetList[7].thresholdTransDetFilterVal-triggerWrap']//following::div"))
						.click();

		fluentWait(By.xpath("//div[@id='boundlist-1047-listEl']//li[8]")).click();

		// Thread.sleep(8000);

		/*
		 * WebElement Marchemntty= fluentWait(By.xpath(
		 * "//div[@data-qtip='MERCHANT TYPE 10']"));
		 * 
		 * Actions action=new Actions(driver);
		 * 
		 * action.moveToElement(Marchemntty).sendKeys(Keys.ENTER).build().
		 * perform();
		 */

		// driver.findElement(By.cssSelector("li.x-boundlist-item.x-boundlist-item-over")).click();

		Thread.sleep(3000);

		fluentWait(By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[7].thresholdTransDetFilterSubVal-inputEl']"))
				.click();

		fluentWait(By.xpath("//div[@data-qtip='Veterinary Services']")).click();

		// driver.findElement(By.xpath("//li[4]/div")).click();

		/*
		 * Thread.sleep(4000);
		 * 
		 * //fluentWait(By.xpath("//div[@data-qtip='MERCHANT TYPE 10']"
		 * )).click();
		 * 
		 * fluentWait(By.xpath("//ul[@class='x-list-plain']//li[2]")).click();
		 * 
		 * Thread.sleep(19000);
		 * 
		 * WebElement input= driver.findElement(By.xpath(
		 * "//div[@data-qtip='MERCHANT TYPE 10']"));
		 * 
		 * String target=" MERCHANT TYPE 10";
		 * 
		 * clickComboItem(input, target);
		 */

		Thread.sleep(13000);
		fluentWait(By.xpath("(//a[contains(text(),'Add Condition')])[4]")).click();

		// ..................................................PurposeCode..................................................................
		Thread.sleep(2000);
		fluentWait(By
				.xpath("//table[@id='temp_ruleBldrVOThreshholdTransDetList[8].thresholdTransDetFilterVal']//following::div[2]"))
						.click();

		fluentWait(By.xpath("//div[@id='boundlist-1049-listEl']//li[9]")).click();

		fluentWait(By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[8].thresholdTransDetFilterSubVal-inputEl']"))
				.click();
		Thread.sleep(2000);

		fluentWait(By.xpath("//div[@data-qtip='P0001']")).click();

		Thread.sleep(3000);
		fluentWait(By.xpath("(//a[contains(text(),'Add Condition')])[4]")).click();

		// ..................................................ReportCode..................................................................

		fluentWait(By
				.xpath("//table[@id='temp_ruleBldrVOThreshholdTransDetList[9].thresholdTransDetFilterVal-triggerWrap']//following::div"))
						.click();
		fluentWait(By.xpath("//div[@id='boundlist-1051-listEl']//li[10]")).click();

		fluentWait(By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[9].thresholdTransDetFilterSubVal-inputEl']"))
				.click();
		fluentWait(By.xpath("//div[@data-qtip='Report Code1']")).click();

		Thread.sleep(3000);
		fluentWait(By.xpath("(//a[contains(text(),'Add Condition')])[4]")).click();

		// ............................................Trans.SubType.......................................................................//

		fluentWait(By
				.xpath("//table[@id='temp_ruleBldrVOThreshholdTransDetList[10].thresholdTransDetFilterVal-triggerWrap']//following::div"))
						.click();

		fluentWait(By.xpath("//div[@id='boundlist-1053-listEl']//li[12]")).click();

		fluentWait(
				By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[10].thresholdTransDetFilterSubVal-inputEl']"))
						.click();

		fluentWait(By.xpath("//div[@data-qtip='Cash - Cash']")).click();

		Thread.sleep(3000);
		fluentWait(By.xpath("(//a[contains(text(),'Add Condition')])[4]")).click();

		// ............................................Trans.Type.......................................................................//

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By
				.xpath("//table[@id='temp_ruleBldrVOThreshholdTransDetList[11].thresholdTransDetFilterVal-triggerWrap']//following::div"))
						.click();

		fluentWait(By.xpath("//div[@id='boundlist-1055-listEl']//li[13]")).click();

		fluentWait(
				By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[11].thresholdTransDetFilterSubVal-inputEl']"))
						.click();

		fluentWait(By.xpath("//div[@data-qtip='Cash']")).click();
		Thread.sleep(3000);
		fluentWait(By.xpath("(//a[contains(text(),'Add Condition')])[4]")).click();

		// ............................................TransCation
		// .Branch.......................................................................//

		fluentWait(By
				.xpath("//table[@id='temp_ruleBldrVOThreshholdTransDetList[12].thresholdTransDetFilterVal-triggerWrap']//following::div"))
						.click();

		fluentWait(By.xpath("//div[@id='boundlist-1057-listEl']//li[14]")).click();

		fluentWait(
				By.xpath("//input[@id='ruleBldrVOThreshholdTransDetList[12].thresholdTransDetFilterSubVal-inputEl']"))
						.click();

		fluentWait(By.xpath("//div[@data-qtip='DALIAN BRANCH']")).click();

		sleep(10);
		fluentWait(By.xpath("(//a[contains(text(),'Add Condition')])[4]")).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(10);

		// clicking the Save rule//

		fluentWait(By.xpath("//div[@id='createRuleTransDet']//span")).click();

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		// sucessfully created

		sleep(10);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();

		sleep(10);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(9);

		System.out.println("Sucess");
		
		ExtentTestManager.getTest().log(LogStatus.INFO,    "  Create Rule  Successfully ");


		/*
		 * }catch(Exception e){
		 * 
		 * sleep(19);
		 * 
		 * ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
		 * +ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(
		 * driver, "ScreenshortForExtentReport")));
		 * 
		 * 
		 * driver.navigate().refresh();
		 * 
		 * System.out.println("referesh................");
		 * 
		 * ExtentTestManager.getTest().log(LogStatus.FAIL,
		 * "missing modules of the Threshold parameters");
		 * 
		 * 
		 * }
		 */

	}
}