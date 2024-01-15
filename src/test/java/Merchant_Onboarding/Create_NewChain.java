package Merchant_Onboarding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_NewChain {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://inqa.omniumpay.io/onboarding/content/landing/merchants/list");
		driver.findElement(By.xpath("//span[normalize-space()='Merchant Id']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Merchant Id']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='IME000000000041']")).click();
		driver.findElement(By.xpath("//span[@class='p-button-label ng-star-inserted']")).click();
		driver.findElement(By.id("chain-name")).sendKeys("Auto Chain 3");
		driver.findElement(By.id("mcc")).sendKeys("5411");
		driver.findElement(By.xpath("//span[normalize-space()='Create']")).click();
		Thread.sleep(3000);
		String exp_msg="Chain saved successfully.";
		String act_msg=driver.findElement(By.xpath("//p-message[@class='p-element w-75 visible']//span")).getText();
		if(exp_msg.equals(act_msg))
		{
			System.out.println(act_msg);
		}
		else
		{
			System.out.println("Test Case Failed");
		}
	}

}
