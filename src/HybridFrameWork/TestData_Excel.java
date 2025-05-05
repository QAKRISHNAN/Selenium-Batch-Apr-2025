package HybridFrameWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData_Excel 
{

	XSSFWorkbook wb;

    public TestData_Excel(String excelPath) throws IOException 
    {
        FileInputStream fis = new FileInputStream(excelPath);
        wb = new XSSFWorkbook(fis);
    }

    public String getData(int sheetNumber, int row, int column) 
    {
        XSSFSheet sheet = wb.getSheetAt(sheetNumber);
        return sheet.getRow(row).getCell(column).toString();
    }

    public int getRowCount(int sheetNumber) 
    {
        return wb.getSheetAt(sheetNumber).getLastRowNum() + 1;
    }
}
