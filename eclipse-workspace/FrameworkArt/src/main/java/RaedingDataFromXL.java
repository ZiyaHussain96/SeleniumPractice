import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class RaedingDataFromXL
{
	
	
	
	public static void main(String [] args) throws Exception
	{
		
		FileInputStream fs= new FileInputStream("C:\\Users\\10667670\\eclipse-workspace\\FrameworkArt\\src\\main\\resources\\Excel/Testing.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(1);
		
		int noofRow=sheet.getPhysicalNumberOfRows();
		
		
		for(int i=0;i<noofRow;i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			int noofCol = row.getPhysicalNumberOfCells();
			
			for(int j=0;j<noofCol;j++)
			{		
				
				XSSFCell cell = row.getCell(j);
			System.out.print("||" + getData(cell));

			}
			
			
			System.out.println("");
		}
		
		workbook.close();
		fs.close();
	
	}
	
	public static String getData(XSSFCell cell)
	{
		
		switch(cell.getCellType())
		{
		case NUMERIC :
			return String.valueOf(cell.getStringCellValue());
			
		case BOOLEAN :
			return String.valueOf(cell.getBooleanCellValue());
			
		case STRING :
			return cell.getStringCellValue();
			
		default:
			return cell.getStringCellValue();

		
		}	
		
		
	}

}
