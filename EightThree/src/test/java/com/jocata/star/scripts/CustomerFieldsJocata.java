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

public class CustomerFieldsJocata extends mainbaseLatest {

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

	// .............................................................customerfieldsthree....................................................................//

	@Test(priority = 3)
	public void login() {

		ExtentTestManager.startTest("  Case Expand :  Actions  ");

		/*
		 * driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(
		 * "l3_user");
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
		 * "Star@123");
		 * driver.findElement(By.xpath("//span[@id='loginButtonExt-btnIconEl']")
		 * ).click();
		 */ clickDashboard();
	}

	public void clickDashboard() {
		// driver.findElement(By.xpath("//span[text()='Rules and
		// Patterns']")).click();
		// driver.findElement(By.xpath("//span[text()='Dashboard']")).click();

		sleep(9);

		fluentWait(By.xpath("//span[text()='Case Files']")).click();

		sleep(9);

		fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

		// ..........................................................Case
		// Type............................................................//
		sleep(9);

		fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();

		sleep(12);

		fluentWait(By.xpath("//li[text()='Other Cases']")).click();

		// .................................................................Search.......................................................//

		sleep(9);

		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

		sleep(14);

		// ...............................................................Alerts
		// 13276.....................................................//

		// driver.findElement(By.xpath("//div[text()='13276']")).click();

		// driver.findElement(By.xpath("//div[text()='24156']")).click();

		fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();

		sleep(9);

		// test.log(LogStatus.INFO ," Alerts ");

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		String alerttext = driver.findElement(By.xpath("//div[text()='Alerts']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, alerttext);

		/*
		 * 
		 * List<WebElement> alertbox=driver.findElements(By.xpath(
		 * "//table[contains(@id,'gridview-')]/colgroup"));
		 * 
		 * for (WebElement elerulealert : alertbox) {
		 * 
		 * 
		 * String textalert=elerulealert.getText();
		 * 
		 * test.log(LogStatus.INFO, textalert);
		 * 
		 * 
		 * 
		 * }
		 */

		// ..........................................Login............................................................................//
		// driver.findElement(By.xpath("//div[@id='tool-1392']//img")).click();

		sleep(9);

		fluentWait(By.xpath("//div[contains(@id,'-placeholder')]//img")).click();

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(9);

		List<WebElement> Loginbox = driver.findElements(By.xpath("//div[@class='row title']//div"));

		for (WebElement elerlogin : Loginbox) {

			String textlogin = elerlogin.getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, textlogin);

		}

		// String OpenCase=driver.findElement(By.xpath("//div[text()='Open
		// Case']")).getText();

		// test.log(LogStatus.INFO, OpenCase);

		sleep(2);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		List<WebElement> photename = driver.findElements(By.xpath("//div[@class='row']/div/div/div"));

		for (WebElement eledisgnat : photename) {

			String textdesigna = eledisgnat.getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, textdesigna);

		}

		// ..............................................logout.......................................................................//
		// driver.findElement(By.xpath("//img[@id='tool-1391-toolEl']")).click();

		sleep(8);

		fluentWait(By.xpath("//div[starts-with(@id,'caseLog')]//div[contains(@id,'_header-body')]//img")).click();

		sleep(6);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		String Casescore = driver.findElement(By.xpath("//span[text()=' Case Score ']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, Casescore);

		String Pattern = driver.findElement(By.xpath("//span[text()='Pattern']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, Pattern);

		String Amount = driver.findElement(By.xpath("//span[text()=' Amount ']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, Amount);

		String History = driver.findElement(By.xpath("//span[text()=' Case History ']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, History);

		// ........................................comments and
		// Evidence..............................................................//

		fluentWait(By.xpath("//div[starts-with(@id,'commentsandevidences')]//img")).click();

		sleep(9);

		String Evidences = driver.findElement(By.xpath("//span[text()='Evidences']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, Evidences);

		String document = driver.findElement(By.xpath("//div[@class='evidences-table']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, document);

		String Links = driver.findElement(By.xpath("//span[text()='Links']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, Links);

		String Tags = driver.findElement(By.xpath("//span[text()=' Tags ']")).getText();

		ExtentTestManager.getTest().log(LogStatus.INFO, Tags);
		// .....................................Evidence...........................//

		fluentWait(By.xpath("//div[@id='panelRight']//a")).click();

		sleep(12);

		// .....................................close
		// Evidence..................................//

		fluentWait(By
				.xpath("//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box x-resizable x-window-resizable x-window-default-resizable']//img"))
						.click();

		fluentWait(By.xpath("//div[@id='panelRight']//a[contains(@id,'upload_lnk')]")).click();

		sleep(9);

		fluentWait(By
				.xpath("//div[@class='x-window x-layer x-window-default x-plain x-window-plain x-window-default-plain x-closable x-window-closable x-window-default-closable x-border-box']//img"))
						.click();

		sleep(5);

		fluentWait(By.xpath("//input[starts-with(@id,'addTag')]")).sendKeys("RaghuRam");

		/*
		 * JavascriptExecutor jseframe = (JavascriptExecutor)driver;
		 * jseframe.executeScript("window.scrollBy(0,600)", "");
		 */
		sleep(9);

		// WebElement
		// elementframe=driver.findElement(By.xpath("//iframe[@class='x-htmleditor-iframe']"));
		// driver.switchTo().frame("");
		// elementframe.sendKeys("Hi Raghu");

		driver.findElement(By.xpath("//div[starts-with(@id,'form-')]//table//div[@id='commentpanl-inputCmp']"))
				.sendKeys("hi ram");

		// driver.switchTo().defaultContent();

		sleep(9);

		fluentWait(By.xpath("//img[@class='x-tool-img x-tool-collapse-right']")).click();

		// .......................................closeing the Evidence and
		// coomments...............................................//

		// ..................................clicking the
		// name..........................................................................//
		// fluentWait(By.xpath("//a[@class='title']")).click();

		sleep(9);

		// .........................................clicling the closeover
		// Lay.........................................................//
		// driver.findElement(By.xpath("//div[@id='tool-1408']/img")).click();
		// fluentWait(By.xpath("//div[@class='x-window x-layer x-window-default
		// x-closable x-window-closable x-window-default-closable
		// x-border-box']//div[contains(@id,'_header-body')]//img[@class='x-tool-img
		// x-tool-close']")).click();

		sleep(9);

		// ............................................clicking the
		// workflow...........................................................//

		fluentWait(By.xpath("//*[contains(@id,'workflowBtn')]")).click();

		// ...........clicking the Workflow &
		// Disposition..........................................................................//
		sleep(18);

		// driver.findElement(By.xpath("//div[@id='tool-1626']//img")).click();
		fluentWait(By
				.xpath("//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//div//img"))
						.click();

		// ...................................................clicking the
		// Actions.................................................//
		sleep(9);

		fluentWait(By.xpath("//span/div/div/div/div/div/div/a/span/span/span[2]")).click();
		//fluentWait(By.xpath("//span[@id='button-1018-btnIconEl']")).click();

		// sleep(9);

		// .......................................................clicking the
		// Add Event.........................................//

		// driver.findElement(By.xpath("//span[@id='addEvntOptn-textEl']")).click();

		// sleep(9);

		// ......................................................close an added
		// eveent...........................................//

		// driver.findElement(By.xpath("//div[@class='x-window x-layer
		// x-window-default x-closable x-window-closable
		// x-window-default-closable x-border-box']//div//img")).click();
		/*
		 * WebElement elementToaddevent = driver.findElement(By.xpath(
		 * "//div[@id='window-1953']//div[starts-with(@id,'tool-')]")); //
		 * Scroll the browser to the element's Y position
		 * 
		 * ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+
		 * elementToaddevent.getLocation().y+")"); // Click the element
		 * elementToaddevent.click();
		 */

		// driver.findElement(By.xpath("//div[starts-with(@id,'tool-')]")).click();

		sleep(10);

		// ....................................................clicking the
		// SecondWorkflow .........................................//
		

		/*fluentWait(By.xpath("//a[starts-with(@id,'button-')]//following::span[contains(@id,'-btnWrap')][2]")).click();*/

		
		
		
		// driver.findElement(By.id("button-1018-btnWrap")).click();

		// driver.findElement(By.xpath("//span[@id='button-1018-btnIconEl']")).click();

		sleep(10);

		/*
		 * WebDriverWait wait = new WebDriverWait(driver,50);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//div[@id='wrkFlwOptn']//a")));
		 */

		// driver.findElement(By.xpath("//div[@id='wrkFlwOptn']//a[@id='wrkFlwOptn-itemEl']")).click();

		// JavascriptExecutor executor3 = (JavascriptExecutor)driver;

		// executor3.executeScript("document.getElementById('wrkFlwOptn-textEl').style.display='block';");

		// ............................................................................................................................//

		WebElement elemwork = driver.findElement(By.xpath("//div[contains(@id,'menu-')]//div[@id='wrkFlwOptn']//a"));

		// This will enable this element if element is invisible      

		String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";

		// Execute the Java Script for the element which we find out
		((JavascriptExecutor) driver).executeScript(js, elemwork);

		// Click on element

		elemwork.click();

		// ............................................................................................................................//

		// WebElement
		// eleworkflow=driver.findElement(By.xpath("//div[contains(@id,'menu-')]//div[@id='wrkFlwOptn']//a"));

		// eleworkflow.click();

		/*
		 * Actions Action=new Actions(driver);
		 * 
		 * Action.moveToElement(eleworkflow).click().perform();
		 */

		// ((JavascriptExecutor)driver).executeScript("arguments[0].checked =
		// true;", eleworkflow);

		// eleworkflow.click();

		sleep(9);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		// ...............................................clicking the close
		// Workflow overlay...................................//

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -500)", "");
		sleep(12);

		fluentWait(By
				.xpath("//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//div//img"))
						.click();

		// driver.findElement(By.xpath("//div[starts-with(@id,'tool-')]//img[@id='tool-1958-toolEl']")).click();

		// .....................................................case
		// Reallocation.....................................................//

		sleep(8);

		

		fluentWait(By.xpath("//span/div/div/div/div/div/div/a/span/span/span[2]")).click();
		
		
		/*sleep(8);
		fluentWait(By.xpath("//a[starts-with(@id,'button-')]//following::span[contains(@id,'-btnWrap')][2]")).click();
*/
		sleep(8);

		fluentWait(By.xpath("//span[@id='reallocOptn-textEl']")).click();

		sleep(8);

		// fluentWait(By.xpath("//div[@class='x-tool x-box-item x-tool-default
		// x-tool-after-title']//following::img[@class='x-tool-img
		// x-tool-close'][5]")).click();

		fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();

		/*
		 * try { Thread.sleep(9000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * 
		 * driver.findElement(By.xpath("//span[@id='button-1018-btnIconEl']")).
		 * click(); try { Thread.sleep(9000); } catch (InterruptedException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * driver.findElement(By.xpath("//span[@id='reallocOptn-textEl']")).
		 * click();
		 * 
		 * 
		 * 
		 * 
		 * //close the case reallocation
		 * 
		 * try { Thread.sleep(9000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * 
		 * 
		 * driver.findElement(By.xpath("//img[@class='x-tool-img x-tool-close']"
		 * )).click();
		 * 
		 * 
		 * 
		 * 
		 */

		// .................................................R1095.....................................................................//

		sleep(9);

		WebElement elementnumber = driver
				.findElement(By.xpath("//tr[starts-with(@id,'ruleTable')]//a[@class='linksStyle']"));

		JavascriptExecutor jsrrr = (JavascriptExecutor) driver;
		jsrrr.executeScript("arguments[0].click();", elementnumber);

		// driver.findElement(By.xpath("//tr[starts-with(@id,'ruleTable')]//a[@class='linksStyle']")).click();
		sleep(8);

		fluentWait(By
				.xpath("//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box x-resizable x-window-resizable x-window-default-resizable']//div//img"))
						.click();
		// driver.findElement(By.xpath("//div[@id='tool-2321']//img")).click();

		sleep(10);

		// ............................................clicking the Activity
		// Graph................................

		// driver.findElement(By.xpath("//img[@id='tool-1382-toolEl']")).click();

		try {
			fluentWait(By.xpath("//div[starts-with(@id,'graphActivity')]//div[3]")).click();

			// sleep(10);

			/*
			 * String Graph=driver.findElement(By.xpath(
			 * "//span[contains(@id,'graphActivity')]")).getText();;
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO, Graph);
			 */

			// .................................clicking the customer and peer
			// groups............................................//

			// driver.findElement(By.xpath("//img[@id='tool-1378-toolEl']")).click();

			fluentWait(By.xpath("//div[starts-with(@id,'peerPanel')]//div[5]")).click();

			sleep(9);

			String peer = driver.findElement(By.xpath("//span[contains(@id,'peerPane')]")).getText();
			;

			ExtentTestManager.getTest().log(LogStatus.INFO, peer);
			
			try{

			 fluentWait(By.xpath("//div[starts-with(@id,'messagebox-')]//img")).click();

			 
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			sleep(13);

			// ........................................ Network
			// Analysis...........................................................//

			fluentWait(By.xpath("//div[starts-with(@id,'networkAnalysis')]//img[contains(@id,'-toolEl')]")).click();

			sleep(9);

			String Network = driver.findElement(By.xpath("//span[contains(@id,'networkAnalysis')]")).getText();
			;

			ExtentTestManager.getTest().log(LogStatus.INFO, Network);

			sleep(10);

			System.out.println("hi");

			sleep(9);

			JavascriptExecutor jseNetworkAn = (JavascriptExecutor) driver;

			jseNetworkAn.executeScript("window.scrollBy(0,-900)", "");

			sleep(12);

			System.out.println("hi Ram  ");
			
			
			ExtentTestManager.getTest().log(LogStatus.INFO, " All Actions performed Successfully ");

			
		} catch (org.openqa.selenium.WebDriverException e) {

			sleep(13);

			JavascriptExecutor jseNetworkAn = (JavascriptExecutor) driver;

			jseNetworkAn.executeScript("window.scrollBy(0,-900)", "");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

			System.out.println("referesh................");

			ExtentTestManager.getTest().log(LogStatus.FAIL, "Customer Fields are Missing ");

		}

	}

}
