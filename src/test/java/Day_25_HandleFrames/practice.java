package Day_25_HandleFrames;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Java");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		Thread.sleep(3000);
		List<WebElement> alloptions=driver.findElements(By.xpath("//div[@class='wikipedia-search-results']//a"));
		System.out.println(alloptions.size());
		
		for(WebElement options:alloptions)
		{
			if(options.getText().contains("Java"))
			{
				options.click();
			}
		}
		
		Set<String> windoids=driver.getWindowHandles();
		List<String> W_Id=new ArrayList(windoids);
		
		for (int i=0;i<=alloptions.size();i++)
		{
		   String BW=W_Id.get(i);
		   driver.switchTo().window(BW);
		   Thread.sleep(2000);
		   System.out.println("Browser window Title:"+driver.getTitle());  
		}
		
		List<String> W_Id1=new ArrayList(windoids);
		
		for (int x=0;x<=alloptions.size();x++)
		{
		   String BW1=W_Id1.get(x);
		   driver.switchTo().window(BW1);
		   Thread.sleep(1000);
		   driver.close(); 
		}
		
	}
}


