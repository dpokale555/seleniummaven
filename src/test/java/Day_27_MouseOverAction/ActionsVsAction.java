package Day_27_MouseOverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsVsAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		//right click action
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

	/*	//using Actions class 
		Actions act=new Actions(driver);
		act.contextClick(button).build().perform();          //statement will work
		//act.contextClick(button).perform();   */             //statement will work
		
		//using Action interface 
		Actions act=new Actions(driver);
		
		Action myaction=act.contextClick(button).build();       //created action first
		myaction.perform();                                     //performed the action

	}

}
