package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.GoibiboHotelsPageUI;
import utils.ExcelReader;
import utils.WebDriverHelper;

/**
 * @author Ajinkya Pathare
 */
public class GoibiboHotelsPage {

	WebDriver driver;
	WebDriverHelper webDriverHelperObj;
	ExtentTest extentTestObj;

	/**
	 * /**
	 * @author Ajinkya Pathare 
	 * @summary Making driver and extentTestIbj accessible everywhere
	 * @param driver
	 * @param extentTestObj
	 */
	public GoibiboHotelsPage(WebDriver driver, ExtentTest extentTestObj) {
		this.driver = driver;
		webDriverHelperObj = new WebDriverHelper(driver, extentTestObj);
		this.extentTestObj = extentTestObj; 
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @summary Clicking on India Radio Button
	 * @param driver
	 */
	public void clickOnIndiaRadioButton() {
		webDriverHelperObj.clickOnElement(GoibiboHotelsPageUI.IndiaRadioButton, "Click on India Radio Button");
	}
	
	
	/**
	 * @author Ajinkya Pathare	
	 * @summary Click on Input Search Bar
	 */
	public void clickOnInputSearchBar() {
		webDriverHelperObj.clickOnElement(GoibiboHotelsPageUI.InputSearchBar, "Click on Input Search Bar");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @summary Enter a value in the input search bar and perform search actions
	 */
	public void sendValueInInputSearchBar() {
	    String value = ExcelReader.readValuesFromExcel("Goibibo", 9, 1);
	    webDriverHelperObj.sendKeys(GoibiboHotelsPageUI.InputSearchBar, value, "Entered value in search bar");
	    webDriverHelperObj.enterAction(GoibiboHotelsPageUI.InputSearchBar, Keys.ARROW_DOWN, "Perform Arrow Down Action in Search Bar");
	    try {
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    webDriverHelperObj.enterAction(GoibiboHotelsPageUI.InputSearchBar, Keys.ENTER, "Perform Enter Action in Input Search Bar");
	}

	
	/**
	 * @author Ajinkya Pathare
	 * @summary Enter a value related to Jaipur in the input search bar and perform search actions
	 */
	public void sendValueInInputSearchBarJaipur() {
	    String value = ExcelReader.readValuesFromExcel("Goibibo", 9, 2);
	    webDriverHelperObj.sendKeys(GoibiboHotelsPageUI.InputSearchBar, value, "Entered value in search bar");
	    webDriverHelperObj.enterAction(GoibiboHotelsPageUI.InputSearchBar, Keys.ARROW_DOWN, "Perform Arrow Down in Input Search Bar");
	    try {
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    webDriverHelperObj.enterAction(GoibiboHotelsPageUI.InputSearchBar, Keys.ENTER, "Perform Enter Action in Input Search Bar");
	}

	
	/**
	 * @author Ajinkya Pathare
	 * @summary Click on the open calendar icon to select a date
	 */
	public void clickOnOpenCalendar() {
	    webDriverHelperObj.clickOnElement(GoibiboHotelsPageUI.openCalendar, "Click on calendar");
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Select the 20th of June from the calendar
	 */
	public void select20thJune() {
	    webDriverHelperObj.clickOnElement(GoibiboHotelsPageUI._20thJune24Date, "Click on 20th June");
	}

	
	/**
	 * @author Ajinkya Pathare
	 * @summary Select the 23rd of June from the calendar
	 */
	public void select23rdJune() {
	    webDriverHelperObj.clickOnElement(GoibiboHotelsPageUI._23rdJune24Date, "Click on 23rd June");
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Click on the "Guests and Rooms" section
	 */
	public void clickOnGuestsAndRooms() {
	    webDriverHelperObj.clickOnElement(GoibiboHotelsPageUI.guestsAndRooms, "Click on guests and rooms");
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Increment the child count by one
	 */
	public void incrementChildCount() {
	    webDriverHelperObj.clickOnElement(GoibiboHotelsPageUI.incrementChildrenCount, "Increment child count by one");
	}

	
	/**
	 * @author Ajinkya Pathare
	 * @summary Decrement the child count by one
	 */
	public void decrementChildCount() {
	    webDriverHelperObj.clickOnElement(GoibiboHotelsPageUI.decrementChildrenCount, "Decrement child count by one");
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Click on the child age option
	 */
	public void selectChildAgeOption() {
	    webDriverHelperObj.clickOnElement(GoibiboHotelsPageUI.selectChildAgeOption, "Click On child age option");
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Select the age option for a child (e.g., age 3)
	 */
	public void selectAge3() {
	    webDriverHelperObj.clickOnElement(GoibiboHotelsPageUI.selectAge3, "Click On child age 3");
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Click on the "Done" button
	 */
	public void clickOnDoneButton() {
	    webDriverHelperObj.clickOnElement(GoibiboHotelsPageUI.doneButton, "Click On Done Button");
	}

	
	/**
	 * @author Ajinkya Pathare
	 * @summary Click on the search button
	 */
	public void clickOnSearchButton() {
	    webDriverHelperObj.clickOnElement(GoibiboHotelsPageUI.searchButton, "Click On Search Button");
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Select the 12th of June from the calendar
	 */
	public void select12thJune() {
	    webDriverHelperObj.clickOnElement(GoibiboHotelsPageUI._12thJune24Date, "Click on 12th June");
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Select the 15th of June from the calendar
	 */
	public void select15thJune() {
	    webDriverHelperObj.clickOnElement(GoibiboHotelsPageUI._15thJune24Date, "Click on 15th June");
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Select the age option for a child (e.g., age 4)
	 */
	public void selectAge4() {
	    webDriverHelperObj.clickOnElement(GoibiboHotelsPageUI.selectAge4, "Click On child age 4");
	}


}
