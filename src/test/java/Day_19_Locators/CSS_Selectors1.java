package Day_19_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Selectors1 {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		//using CSS selector : "tag name & id" combination : seperated with "#"
		//driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("T-shirts");          
		//driver.findElement(By.cssSelector("#search_query_top")).sendKeys("T-shirts");                
			
		//using CSS selector : "tag name & class" combination : seperated with "."
		//driver.findElement(By.cssSelector("input.search_query")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector(".search_query")).sendKeys("T-shirts");
		
		//using CSS selector : "tag name & attribute" combination : seperated with "[]"
		//driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("input[name=\"search_query\"]")).sendKeys("T-shirts");
		
		//using CSS selector : "tag name, class & attribute" combination : seperated with ". & []"
		driver.findElement(By.cssSelector("input.search_query[name='search_query']")).sendKeys("T-shirts");
	}

}
