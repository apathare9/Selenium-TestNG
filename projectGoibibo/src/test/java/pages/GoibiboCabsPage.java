package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import uistore.GoibiboCabsPageUI;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.PropertyFileReader;
import utils.WebDriverHelper;

/**
 * @author Ajinkya Pathare
 * @param driver: WebDriver object
 * @param extentTestObj: ExtentTest Object
 */
public class GoibiboCabsPage {

	WebDriver driver;
	ExtentTest extentTestObj;
	WebDriverHelper webDriverHelperObj;

	public GoibiboCabsPage(WebDriver driver, ExtentTest extentTestObj) {
		this.driver = driver;
		this.extentTestObj = extentTestObj;
		webDriverHelperObj = new WebDriverHelper(driver, extentTestObj);
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to click on the Airport transfer radio button in the cabs page
	 */
	public void clickAirportTransfer() {
		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.airportTransfer,"Airport transfer radio button in the cabs page is clicked");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to click on the 'From' field in the cabs page
	 */
	public void clickFromField() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.fromCabs, 15);
		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.fromCabs,"The field 'From' in the cabs page is clicked");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to read data from the excel and print the data in the 'From' field
	 */
	public void inputFromData1() {
//		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");
		try {
			String fromLocation = ExcelReader.readValuesFromExcel("Goibibo", 2, 1);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.inputFromData, 15);
			webDriverHelperObj.sendKeys(GoibiboCabsPageUI.inputFromData,fromLocation, "The text Coimbatore International Airport is entered in the 'From' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to select Coimbatore International Airport from the list
	 */
	public void selectcoimbatoreInternational() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.coimbatoreInternational, 15);
		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.coimbatoreInternational,"Coimbatore International Airport is selected from the list");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to click on the 'From' field in the cabs page
	 */
	public void clickToField() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.toCabs, 15);
		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.toCabs,"The field 'To' in the cabs page is clicked");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to read data from the excel and print the data in the 'To' field
	 */
	public void inputToData1() {
//		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");

		try {
			String toLocation = ExcelReader.readValuesFromExcel("Goibibo", 2, 2);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.inputToData, 15);
			webDriverHelperObj.sendKeys(GoibiboCabsPageUI.inputToData,toLocation, "The text Mettupalayam, Tamil Nadu, India\r\n"
					+ "is entered in the 'To' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to select Mettupalayam, Tamil Nadu, India from the list
	 */
	public void selectMettupalyam() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.mettupalayam, 15);
		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.mettupalayam,"Mettupalayam, Tamil Nadu, India\r\n"
				+ " is selected from the list");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to click on the 'pickup date' field
	 */
	public void clickPickUpDate() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.pickUpDate, 15);
		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.pickUpDate,"The field 'Pickup Date' is selected");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to select the pickup date from the below calendar
	 */
	public void selectPickUpDate1() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.selectDate, 15);
		webDriverHelperObj.scrollToClick(GoibiboCabsPageUI.selectDate,"The Pickup date is selected from the calendar");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to click on the 'pickup time' field
	 */
	public void clickPickUpTime() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.pickUpTime, 15);
		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.pickUpTime,"The field 'Pickup Time' is selected");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to select the pickup time from the drop down list
	 */
	public void selectPickUpTime1() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.selectTime, 15);
		webDriverHelperObj.scrollToClick(GoibiboCabsPageUI.selectTime,"The Pickup time is selected from the drop down list");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to click on the 'Search Cabs' button
	 */
	public void clickSearchCabs() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.searchCabs, 15);
		webDriverHelperObj.scrollToClick(GoibiboCabsPageUI.searchCabs,"Search cabs button is clicked");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to read data from the excel and print the data in the 'From' field
	 */
	public void inputFromData2() {
//		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");


		try {
			String fromLocation = ExcelReader.readValuesFromExcel("Goibibo", 3, 1);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.inputFromData, 15);
			webDriverHelperObj.sendKeys(GoibiboCabsPageUI.inputFromData,fromLocation, "The text Indira Gandhi International Airport, Delhi \r\n"
					+ " is entered in the 'From' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to select Indira Gandhi International Airport, Delhi from the list
	 */
	public void selectindiraGandhiAirport() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.indiraGandhiAirport, 15);
		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.indiraGandhiAirport,"Indira Gandhi International Airport, Delhi \r\n"
				+ " is selected from the list");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to read data from the excel and print the data in the 'To' field
	 */
	public void inputToData2() {

//		String sheetName = PropertyFileReader.loadProperties().getProperty("sheetName");

		try {
			String toLocation = ExcelReader.readValuesFromExcel("Goibibo", 3, 2);
			webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.inputToData, 15);
			webDriverHelperObj.sendKeys(GoibiboCabsPageUI.inputToData,toLocation, "The text Gurgaon, Haryana, India\r\n"
					+ "is entered in the 'To' field");
		}
		catch(Exception e) {
			LoggerHandler.error("Data is not inputed from the excel file");
		}
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to select Gurgaon, Haryana, India from the list
	 */
	public void selectGurgaon() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.gurgaon, 15);
		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.gurgaon,"Gurgaon, Haryana, India is selected from the list");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to select the pickup date from the below calendar
	 */
	public void selectPickUpDate2() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.selectPickUpDate, 15);
		webDriverHelperObj.scrollToClick(GoibiboCabsPageUI.selectPickUpDate,"The Pickup date is selected from the calendar");
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary: This method is used to select the pickup time from the drop down list
	 */
	public void selectPickUpTime2() {
		webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.selectPickUpTime, 15);
		webDriverHelperObj.scrollToClick(GoibiboCabsPageUI.selectPickUpTime,"The Pickup time is selected from the drop down list");
	}
	

	/**
	 * @author Ajinkya Pathare-08/06/2024
	 * @summary This method is used to search cabs from source to destination for
	 *          desired date and time
	 */
	public void searchCabsFunctionality() {
		try {
			webDriverHelperObj.tabSwitch("Switched to new window");
			webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.outstationOneWayRadioButton,
					"Clicked on outstation one way radio button");

			webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.pickupLocationSearchField,
					"Clicked on Pickup Location field on cabs page");
			String fromFieldData = ExcelReader.readValuesFromExcel("Goibibo", 4, 1);
			webDriverHelperObj.sendKeys(GoibiboCabsPageUI.pickupLocationSearchField, fromFieldData,
					"Entered data in pickup location firld");
			webDriverHelperObj.wait(2000);
			webDriverHelperObj.enterAction(GoibiboCabsPageUI.pickupLocationSearchField, Keys.ARROW_DOWN,
					"Down arrow action performed");
			webDriverHelperObj.enterAction(GoibiboCabsPageUI.pickupLocationSearchField, Keys.ENTER,
					"Enter action performed");

			webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.dropLocationSearchField,
					"Clicked on Drop Location field on cabs page");
			String toFieldData = ExcelReader.readValuesFromExcel("Goibibo", 4, 2);
			webDriverHelperObj.sendKeys(GoibiboCabsPageUI.dropLocationSearchField, toFieldData,
					"Entered data in drop location field");
			webDriverHelperObj.wait(2000);
			webDriverHelperObj.enterAction(GoibiboCabsPageUI.dropLocationSearchField, Keys.ARROW_DOWN,
					"Down arrow action performed");
			webDriverHelperObj.enterAction(GoibiboCabsPageUI.dropLocationSearchField, Keys.ENTER,
					"Enter action performed");

			webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.pickupDateInputField,
					"Clicked on pickup Date Input Field");

			webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.pickupDateValue, 5);
			webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.pickupDateValue, "Selected Date");

			webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.pickupTimeInputField,
					"Clicked on pickup Time Input Field");

			webDriverHelperObj.waitForElementToBeVisible(GoibiboCabsPageUI.pickupTimeValue, 5);
			webDriverHelperObj.jsScrollDown(GoibiboCabsPageUI.pickupTimeValue, 100, "Scrolled on pickup time field");

			webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.pickupTimeValue, "Selected Time");

			webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.searchCabsButton, "Clicked on Search Cabs");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * @author Aman Tiwari
	 */
	
public void clickOnCabs() {
		
		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.clickOnCabs, "Click on Cabs");
	
	}
	
	public void clickOnAirport() {
		
		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.clickOnAirport, "Click on Airport");
		
	}
	
	public void clickOnCabsFrom() {
			
		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.clickOnCabsFrom, "Click on Cabs From");
			
	}
	
	public void enterDelhiAirport() {

		String Delhi = ExcelReader.readValuesFromExcel("Goibibo", 1, 1);
		webDriverHelperObj.sendKeys(GoibiboCabsPageUI.enterDelhiAirport, Delhi, "Click on Delhi Airport");
			
	}
	
	public void clickOn1stSuggestionFromCabs() {
	
		webDriverHelperObj.wait(1000);
		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.clickOn1stSuggestionFromCabs, "Click on First Suggestion from Cabs");
			
	}
	
	public void clickOnCabsTo() {
				
		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.clickOnCabsTo, "Click on Cabs To");
		
	}
	
	public void enterMarriottDelhi() {
		
		String Marriott = ExcelReader.readValuesFromExcel("Goibibo", 1, 2);
		webDriverHelperObj.sendKeys(GoibiboCabsPageUI.enterMarriottDelhi, Marriott, "Enter value Marriott Delhi");
		
	}
	
	public void clickOn1stSuggestionToCabs() {
	
		webDriverHelperObj.wait(1000);
		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.clickOn1stSuggestionFromCabs, "Click on 1st suggestion from cabs");
			
	}
	
	public void clickOnPickUpDate() {

		webDriverHelperObj.clickOnElement(GoibiboCabsPageUI.clickOnPickUpDate, "Click on Pickup Date");
		
	}
	
	public void clickOn20thJune() {

		webDriverHelperObj.wait(1000);
		webDriverHelperObj.scrollToClick(GoibiboCabsPageUI.clickOn20thJune, "Click on 20th June");
	
	}
	
	public void clickOnSearchCabs() {
				
		webDriverHelperObj.scrollToClick(GoibiboCabsPageUI.clickOnSearchCabs, "Click on Search Cabs");
		
	}	


}
