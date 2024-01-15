package Day_37_Grouping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {

	WebDriver driver;

	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "dp")
	void testLogin(String email, String pwd) throws InterruptedException {
		driver.get("https://demo.nopcommerce.com/login");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

		String exp_title = "nopCommerce demo store";
		String act_title = driver.getTitle();

		Assert.assertEquals(exp_title, act_title);
	
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();

	}

	@DataProvider(name = "dp", indices= {0,2}) // indices :it will take specific parameter only of position 0 and 3
	String[][] loginData() {
		String data[][] = { { "abcd1@gmail.com", "Password1" }, 
							{ "abcd2@gmail.com", "Password2" },
							{ "abcd3@gmail.com", "Password3" }, 
							{ "abcd4@gmail.com", "Password4" } 
							};
		return data;
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}

}
