package Day_40_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//Approach 2) Creating page object class
	
	WebDriver driver;
	
	//constructor
	LoginPage(WebDriver driver)
	{
	this.driver=driver;
	
	}
	
	//identify the locator
	By img_loc=By.xpath("//img[@alt='company-branding']");
	By txt_username=By.xpath("//input[@placeholder='Username']");
	By txt_password=By.xpath("//input[@placeholder='Password']");
	By btn_login_loc=By.xpath("//button[@type='submit']");
	
	//Action Methods
	public boolean checkLogoPresence()
	{
		boolean status=driver.findElement(img_loc).isDisplayed();
		return status;		
	}
	
	public void setUserName(String name)
	{
		 driver.findElement(txt_username).sendKeys(name);	
	}
	
	public void setPassword(String pwd)
	{
		 driver.findElement(txt_password).sendKeys(pwd);	
	}
	
	public void clickLogin()
	{
		 driver.findElement(btn_login_loc).click();	
	}
	
	
}
