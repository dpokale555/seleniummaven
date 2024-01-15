package Day_23_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_SelectDropdown {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement drpButton=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		
		Select drpOption=new Select(drpButton);
		
		//Three types of methods to slect the option from dropdown list		
		drpOption.selectByVisibleText("Albania");
		//drpOption.selectByValue("ASM");
		//drpOption.selectByIndex(6);
		
		//Find the number of option in a dropdown
		List<WebElement> Ttl_Option=drpOption.getOptions();
		System.out.println("Total Numbers of Options:"+Ttl_Option.size());
		
		//Print countries list in console using for loop
		
		/*for (int i=0; i<Ttl_Option.size();i++)
		{
			System.out.println(Ttl_Option.get(i).getText());
		}*/
		
		for (WebElement Optionlist:Ttl_Option)
		{
			System.out.println(Optionlist.getText());
		}

	}

}
