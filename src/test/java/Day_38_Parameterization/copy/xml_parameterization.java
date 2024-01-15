package Day_38_Parameterization.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * 1)Create a test case
 * 2) Execute test case using xml
 * 3)pass browser name & url as a parameter to the test method from xml file
 * 4) execute test on multiple browser sequencially (serial execution)
 * 5) Execute test on multiple browser parallely (parallel execution
 */

public class xml_parameterization {
	
	WebDriver driver;
	
	@Parameters({"browser","url"})
	@BeforeClass
	void setup(String br, String appURL) throws InterruptedException
	{
		if(br.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else if(br.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		
		//driver.manage().window().maximize();
		driver.get(appURL);
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	void testLogo()
	{		
		try
		{
			WebElement logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']"));
			Assert.assertEquals(logo.isDisplayed(), true);
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	}
	
	
	@Test(priority=2)
	void testTitle()
	{
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM","Title Not Matched");
		
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
