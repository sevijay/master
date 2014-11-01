package poi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelDemo {

	public static void main(String[] args) throws IOException {
		int cellnum = 0;
		//Creating the workbook
		XSSFWorkbook wb = new XSSFWorkbook();
		//Creating the worksheet
        XSSFSheet ws = wb.createSheet("Test Report");

         //Creating the first row
         XSSFRow r =ws.createRow(0);
         
         //Creating the first Cell
         XSSFCell c1 = r.createCell(0);
         
         //Adding the text to the cell
         c1.setCellValue("Step#");
         
         //Adding the value to the next cell
         r.createCell(1).setCellValue("Step Description");
         r.createCell(2).setCellValue("Status");
                           
         
         
 		//Write the workbook in file system
		    FileOutputStream out = new FileOutputStream(new File("C:\\workspace\\Framework\\Reports.xlsx"));
		    wb.write(out);
		    out.close();
		    
		    System.out.println("Sucess");

		
				
		
	}

}
