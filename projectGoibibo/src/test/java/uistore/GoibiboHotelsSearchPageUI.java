package uistore;

import org.openqa.selenium.By;

/**
 * 
 * @author Ajinkya Pathare
 */

public class GoibiboHotelsSearchPageUI {

	public static By clearFilter = By.xpath("//span[text()='CLEAR']");
	
	public static By CustomerRating = By.xpath("//div[@ratingcount='4.5']");
	
	public static By freeBreakfastIncludedCheckBox = By.xpath("//span[text()='Free Breakfast Included']");
	
	public static By firstHotel = By.xpath("//div[@class='infinite-scroll-component ']/child::div[2]/descendant::h4");
	
}
