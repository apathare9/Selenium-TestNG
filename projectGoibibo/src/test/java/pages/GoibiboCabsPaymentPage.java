package pages;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.GoibiboCabsPaymentPageUI;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.PropertyFileReader;
import utils.WebDriverHelper;

/**
 * @author Ajinkya Pathare
 * @param driver: WebDriver object
 * @param extentTestObj: ExtentTest Object
 */
public class GoibiboCabsPaymentPage {

	WebDriver driver;
	ExtentTest extentTestObj;
	WebDriverHelper webDriverHelperObj;

	public GoibiboCabsPaymentPage(WebDriver driver, ExtentTest extentTestObj) {
		this.driver = driver;
		this.extentTestObj = extentTestObj;
		webDriverHelperObj = new WebDriverHelper(driver, extentTestObj);
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to scroll the page until the traveller's field is visible
	 */
	public void scrollUptoTravellerDetails() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPaymentPageUI.travellerDetails,15);
		webDriverHelperObj.jsScroll(GoibiboCabsPaymentPageUI.travellerDetails,"The page is scrolled to the traveller's field");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to click on the 'Full Name' field in the Cabs payment page
	 */
	public void clickFullNameField() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPaymentPageUI.fullName, 15);
		webDriverHelperObj.clickOnElement(GoibiboCabsPaymentPageUI.fullName,"Click on the 'Full Name' field in the Cabs payment page");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to read data from the excel and print the data in the 'Name' field
	 */
	public void inputFullName1() {
//		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");

		try {
			String fromLocation = ExcelReader.readValuesFromExcel("Goibibo", 2, 3);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPaymentPageUI.fullName, 15);
			webDriverHelperObj.sendKeys(GoibiboCabsPaymentPageUI.fullName,fromLocation, "Full name of the traveller is entered in the 'Name' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to click on the 'Mobile Number' field in the Cabs payment page
	 */
	public void clickMobileNumberField() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPaymentPageUI.mobileNumber, 15);
		webDriverHelperObj.clickOnElement(GoibiboCabsPaymentPageUI.mobileNumber,"Click on the 'Mobile number' field in the Cabs payment page");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to read data from the excel and print the data in the 'Mobile Number' field
	 */
	public void inputMobileNumber1() {
//		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");

		try {
			String fromLocation = ExcelReader.readValuesFromExcel("Goibibo", 2, 4);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPaymentPageUI.mobileNumber, 15);
			webDriverHelperObj.sendKeys(GoibiboCabsPaymentPageUI.mobileNumber,fromLocation, "Mobile Number of the traveller is entered in the 'Mobile Number' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to click on the 'Email' field in the Cabs payment page
	 */
	public void clickEmailField() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPaymentPageUI.email, 15);
		webDriverHelperObj.clickOnElement(GoibiboCabsPaymentPageUI.mobileNumber,"Click on the 'Email' field in the Cabs payment page");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to read data from the excel and print the data in the 'Email' field
	 */
	public void inputEmail1() {
//		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");


		try {
			String fromLocation = ExcelReader.readValuesFromExcel("Goibibo", 2, 5);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPaymentPageUI.email, 15);
			webDriverHelperObj.sendKeys(GoibiboCabsPaymentPageUI.email,fromLocation, "Email of the traveller is entered in the 'Email' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to click on the 'Confirm and Pay' button
	 */
	public void clickConfirmAndPay() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPaymentPageUI.confirmAndPay, 15);
		webDriverHelperObj.clickOnElement(GoibiboCabsPaymentPageUI.confirmAndPay,"Click on the 'Confirm and Pay' button in the Cabs payment page");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to wait for a particular element to be visible
	 */
	public void waitForScreenshot1() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPaymentPageUI.screenshot, 15);
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to read data from the excel and print the data in the 'Name' field
	 */
	public void inputFullName2() {
//		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");

		try {
			String fromLocation = ExcelReader.readValuesFromExcel("Goibibo", 3, 3);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPaymentPageUI.fullName, 15);
			webDriverHelperObj.sendKeys(GoibiboCabsPaymentPageUI.fullName,fromLocation, "Full name of the traveller is entered in the 'Name' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to click on the 'Mobile Number' field in the Cabs payment page
	 */
	public void inputMobileNumber2() {
		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");

		try {
			String fromLocation = ExcelReader.readValuesFromExcel(sheetName, 3, 4);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPaymentPageUI.mobileNumber, 15);
			webDriverHelperObj.sendKeys(GoibiboCabsPaymentPageUI.mobileNumber,fromLocation, "Mobile Number of the traveller is entered in the 'Mobile Number' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to click on the 'Email' field in the Cabs payment page
	 */
	public void inputEmail2() {
		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");

		try {
			String fromLocation = ExcelReader.readValuesFromExcel(sheetName, 3, 5);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPaymentPageUI.email, 15);
			webDriverHelperObj.sendKeys(GoibiboCabsPaymentPageUI.email,fromLocation, "Email of the traveller is entered in the 'Email' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to wait for a particular element to be visible
	 */
	public void waitForScreenshot2() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPaymentPageUI.screenshot, 15);
	}



}
