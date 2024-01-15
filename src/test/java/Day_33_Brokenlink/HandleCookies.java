package Day_33_Brokenlink;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCookies {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		//1) How to capture the cookies?
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("Size of cookies:"+cookies.size());
		
		//2)How to print cookies info from browser
		for(Cookie c:cookies)
		{
			System.out.println(c.getName()+"    "+c.getValue());
		}
		
		//3) How to add cookies to the browser
		Cookie cookieObj=new Cookie("Mycookie","12345");          //created new cookie
		driver.manage().addCookie(cookieObj);                     //added new cookie
		
		cookies=driver.manage().getCookies();
		System.out.println("Size of cookies after adding new cookies:"+cookies.size());
		
		//4) How to delete specific cookies from the browser
		//driver.manage().deleteCookie(cookieObj);        //to delete the new cookie only
		driver.manage().deleteCookieNamed("Mycookie");    //to delete the specifi cookie using name
		//driver.manage().deleteAllCookies();               //to delete all the cookies
		
		cookies=driver.manage().getCookies();
		System.out.println("Size of cookies after deletion of new cookies:"+cookies.size());
		
		
		
		
	}

}
