package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.GoibiboCabsResultPageUI;
import utils.WebDriverHelper;

/**
 * @author Ajinkya Pathare
 * @param driver: WebDriver object
 * @param extentTestObj: ExtentTest Object
 */
public class GoibiboCabsResultPage {

	WebDriver driver;
	ExtentTest extentTestObj;
	WebDriverHelper webDriverHelperObj;

	public GoibiboCabsResultPage(WebDriver driver, ExtentTest extentTestObj) {
		this.driver = driver;
		this.extentTestObj = extentTestObj;
		webDriverHelperObj = new WebDriverHelper(driver, extentTestObj);
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to verify the title contains the text 'Cab Booking'
	 */
	public void verifyCabsPageTitle1() {
		webDriverHelperObj.verifyTitle("Cab Booking","Verifying the title of the Cabs Result Page");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to select the first cab in the Cabs result page
	 */
	public void clickFirstCab() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsResultPageUI.firstCab, 15);
		webDriverHelperObj.scrollToClick(GoibiboCabsResultPageUI.firstCab,"Select the first cab in the Cabs result page");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to verify the title contains the text 'Cab Booking'
	 */
	public void verifyCabsPageTitle2() {
		webDriverHelperObj.verifyTitle("Cab Booking","Verifying the title of the Cabs Result Page");
	}

}
