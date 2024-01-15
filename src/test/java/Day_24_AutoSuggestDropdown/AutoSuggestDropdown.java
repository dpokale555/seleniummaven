package Day_24_AutoSuggestDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(3000);
		
		//list of the total elements
		List<WebElement> alloption=driver.findElements(By.xpath("//*[@class='wM6W7d']"));
		System.out.println(alloption.size());
		
		//print the all elements
		for(WebElement option:alloption)
		{
			System.out.println(option.getText());
		}
		
		//click on the specific element
		for (WebElement option:alloption)
		{
			if(option.getText().equals("selenium tutorial"))
			{
				option.click();
				break;
			}
		}

	}

}
