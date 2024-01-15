package Day_31_Data_Driven_Testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		
		String file=System.getProperty("user.dir")+"\\TestData\\Moneycontrol.TestData.xlsx";
		//String file=
		
		
		
		
		int rows=XLUtils.getRowCount(file, "Data");
		
		for(int i=1;i<=rows;i++)
		{
			String principle=XLUtils.getCellData(file, "Data", i, 0);
			String ROI=XLUtils.getCellData(file, "Data", i, 1);
			String per1=XLUtils.getCellData(file, "Data", i, 2);
			String per2=XLUtils.getCellData(file, "Data", i, 3);
			String freq=XLUtils.getCellData(file, "Data", i, 4);
			String exp_mvalue=XLUtils.getCellData(file, "Data", i, 5);
			
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principle);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(ROI);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			
			Select predrp=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			predrp.selectByVisibleText(per2);
			
			Select freqdrp=new Select(driver.findElement(By.xpath("//select[@name='frequency']")));
			freqdrp.selectByVisibleText(freq);
			
			driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
		
			
			String act_mvalue=driver.findElement(By.xpath("//span[@name='resp_matval']/strong")).getText();
			
			
			//validation
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
			{
				System.out.println("Test Passed");
				XLUtils.setCellData(file, "Data", i, 7, "Passed");
				XLUtils.fillGreenColor(file, "Data",i,7);
			}
			else
			{
				System.out.println("Test Failed");
				XLUtils.setCellData(file, "Data", i, 7, "Passed");
				XLUtils.fillRedColor(file, "Data",i,7);
			}
			
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
			Thread.sleep(3000);
			
		}
		
		driver.quit();
				
	}

}
