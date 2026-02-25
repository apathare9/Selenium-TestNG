package uistore;

import org.openqa.selenium.By;

/**
 * @author Ajinkya Pathare
 * @Description This class contains different locators for Bus Search page
 */

public class GoibiboBusSearchPageUI {
	
	public static By LiveTracking = By.xpath("//span[@title='Live Tracking']");
	
	public static By GoDeal = By.xpath("//span[@title='GoDeal Discount']");
	
	public static By Amenities = By.xpath("//span[text()='Amenities']");
	
	public static By WaterBottle = By.xpath("//span[text()='Water Bottle']");
	
	public static By Bus = By.xpath("//span[text()='Bus']");
	
	public static By BusCount = By.xpath("//span[@class='SortBystyles__BusTextSpan-sc-luteww-8 dOsBbG']");
	
	public static By Primo = By.xpath("//p[text()='Primo Buses']");
	
	public static By AC = By.xpath("//div[text()='AC']");
	
	public static By ShowAmenities = By.xpath("//a[text()='+ Show all Amenities']");
	
	public static By Blankets = By.xpath("//span[text()='Water Bottle']");
	
    public static By Price=By.xpath("//span[@class='SrpActiveCardstyles__RupeetxtSpan-sc-yk1110-37 iIIlCN']");
    
    public static By BusesSection = By.xpath("//div[@class='SrpCardMainBlockstyles__SrpcardOuterWrapDiv-sc-xam1wr-0 jNLXAN']");
    
    public static By BusesList = By.xpath("//div[@class='SrpActiveCardstyles__ActivepcardInnerLayoutDiv-sc-yk1110-2 hmdiLF']/child::div[@class='SrpActiveCardstyles__LayoutFirstDiv-sc-yk1110-4 ijRmXM']/child::p[1]");
    
    public static By BusesPrices = By.xpath(" //div[@class='SrpActiveCardstyles__ActivepcardInnerLayoutDiv-sc-yk1110-2 hmdiLF']/child::div[@class='SrpActiveCardstyles__LayoutThirdDiv-sc-yk1110-6 cWWjGr']//following-sibling::span[@class='SrpActiveCardstyles__RupeetxtSpan-sc-yk1110-37 iIIlCN']");
    
    public static By NumberOfBuses = By.xpath("//div[@class='SortBystyles__LeftWrapDiv-sc-luteww-6 ullym']");
}