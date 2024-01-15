package Day_18_Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo1 {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).clear();*/
		
		//fine the count of sliders by using class
		List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
		System.out.println("number of sliders:"+sliders.size());
		
		//total count of links by using TagName
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total numbers of Links:"+links.size());
			
	}

}
