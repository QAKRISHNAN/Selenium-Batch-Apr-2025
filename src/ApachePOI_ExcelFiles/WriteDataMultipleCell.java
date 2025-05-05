package ApachePOI_ExcelFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataMultipleCell {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();

		File file = new File("D:\\SELENIUM APR-2025\\WriteDataMultipleCells.xlsx");
		
		XSSFSheet sheet1 = wb.createSheet("WriteDataMultipleCells");

		XSSFRow row1 = sheet1.createRow(0);
		
		row1.createCell(0).setCellValue("Aruna");
		row1.createCell(1).setCellValue("Keerthi");
		row1.createCell(2).setCellValue("Divya");
		row1.createCell(3).setCellValue("Khaleen");
		row1.createCell(4).setCellValue("Srvan");
		row1.createCell(5).setCellValue("Purender");
		
		XSSFRow row2 = sheet1.createRow(1);
		row2.createCell(0).setCellValue("Software");
		row2.createCell(1).setCellValue("Automation");
		row2.createCell(2).setCellValue("Testing");
		row2.createCell(3).setCellValue("Manual");
		row2.createCell(4).setCellValue("Testing");
		row2.createCell(5).setCellValue("Functional");
		
		XSSFRow row3 = sheet1.createRow(2);
		row3.createCell(0).setCellValue("Software");
		row3.createCell(1).setCellValue("Automation");
		row3.createCell(2).setCellValue("Testing");
		row3.createCell(3).setCellValue("Manual");
		row3.createCell(4).setCellValue("Testing");
		row3.createCell(5).setCellValue("Functional");

		FileOutputStream fileOut = new FileOutputStream(file);
		wb.write(fileOut);
		
		System.out.println("Written Successfully");

	}

}
