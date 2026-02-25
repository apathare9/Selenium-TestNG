package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.GoibiboForexPageUI;
import utils.Screenshot;
import utils.WebDriverHelper;

/**
 * @author Ajinkya Pathare
 */
public class GoibiboForexPage {

	WebDriver driver;
	WebDriverHelper webDriverHelperObj;
	ExtentTest extentTestObj;

	
	/**
	 * @author Ajinkya Pathare
	 * @summary: Making driver and extentTestIbj accessible everywhere
	 * @param driver : assigns the provided driver instance to the class field.
	 * @param extentTestObj : assigns the provided extentTestObj instance to the class field
	 */
	public GoibiboForexPage(WebDriver driver, ExtentTest extentTestObj) {
		this.driver = driver;
		webDriverHelperObj = new WebDriverHelper(driver, extentTestObj);
		this.extentTestObj = extentTestObj;
	}

	/**
	 * @summary To click on Multi Currency Option
	 * @author Ajinkya Pathare
	 */
	public void clickOnMultiCurrencyOption() {
		webDriverHelperObj.jsScroll(GoibiboForexPageUI.WhatIsAMultiCurrencyCardOption, "Scrolled upto Multi Currency Option");
		webDriverHelperObj.waitForElementToBeVisible(GoibiboForexPageUI.WhatIsAMultiCurrencyCardOption, 10);
		String expectedText = "What is a Multicurrency Card?";
		String actualText = webDriverHelperObj.getText(GoibiboForexPageUI.WhatIsAMultiCurrencyCardOption, "Fetched 'What is a Multi Currency Card Option' ");
		webDriverHelperObj.verifyText(GoibiboForexPageUI.WhatIsAMultiCurrencyCardOption, expectedText , "Verified What is a Multi Currency Option");
		webDriverHelperObj.jsClick(GoibiboForexPageUI.WhatIsAMultiCurrencyCardOption);
	}

	/**
	 * @summary To click on "Click Here" of multi currency option
	 * @author Ajinkya Pathare
	 */
	public void clickOnClickHereOfMultiCurrencyOption() {
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		webDriverHelperObj.jsClick(GoibiboForexPageUI.clickHereOfWhatIsAMultiCurrency);
	}

	/**
	 * @summary: To click on Hotels near me
	 * @author Ajinkya Pathare
	 */
	public void clickOnHotelsNearMe() {

		webDriverHelperObj.clickOnElement(GoibiboForexPageUI.hotelsNearMe, "Clicked On More Links");
		driver.navigate().refresh();
		webDriverHelperObj.enterEsc();
		webDriverHelperObj.enterEsc();
	}



	/**
	 * @summary To click on list your hotel for free
	 * @author Ajinkya Pathare
	 */
	public void clickOnListYourHotelForFree() {

		driver.navigate().to("https://in.goibibo.com/newextranet/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		String actualText = "Get Started Today For Free!";
		webDriverHelperObj.verifyText(GoibiboForexPageUI.getStartedTodayForFree, actualText, "Verified 'Get started today for free!' ");
		
	}

	/**
	 * @summary To take a screenshot
	 * @author Ajinkya Pathare
	 */
	public void Screenshot() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		webDriverHelperObj.wait(3);
		Screenshot.takeScreenshot(driver, "Screenshot");
		webDriverHelperObj.writeExtentTest(Status.PASS, "Verified");
	}

}
