package uistore;

import org.openqa.selenium.By;

/**
 * @author Ajinkya Pathare
 * @Summary Locators for the Cabs page
 */
public class GoibiboCabsPageUI {

	public static By airportTransfer = By.xpath("(//span[@style='color:#4f525a'])[2]");

	public static By fromCabs = By.xpath("(//div[@role='combobox'])[1]");
	public static By inputFromData = By.xpath("(//input[@type='text'])[1]");
	public static By coimbatoreInternational = By.xpath("//p[text()='Coimbatore International Airport']");

	public static By toCabs = By.xpath("(//div[@role='combobox'])[2]");
	public static By inputToData = By.xpath("(//input[@type='text'])[2]");
	public static By mettupalayam = By.xpath("//p[text()='Mettupalayam, Tamil Nadu, India']");

	public static By pickUpDate = By.xpath("//div[@class='HomeSearchWidgetstyles__PickupDate-sc-1rvppov-6 iCkPml']");
	public static By selectDate = By.xpath("//span[text()='28']");

	public static By pickUpTime = By.xpath("//div[@class='HomeSearchWidgetstyles__PickupTime-sc-1rvppov-8 chQRDW']");
	public static By selectTime = By.xpath("//span[text()='10:30 AM']");

	public static By searchCabs = By.xpath("//button[text()='SEARCH CABS']");

	public static By indiraGandhiAirport = By.xpath("(//p[text()='NCR'])[1]");
	public static By gurgaon = By.xpath("//p[text()='Gurgaon, Haryana, India']");

	public static By selectPickUpDate = By.xpath("//span[text()='14']");
	public static By selectPickUpTime = By.xpath("//span[text()='12:00 PM']");
	
	/**
	 * @author Sanika Vaidya
	 */
	
	public static By outstationOneWayRadioButton = By.id("Outstation-One-way");

	public static By pickupLocationSearchField = By.cssSelector("#downshift-1-input");

	public static By dropLocationSearchField = By.id("downshift-2-input");

	public static By pickupDateInputField = By.xpath("//label[text()='Pickup Date']/parent::div");
	public static By pickupDateValue = By.xpath("//span[text()='30']/parent::li");

	public static By pickupTimeInputField = By.xpath("//label[text()='Pickup Time']/parent::div");
	public static By pickupTimeValue = By.xpath("//span[text()='10:30 AM']/parent::li");

	public static By searchCabsButton = By.xpath("//button[text()='SEARCH CABS']");
	
	/**
	 * @author Aman Tiwari
	 */
	
//	Click on Cabs.
	public static By clickOnCabs = By.xpath("(//span[text()='Cabs'])");
	
//	Click on Airport.
	public static By clickOnAirport = By.xpath("(//span[text()='Airport'])");
	
//	Click on Cabs From.
	public static By clickOnCabsFrom = By.xpath("(//input[@id='downshift-1-input'])");
	
//	Enter Delhi Airport.
	public static By enterDelhiAirport = By.xpath("(//input[@id='downshift-1-input'])");
	
//	Click on 1st Suggestion.
	public static By clickOn1stSuggestionFromCabs = By.xpath("(//div[@class='AutoSuggeststyles__ListItemContent-sc-1xb3zd-3 bpbSMe'])[1]");
	
//	Click on Cabs To.
	public static By clickOnCabsTo = By.xpath("(//input[@id='downshift-1-input'])");
	
//	Enter Marriott Delhi.
	public static By enterMarriottDelhi = By.xpath("(//input[@id='downshift-2-input'])");
	
//	Click on 1st Suggestion.
	public static By clickOn1stSuggestionToCabs = By.xpath("(//div[@class='AutoSuggeststyles__ListItemContent-sc-1xb3zd-3 bpbSMe'])[1]");
	
//	Click on PickUp Date.
	public static By clickOnPickUpDate = By.xpath("(//span[@class='HomeSearchWidgetstyles__DateTxt-sc-1rvppov-7 kUWFbN'])[1]");
	
//	Click on 20th June.
	public static By clickOn20thJune = By.xpath("(//span[contains(text(),'20')])");
	
//	Click On Search Cabs.
	public static By clickOnSearchCabs = By.xpath("(//button[text()='SEARCH CABS'])");
}
