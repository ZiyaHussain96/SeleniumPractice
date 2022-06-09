import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class CreatingXLusingApache 
{
	
	@Test
	public void sample() throws IOException
	{
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("First");
		
		sheet1.createRow(0);
		sheet1.getRow(0).createCell(0).setCellValue("Testing");
		sheet1.getRow(0).createCell(1).setCellValue("Mode");
		
		sheet1.createRow(1);
		sheet1.getRow(1).createCell(0).setCellValue("Yes");
		sheet1.getRow(1).createCell(1).setCellValue("Manual");
		
		sheet1.createRow(2);
		sheet1.getRow(2).createCell(0).setCellValue("Yes");
		sheet1.getRow(2).createCell(1).setCellValue("Automation-Selenium");
		
		FileOutputStream file= new FileOutputStream("C:\\Users\\10667670\\eclipse-workspace\\FrameworkArt\\src\\main\\resources\\Excel/Testing.xlsx");
		
		
		workbook.write(file);
	
	}
	
	

}
