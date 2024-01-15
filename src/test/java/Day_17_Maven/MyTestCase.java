package Day_17_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTestCase {

	public static void main(String[] args) {
				//System.setProperty("webdriver.egde.driver","C:\\Drivers\\Driver_Edge_Browser\\msedgedriver.exe");
				//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Driver_Chrome_Browser\\chromedriver.exe");
				//System.setProperty("webdriver.gecko.driver","C:\\Drivers\\Driver_Firefox_Browser\\geckodriver.exe");
				
		        WebDriverManager.chromedriver().setup();
				 
				//WebDriver driver=new EdgeDriver();
				WebDriver driver=new ChromeDriver();
				//WebDriver driver=new FirefoxDriver();
				
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
