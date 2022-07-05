package Com.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider 
{
	XSSFWorkbook wb;
	
	public ExcelDataProvider() throws IOException
	{
		String pathExcel = "C:\\Users\\Shreedevi\\eclipse-workspace\\Frame_Work_One\\TestData\\data1.xlsx";
		
		FileInputStream fis1 = new FileInputStream(pathExcel);
		
		wb = new XSSFWorkbook(fis1);
	}
	
	public String getStringData(String sheetname, int row, int cell)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
