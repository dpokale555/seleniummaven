package Day_21_WebDriver_command.copy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethod {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Get methods
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Title of the webpage:"+driver.getTitle());
		System.out.println("Get Current URL:"+driver.getCurrentUrl());
		//System.out.println("===============Page source=================");
		//System.out.println(driver.getPageSource());
		
		String windowID=driver.getWindowHandle();
		System.out.println(windowID);
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		for (String wind:windowIDs)
		{
			System.out.println(wind);
		}
		
		//driver.quit();

	}

}
