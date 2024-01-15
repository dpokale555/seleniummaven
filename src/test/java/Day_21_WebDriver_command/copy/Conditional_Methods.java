package Day_21_WebDriver_command.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Conditional_Methods {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1)isDisplayed & isEnabled --- used for all types of WebElements
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display Status:"+searchbox.isDisplayed());
		System.out.println("Enable Status:"+searchbox.isEnabled());
		
		//2)isSelected ---used for only checkbox and radios button
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//before selection
		System.out.println("===Before Selecting====");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		//after selection of male button
		male_rd.click();
		System.out.println("===after selection of male button====");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		//after selection of female button
		female_rd.click();
		System.out.println("===after selection of female button====");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
				
		}

}
