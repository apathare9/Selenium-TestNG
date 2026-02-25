package uistore;

import org.openqa.selenium.By;

/**
 * @author Ajinkya Pathare
 * @Description This class contains different locators for Bus page
 */

public class GoibiboBusPageUI {

	public static By from = By.xpath("//input[@id='autosuggestBusSRPSrcHome']");

	public static By to = By.xpath("//input[@id='autosuggestBusSRPDestHome']");

	public static By fromOption1 = By.xpath("//span[text()='MG Road, Bangalore']");

	public static By toOption1 = By.xpath("//span[text()='Hyderabad, Telangana']");

	public static By travelDate = By.xpath("//input[@placeholder='Pick a date']");

	public static By _10June2024_ = By.xpath("//span[text()='15']");

	public static By search = By.xpath("//button[text()='Search Bus']");

	public static By fromOption2 = By.xpath("//span[text()='Jaipur, Rajasthan']");

	public static By toOption2 = By.xpath("//span[text()='Udaipur, Rajasthan']");

	public static By _20June2024_ = By.xpath("//span[text()='20']");

	/**
	 * @author Ajinkya Pathare
	 */

//  Click on Bus.
	public static By clickOnBus = By.xpath("(//span[text()='Bus'])");

//  Click on Bus From.
	public static By clickOnBusFrom = By.xpath("(//input[@id='autosuggestBusSRPSrcHome'])");

//	Enter Delhi.
	public static By enterBusFromDelhi = By.xpath("(//input[@id='autosuggestBusSRPSrcHome'])");

//	Click on Delhi.
	public static By clickOnDelhi = By.xpath("(//span[text()='Delhi'])");

//  Click on Bus To.
	public static By clickOnBusTo = By.xpath("(//input[@id='autosuggestBusSRPDestHome'])");

//	Enter Agra.
	public static By enterBusToAgra = By.xpath("(//input[@id='autosuggestBusSRPDestHome'])");

//	Click on Agra.
	public static By clickOnAgra = By.xpath("(//span[text()='Agra, Uttar Pradesh'])");

//	Click on Date.
	public static By clickOnDate = By.xpath("(//input[@placeholder='Pick a date'])");

//	Click on 17th June.
	public static By clickOn17June = By.xpath("(//span[text()='17'])");

//	Click on Search Buses.
	public static By clickOnSearchBuses = By.xpath("(//button[text()='Search Bus'])");

}