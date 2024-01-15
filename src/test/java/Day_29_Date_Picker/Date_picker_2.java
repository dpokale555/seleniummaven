package Day_29_Date_Picker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_picker_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.xpath("//input[@id='departon']")).click();
		
		//logic path
		String month="Mar";
		String year="1985";
		String date="20";
		
		//Month selection
		Select dropmonth=new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
		dropmonth.selectByVisibleText(month);
		
		//year Selection
		Select dropyear=new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
		dropyear.selectByVisibleText(year);
		
		//date selection
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement dt:alldates)
			
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		
	}

}
