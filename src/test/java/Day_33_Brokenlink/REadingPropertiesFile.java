package Day_33_Brokenlink;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class REadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		/*//Approach 1: Reading property file
		FileInputStream file=new FileInputStream("D:\\Dhananjay_APP\\SeleniumMaven\\src\\test\\resources\\config.properties");
		
		Properties pro=new Properties();
		pro.load(file);
		String URL=pro.getProperty("F_url");
		String EMAIL=pro.getProperty("F_Email");
		String PASSWORD=pro.getProperty("F_Password");
		*/
		
		//Approach 2: Reading property file
		ResourceBundle rb=ResourceBundle.getBundle("config");      //mention only name of the file
		String URL=rb.getString("F_url");
		String EMAIL=rb.getString("F_Email");
		String PASSWORD=rb.getString("F_Password");
				
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get(URL);
		driver.manage().window().maximize();
		
		WebElement emailtxt=driver.findElement(By.id("Email"));
		emailtxt.clear();
		emailtxt.sendKeys(EMAIL);
		
		WebElement pswdtxt=driver.findElement(By.id("Password"));
		pswdtxt.clear();
		pswdtxt.sendKeys(PASSWORD);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		

	}

}
