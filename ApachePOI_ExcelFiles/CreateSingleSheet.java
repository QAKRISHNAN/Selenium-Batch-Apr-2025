package ApachePOI_ExcelFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSingleSheet {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();
		
		File file=new File("D:\\SELENIUM APR-2025\\TestDataExcelFile.xlsx");
		FileOutputStream fileOut = new FileOutputStream(file);

		XSSFSheet sheet1=wb.createSheet("Amazon");
		
		System.out.println("Sheet Created");
	
		wb.write(fileOut);
		
		wb.close();
		
	}

}
