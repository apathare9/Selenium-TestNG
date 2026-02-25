package runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.qameta.allure.Step;
import pages.GoibiboForexPage;
import pages.GoibiboHomePage;
import pages.GoIbiboHotelsDescriptionPage;
import pages.GoibiboBusPage;
import pages.GoibiboBusSearchPage;
import pages.GoibiboHotelsPage;
import pages.GoibiboHotelsSearchPage;
import utils.Base;
import utils.ProgressBarUtility;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

import pages.GoibiboCabsPage;
import pages.GoibiboCabsPaymentPage;
import pages.GoibiboCabsResultPage;
import pages.GoibiboCabsSearchResultPage;
import pages.GoibiboFlightPage;
import pages.GoibiboTrainsPage;
import pages.GoibiboTrainsResultPage;


/**
 * @author Ajinkya Pathare
 */
public class TestGoIbibo extends Base {
	
	static int NO_OF_TESTS = 0;

	ProgressBarUtility progressBarUtility;

	public static ExtentReports extentReportObj;
	public static ExtentTest extentTestObj;
	GoibiboHomePage goibiboHomePageObj;
	GoibiboHotelsPage goibiboHotelsPageObj;
	GoibiboHotelsSearchPage goibiboHotelsSearchPageObj;
	GoIbiboHotelsDescriptionPage goibiboHotelsDescriptionPageObj;
	GoibiboForexPage goibiboForexPageObj;
	WebDriverHelper webDriverHelperObj;
	
	GoibiboTrainsPage trainsPageObj;
	GoibiboTrainsResultPage trainsResultPageObj;
	GoibiboCabsPage cabsPageObj;
	GoibiboCabsResultPage cabsResultPageObj;
	GoibiboCabsPaymentPage cabsPaymentPageObj;
	
	GoibiboBusPage goibiboBusPageObj;
	GoibiboBusSearchPage goibiboBusSearchPageObj;
	
//	GoibiboHomePage homePageObj;
//	GoibiboCabsPage cabsPageObj;
	GoibiboCabsSearchResultPage cabsSearchResultPage;


	@BeforeMethod
	public void setUpBrowser() {
		openBrowser();
		NO_OF_TESTS++;
	}

	@BeforeClass
	public void createextentReport() {
		extentReportObj = Reporter.createReport("Go Ibibo Test Cases");
		progressBarUtility = new ProgressBarUtility();
	}

	/**
	 * @author Ajinkya Pathare Description : Verify Search Functionaliy.
	 */
	@Step("Verifying Search Hotels Functionality")
	@Test(priority = 1, description = "Verifying Search Hotels Functionality", enabled = true)
	public void verifySearchHotelsFunctionality() {

		extentTestObj = extentReportObj.createTest("Verify Sign Up. ", "Test Cases to Verify Hotels Search Functionality");
		goibiboHomePageObj = new GoibiboHomePage(driver, extentTestObj);
		goibiboHotelsPageObj = new GoibiboHotelsPage(driver, extentTestObj);
		goibiboHotelsSearchPageObj = new GoibiboHotelsSearchPage(driver, extentTestObj);
		goibiboHotelsDescriptionPageObj = new GoIbiboHotelsDescriptionPage(driver, extentTestObj);
		webDriverHelperObj = new WebDriverHelper(driver, extentTestObj);

		goibiboHomePageObj.clickOnLoginPopUp();
		goibiboHomePageObj.clickOnOffersPopUp();
		goibiboHomePageObj.clickOnHotels();
		goibiboHotelsPageObj.clickOnIndiaRadioButton();
		goibiboHotelsPageObj.clickOnInputSearchBar();
		goibiboHotelsPageObj.sendValueInInputSearchBar();
		goibiboHotelsPageObj.clickOnOpenCalendar();
		goibiboHotelsPageObj.select20thJune();
		goibiboHotelsPageObj.select23rdJune();
		goibiboHotelsPageObj.clickOnGuestsAndRooms();
		goibiboHotelsPageObj.incrementChildCount();
		goibiboHotelsPageObj.selectChildAgeOption();
		goibiboHotelsPageObj.selectAge3();
		goibiboHotelsPageObj.clickOnDoneButton();
		goibiboHotelsPageObj.clickOnSearchButton();
		goibiboHotelsSearchPageObj.clickOnCustomerRatings45();
		goibiboHotelsSearchPageObj.clickOnFreeBreakfastIncluded();
		goibiboHotelsSearchPageObj.clickOnFirstHotel();
		webDriverHelperObj.tabSwitch("Tab Switch to Hotels Search Page");
		goibiboHotelsDescriptionPageObj.clickOnFreeCancelation();
		goibiboHotelsDescriptionPageObj.clickOnSelectRoom();
		driver.manage().deleteAllCookies();
		goibiboHotelsDescriptionPageObj.clickOnHotelsNavigationBar();
		driver.manage().deleteAllCookies();
		goibiboHotelsPageObj.clickOnIndiaRadioButton();
		goibiboHotelsPageObj.clickOnInputSearchBar();
		goibiboHotelsPageObj.sendValueInInputSearchBarJaipur();
		goibiboHotelsPageObj.clickOnOpenCalendar();
		goibiboHotelsPageObj.select12thJune();
		goibiboHotelsPageObj.select15thJune();
		goibiboHotelsPageObj.clickOnGuestsAndRooms();
		goibiboHotelsPageObj.decrementChildCount();
		goibiboHotelsPageObj.incrementChildCount();
		goibiboHotelsPageObj.selectChildAgeOption();
		goibiboHotelsPageObj.selectAge4();
		goibiboHotelsPageObj.clickOnDoneButton();
		goibiboHotelsPageObj.clickOnSearchButton();
		goibiboHotelsSearchPageObj.scrollToTopHotelsSearchPage();
		goibiboHotelsSearchPageObj.clickOnClearFilters();
		goibiboHotelsSearchPageObj.clickOnCustomerRatings45();
		goibiboHotelsSearchPageObj.clickOnFreeBreakfastIncluded();
		goibiboHotelsSearchPageObj.clickOnFirstHotel();
		webDriverHelperObj.tabSwitch("Tab Switch to Hotels Search Page");

	}

	/**
	 * @author Ajinkya Pathare Description : Currency Functionality Testing
	 */
	
	@Step("Currency Functionality Testing")
	@Test(priority = 2, enabled = true)
	public void currencyFunctionality() {
		extentTestObj = extentReportObj.createTest("Test Cases to Verify Currency Search Functionality");
		goibiboHomePageObj = new GoibiboHomePage(driver, extentTestObj);
		goibiboHotelsPageObj = new GoibiboHotelsPage(driver, extentTestObj);
		goibiboHotelsSearchPageObj = new GoibiboHotelsSearchPage(driver, extentTestObj);
		goibiboHotelsDescriptionPageObj = new GoIbiboHotelsDescriptionPage(driver, extentTestObj);
		goibiboForexPageObj = new GoibiboForexPage(driver, extentTestObj);
		webDriverHelperObj = new WebDriverHelper(driver, extentTestObj);
		goibiboHomePageObj.clickOnLoginPopUp();
		goibiboHomePageObj.clickOnOffersPopUp();
		goibiboHomePageObj.clickOnForex();
		webDriverHelperObj.tabSwitch("Tab Switch to Forex Cards & Currency Page");
		goibiboForexPageObj.clickOnMultiCurrencyOption();
		goibiboForexPageObj.clickOnClickHereOfMultiCurrencyOption();
		driver.navigate().to("https://www.goibibo.com/");
		goibiboHomePageObj.clickOnLoginPopUp();
		goibiboHomePageObj.clickOnOffersPopUp();
		goibiboForexPageObj.clickOnHotelsNearMe();
		goibiboForexPageObj.clickOnListYourHotelForFree();
		webDriverHelperObj.tabSwitch("Tab Switched to New Extra Net");
		goibiboForexPageObj.Screenshot();

	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Date: 08/06/2024
	 * @Summary: To search trains by filling the necessary fields
	 */
	@Step("To search trains by filling the necessary fields")
	@Test(priority = 3, enabled = true)
	public void searchTrains() {

		extentTestObj = extentReportObj.createTest("Search Trains", "To search trains by filling the necessary fields");
		goibiboHomePageObj = new GoibiboHomePage(driver, extentTestObj);
		trainsPageObj = new GoibiboTrainsPage(driver, extentTestObj);
		trainsResultPageObj = new GoibiboTrainsResultPage(driver, extentTestObj);

		goibiboHomePageObj.clickTrains();
		trainsPageObj.clickFromField();
		trainsPageObj.inputFromData1();
		trainsPageObj.clickMainJunction();
		trainsPageObj.clickToField();
		trainsPageObj.inputToData1();
		trainsPageObj.clickAllStations();
		trainsPageObj.selectDate();
		trainsPageObj.clickSearchTrains();
		trainsResultPageObj.numberOfTrains();
		Screenshot.takeScreenshot(driver, "List of trains on 20th June");
		driver.navigate().back();

		trainsPageObj.clickFromField();
		trainsPageObj.inputFromData2();
		trainsPageObj.clickpuneJunction();
		trainsPageObj.clickToField();
		trainsPageObj.inputToData2();
		trainsPageObj.clickmumbaiCst();
		trainsPageObj.selectDepartureDate();
		trainsPageObj.clickSearchTrains();
		trainsResultPageObj.listOfTrains();
		Screenshot.takeScreenshot(driver, "List of trains on 13th June");
		driver.navigate().back();

		trainsPageObj.clickFromField();
		trainsPageObj.inputFromData3();
		trainsPageObj.clickDeccan();
		trainsPageObj.clickToField();
		trainsPageObj.inputToData3();
		trainsPageObj.clickMadgaonJunction();
		trainsPageObj.selectGoingDate();
		trainsPageObj.clickSearchTrains();
	}

	/**
	 * @author Ajinkya Pathare
	 * @Date: 08/06/2024
	 * @Summary: To search and book cabs by filling the necessary fields
	 */
	@Step("To search and book cabs by filling the necessary fields")
	@Test(priority = 4, enabled = true)
	public void searchCabs() {
		extentTestObj = extentReportObj.createTest("Search Cabs",
				"To book a cab by filling the necessary details of the traveller");
		goibiboHomePageObj = new GoibiboHomePage(driver, extentTestObj);
		cabsPageObj = new GoibiboCabsPage(driver, extentTestObj);
		cabsResultPageObj = new GoibiboCabsResultPage(driver, extentTestObj);
		cabsPaymentPageObj = new GoibiboCabsPaymentPage(driver, extentTestObj);

		goibiboHomePageObj.clickCabs();
		cabsPageObj.clickAirportTransfer();
		cabsPageObj.clickFromField();
		cabsPageObj.inputFromData1();
		cabsPageObj.selectcoimbatoreInternational();
		cabsPageObj.clickToField();
		cabsPageObj.inputToData1();
		cabsPageObj.selectMettupalyam();
		cabsPageObj.clickPickUpDate();
		cabsPageObj.selectPickUpDate1();
		cabsPageObj.clickPickUpTime();
		cabsPageObj.selectPickUpTime1();
		cabsPageObj.clickSearchCabs();
		cabsResultPageObj.verifyCabsPageTitle1();
		cabsResultPageObj.clickFirstCab();
		cabsPaymentPageObj.scrollUptoTravellerDetails();
		cabsPaymentPageObj.clickFullNameField();
		cabsPaymentPageObj.inputFullName1();
		cabsPaymentPageObj.clickMobileNumberField();
		cabsPaymentPageObj.inputMobileNumber1();
		cabsPaymentPageObj.clickEmailField();
		cabsPaymentPageObj.inputEmail1();
		cabsPaymentPageObj.clickConfirmAndPay();
		cabsPaymentPageObj.waitForScreenshot1();
		Screenshot.takeScreenshot(driver, "Payment details of the Traveller1");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();

		cabsPageObj.clickFromField();
		cabsPageObj.inputFromData2();
		cabsPageObj.selectindiraGandhiAirport();
		cabsPageObj.clickToField();
		cabsPageObj.inputToData2();
		cabsPageObj.selectGurgaon();
		cabsPageObj.clickPickUpDate();
		cabsPageObj.selectPickUpDate2();
		cabsPageObj.clickPickUpTime();
		cabsPageObj.selectPickUpTime2();
		cabsPageObj.clickSearchCabs();
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @Description This test is to book bus by selecting various filters
	 */
	@Step("Verifying Bus Booking Functionality")
	@Test(priority = 5, enabled = true)
	public void testBusBooking() { 

		// extent test for every test
		extentTestObj = extentReportObj.createTest("Verify Bus Booking. ", "Test Cases to Verify Bus Booking Functionality");

		// call the object of that particular page
		goibiboHomePageObj = new GoibiboHomePage(driver, extentTestObj);
		goibiboBusPageObj = new GoibiboBusPage(driver, extentTestObj);
		goibiboBusSearchPageObj = new GoibiboBusSearchPage(driver, extentTestObj);

		// close popup and click on bus
		goibiboHomePageObj.closePopup();
		goibiboHomePageObj.clickOnBus();

		// Enter Source and Destination location, Select date and click on search
		goibiboBusPageObj.enterBangloreLocation();
		goibiboBusPageObj.selectBangloreLocation();
		goibiboBusPageObj.enterHyderabadLocation();
		goibiboBusPageObj.selectHyderabadLocation();
		goibiboBusPageObj.selectTravelDate10June();
		goibiboBusPageObj.clickOnSearch();

		// Select Filters
		goibiboBusSearchPageObj.selectLiveTracking();
		goibiboBusSearchPageObj.selectGoDealDiscount();
		goibiboBusSearchPageObj.scrollDownToAmenities();
		goibiboBusSearchPageObj.selectWaterBottle();
		
		// print number of buses for selected filter
		goibiboBusSearchPageObj.numberOfBuses();
		
		// print list of Buses with prices in console
		goibiboBusSearchPageObj.printListOfBuses();
		
		// Navigate Back
		goibiboBusSearchPageObj.navigateBack();
		goibiboBusSearchPageObj.navigateBack(); 
		goibiboBusSearchPageObj.clickOnBus();

		// Enter Source and Destination location, Select date and click on search
		goibiboBusPageObj.deleteFromInputSection();
		goibiboBusPageObj.enterJaipurLocation();
		goibiboBusPageObj.selectJaipurLocation();
		goibiboBusPageObj.deleteToInputSection();
		goibiboBusPageObj.enterUdaipurLocation();
		goibiboBusPageObj.selectUdaipurLocation();
		goibiboBusPageObj.selectTravelDate20June();
		goibiboBusPageObj.clickOnSearch();

		// Select Filters
		goibiboBusSearchPageObj.clickOnPrimo();
		goibiboBusSearchPageObj.selectAcFiletr();
		goibiboBusSearchPageObj.scrollDownToAmenities();
		goibiboBusSearchPageObj.clickOnShowAmenities();
		goibiboBusSearchPageObj.selectBlankets();
		
		// print number of buses for selected filter
		goibiboBusSearchPageObj.numberOfBuses();

	}

	/**
	 * @author Ajinkya Pathare
	 * @Description This test checks url's for various links in footer section of Goibibo website
	 */

	@Step("Verifying Footer Functionality")
	@Test(priority = 6, enabled = true)
	public void testFooter(){

		extentTestObj = extentReportObj.createTest("Verify footer. ", "Test Cases to Verify footer urls");
		goibiboHomePageObj = new GoibiboHomePage(driver, extentTestObj);
		
		goibiboHomePageObj.closePopup();
		goibiboHomePageObj.clickAndVerifyAboutUs();
		goibiboHomePageObj.clickAndVerifyInvestorRelations();
		goibiboHomePageObj.clickAndVerifyManagement();
		goibiboHomePageObj.clickAndVerifyUserAgreement();
		goibiboHomePageObj.clickAndVerifyPrivacy();
		goibiboHomePageObj.clickAndVerifyCareers();
		goibiboHomePageObj.clickAndVerifyYouTubeChannel();
		goibiboHomePageObj.clickAndVerifyTechnologyGoibibo();
		goibiboHomePageObj.clickAndVerifyFacebookPage();
		goibiboHomePageObj.clickAndVerifyTwitterHandle();

	}
	
	@Step("Search Cabs and Login Sign Up Functionality")
	@Test(priority = 7, enabled = true)
	public void searchCabsAndLoginSignupFunctionality() {
		extentTestObj = extentReportObj.createTest("Search Cabs Functionality");
		goibiboHomePageObj = new GoibiboHomePage(driver, extentTestObj);
		goibiboHomePageObj.clickCabs();
		cabsPageObj = new GoibiboCabsPage(driver, extentTestObj);
		cabsPageObj.searchCabsFunctionality();
		cabsSearchResultPage = new GoibiboCabsSearchResultPage(driver, extentTestObj);
		cabsSearchResultPage.payAndConfirmFunctionality();
		cabsSearchResultPage.travellerDetailsFunctionality();
		cabsSearchResultPage.verifyLoginSignupFunctionality();

	}

	@Step("Home Page Footer Section Functionality")
	@Test(priority = 8, enabled = true)
	public void homePageFooterSectionFunctionality() {
		extentTestObj = extentReportObj.createTest("homePageFooterSectionFunctionality");
		goibiboHomePageObj = new GoibiboHomePage(driver, extentTestObj);
		goibiboHomePageObj.verifyFooterSectionFunctionality();

	}


/**
 * @author Ajinkya Pathare
 * @summary Testing multiple functionalities of Goibibo Website.
 * @category Using Testng to automate scripts.
 */


	GoibiboHomePage GoibiboHomePageObj;
	GoibiboFlightPage GoibiboFlightPageObj;
	GoibiboTrainsPage GoibiboTrainPageObj;
	GoibiboCabsPage GoibiboCabPageObj;
	GoibiboBusPage GoibiboBusPageObj;
	
	
	@Step("Home Page Functionalities")
	@Test(priority = 9, enabled = true)
	public void homePage() {
		extentTestObj = extentReportObj.createTest("Home Page Exploration");
		GoibiboHomePageObj = new GoibiboHomePage(driver, extentTestObj);
		
		GoibiboHomePageObj.hidePopUp();
		GoibiboHomePageObj.hideOfferPopUp();
		GoibiboHomePageObj.clickOnFromBox();
		GoibiboHomePageObj.enterBengaluru();
		GoibiboHomePageObj.pressEnterOnBengaluru();
		GoibiboHomePageObj.enterDelhi();
		GoibiboHomePageObj.pressEnterOnDelhi();
		GoibiboHomePageObj.clickOnDeparture();
		GoibiboHomePageObj.clickOn20thJune();
		GoibiboHomePageObj.clickOnReturn();
		GoibiboHomePageObj.clickOn23rdJune();
		GoibiboHomePageObj.clickOnTravellers();
		GoibiboHomePageObj.increaseAdultCount();
		GoibiboHomePageObj.increaseChildCount();
		GoibiboHomePageObj.clickOnBusiness();
		GoibiboHomePageObj.clickOnDone();
		GoibiboHomePageObj.clickOnSearchFlights();

		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Screenshot.takeScreenshot(driver, "SS1");
		GoibiboHomePageObj.clickOnFlights();
		GoibiboHomePageObj.clickOnFromBox();
		GoibiboHomePageObj.enterHyderabad();
		GoibiboHomePageObj.pressEnterOnHyderabad();
		GoibiboHomePageObj.enterMumbai();
		GoibiboHomePageObj.pressEnterOnMumbai();
		GoibiboHomePageObj.clickOnDeparture();
		GoibiboHomePageObj.clickOn11thJune();
		GoibiboHomePageObj.clickOn14thJune();
		GoibiboHomePageObj.clickOnSearchFlights();
		Screenshot.takeScreenshot(driver, "SS2");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		GoibiboHomePageObj.clickOnFlights();
		GoibiboHomePageObj.clickOnFromBox();
		GoibiboHomePageObj.enterKolkata();
		GoibiboHomePageObj.pressEnterOnKolkata();
		GoibiboHomePageObj.enterChennai();
		GoibiboHomePageObj.pressEnterOnChennai();
		GoibiboHomePageObj.clickOnDeparture();
		GoibiboHomePageObj.clickOn17thJune();
		GoibiboHomePageObj.clickOn21thJune();
		GoibiboHomePageObj.clickOnTravellers();
		GoibiboHomePageObj.decreaseAdultCount();
		GoibiboHomePageObj.increaseChildCount();
		GoibiboHomePageObj.clickOnDone();
		GoibiboHomePageObj.clickOnSearchFlights();
		Screenshot.takeScreenshot(driver, "SS3");
		
	}
	
	/**
	 * @author Ajinkya Pathare
	 * @summary Testing Home Page functionalities of Goibibo Website.
	 * @category Using Testng to automate scripts.
	 */
	
	@Step("Multiple Pages Exploration Functionalities")
	@Test(priority = 10, enabled = true)
	public void multiplePageExploration() {
		extentTestObj = extentReportObj.createTest("Exploring Multiple Pages");
		GoibiboFlightPageObj = new GoibiboFlightPage(driver, extentTestObj);
		GoibiboTrainPageObj = new GoibiboTrainsPage(driver,extentTestObj);
		GoibiboBusPageObj = new GoibiboBusPage(driver,extentTestObj);
		GoibiboCabPageObj = new GoibiboCabsPage(driver, extentTestObj);
		
		GoibiboFlightPageObj.hidePopUp();
		GoibiboFlightPageObj.hideOfferPopUp();
		GoibiboFlightPageObj.clickOnFromBox(); 
		GoibiboFlightPageObj.enterMumbai();
		GoibiboFlightPageObj.pressEnterOnMumbai();
		GoibiboFlightPageObj.enterDelhi();
		GoibiboFlightPageObj.pressEnterOnDelhi();
		GoibiboFlightPageObj.clickOnDeparture();
		GoibiboFlightPageObj.clickOn15();
		GoibiboFlightPageObj.clickOnReturn();
		GoibiboFlightPageObj.clickOn20(); 
		GoibiboFlightPageObj.clickOnTravellers();
		GoibiboFlightPageObj.increaseChildCount();
		GoibiboFlightPageObj.clickOnEconomy();
		GoibiboFlightPageObj.clickOnDone();
		GoibiboFlightPageObj.clickOnSearchFlights();
		GoibiboFlightPageObj.verifyTitle();
		GoibiboFlightPageObj.backToHomePage();
		
		GoibiboTrainPageObj.clickOnTrains();
		GoibiboTrainPageObj.clickOnTrainsFromBox();
		GoibiboTrainPageObj.enterTrainForMumbai();
		GoibiboTrainPageObj.clickOnMumbaiAllStations();
		GoibiboTrainPageObj.clickOnTrainsToBox();
		GoibiboTrainPageObj.enterTrainForPune();
		GoibiboTrainPageObj.clickOnPuneAllStations();
		GoibiboTrainPageObj.clickOn16();
		GoibiboTrainPageObj.clickOnSearchTrains();
		
		GoibiboBusPageObj.clickOnBus();
		GoibiboBusPageObj.clickOnBusFrom();
		GoibiboBusPageObj.enterBusFromDelhi();
		GoibiboBusPageObj.clickOnDelhi();
		GoibiboBusPageObj.clickOnBusTo();
		GoibiboBusPageObj.enterBusToAgra();
		GoibiboBusPageObj.clickOnAgra();
		GoibiboBusPageObj.clickOnDate();
		GoibiboBusPageObj.clickOn17June();
		GoibiboBusPageObj.clickOnSearchBuses();
		
		GoibiboCabPageObj.clickOnCabs();
		GoibiboCabPageObj.clickOnAirport();
		GoibiboCabPageObj.clickOnCabsFrom();
		GoibiboCabPageObj.enterDelhiAirport();
		GoibiboCabPageObj.clickOn1stSuggestionFromCabs();
		GoibiboCabPageObj.clickOnCabsTo();
		GoibiboCabPageObj.enterMarriottDelhi();
		GoibiboCabPageObj.clickOn1stSuggestionToCabs();
		GoibiboCabPageObj.clickOnPickUpDate();
		GoibiboCabPageObj.clickOn20thJune();
		GoibiboCabPageObj.clickOnSearchCabs();
		
	}
	
	
	@AfterClass
	public void flushextentReport() {
		extentReportObj.flush();

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		progressBarUtility.progressBar.setValue(NO_OF_TESTS * 10);

	}

}
