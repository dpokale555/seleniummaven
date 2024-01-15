package Day_26_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTables {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		//1) How to find rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total Numbers of rows:"+rows);
		
		//2) How to find column in table
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Total Numbers of columns:"+columns);
		
		
		//3)Retrive the specific raw/column data
		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(value);
		
		//4) How to retrive all data from the table
		System.out.println("=====retrive all data from the table=====");
		
		for (int r=2;r<=rows;r++)
		{
			for(int c=1;c<=columns;c++)
			{
				String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value1+"        ");
			}
			System.out.println();
		}
		
		
		//5) Print the book name whose auther is Mukesh (Conditional Base)
		System.out.println("=====Print the book name whose auther is Mukesh=====");
		for (int R=2;R<=rows;R++)
		{
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+R+"]//td[2]")).getText();
			
			if(author.equals("Mukesh"))
			{
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+R+"]//td[1]")).getText();
				System.out.println(bookname);
			}
		}
		
		//6) Find sum of cost of all book listed
		System.out.println("=====sum of cost of all book listed=====");
		
		int total=0;
		for(int Rw=2;Rw<=rows;Rw++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+Rw+"]//td[4]")).getText();

			total=total+Integer.parseInt(price);
		}
		
		System.out.println("Total Price:"+total);
	}

}
