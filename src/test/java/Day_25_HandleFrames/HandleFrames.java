package Day_25_HandleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrames {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		driver.switchTo().frame(0);
	}

}
