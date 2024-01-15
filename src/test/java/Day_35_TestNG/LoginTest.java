package Day_35_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	
	@Test(priority=1)
	void openapp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		String act_home=driver.findElement(By.xpath("//h1[normalize-space()='Admin area demo']")).getText();
		
		/*if(act_home.equals("Admin area demo"))
		{
			System.out.println("TestCase is Passed: 1");
		}
		else
		{
			System.out.println("TestCase is Failed: 1");
		}*/
		
		//insted of using if loops for validation used assertion class in testng
		
		Assert.assertEquals(act_home, "Admin area demo");
		
	}
	
	@Test(priority=2)
	void login()
	{
		WebElement emailbox=driver.findElement(By.xpath("//input[@id='Email']"));
		emailbox.clear();
		emailbox.sendKeys("admin@yourstore.com");
		
		WebElement pwdbox=driver.findElement(By.xpath("//input[@id='Password']"));
		pwdbox.clear();
		pwdbox.sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String act_lbl=driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).getText();
		
		/*if(act_lbl.equals("Dashboard123"))
				{
			System.out.println("Testcase Pass:2");
				}
		else
				{
			System.out.println("Testcase Failed:2");
				}*/
		
		//insted of using if loops for validation used assertion class in testng
		
			Assert.assertEquals(act_lbl, "Dashboard");
		
	}
	
	@Test(priority=3)
	void closing()
	{
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		String act_home=driver.findElement(By.xpath("//h1[normalize-space()='Admin area demo']")).getText();
		
		/*if(act_home.equals("Admin area demo"))
		{
			System.out.println("TestCase is Passed: 3");
		}
		else
		{
			System.out.println("TestCase is Failed: 3");
		}*/
		
		//insted of using if loops for validation used assertion class in testng
		
		Assert.assertEquals(act_home, "Admin area demo");
		
		driver.close();
}
}
