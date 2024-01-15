package Day_33_Brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrkenLink {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement element:links)
		{
			String url=element.getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is empty");
				continue;
			}
			
			//Convere string url into actual URL object format by using prdeffine javaclass 'URL'
			URL link=new URL(url);
			
			try
			{
			//Sent converted url to server using prdefine javaclass 'HttpURLConnection
			HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
			httpconn.connect();
			
			if(httpconn.getResponseCode()>=400)
			{
				System.out.println(httpconn.getResponseCode()+"   "+url+"   "+"is a Broken Link");
			}
			else
			{
				System.out.println(httpconn.getResponseCode()+"   "+url+"   "+"is Not a Broken Link");
			}
			
		}
		catch (Exception e)
		{
			
		}
		}
		

	}

}
