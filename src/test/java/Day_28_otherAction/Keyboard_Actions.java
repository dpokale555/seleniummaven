package Day_28_otherAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Actions {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://text-compare.com/");
		driver.findElement(By.name("text1")).sendKeys("Hello Words");
		Actions act=new Actions(driver);
		
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL);    //Action ctr+a 
		act.keyDown(Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL);    //Action ctr+c
		act.sendKeys(Keys.TAB).perform();                                 //Press Tab key
		act.keyDown(Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL);    //Action ctr+v
		
		
		
	}

}
