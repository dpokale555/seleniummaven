package Day_23_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxDemo {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		//selecting checkbox
		//driver.findElement(By.xpath("//input[@id='profession-0']")).click();
		
		//find total number of checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of checkboxs :"+checkboxes.size());
		
		//select all the checkboxes using "loop statment"
		/*for (int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		//unselect all the checkboxes using "enhance for loop"
		for (WebElement chkbox:checkboxes)
		{
			chkbox.click();
		}
		
		//Select last 2 checkboxes
		for (int i=3;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//Select first 2 checkboxes
		for (int i=0;i<2;i++)
				{
					checkboxes.get(i).click();
				}
		
		
		//driver.quit();

	}

}
