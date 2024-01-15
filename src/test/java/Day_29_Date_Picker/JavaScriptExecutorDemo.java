package Day_29_Date_Picker;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();                                      
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.switchTo().frame(0);
		
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Inputbox - First Name
		WebElement inputbox=driver.findElement(By.xpath(""));
		js.executeScript("arguments[0].setAttribute('value',''test');",inputbox);
				
		//Radio button
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click();",male_rd);
		
		//checkbox
		WebElement chkbox=driver.findElement(By.xpath(""));
		js.executeScript("arguments[0].click();",chkbox);
		
		//Button
		WebElement button=driver.findElement(By.xpath(""));
		js.executeScript("arguments[0].click();",button);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		js.executeScript("argument[0].click();",male_rd);
		

	}

}
