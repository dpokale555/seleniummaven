package Day_39_ExtentReports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;

	@BeforeClass
	void setup() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.nopcommerce.com");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	}

	@Test(priority=1)
	void testLogo()
	{		
		try
		{
			boolean status=driver.findElement(By.xpath("//div[@class='header-logo']//img")).isDisplayed();
			Assert.assertEquals(status, true);
		}
		catch (NoSuchElementException e)
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=2)
	void testLogin() throws InterruptedException {
		try {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Test123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

		//validation
		boolean status=driver.findElement(By.linkText("My account")).isDisplayed();
		Assert.assertEquals(status, true);
		}
		catch(Exception e)
		{
			Assert.fail();    //Assert.assertTrue(false);
		}

	}
	
	
	
	@Test(priority=3, dependsOnMethods= {"testLogin"})
	void testLogout() throws InterruptedException
	{
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(3000);
		boolean status=driver.findElement(By.linkText("Register")).isDisplayed();
		Assert.assertEquals(status, true);
	}

	@AfterClass
	void tearDown() {
	driver.quit();
	}
}
