package ApachePOI_ExcelFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataSingleCell
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		  XSSFWorkbook wb = new XSSFWorkbook();
		    	      	    	
		String filePath = "D:\\SELENIUM APR-2025\\ReadDataSingleCell.xlsx";
		
		FileInputStream file = new FileInputStream(filePath);
		wb = new XSSFWorkbook(file);
			
		//XSSFSheet sheet = wb.getSheetAt(0);
		XSSFSheet sheet = wb.getSheet("Sheet");
		
		XSSFRow row = sheet.getRow(9);
		XSSFCell cell = row.getCell(2);
		String cellValue = cell.getStringCellValue(); 
		System.out.println("Cell value: " + cellValue);
		
		wb.close();
        file.close();
        

	}

}
