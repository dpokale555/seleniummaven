package Day_40_PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	//Approac1) Createing page object using pagefactory approach
	
	WebDriver driver;
	
	//constructor
	LoginPage2(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	//identify the locator
	
	/*//other way to write the locatore
	@FindBy(how=How.XPATH, using="//img[@alt='company-branding']")
	WebElement img_logo;*/
	
	
	@FindBy(xpath="//img[@alt='company-branding']") 
	WebElement img_logo;
	
	@FindBy(name="username") 
	WebElement txt_username;
	
	@FindBy(name="password") 
	WebElement txt_password;
	
	@FindBy(xpath="//button[@type='submit']") 
	WebElement btn_login;
	
	/*//To identify multiple webelements
	@FindBy(tagName="a")
	List<WebElement> links;*/
	
	//Action Methods
	public boolean checkLogoPresence()
	{
		boolean status=img_logo.isDisplayed();
		return status;		
	}
	
	public void setUserName(String name)
	{
		txt_username.sendKeys(name);	
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);	
	}
	
	public void clickLogin()
	{
		btn_login.click();	
	}

}
