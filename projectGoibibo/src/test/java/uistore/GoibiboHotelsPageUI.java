package uistore;

import org.openqa.selenium.By;

/**
 * @author Ajinkya Pathare
 */
public class GoibiboHotelsPageUI {

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
	
	public static By _12thJune24Date = By.xpath("//span[@data-testid='date_15_5_2024']");
	
	public static By _15thJune24Date = By.xpath("//span[@data-testid='date_17_5_2024']");
	
	
	
}
