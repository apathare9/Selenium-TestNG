package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	/**
	 * @author Ajinkya Pathare
	 * @param driver
	 * @param error
	 * @return
	 */
	
	private static String userDir = System.getProperty("user.dir");
	private static String screenshotDir = userDir + PropertyFileReader.loadProperties().getProperty("ScreenshotPath");

	@SuppressWarnings("deprecation")
	public static String takeScreenshot(WebDriver driver, String error) {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		byte[] imageByte = null;

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String screenshotName = screenshotDir + error + ".png";
		File DestFile = new File(screenshotName);

		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			imageByte = IOUtils.toByteArray(new FileInputStream(screenshotName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String screenshot = Base64.getEncoder().encodeToString(imageByte);

		return screenshot;

	}

}
