package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.GoibiboHotelsSearchPageUI;
import utils.WebDriverHelper;


/**
 * @author Ajinkya Pathare
 */
public class GoibiboHotelsSearchPage {

	WebDriver driver;
	WebDriverHelper webDriverHelperObj;
	ExtentTest extentTestObj;

	/**
	 * @author Ajinkya Pathare
	 * @summary Initializes the GoibiboHotelsSearchPage class with WebDriver and test reporting objects
	 * @param driver An instance of the WebDriver class
	 * @param extentTestObj An object related to test reporting or logging using the ExtentTest framework
	 */
	public GoibiboHotelsSearchPage(WebDriver driver, ExtentTest extentTestObj) {
	    this.driver = driver;
	    webDriverHelperObj = new WebDriverHelper(driver, extentTestObj);
	    this.extentTestObj = extentTestObj;
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Scrolls to the top of the Hotels Search page
	 */
	public void scrollToTopHotelsSearchPage() {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    webDriverHelperObj.jsScrollTop(GoibiboHotelsSearchPageUI.clearFilter, 0);
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Clicks on the "Clear Filters" button
	 */
	public void clickOnClearFilters() {
	    webDriverHelperObj.clickOnElement(GoibiboHotelsSearchPageUI.clearFilter, "Click on Clear Filters");
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Clicks on the "Customer Ratings 4.5" option
	 */
	public void clickOnCustomerRatings45() {
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    webDriverHelperObj.clickOnElement(GoibiboHotelsSearchPageUI.CustomerRating, "Click on Customer Rating 4.5");
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Clicks on the "Free Breakfast Included" checkbox
	 */
	public void clickOnFreeBreakfastIncluded() {
	    webDriverHelperObj.clickOnElement(GoibiboHotelsSearchPageUI.freeBreakfastIncludedCheckBox, "Click on Free Breakfast Included");
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Scrolls to and clicks on the first hotel in the search results
	 */
	public void clickOnFirstHotel() {
	    webDriverHelperObj.scrollToClick(GoibiboHotelsSearchPageUI.firstHotel, "Click on First Hotel");
	}

}