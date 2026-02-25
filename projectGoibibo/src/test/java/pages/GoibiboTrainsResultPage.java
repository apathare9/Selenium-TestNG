package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.GoibiboTrainsResultPageUI;
import utils.WebDriverHelper;

/**
 * @author Ajinkya Pathare
 * @param driver: WebDriver object
 * @param extentTestObj: ExtentTest Object
 */
public class GoibiboTrainsResultPage {

	WebDriver driver;
	ExtentTest extentTestObj;
	WebDriverHelper webDriverHelperObj;

	public GoibiboTrainsResultPage(WebDriver driver, ExtentTest extentTestObj) {
		this.driver = driver;
		this.extentTestObj = extentTestObj;
		webDriverHelperObj = new WebDriverHelper(driver, extentTestObj);
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary This method is used to print the number of trains available on the selected date
	 */
	public void numberOfTrains() {
		System.out.println("Total number of trains available on the selected date: "+webDriverHelperObj.getNumberOfWebElements(GoibiboTrainsResultPageUI.listOfTrains,
				"Total number of trains available on the selected date is printed"));
	}

	/**
	 *  @author Ajinkya Pathare
	 *  @Summary This method is used to print the number of trains available on the selected date
	 */
	public void listOfTrains() {
		System.out.println("Total number of trains available on the selected date: "+webDriverHelperObj.getNumberOfWebElements(GoibiboTrainsResultPageUI.listOfTrains,
				"Total number of trains available on the selected date is printed"));
	}

}
