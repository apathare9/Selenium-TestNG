package uistore;

import org.openqa.selenium.By;


/**
 * @author Ajinkya Pathare
 */
public class GoibiboHomePageUI {

	public static By loginPopup = By.xpath("//span[@class='logSprite icClose']");

	public static By OffersPopup = By.xpath("//div[@data-id='dweb_pip_id']/p[1]");

	public static By hotels = By.xpath("//span[text()='Hotels']//parent::a");
	
	public static By Forex = By.xpath("//span[text()='Forex']//parent::a");

	public static By IndiaRadioButton = By.xpath("//h4[text()='India']/preceding-sibling::input");

	public static By InputSearchBar = By.xpath("//input[@id='downshift-1-input']");

	public static By openCalendar = By.xpath("//div[@data-testid ='openCheckinCalendar']/child::h4");

	public static By _20thJune24Date = By.xpath("//span[@data-testid='date_20_5_2024']");

	public static By _23rdJune24Date = By.xpath("//span[@data-testid='date_23_5_2024']");

	public static By guestsAndRooms = By.xpath("//span[contains(text(), 'Guests & Rooms')]/following-sibling::div/input");

	public static By incrementChildrenCount = By.xpath("//span[text()='Children']/following-sibling::div/span[@data-testid='button-child-add']");
	
	public static By decrementChildrenCount = By.xpath("//span[text()='Children']/following-sibling::div/span[@data-testid='button-child-dec']");

	public static By selectChildAgeOption = By.xpath("//h4[text()='Select']");

	public static By selectAge3 = By.xpath("//li[text()='3']"); 
	
	public static By selectAge4 = By.xpath("//li[text()='4']");

	public static By doneButton = By.xpath("//button[text()='Done']");

	public static By searchButton = By.xpath("//button[text()='Search']");
	
	public static By _12thJune24Date = By.xpath("//span[@data-testid='date_12_5_2024']");
	
	public static By _15thJune24Date = By.xpath("//span[@data-testid='date_15_5_2024']");
	
	/**
	 * @author Kesava Krishnan
	 */
	public static By trains = By.xpath("//span[text()='Trains']");

	public static By cabs = By.xpath("//span[text()='Cabs']");
	
	
	/**
	 * @author Prajwal Sinha
	 */
	
	
    public static By Bus = By.xpath("//span[text()='Bus']");
	
	public static By Popup = By.xpath("//span[@class='logSprite icClose']");
	
	public static By AboutUsSection = By.xpath("//p[text()='about us']");
	
	public static By AboutUs = By.xpath("(//p[@class='sc-imWYAI pQYto'])[17]");
	
	public static By InvestorRelations = By.xpath("//p[text()='Investor Relations']");
	
	public static By Management = By.xpath("//p[text()='Management']");
	
	public static By TermsofServices = By.xpath("//p[text()='Terms of Services']");
	
	public static By UserAgreement = By.xpath("//p[text()='User Agreement']");
	
	public static By Privacy = By.xpath("//p[text()='Privacy']");
	
	public static By Careers = By.xpath("//p[text()='Careers']");
	
	public static By YouTubeChannel = By.xpath("//p[text()='YouTube Channel']");
	
	public static By TechnologyGoibibo = By.xpath("//p[text()='Technology@Goibibo']");
	
	public static By CustomerSupport = By.xpath("//p[text()='Customer Support']");
	
	public static By FacebookPage = By.xpath("//p[text()='Facebook Page']");
	
	public static By TwitterHandle = By.xpath("//p[text()='Twitter Handle']");
	
	public static By Back = By.xpath("//span[@class='sc-1f95z5i-8 gnkTau header-sprite logo gi-logo']");

	
	/**
	 * @author Sanika Vaidya
	 */
	
	public static By clickCabs = By.xpath("//span[text()='Cabs']/parent::a");

	public static By cheapFlightsFooterSection = By.xpath("//a[@href='/flights/cheap-flights/']");
	public static By hotelsNearMeFooterSection = By.xpath("//p[text()='Hotels Near Me']");
	public static By myAccountFooterSection = By.xpath("//p[text()='My Account']");
	public static By myProfileText = By.xpath("//div[text()='My Profile']");
	public static By walletFooterSection = By.xpath("//p[text()='Wallet']");
	public static By goCashBalanceText = By.xpath("//p[text()='goCash Balance']/parent::div");
	public static By advertiseWithUsFooterSection = By.xpath("//p[text()='Advertise with Us']");
	public static By advertisingSolutionsText = By.xpath("//span[text()='Advertising Solutions']");
	
	/**
	 * @author Aman Tiwari
	 */
	
//	Click On Round Trip.
	public static By clickOnRoundTrip = By.xpath("(//p[text()='Round-trip'])");

//	Click on 20th June.
	public static By clickOn20thJune = By.xpath("(//p[text()='20'])[1]");
	
//	Click on 23rd June.
	public static By clickOn23rdJune = By.xpath("(//p[text()='23'])[1]");

//  Increase Adult Count. 
	public static By increaseOnAdultCount = By.xpath("(//span[@class='sc-12foipm-51 kZvHQU'])[2]");

//	Click On Business.
	public static By clickOnBusiness = By.xpath("(//li[text()='business'])");
	
//	Click On Done.
	public static By clickOnDone = By.xpath("(//a[text()='Done'])");
	
//	Click on Search Flights.
	public static By clickOnSearchFlights = By.xpath("(//span[text()='SEARCH FLIGHTS'])");

//	Click on Flights.
	public static By clickOnFlights = By.xpath("(//span[text()='Flights'])");
	
//	Click on 11th June.
	public static By clickOn11thJune = By.xpath("(//p[text()='12'])[1]");
	
//	Click on 14th June.
	public static By clickOn14thJune = By.xpath("(//p[text()='14'])[1]");
	
//	Click on 17th June.
	public static By clickOn17thJune = By.xpath("(//p[text()='17'])[1]");
	
//	Click on 14th June.
	public static By clickOn21thJune = By.xpath("(//p[text()='21'])[1]");
	
//  Decrease children Count. 
	public static By decreaseOnAdultCount = By.xpath("(//span[@class='sc-12foipm-51 kZvHQU'])[1]");
}


	


