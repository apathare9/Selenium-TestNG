package utils;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
* @author Ajinkya Pathare
* @Date: 08/06/2024
* @Summary To generate different levels of logs
*/

public class LoggerHandler {

    static {
		Properties prop = PropertyFileReader.loadProperties();
 
		SimpleDateFormat dateFormat = new SimpleDateFormat("E-dd-MM-yyyy_hh-mm-ss");
 
		String logFileName = "logfile_" + dateFormat.format(new Date());
 
		System.setProperty("logFile", logFileName);
 
		PropertyConfigurator.configure(prop.getProperty("LogPropertiesPath"));
	}

	private static final Logger log = Logger.getLogger(LoggerHandler.class);

	public static void trace(String traceMessage) {
		log.trace(traceMessage);
	}

	public static void debug(String debugMessage) {
		log.debug(debugMessage);
	}
	
	/**
	 * @author Kesava
	 * @param infoMessage
	 * @description this gives information about the executed step
	 */

	public static void info(String infoMessage) {
		log.info(infoMessage);
	}
	
	/**
	 * @author Kesava
	 * @param infoMessage
	 * @description this gives warning if present about the executed step
	 */

	public static void warn(String warnMessage) {
		log.warn(warnMessage);
	}

	public static void error(String errorMessage) {
		log.error(errorMessage);
	}

	public static void fatal(String fatalMessage) {
		log.fatal(fatalMessage);
	}

}
