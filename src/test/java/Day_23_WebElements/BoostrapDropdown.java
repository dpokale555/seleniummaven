package Day_23_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BoostrapDropdown {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		//1) capture all the options without select tag have to write the manual xpath by adding parent tag name at the end "/option"
		List<WebElement> Ttl_Option=driver.findElements(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select/option"));
		
		//2)find total number of options
		System.out.println("Total Number of Option:"+Ttl_Option.size());
		
		//3) print the option list 
		
		for (WebElement option:Ttl_Option)
		{
			System.out.println(option.getText());
		}
		
		
		//4)select the option from dropdown without select tag
		for (WebElement option:Ttl_Option)
		{
			if(option.getText().equals("Angola"))
					{
				option.click();
				break;
					}
		}
		
		
	}

}
