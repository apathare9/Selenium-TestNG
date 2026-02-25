package pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.ExtentTest;

import uistore.GoibiboBusSearchPageUI;
import utils.WebDriverHelper;

/**
 * @author Ajinkya PatharePrajwal Sinha
 * @Summary This class contains various methods related to Bus Search Page
 */

public class GoibiboBusSearchPage {

	WebDriver driver;
	WebDriverHelper webDriverHelperObj;
	ExtentTest extentTestObj;

	public GoibiboBusSearchPage(WebDriver driver, ExtentTest extentTestObj) {
		this.driver = driver;
		webDriverHelperObj = new WebDriverHelper(driver, extentTestObj);
		this.extentTestObj = extentTestObj;
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to select live tracking filter in Bus Search Page
	 */

	public void selectLiveTracking() {
		webDriverHelperObj.clickOnElement(GoibiboBusSearchPageUI.LiveTracking, "selected checkbox Live Tracking");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to select Go Deal Discount filter in Bus Search Page
	 */

	public void selectGoDealDiscount() {
		webDriverHelperObj.clickOnElement(GoibiboBusSearchPageUI.GoDeal, "selected checkbox Go Deal Discount");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to scroll down to amenities in Bus Search Page
	 */

	public void scrollDownToAmenities() {
		webDriverHelperObj.scrollOverElement(GoibiboBusSearchPageUI.Amenities, "scrolled down to Amenities");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to select water bottle filter in Bus Search Page
	 */

	public void selectWaterBottle() {
		webDriverHelperObj.clickOnElement(GoibiboBusSearchPageUI.WaterBottle, "selected checkbox Water Bottle");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to click on bus header in Bus Search Page
	 */

	public void clickOnBus() {
		webDriverHelperObj.clickOnElement(GoibiboBusSearchPageUI.Bus, "Clicked On Bus");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to select Primo filter in Bus Search Page
	 */

	public void clickOnPrimo() {
		webDriverHelperObj.clickOnElement(GoibiboBusSearchPageUI.Primo, "Clicked On Primo Bus Filter");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to select AC filter in Bus Search Page
	 */

	public void selectAcFiletr() {
		webDriverHelperObj.clickOnElement(GoibiboBusSearchPageUI.AC, "selected checkbox AC");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to click on show amenities in Bus Search Page
	 */

	public void clickOnShowAmenities() {
		webDriverHelperObj.jsClick(GoibiboBusSearchPageUI.ShowAmenities);
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to select Blankets filter in Bus Search Page
	 */

	public void selectBlankets() {
		webDriverHelperObj.clickOnElement(GoibiboBusSearchPageUI.Blankets, "selected checkbox Blankets");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to navigate back to previous page
	 */

	public void navigateBack() {
		driver.manage().deleteAllCookies();
		driver.navigate().back();
		driver.manage().deleteAllCookies();
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to print number of buses for selected filter in Bus Search Page
	 */
	
	public void numberOfBuses() {
		String numberOfBuses = webDriverHelperObj.getText(GoibiboBusSearchPageUI.NumberOfBuses, "Number of Buses for selected filter");
		System.out.println(numberOfBuses);
		System.out.println("--------------");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This method is used to print list of buses with prices in Bus Search Page
	 */
	
	public  void printListOfBuses() {
        WebElement busesSection = driver.findElement(GoibiboBusSearchPageUI.BusesSection);
        List<WebElement> busesNames = busesSection.findElements(GoibiboBusSearchPageUI.BusesList);
        List<WebElement> busesPrices = busesSection.findElements(GoibiboBusSearchPageUI.BusesPrices);

        Map<String, String> busNamesWithPrices = new HashMap<>();
        for (int i = 0; i < busesNames.size(); i++) {
        	busNamesWithPrices.put(busesNames.get(i).getText(), busesPrices.get(i).getText());
        }

        Map<String, Integer> convertedMap = new HashMap<>();
        for (Map.Entry<String, String> entry : busNamesWithPrices.entrySet()) {
            String valueStr = entry.getValue();
            try {
                int value = Integer.parseInt(valueStr);
                if (value < 1197) {
                    convertedMap.put(entry.getKey(), value);
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid value for key '" + entry.getKey() + "': " + valueStr);
            }
            
        }

        for (Map.Entry<String, Integer> entry : convertedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("--------------");
    }

}
