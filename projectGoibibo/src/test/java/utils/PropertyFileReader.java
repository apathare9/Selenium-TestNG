package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	public static FileInputStream fileInputStream;
	public static Properties properties;
	public static String propertiesPath = "./config/config.properties";
	
	/*@author Ajinkya Pathare
	 * @summary This method loads properties from config.properties file
	 */
	public static Properties loadProperties() {
		try {
			fileInputStream = new FileInputStream(propertiesPath);
			properties = new Properties();
			properties.load(fileInputStream);
			
		} catch (FileNotFoundException e) {
			LoggerHandler.error("File path or file name is not correct");
			//LoggerHandler.error(e.printStackTrace());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
}
