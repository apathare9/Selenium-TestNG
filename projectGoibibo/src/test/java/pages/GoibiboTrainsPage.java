package pages;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.GoibiboTrainsPageUI;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.PropertyFileReader;
import utils.WebDriverHelper;

/**
 *@author Ajinkya Pathare
 * @param driver: WebDriver object
 * @param extentTestObj: ExtentTest Object
 */
public class GoibiboTrainsPage {

	WebDriver driver;
	ExtentTest extentTestObj;
	WebDriverHelper webDriverHelperObj;

	public GoibiboTrainsPage(WebDriver driver, ExtentTest extentTestObj) {
		this.driver = driver;
		this.extentTestObj = extentTestObj;
		webDriverHelperObj = new WebDriverHelper(driver, extentTestObj);
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to click on the 'From' field in the trains page
	 */
	public void clickFromField() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.fromTrains, 15);
		webDriverHelperObj.clickOnElement(GoibiboTrainsPageUI.fromTrains,"The field 'From' in the trains page is clicked");
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to read data from the excel and print the data in the 'From' field
	 */
	public void inputFromData1() {
//		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");

		try {
			String fromLocation = ExcelReader.readValuesFromExcel("Goibibo", 11, 1);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.enterFromData, 15);
			webDriverHelperObj.sendKeys(GoibiboTrainsPageUI.enterFromData,fromLocation, "The text Coimbatore is entered in the 'From' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to select the option Coimbatore Main Junction from the list
	 */
	public void clickMainJunction() {

		webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.mainJunction, 15);
		webDriverHelperObj.scrollToClick(GoibiboTrainsPageUI.mainJunction,"CBE, Coimbatore Main Junction is selected from the list");
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to click on the 'To' field in the trains page
	 */
	public void clickToField() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.toTrains, 15);
		webDriverHelperObj.clickOnElement(GoibiboTrainsPageUI.toTrains,"The field 'To' in the trains page is clicked");
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to read data from the excel and print the data in the 'To' field
	 */
	public void inputToData1() {
//		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");

		try {
			String toLocation = ExcelReader.readValuesFromExcel("Goibibo", 11, 2);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.enterToData, 15);
			webDriverHelperObj.sendKeys(GoibiboTrainsPageUI.enterToData,toLocation, "The text Chennai is entered in the 'To' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to select the option Chennai - All Stations from the list
	 */
	public void clickAllStations() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.allStations, 15);
		webDriverHelperObj.clickOnElement(GoibiboTrainsPageUI.allStations,"MAS, Chennai - All Stations is selected from the list");
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to select the departure date from the below calendar
	 */
	public void selectDate() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.date, 15);
		webDriverHelperObj.scrollToClick(GoibiboTrainsPageUI.date,"Departure date is selected from the calendar");
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to click on the Search Trains button
	 */
	public void clickSearchTrains() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.searchTrains, 15);
		webDriverHelperObj.clickOnElement(GoibiboTrainsPageUI.searchTrains,"Search Trains button is clicked");
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to read data from the excel and print the data in the 'From' field
	 */
	public void inputFromData2() {
//		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");

		try {
			String fromLocation = ExcelReader.readValuesFromExcel("Goibibo", 12, 1);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.enterFromData, 15);
			webDriverHelperObj.sendKeys(GoibiboTrainsPageUI.enterFromData,fromLocation, "The text Pune is entered in the 'From' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to select the option PUNE, Pune Junction from the list
	 */
	public void clickpuneJunction() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.puneJunction, 15);
		webDriverHelperObj.clickOnElement(GoibiboTrainsPageUI.puneJunction,"PUNE, Pune Junction is selected from the list");
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to read data from the excel and print the data in the 'To' field
	 */
	public void inputToData2() {
//		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");

		try {
			String toLocation = ExcelReader.readValuesFromExcel("Goibibo", 12, 2);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.enterToData, 15);
			webDriverHelperObj.sendKeys(GoibiboTrainsPageUI.enterToData,toLocation, "The text Mumbai is entered in the 'To' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to select the option CSTM, Mumbai CST from the list
	 */
	public void clickmumbaiCst() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.mumbaiCst, 15);
		webDriverHelperObj.clickOnElement(GoibiboTrainsPageUI.mumbaiCst,"CSTM, Mumbai CST is selected from the list");
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to select the departure date from the below calendar
	 */
	public void selectDepartureDate() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.date, 15);
		webDriverHelperObj.scrollToClick(GoibiboTrainsPageUI.departureDate,"Departure date is selected from the calendar");
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to read data from the excel and print the data in the 'From' field
	 */
	public void inputFromData3() {
//		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");

		try {
			String fromLocation = ExcelReader.readValuesFromExcel("Goibibo", 13, 1);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.enterFromData, 15);
			webDriverHelperObj.sendKeys(GoibiboTrainsPageUI.enterFromData,fromLocation, "The text Hyderabad is entered in the 'From' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to select the option HYB, Hyderabad Deccan from the list
	 */
	public void clickDeccan() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.deccan, 15);
		webDriverHelperObj.scrollToClick(GoibiboTrainsPageUI.deccan,"HYB, Hyderabad Deccan is selected from the list");
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to read data from the excel and print the data in the 'To' field
	 */
	public void inputToData3() {
//		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");

		try {
			String toLocation = ExcelReader.readValuesFromExcel("Goibibo", 13, 2);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.enterToData, 15);
			webDriverHelperObj.sendKeys(GoibiboTrainsPageUI.enterToData,toLocation, "The text Goa is entered in the 'To' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to select the option MAO, Madgaon Junction from the list
	 */
	public void clickMadgaonJunction() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.madgaonJunction, 15);
		webDriverHelperObj.scrollToClick(GoibiboTrainsPageUI.madgaonJunction,"MAO, Madgaon Junction is selected from the list");
	}

	/**
	 * @author Ajinkya Pathare
	 *  @Summary: This method is used to select the departure date from the below calendar
	 */
	public void selectGoingDate() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboTrainsPageUI.selectDate, 15);
		webDriverHelperObj.scrollToClick(GoibiboTrainsPageUI.selectDate,"Departure date is selected from the calendar");
	}

	public void clickOnTrains() {

		webDriverHelperObj.clickOnElement(GoibiboTrainsPageUI.clickOnTrains, "Click on Trains");

	}

	public void clickOnTrainsFromBox() {

		webDriverHelperObj.wait(1000);
		webDriverHelperObj.clickOnElement(GoibiboTrainsPageUI.clickOnTrainsFromBox, "Click on From Trains Box");

	}

	public void enterTrainForMumbai() {

		webDriverHelperObj.wait(1000);
		String Mumbai = ExcelReader.readValuesFromExcel("Goibibo", 10, 1);
		webDriverHelperObj.sendKeys(GoibiboTrainsPageUI.enterTrainForMumbai, Mumbai, "Enter Train From Mumbai");
 
	}
 
	public void clickOnMumbaiAllStations() {

		webDriverHelperObj.wait(1000);
		webDriverHelperObj.scrollToClick(GoibiboTrainsPageUI.clickOnMumbaiAllStations, "Click on Mumbai");

	} 
 
	public void clickOnTrainsToBox() {

		webDriverHelperObj.wait(1000);
		webDriverHelperObj.clickOnElement(GoibiboTrainsPageUI.clickOnTrainsToBox, "Click on Trains to Box");

	}

	public void enterTrainForPune() {

		webDriverHelperObj.wait(1000);
		String Pune = ExcelReader.readValuesFromExcel("Goibibo", 10, 2);
		webDriverHelperObj.sendKeys(GoibiboTrainsPageUI.enterTrainForPune, Pune, "Enter Trains for Pune");

	}

	public void clickOnPuneAllStations() {

		webDriverHelperObj.wait(1000);
		webDriverHelperObj.scrollToClick(GoibiboTrainsPageUI.clickOnPuneAllStations, "Click on Pune All Staions");
		
	}

	public void clickOnTrainDeparture() {
		
		webDriverHelperObj.clickOnElement(GoibiboTrainsPageUI.clickOnTrainDeparture, "Click on Train Departure");
			
	}

	public void clickOn16() {
	
		webDriverHelperObj.wait(1000);
		webDriverHelperObj.scrollToClick(GoibiboTrainsPageUI.clickOn16, "Click on 16th June");
			
	}

	public void clickOnSearchTrains() {
		
		webDriverHelperObj.scrollToClick(GoibiboTrainsPageUI.clickOnSearchTrains, "Scroll to Search Trains & Click on it");
		webDriverHelperObj.wait(1000);
			
	}
	
}
