package Day_27_MouseOverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		
		driver.switchTo().frame("iframeResult");                   //switch to frame
		
		WebElement dc_btn=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(dc_btn).perform();
		
		String expt_msg="Hello World";
		String act_msg=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		if(expt_msg.equals(act_msg))
		{
			System.out.println("Test Case Passes");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		
		
		
		

	}

}
