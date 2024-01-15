package Day_21_WebDriver_command.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test123 {

	public static void main(String[] args) {

		  WebDriverManager.firefoxdriver().setup();
		  WebDriver driver=new FirefoxDriver();
	
			//2) open url and located the element
			driver.get("https://inqa.omniumpay.io/onboarding/content/landing/merchants/list");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[normalize-space()='Merchant Id']")).click();			
	}

}
