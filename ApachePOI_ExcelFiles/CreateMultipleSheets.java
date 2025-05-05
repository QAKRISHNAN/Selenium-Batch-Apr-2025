package ApachePOI_ExcelFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateMultipleSheets {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();
		
		File file=new File("D:\\SELENIUM APR-2025\\TestDataExcelFile.xlsx");
		FileOutputStream fileOut = new FileOutputStream(file);

		XSSFSheet sheet1=wb.createSheet("SwagLabs");
		XSSFSheet sheet2=wb.createSheet("Amazon");
		XSSFSheet sheet3=wb.createSheet("FaceBook");
		XSSFSheet sheet4=wb.createSheet("DemoQA");
		XSSFSheet sheet5=wb.createSheet("OpenCart");
		
		System.out.println("Multiple Sheets Created");
	
		wb.write(fileOut);
		
		wb.close();
	}

}
