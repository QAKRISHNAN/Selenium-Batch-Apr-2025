package ApachePOI_ExcelFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataSingleCell {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();

		//File file = new File("D:\\SELENIUM APR-2025\\SingleSheet.xlsx");
		File file = new File("D:\\SELENIUM APR-2025\\MySheet.xlsx");
		
		XSSFSheet sheet1 = wb.createSheet("WriteDataSingleCell");

		//XSSFSheet sheet1 = wb.getSheet("Sheet1");
		//XSSFSheet sheet1 = wb.getSheetAt(0);
		
		XSSFRow row2 = sheet1.createRow(8);
		row2.createCell(8).setCellValue("gdfhfghfg");

		FileOutputStream fileOut = new FileOutputStream(file);
		wb.write(fileOut);
		
		System.out.println("Written Successfully");

	}

}
