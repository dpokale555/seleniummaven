package Day_22_Wait_Methods;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluent_Wait_Method {

	public static void main(String[] args) {


		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();	
		
		//Declaration
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.RETURN);
		
		//ussage
		WebElement weblink = mywait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//h3[normalize-space()='Selenium Tutorial']"));
		     }
		   });
		
		weblink.click();
		
		//driver.findElement(By.xpath("//h3[normalize-space()='Selenium Tutorial']")).click();

	}

}
