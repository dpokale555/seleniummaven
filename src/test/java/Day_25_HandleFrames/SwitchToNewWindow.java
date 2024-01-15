package Day_25_HandleFrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToNewWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.TAB);          //opening of new Tab
		//driver.switchTo().newWindow(WindowType.WINDOW);     //opening of new window
		driver.get("https://text-compare.com/");

	}

}
