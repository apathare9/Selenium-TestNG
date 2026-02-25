package pages;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.GoibiboBusPageUI;
import uistore.GoibiboFlightPageUI;
import uistore.GoibiboFlightPageUI;
import uistore.GoibiboHomePageUI;
import utils.ExcelReader;
import utils.WebDriverHelper;

/**
 * @author Ajinkya Pathare
 */
public class GoibiboHomePage {

	WebDriver driver;
	WebDriverHelper webDriverHelperObj;
	ExtentTest extentTestObj;

	/**
	 * @author Ajinkya Pathare
	 * @summary Making driver and extentTestIbj accessible everywhere
	 * @param driver
	 * @param extentTestObj
	 */
	public GoibiboHomePage(WebDriver driver, ExtentTest extentTestObj) { // goibibo homepage
		this.driver = driver;
		webDriverHelperObj = new WebDriverHelper(driver, extentTestObj);
		this.extentTestObj = extentTestObj;
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Click on Login Pop up
	 */
	public void clickOnLoginPopUp() {
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.loginPopup, "Click on Login Pop Up");
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Click on Offers Pop up
	 */
	public void clickOnOffersPopUp() {
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.OffersPopup, "Click on Offers Pop Up");
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Click on Hotels
	 */

	public void clickOnHotels() {
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.hotels, "Click on Hotels Section");
	}

	/**
	 * @author Ajinkya Pathare
	 * @summary Click on Forex
	 */
	public void clickOnForex() {
		webDriverHelperObj.wait(1);
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.Forex, "Click on Forex Section");
	}

	/**
	 *@author Ajinkya Pathare
	 * @Summary: This method is used to click on the Trains option in the navigation
	 *           bar
	 */
	public void clickTrains() {
		webDriverHelperObj.wait(2000);
		driver.navigate().refresh();
		webDriverHelperObj.waitForElementToBeVisible(GoibiboHomePageUI.trains, 15);
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.trains, "Trains option in the navigation bar is clicked");
	}

	/**
	 *@author Ajinkya Pathare
	 * @Summary: This method is used to click on the Cabs option in the navigation
	 *           bar
	 */
	public void clickCabs() {
		webDriverHelperObj.wait(2000);
		driver.navigate().refresh();
		webDriverHelperObj.waitForElementToBeVisible(GoibiboHomePageUI.cabs, 15);
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.cabs, "Cabs option in the navigation bar is clicked");

	}

	/**
	 * @author Ajinkya Pathare
	 * @Description This is a method to close popup
	 */

	public void closePopup() {
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.Popup, "Popup Closed");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This is a method to click on Bus in Goibibo home page
	 */

	public void clickOnBus() {
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.Bus, "Clicked On Bus");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This is a method to scroll down to footer of Goibibo home page
	 */

	public void scrollToFooter() {
		webDriverHelperObj.scrollOverElement(GoibiboHomePageUI.AboutUsSection, "Scrooled to footer");
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description Method to click and verify About Us link from homepage footer
	 */

	public void clickAndVerifyAboutUs() {
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.AboutUs, "Clicked on About Us");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriverHelperObj.verifyURL("https://www.goibibo.com/aboutus/", "About Us - link verified");
		driver.navigate().back();
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description Method to click and verify Investor Relations link from homepage footer
	 */

	public void clickAndVerifyInvestorRelations() {
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.InvestorRelations, "Clicked on Investor Relations");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriverHelperObj.verifyURL("https://www.goibibo.com/info/investors-overview/",
				"Investor Relations - link verified");
		driver.navigate().back();
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description Method to click and verify Management link from homepage footer
	 */

	public void clickAndVerifyManagement() {
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.Management, "Clicked on Management");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriverHelperObj.verifyURL("https://www.goibibo.com/management/", "Management - link verified");
		driver.navigate().back();
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description Method to click and verify Terms of Services link from homepage footer
	 */

	public void clickAndVerifyTermsofServices() {
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.TermsofServices, "Clicked on Terms of Services");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriverHelperObj.verifyURL("https://www.goibibo.com/info/terms-of-services/",
				"Terms of Services - link verified");
		driver.navigate().back();
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description Method to click and verify User Agreement link from homepage footer
	 */

	public void clickAndVerifyUserAgreement() {
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.UserAgreement, "Clicked on User Agreement");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriverHelperObj.verifyURL("https://www.goibibo.com/info/user-agreement/", "User Agreement - link verified");
		driver.navigate().back();
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description Method to click and verify Privacy link from homepage footer
	 */

	public void clickAndVerifyPrivacy() {
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.Privacy, "Clicked on Privacy");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriverHelperObj.verifyURL("https://www.goibibo.com/info/privacy/", "Privacy - link verified");
		driver.navigate().back();
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description Method to click and verify Careers link from homepage footer
	 */

	public void clickAndVerifyCareers() {
		String mainWindow = driver.getWindowHandle();
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.Careers, "Clicked on Careers");
		webDriverHelperObj.tabSwitch("Switched to Careers tab");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriverHelperObj.verifyURL("https://www.goibibo.com/careers/", "Careers - link verified");
		driver.close();
		driver.switchTo().window(mainWindow);
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description Method to click and verify YouTube channel link from homepage footer
	 */

	public void clickAndVerifyYouTubeChannel() {
		String mainWindow = driver.getWindowHandle();
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.YouTubeChannel, "Clicked on YouTube Channel");
		webDriverHelperObj.tabSwitch("Switched to YouTube Channel tab");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriverHelperObj.verifyURL("https://www.youtube.com/user/goibibo", "YouTube Channel - link verified");
		driver.close();
		driver.switchTo().window(mainWindow);
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description Method to click and verify Technology@Goibibo link from homepage footer
	 */

	public void clickAndVerifyTechnologyGoibibo() {
		String mainWindow = driver.getWindowHandle();
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.TechnologyGoibibo, "Clicked on Technology@Goibibo");
		webDriverHelperObj.tabSwitch("Switched to Technology tab");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriverHelperObj.verifyURL("https://tech.goibibo.com/", "Technology@Goibibo - link verified");
		driver.close();
		driver.switchTo().window(mainWindow);
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description Method to click and verify Customer Support link from homepage footer
	 */

	public void clickAndVerifyCustomerSupport() {
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.CustomerSupport, "Clicked on Customer Support");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriverHelperObj.verifyURL("https://www.goibibo.com/mysupport/customerHelp/",
				"Customer Support - link verified");
		driver.navigate().back();
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description Method to click and verify Facebook link from homepage footer
	 */

	public void clickAndVerifyFacebookPage() {
		String mainWindow = driver.getWindowHandle();
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.FacebookPage, "Clicked on Facebook Page");
		webDriverHelperObj.tabSwitch("Switched to Facebook Page tab");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriverHelperObj.verifyURL("https://www.facebook.com/Goibibo/", "Facebook Page - link verified");
		driver.close();
		driver.switchTo().window(mainWindow);
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description Method to click and verify Twitter link from homepage footer
	 */
	
	public void clickAndVerifyTwitterHandle() {
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.TwitterHandle, "Clicked on Twitter Handle");
		webDriverHelperObj.tabSwitch("Switched to Twitter tab");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriverHelperObj.verifyURL("https://x.com/goibibo", "Twitter Handle - link verified");
		driver.close();

	}

//	/**
//	 * @author Ajinkya Pathare
//	 * @summary This method clicks on Cabs field on Goibibo Home page
//	 */
//	public void clickCabs() {
//
//		try {
//			webDriverHelperObj.clickOnElement(GoibiboHomePageUI.loginPopup, "Closed login pop up");
//			webDriverHelperObj.clickOnElement(GoibiboHomePageUI.clickCabs, "Clicked on Cabs");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

	/**
	 * @author Ajinkya Pathare-08/06/2024
	 * @summary This method verifies the footer section functionality
	 */
	public void verifyFooterSectionFunctionality() {
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.loginPopup, "Closed login popup");
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.cheapFlightsFooterSection, "Clicked on cheap flights");
		webDriverHelperObj.verifyURL("https://www.goibibo.com/flights/cheap-flights/", "cheap flights url verified");
		driver.navigate().back();

		webDriverHelperObj.waitForElementToBeVisible(GoibiboHomePageUI.myAccountFooterSection, 8);
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.myAccountFooterSection, "Clicked on my account");
		webDriverHelperObj.verifyText(GoibiboHomePageUI.myProfileText, "My Profile", "my profile text verified");
		driver.navigate().back();

		webDriverHelperObj.waitForElementToBeVisible(GoibiboHomePageUI.walletFooterSection, 8);
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.walletFooterSection, "Clicked on wallet");
		webDriverHelperObj.verifyText(GoibiboHomePageUI.goCashBalanceText, "goCash Balance",
				"provides information gocash balance verified");
		driver.navigate().back();

		webDriverHelperObj.waitForElementToBeVisible(GoibiboHomePageUI.advertiseWithUsFooterSection, 8);
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.advertiseWithUsFooterSection,
				"Clicked on advertise with us");
		webDriverHelperObj.verifyText(GoibiboHomePageUI.advertisingSolutionsText, "Advertising Solutions",
				" provides information on advertising verified");
		driver.navigate().back();
	}

	/**
	 * @author Aman Tiwari
	 */

	public void clickOnBus1() {

		webDriverHelperObj.clickOnElement(GoibiboBusPageUI.clickOnBus, "Click on Bus");

	}

	public void clickOnBusFrom() {

		webDriverHelperObj.clickOnElement(GoibiboBusPageUI.clickOnBusFrom, "Click on Bus From");

	}

	public void enterBusFromDelhi() {

		String Delhi = ExcelReader.readValuesFromExcel("Goibibo", 14, 1);
		webDriverHelperObj.sendKeys(GoibiboBusPageUI.enterBusFromDelhi, Delhi, "Successfully entered Delhi");

	}

	public void clickOnDelhi() {

		webDriverHelperObj.wait(1000);
		webDriverHelperObj.scrollToClick(GoibiboBusPageUI.clickOnDelhi, "Clicked on Delhi");

	}

	public void clickOnBusTo() {

		webDriverHelperObj.clickOnElement(GoibiboBusPageUI.clickOnBusTo, "Clicked on 'Bus to' ");

	}

	public void enterBusToAgra() {

		String Agra = ExcelReader.readValuesFromExcel("Goibibo", 14, 2);
		webDriverHelperObj.sendKeys(GoibiboBusPageUI.enterBusToAgra, Agra, "Entered Bus to Agra");

	}

	public void clickOnAgra() {

		webDriverHelperObj.wait(1000);
		webDriverHelperObj.scrollToClick(GoibiboBusPageUI.clickOnAgra, "Click on Agra");

	}

	public void clickOnDate() {

//			webDriverHelperObj.click(GoibiboBusPageUI.clickOnDate);

		webDriverHelperObj.clickOnElement(GoibiboBusPageUI.clickOnDate, "Click on Date");

	}

	public void clickOn17June() {

		webDriverHelperObj.wait(1000);
		webDriverHelperObj.clickOnElement(GoibiboBusPageUI.clickOn17June, "Click on 17th June");

	}

	public void clickOnSearchBuses() {

//			webDriverHelperObj.scrollToClick(GoibiboBusPageUI.clickOnSearchBuses);

		webDriverHelperObj.scrollToClick(GoibiboBusPageUI.clickOnSearchBuses, "Click on Search Buses");

	}
	
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Hide Pop up
	 */
	public void hidePopUp() {
		
		webDriverHelperObj.wait(1000);
		webDriverHelperObj.clickOnElement(GoibiboFlightPageUI.hidePopUp, "Hide Pop up");
		
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Hide Offer Pop up
	 */
	public void hideOfferPopUp() {

		webDriverHelperObj.clickOnElement(GoibiboFlightPageUI.hideOfferPopUp, "Hide Offer Pop up");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Hide Offer Pop up
	 */
	public void clickOnFromBox() {

		webDriverHelperObj.wait(1000);
		webDriverHelperObj.clickOnElement(GoibiboFlightPageUI.clickOnFromBox, "Click on From Box");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Hide Offer Pop up
	 */
	public void enterBengaluru() {

	    String Bengaluru = ExcelReader.readValuesFromExcel("Goibibo", 5, 1);
		webDriverHelperObj.sendKeys(GoibiboFlightPageUI.enterMumbai,Bengaluru, "Enter Bengaluru");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Hide Offer Pop up
	 */
	public void pressEnterOnBengaluru() {

		webDriverHelperObj.wait(1000);
		webDriverHelperObj.enterAction(GoibiboFlightPageUI.enterMumbai,Keys.ENTER,  "Press Enter on Mumbai");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Enter New Delhi
	 */
	public void enterDelhi() {
	
	    String Delhi = ExcelReader.readValuesFromExcel("Goibibo", 5, 2);
		webDriverHelperObj.sendKeys(GoibiboFlightPageUI.enterDelhi,Delhi, "Enter New Delhi");
			
	} 
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Press Enter
	 */
	public void pressEnterOnDelhi() {
		
		webDriverHelperObj.wait(1000);
		webDriverHelperObj.enterAction(GoibiboFlightPageUI.enterDelhi,Keys.ENTER, "Press Enter");
			
	} 
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Click on Departure
	 */
	public void clickOnDeparture() {
		
		webDriverHelperObj.clickOnElement(GoibiboFlightPageUI.clickOnDeparture, "Click on Departure");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Click on 20th June
	 */
	public void clickOn20thJune() {
	
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.clickOn20thJune, "Click on 20th June");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Click on Return
	 */
	public void clickOnReturn() {
	
		webDriverHelperObj.clickOnElement(GoibiboFlightPageUI.clickOnReturn, "Click on Return");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Click on 23rd June
	 */
	public void clickOn23rdJune() {

		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.clickOn23rdJune, "Click on 23rd June");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Click on Travellers
	 */
	public void clickOnTravellers() {
	
		webDriverHelperObj.clickOnElement(GoibiboFlightPageUI.clickOnTravellers, "Click on Travellers");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Increase Adult Count
	 */
	public void increaseAdultCount() {
		
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.increaseOnAdultCount, "Increase Adult Count");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Increase Child Count
	 */
	public void increaseChildCount() {

		webDriverHelperObj.clickOnElement(GoibiboFlightPageUI.increaseChildCount, "Increase Child Count");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Click on Business
	 */
	public void clickOnBusiness() {
		
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.clickOnBusiness, "Click on Business");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Click on Done
	 */
	public void clickOnDone() {
	
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.clickOnDone, "Click on Done");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Click on Search Flights
	 */
	public void clickOnSearchFlights() {

		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.clickOnSearchFlights, "Click on Search Flights");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Click on Flights
	 */
	public void clickOnFlights() {
		
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.clickOnFlights, "Click on Flights");
			
	}
		
	/**
	 * @author Ajinkya Pathare
	 * @description: Enter Hyderabad
	 */
	public void enterHyderabad() {
		
		webDriverHelperObj.wait(1000);
	    String Hyderabad = ExcelReader.readValuesFromExcel("Goibibo", 6, 1);
		webDriverHelperObj.sendKeys(GoibiboFlightPageUI.enterDelhi,Hyderabad, "Enter Hyderabad");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Press Enter
	 */
	public void pressEnterOnHyderabad() {
		
		webDriverHelperObj.wait(1000);
		webDriverHelperObj.enterAction(GoibiboFlightPageUI.enterDelhi,Keys.ENTER, "Press Enter");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Enter Mumbai
	 */
	public void enterMumbai() {
		
		webDriverHelperObj.wait(1000);
	    String Mumbai = ExcelReader.readValuesFromExcel("Goibibo", 6, 2);
		webDriverHelperObj.sendKeys(GoibiboFlightPageUI.enterMumbai,Mumbai, "Enter Mumbai");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Press Enter
	 */
	public void pressEnterOnMumbai() {
	
		webDriverHelperObj.wait(1000);
		webDriverHelperObj.enterAction(GoibiboFlightPageUI.enterMumbai,Keys.ENTER, "Press Enter");
			
	}

	/**
	 * @author Ajinkya Pathare
	 * @description: Click On 11th June
	 */
	public void clickOn11thJune() {
	
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.clickOn11thJune, "Click On 11th June");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Click On 14th June
	 */
	public void clickOn14thJune() {
	
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.clickOn14thJune, "Click On 14th June");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Press Enter
	 */
	public void enterKolkata() {
	
		webDriverHelperObj.wait(1000);
	    String Kolkata = ExcelReader.readValuesFromExcel("Goibibo", 7, 1);
		webDriverHelperObj.sendKeys(GoibiboFlightPageUI.enterDelhi,Kolkata, "Enter Kolkata");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Press Enter
	 */
	public void pressEnterOnKolkata() {
		
		webDriverHelperObj.wait(1000);
		webDriverHelperObj.enterAction(GoibiboFlightPageUI.enterDelhi,Keys.ENTER, "Press Enter");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Enter Chennai
	 */
	public void enterChennai() {

		webDriverHelperObj.wait(1000);
	    String Chennai = ExcelReader.readValuesFromExcel("Goibibo", 7, 2);
		webDriverHelperObj.sendKeys(GoibiboFlightPageUI.enterMumbai,Chennai, "Enter Chennai");
			
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Press Enter
	 */
	public void pressEnterOnChennai() {
		
		webDriverHelperObj.wait(1000);
		webDriverHelperObj.enterAction(GoibiboFlightPageUI.enterMumbai,Keys.ENTER, "Press Enter");
			
	}

	/**
	 * @author Ajinkya Pathare
	 * @description: Click on 17th June
	 */
	public void clickOn17thJune() {
		
		webDriverHelperObj.scrollToClick(GoibiboHomePageUI.clickOn17thJune, "Click on 17th June");
		
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Click on 21th June
	 */
	public void clickOn21thJune() {
	
		webDriverHelperObj.scrollToClick(GoibiboHomePageUI.clickOn21thJune, "Click on 21th June");
			
	} 
	
	/**
	 * @author Ajinkya Pathare
	 * @description: Decrease Adult Count
	 */
	public void decreaseAdultCount() {
	
		webDriverHelperObj.clickOnElement(GoibiboHomePageUI.decreaseOnAdultCount, "Decrease Adult Count");
			
	} 


}
