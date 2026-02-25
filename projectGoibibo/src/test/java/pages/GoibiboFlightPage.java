package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.GoibiboFlightPageUI;
import utils.ExcelReader;
import utils.WebDriverHelper;

/**
 * @throws InterruptedException
 * @author Ajinkya Pathare
 * @Date 6/7/2024
 * @Summary Navigating through Home Page to Search Flights Available form Mumbai to Delhi. 
 */ 

public class GoibiboFlightPage {

	WebDriver driver;
	WebDriverHelper wdh;
	ExtentTest test;

	public GoibiboFlightPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		wdh = new WebDriverHelper(driver, test);
		this.test = test;
	}

	public void hidePopUp() {

		wdh.wait(1000);
		wdh.clickOnElement(GoibiboFlightPageUI.hidePopUp, "Click on Popup Cancellation Button");

	}

	public void hideOfferPopUp() {

		wdh.clickOnElement(GoibiboFlightPageUI.hideOfferPopUp, "Click on Offers Pop up Cancellation Button");

	}

	public void clickOnFromBox() {

		wdh.clickOnElement(GoibiboFlightPageUI.clickOnFromBox, "Click on From Box");

	}

	public void enterMumbai() {

		String Mumbai = ExcelReader.readValuesFromExcel("Goibibo", 8, 1);
		wdh.sendKeys(GoibiboFlightPageUI.enterMumbai, Mumbai, "Enter Mumbai");

	}

	public void pressEnterOnMumbai() {

		wdh.wait(1000);
		wdh.enterAction(GoibiboFlightPageUI.enterMumbai, Keys.ENTER ,"Enter Mumbai");

	}

	public void enterDelhi() {

		String Delhi = ExcelReader.readValuesFromExcel("Goibibo", 8, 2);
		wdh.sendKeys(GoibiboFlightPageUI.enterDelhi, Delhi, "Enter Delhi");

	}

	public void pressEnterOnDelhi() {

		wdh.wait(1000);
		wdh.enterAction(GoibiboFlightPageUI.enterDelhi, Keys.ENTER , "Press Enter on Delhi");

	}

	public void clickOnDeparture() {

		wdh.clickOnElement(GoibiboFlightPageUI.clickOnDeparture, "Click on Departure");

	}

	public void clickOn15() {

		wdh.wait(1000);
		wdh.clickOnElement(GoibiboFlightPageUI.clickOn15, "Click on 15th June");

	}

	public void clickOnReturn() {

//			wdh.click(GoibiboFlightPageUI.clickOnReturn);

		wdh.clickOnElement(GoibiboFlightPageUI.clickOnReturn, "Click on Return");

	}

	public void clickOn20() {

		wdh.wait(1000);
		wdh.clickOnElement(GoibiboFlightPageUI.clickOn20, "Click on 20th June");

	}

	public void clickOnTravellers() {

		wdh.clickOnElement(GoibiboFlightPageUI.clickOnTravellers, "Click on Travellers");

	}

	public void increaseChildCount() {
				
		wdh.clickOnElement(GoibiboFlightPageUI.increaseChildCount, "Increase Child Count ");
			
	}

	public void clickOnEconomy() {
			
		wdh.clickOnElement(GoibiboFlightPageUI.clickOnEconomy, "Click on Economy");
			
	}

	public void clickOnDone() {
			
		wdh.clickOnElement(GoibiboFlightPageUI.clickOnDone, "Click on Done");
			
	}

	public void clickOnSearchFlights() {
		
		wdh.clickOnElement(GoibiboFlightPageUI.clickOnSearchFlights, "Click on Search Flights");
			
	}
	
	public void verifyTitle() {
		wdh.verifyTitle( "Book Cheap Flights", "Verify the Title");
	}

	public void backToHomePage() {
		wdh.wait(1000);
		driver.navigate().back();
	}
}
