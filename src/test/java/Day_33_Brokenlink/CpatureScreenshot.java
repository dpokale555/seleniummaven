package Day_33_Brokenlink;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CpatureScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1) screenshot of full page
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("D:\\Dhananjay_APP\\SeleniumMaven\\ScreenShot\\homepage.png");
		FileUtils.copyFile(src, trg);
		
		//2) screenshot of specific area from page
		WebElement fb=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		src=fb.getScreenshotAs(OutputType.FILE);
		trg=new File("D:\\Dhananjay_APP\\SeleniumMaven\\ScreenShot\\featureproduct.png");
		FileUtils.copyFile(src, trg);
		
			
		//3)screenshot of webelement
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		src=logo.getScreenshotAs(OutputType.FILE);
		trg=new File("D:\\Dhananjay_APP\\SeleniumMaven\\ScreenShot\\logo.png");
		FileUtils.copyFile(src, trg);

	}

}
