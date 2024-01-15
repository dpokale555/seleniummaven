package Day_31_Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("D:\\Dhananjay_APP\\SeleniumMaven\\TestData\\TestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int TotalRows=sheet.getLastRowNum();
		
		int TotalColumn=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Rows:"+TotalRows);
		System.out.println("Cells:"+TotalColumn);

		for(int r=0;r<=TotalRows;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			
			for(int c=0;c<TotalColumn;c++)
			{
				XSSFCell cell=currentrow.getCell(c);
				System.out.print(cell.toString()+"       ");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
	}

}
