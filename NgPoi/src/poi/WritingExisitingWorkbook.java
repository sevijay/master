package poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExisitingWorkbook {

	public static void main(String[] args) throws InvalidFormatException,
			IOException {

		InputStream myxls = new FileInputStream(
				"C:\\workspace\\Framework\\Reports.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(myxls);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow r1 = sheet.createRow(1);
		XSSFCell c1 = r1.createCell(0);

		c1.setCellType(XSSFCell.CELL_TYPE_NUMERIC);
		c1.setCellValue(5);
		r1.createCell(1).setCellValue("Login with valid user");
		r1.createCell(2).setCellValue("Pass");

		FileOutputStream fileOut = new FileOutputStream(
				"C:\\workspace\\Framework\\Reports.xlsx");
		wb.write(fileOut);
		fileOut.close();
		System.out.println("Sucess");

	}

}
