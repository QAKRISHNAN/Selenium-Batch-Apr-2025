package ApachePOI_ExcelFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataMultipleCell 
{

	public static void main(String[] args) throws IOException 
	{
		

		String filePath = "D:\\SELENIUM APR-2025\\WriteDataMultipleCells.xlsx";
		 FileInputStream file = new FileInputStream(filePath);
	    Workbook workbook = WorkbookFactory.create(file);
	    
	    Sheet sheet = workbook.getSheetAt(0); // assuming you want to read from the first sheet
	    
	    // Define the cell range you want to read
	
	    for (int i =1; i <= 1; i++) //0<=0 6<=5F Row 
	    {
	        Row row = sheet.getRow(i);
	        for (int j = 0; j <= 5; j++) //1<=5 2<=5 6<=5F 
	        {
	            Cell cell = row.getCell(j);
	            // Assuming all cells contain string data
	         String cellValue = cell.getStringCellValue();
	         System.out.print(cellValue + "\t");
	          
	      // int cellValue = (int) cell.getNumericCellValue();
	          
	        }
	        System.out.println();
	    }
	    
	    workbook.close();
	    file.close();
	}
}
