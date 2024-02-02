package Day_26_WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();	
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); 
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try 
		{
		WebElement weblink=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		weblink.sendKeys("Admin");
		}
		catch (Exception e)
		{
		System.out.println("Element not Found");
		}
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		try
			{
			WebElement weblink1=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[1]//a[1]//span[1]")));
			weblink1.click();
			}
			catch (Exception e)
			{
			System.out.println("Element not Found");
			}
		
		try
		{
		WebElement weblink2=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='oxd-text oxd-text--span']")));
		}
		catch (Exception e)
		{
		System.out.println("Element not Found");
		}
		
		int row=driver.findElements(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']")).size();
		System.out.println("Number of row:"+row);
		
		int column=driver.findElements(By.xpath("//div[@role='columnheader']")).size();
		System.out.println("Number of Column:"+column);

	}

}
