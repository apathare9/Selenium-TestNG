package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * @author Ajinkya Pathare
 * @Description This class is used to generate report for test script
 */

public class Reporter {

	public static ExtentReports report;
	public static ExtentSparkReporter spark;
	private static String userDir = System.getProperty("user.dir");
	private static String reportDir = userDir + PropertyFileReader.loadProperties().getProperty("ExtentReportPath");
	public static ExtentReports createReport(String reportName) {

		try {

			report = new ExtentReports();
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
			String timeStamp = dateFormat.format(new Date());
			
			
	        String reportFilePath = reportDir + reportName + "_" + timeStamp + ".html";
			spark = new ExtentSparkReporter(reportFilePath);
			report.attachReporter(spark);

			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle(reportName);
			spark.config().setReportName("Goibibo Test Exection Status Report");
			report.attachReporter(spark);
			LoggerHandler.info("Goibibo report generated");

			return report;
		} catch (Exception e) {
			e.printStackTrace();
			LoggerHandler.error("Failed to generate report");
			return null;
		}


	}
}
