package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.GoibiboHomePageUI;
import uistore.GoibiboHotelsDescriptionPageUI;
import utils.WebDriverHelper;

/**
 * @author Ajinkya Pathare
 */
public class GoIbiboHotelsDescriptionPage {
	
	WebDriver driver;
	WebDriverHelper webDriverHelperObj;
	ExtentTest extentTestObj;
	
	/**
	 * @author Ajinkya Pathare 
	 * @summary Making driver and extentTestIbj accessible everywhere
	 * @param driver
	 * @param extentTestObj
	 */
	public GoIbiboHotelsDescriptionPage(WebDriver driver, ExtentTest extentTestObj) { 
		this.driver = driver;
		webDriverHelperObj = new WebDriverHelper(driver, extentTestObj);
		this.extentTestObj = extentTestObj; 
	}
	
	/**
	 * @author Ajinkya Pathare 
	 * @summary Clicking on Free Cancelation
	 */
	public void clickOnFreeCancelation() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		webDriverHelperObj.clickOnElement(GoibiboHotelsDescriptionPageUI.freeCancelation, "Click on Free Cancelation");
	}

	/**
	 * @author Ajinkya Pathare 
	 * @summary Clicking on Select Room
	 */
	public void clickOnSelectRoom() {
		webDriverHelperObj.clickOnElement(GoibiboHotelsDescriptionPageUI.selectRoom, "Click on Select Room Button");
	}
	
	/**
	 * @author Ajinkya Pathare 
	 * @summary Clicking on Hotels Navigation Bar
	 */
	public void clickOnHotelsNavigationBar() {
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.hotels , "Click on Hotels Button");
	}
	
	

	
}
