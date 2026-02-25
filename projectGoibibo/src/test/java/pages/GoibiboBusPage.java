package pages;

import java.time.Duration;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.GoibiboBusPageUI;
import utils.ExcelReader;
import utils.WebDriverHelper;

/**
 * @author Ajinkya Pathare
 * @Summary This class contains various methods related to Bus Page
 */

public class GoibiboBusPage {

	WebDriver driver;
	WebDriverHelper webDriverHelperObj;
	ExtentTest extentTest;

	public GoibiboBusPage(WebDriver driver, ExtentTest extentTest) {
		this.driver = driver;
		webDriverHelperObj = new WebDriverHelper(driver, extentTest);
		this.extentTest = extentTest;
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to send input in From section in Bus Page
	 */

	public void enterBangloreLocation() { 
		String value = ExcelReader.readValuesFromExcel("Goibibo", 15, 1);
		webDriverHelperObj.sendKeys(GoibiboBusPageUI.from, value, "Entered Source Location");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to select option in From section in Bus Page
	 */

	public void selectBangloreLocation() {
		webDriverHelperObj.clickOnElement(GoibiboBusPageUI.fromOption1, "Selected Option");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to enter data in To section in Bus Page
	 */

	public void enterHyderabadLocation() {
		String value = ExcelReader.readValuesFromExcel("Goibibo", 15, 2);
		webDriverHelperObj.sendKeys(GoibiboBusPageUI.to, value, "Entered Destination Location");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to select option in To section in Bus Page
	 */

	public void selectHyderabadLocation() {
		webDriverHelperObj.clickOnElement(GoibiboBusPageUI.toOption1, "Selected Option");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to select select date in Bus Page
	 */

	public void selectTravelDate10June() {
		webDriverHelperObj.clickOnElement(GoibiboBusPageUI.travelDate, "Clicked on Travel date");
		webDriverHelperObj.clickOnElement(GoibiboBusPageUI._10June2024_, "Date selected");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to click on Search Bus page in Bus Page
	 */

	public void clickOnSearch() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriverHelperObj.clickOnElement(GoibiboBusPageUI.search, "Clicked on Search");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to delete previously filled data in From section in Bus page
	 */

	public void deleteFromInputSection() {
		driver.manage().deleteAllCookies();
		webDriverHelperObj.deleteText(GoibiboBusPageUI.from, "Deleted previously populated text in 'From' input bar");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to delete previously filled data in To section in Bus page
	 */
	
	public void deleteToInputSection() {
		driver.manage().deleteAllCookies();
		webDriverHelperObj.deleteText(GoibiboBusPageUI.to, "Deleted previously populated text in 'To' input bar");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to send input in From section in Bus Page
	 */

	public void enterJaipurLocation() {
		String value = ExcelReader.readValuesFromExcel("Goibibo", 16, 1);
		webDriverHelperObj.sendKeys(GoibiboBusPageUI.from, value, "Entered Source Location");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to select option in From section in Bus Page
	 */

	public void selectJaipurLocation() {
		webDriverHelperObj.clickOnElement(GoibiboBusPageUI.fromOption2, "Selected Option");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to enter data in To section in Bus Page
	 */

	public void clearToInputSection() {
		webDriverHelperObj.clearText(GoibiboBusPageUI.to, "Cleared To Input bar");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to enter data in To section in Bus Page
	 */

	public void enterUdaipurLocation() {
		String value = ExcelReader.readValuesFromExcel("Goibibo", 16, 2);
		webDriverHelperObj.sendKeys(GoibiboBusPageUI.to, value, "Entered Destination Location");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to select option in To section in Bus Page
	 */

	public void selectUdaipurLocation() {
		webDriverHelperObj.clickOnElement(GoibiboBusPageUI.toOption2, "Selected Option");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to select select date in Bus Page
	 */

	public void selectTravelDate20June() {
		webDriverHelperObj.clickOnElement(GoibiboBusPageUI.travelDate, "Clicked on Travel Date");
		webDriverHelperObj.clickOnElement(GoibiboBusPageUI._20June2024_, "Date Selected");
	}
 
	/**
	 * @author Ajinkya Pathare
	 * @summary Clicks on the "Bus" option
	 */
	public void clickOnBus() {
	    webDriverHelperObj.clickOnElement(GoibiboBusPageUI.clickOnBus, "Click on Bus");
	}
 
	/**
	 * @author Ajinkya Pathare
	 * @summary Clicks on the "Bus From" option
	 */
	public void clickOnBusFrom() {
	    webDriverHelperObj.clickOnElement(GoibiboBusPageUI.clickOnBusFrom, "Click on Bus From");
	}
 
	/**
	 *@author Ajinkya Pathare
	 * @summary Enters the source location (Delhi) in the bus search
	 */
	public void enterBusFromDelhi() {
	    String Delhi = ExcelReader.readValuesFromExcel("Goibibo", 14, 1);
	    webDriverHelperObj.sendKeys(GoibiboBusPageUI.enterBusFromDelhi, Delhi, "Successfully entered Delhi");
	}
 
	/**
	 * @author Ajinkya Pathare
	 * @summary Clicks on the source location (Delhi) in the dropdown
	 */
	public void clickOnDelhi() {
	    webDriverHelperObj.wait(1000);
	    webDriverHelperObj.scrollToClick(GoibiboBusPageUI.clickOnDelhi, "Clicked on Delhi");
	}
 
	/**
	 * @author Ajinkya Pathare
	 * @summary Clicks on the "Bus To" option
	 */
	public void clickOnBusTo() {
	    webDriverHelperObj.clickOnElement(GoibiboBusPageUI.clickOnBusTo, "Clicked on 'Bus to'");
	}
 
	/**
	 * @author Ajinkya Pathare
	 * @summary Enters the destination location (Agra) in the bus search
	 */
	public void enterBusToAgra() {
	    String Agra = ExcelReader.readValuesFromExcel("Goibibo", 14, 2);
	    webDriverHelperObj.sendKeys(GoibiboBusPageUI.enterBusToAgra, Agra, "Entered Bus to Agra");
	}
 
	/**
	 * @author Ajinkya Pathare
	 * @summary Clicks on the destination location (Agra) in the dropdown
	 */
	public void clickOnAgra() {
	    webDriverHelperObj.wait(1000);
	    webDriverHelperObj.scrollToClick(GoibiboBusPageUI.clickOnAgra, "Click on Agra");
	}
 
	/**
	 * @author Ajinkya Pathare
	 * @summary Clicks on the date field
	 */
	public void clickOnDate() {
	    webDriverHelperObj.clickOnElement(GoibiboBusPageUI.clickOnDate, "Click on Date");
	}
 
	/**
	 * @author Ajinkya Pathare
	 * @summary Clicks on the 17th of June in the calendar
	 */
	public void clickOn17June() {
	    webDriverHelperObj.wait(1000);
	    webDriverHelperObj.clickOnElement(GoibiboBusPageUI.clickOn17June, "Click on 17th June");
	}
 
	/**
	 * @author Ajinkya Pathare
	 * @summary Clicks on the "Search Buses" button
	 */
	public void clickOnSearchBuses() {
	    webDriverHelperObj.scrollToClick(GoibiboBusPageUI.clickOnSearchBuses, "Click on Search Buses");
	}


}
