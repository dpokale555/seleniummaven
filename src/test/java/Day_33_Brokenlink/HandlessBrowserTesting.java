package Day_33_Brokenlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlessBrowserTesting {

	public static void main(String[] args) {
								
				ChromeOptions options=new ChromeOptions();
				//EdgeOptions options=new EdgeOptions();
				//FirefoxOptions options=new FirefoxOptions();
				options.setHandless(true);
		
		        WebDriverManager.chromedriver().setup();
				 
		      //WebDriver driver=new ChromeDriver(options);
		       //WebDriver driver=new EdgeDriver();
				WebDriver driver=new FirefoxDriver();
				
				//2) open url and located the element
				driver.get("https://admin-demo.nopcommerce.com/login");
				driver.manage().window().maximize();
				driver.findElement(By.id("Email")).clear();
			    driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
			    driver.findElement(By.id("Password")).clear();
				driver.findElement(By.id("Password")).sendKeys("admin");
				driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
								
				//3)Validate the title
				String exp_title="Dashboard / nopCommerce administration";
				String actu_title=driver.getTitle();
				
				if (exp_title.equals(actu_title))
				{
					System.out.println("Login Test Pass");
				}
				else
				{
					System.out.println("Login Test Failed");
				}
										
				//4) closed the browser
				driver.close();
	}

}
