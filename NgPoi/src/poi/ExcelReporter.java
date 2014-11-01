package poi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 * @author vijay
 * @since 11/1/2014
 *
 */

public class ExcelReporter {

	private static XSSFWorkbook workbook = null;
	private static XSSFSheet sheet = null;
	private static XSSFRow row = null;

	/*
	 * this constructor creates the workbook and sheet
	 */
	ExcelReporter(String testcaseSheetName) {
		workbook = new XSSFWorkbook();
		sheet = workbook.createSheet(testcaseSheetName);
		createReportHeader();
	}

	/*
	 * this method creates the header for reporter
	 */
	void createReportHeader() {
		row = sheet.createRow(0);
		// row.createCell(0).setCellValue("SNo");
		row.createCell(0).setCellValue("Step No");
		row.createCell(1).setCellValue("Description");
		row.createCell(2).setCellValue("Status");
	}

	static void flushWorkbook() throws IOException {
		FileOutputStream fos = new FileOutputStream(new File(
				"C:\\Users\\Dell\\workspace\\NgPoi\\report\\report.xlsx"));
		workbook.write(fos);
	}

	static void reortStep(String desc, String status) {
		row = sheet.createRow(sheet.getLastRowNum()+1);
		row.createCell(0).setCellValue(sheet.getLastRowNum());
		row.createCell(1).setCellValue(desc);
		row.createCell(2).setCellValue(status);
	}

}
