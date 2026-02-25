package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell column;
	public static int rowNum;
	public static int colNum;

	/**
	 * Reads a value from an Excel sheet.
	 * 
	 * @author Ajinkya Pathare
	 * @param workbookPath Path to the Excel workbook file
	 * @param sheetName    Name of the sheet within the workbook
	 * @param rowNumber      Row index
	 * @param columnNumber   Column index
	 * @return The cell value as a string
	 */
	
	private static String excelFilePath = PropertyFileReader.loadProperties().getProperty("ExcelSheetPath");
	
	public static String readValuesFromExcel(String sheetName, int rowNumber, int columnNumber) {
		try {
			fis = new FileInputStream(excelFilePath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
			row = sheet.getRow(rowNumber);
			column = row.getCell(columnNumber);

			DataFormatter dataFormatter = new DataFormatter();
			String value = dataFormatter.formatCellValue(column);
			return value;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null; // Return null if an error occurs
	}
}