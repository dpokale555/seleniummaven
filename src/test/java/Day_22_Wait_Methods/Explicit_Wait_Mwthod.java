package Day_22_Wait_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_Wait_Mwthod {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();	
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));    //Explicit wait declaration
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.RETURN);
		
		try 
		{
		WebElement weblink=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='Selenium Tutorial']")));
		weblink.click();
		}
		catch (Exception e)
		{
		System.out.println("Element not Found");
		}
		
		//driver.findElement(By.xpath("//h3[normalize-space()='Selenium Tutorial']")).click();
	}
		
	}

