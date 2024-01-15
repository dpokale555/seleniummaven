package Day_31_Data_Driven_Testing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteEcxel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream("D:\\\\Dhananjay_APP\\\\SeleniumMaven\\\\TestData\\\\TestDataNew.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");
		
		//Insert same data 
		/*for(int r=0; r<3; r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			for(int c=0; c<2; c++)
			{
				currentrow.createCell(c).setCellValue("Welcome");
			}
		}*/
		
		//insert diffrent data
		Scanner sc=new Scanner(System.in);
		
		for(int r=0; r<3; r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			for(int c=0; c<2; c++)
			{
				
				System.out.println("Enter a input Value:");
				currentrow.createCell(c).setCellValue(sc.next());
			}
		}
		
	
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("Done!!!");
	}

}
