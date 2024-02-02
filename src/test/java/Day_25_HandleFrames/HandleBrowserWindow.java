package Day_25_HandleFrames;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("ID of browser windo"+driver.getWindowHandle());
		
		driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
		
		Set<String> windowids=driver.getWindowHandles();
		
		//Approach 1
		List<String> windowIdList=new ArrayList<String>(windowids);
		String parrentWID=windowIdList.get(0);
		String childWID=windowIdList.get(1);
		
		driver.switchTo().window(childWID);
		//driver.findElement(By.xpath("//input[@id='Form_submitForm_action_request']")).click();
		System.out.println("Child browser window title:"+driver.getTitle());
		
		driver.switchTo().window(parrentWID);
		System.out.println("Parent browser window title:"+driver.getTitle());
		
		//Approach 2
	/*	for (String windowid:windowids)
		{
			String title=driver.switchTo().window(windowid).getTitle();
			if(title.equals("OrangeHRM HR Software | OrangeHRM"))
			{
			driver.findElement(By.xpath("//input[@id='Form_submitForm_action_request']")).click();
			
		}*/
		

	}

}
