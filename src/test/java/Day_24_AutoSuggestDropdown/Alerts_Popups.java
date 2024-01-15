package Day_24_AutoSuggestDropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_Popups {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.sendKeys("Welcome");
		myalert.accept();                      // ---To click on "OK"
		//myalert.dismiss();                   // ---To click on "Cancel"
		
		String exp_text="You entered: Welcome";
		String act_text=driver.findElement(By.id("result")).getText();	
		if(exp_text.equals(act_text))
		{
			System.out.println("Testcase Passed");
		}
		else
		{
			System.out.println("Testcase Failed");
		}
		
		

	}

}
