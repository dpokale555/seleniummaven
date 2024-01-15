package Day_27_MouseOverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		//right click action
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		
		Actions act=new Actions(driver);
		act.contextClick(button).build().perform();
		//act.contextClick(button).perform();
			
		driver.findElement(By.xpath("//span[normalize-space()='Paste']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();

	}

}
