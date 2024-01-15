package Day_27_MouseOverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		//MouseHover
		WebElement Desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement Lap_Ntb=driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
		WebElement cmpt=driver.findElement(By.xpath("//a[normalize-space()='Components']"));
		WebElement mntr=driver.findElement(By.xpath("//a[normalize-space()='Monitors (2)']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(Desktops).moveToElement(Lap_Ntb).moveToElement(cmpt).moveToElement(mntr).click().build().perform();
		//act.moveToElement(job_titl).moveToElement(pay_gred).moveToElement(emp_stus).click().perform();
		
		

	}

}
