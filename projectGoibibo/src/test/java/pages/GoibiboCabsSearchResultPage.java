package pages;

import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.Status;


import uistore.GoibiboCabsSearchResultPageUI;
import utils.ExcelReader;

import utils.WebDriverHelper;


public class GoibiboCabsSearchResultPage {
	WebDriver driver;
	WebDriverHelper webDriverHelperObj;
	ExtentTest test;

	public GoibiboCabsSearchResultPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		webDriverHelperObj = new WebDriverHelper(driver, test);

	}

	/**
	 * @author Ajinkya Pathare Date-08/06/2024
	 * @summary This method
	 */
	public void payAndConfirmFunctionality() {
		try {
			webDriverHelperObj.tabSwitch("Switched to new window");

			webDriverHelperObj.jsScrollDown(GoibiboCabsSearchResultPageUI.dzireOrSimilarCarModelFilter, 900,
					"Scrolled till car model filter");
			webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsSearchResultPageUI.dzireOrSimilarCarModelFilter, 5);
			webDriverHelperObj.clickOnElement(GoibiboCabsSearchResultPageUI.dzireOrSimilarCarModelFilter,
					"Clicked on dzire or similar in car model filter");

			webDriverHelperObj.jsScrollDown(GoibiboCabsSearchResultPageUI.firstCarSelectButton, -900,
					"Scrolled till car select button");

			webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsSearchResultPageUI.firstCarSelectButton, 10);
			webDriverHelperObj.clickOnElement(GoibiboCabsSearchResultPageUI.firstCarSelectButton,
					"Clicked on first car select button");
			webDriverHelperObj.clickOnElement(GoibiboCabsSearchResultPageUI.payAndConfirmNowButton,
					"Clicked on pay and confirm now");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @author Ajinkya Pathare Date-08/06/2024
	 * @summary This method
	 */
	public void travellerDetailsFunctionality() {
		webDriverHelperObj.jsScrollDown(GoibiboCabsSearchResultPageUI.genderDropdown, 500,
				"Scrolled till gendre dropdown button on cabs search result page");
		webDriverHelperObj.dropDown(GoibiboCabsSearchResultPageUI.genderDropdown, "F",
				"Selected female value in gender dropdown");

		String nameInputData = ExcelReader.readValuesFromExcel("Goibibo", 4, 3);
		webDriverHelperObj.sendKeys(GoibiboCabsSearchResultPageUI.nameInputField, nameInputData,
				"Entered data in name input field in traveller details");

		String mobileInputData = ExcelReader.readValuesFromExcel("Goibibo", 4, 4);
		webDriverHelperObj.sendKeys(GoibiboCabsSearchResultPageUI.mobileNumberInputField, mobileInputData,
				"Entered data in mobile number input field in traveller details");

		String emailInputData = ExcelReader.readValuesFromExcel("Goibibo", 4, 5);
		webDriverHelperObj.sendKeys(GoibiboCabsSearchResultPageUI.emailInputField, emailInputData,
				"Entered data in email input field in traveller details");

		webDriverHelperObj.clickOnElement(GoibiboCabsSearchResultPageUI.signInsignUpField,
				"Clicked on signin/signup field");

	}

	/**
	 * @author Ajinkya Pathare Date-08/06/2024
	 * @summary This method verifies if login/signup text is displayed or not
	 */
	public void verifyLoginSignupFunctionality() {

		webDriverHelperObj.verifyText(GoibiboCabsSearchResultPageUI.loginSignUp, "Login/Signup",
				"login and sign up text verified");

		webDriverHelperObj.writeToReportScreenshot(Status.PASS, "Verified Login & Sign up Functionality");

	}
}
