package Day_28_otherAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLocation_Method {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		System.out.println(logo.getLocation());    //both x and y axis
		System.out.println(logo.getLocation().getX());      //x axis
		System.out.println(logo.getLocation().getY());      //y axis
	}

}
