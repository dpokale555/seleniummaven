package Day_36.pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DBConnect {
	
	//@BeforeTest
	@BeforeSuite
	void connectDB()
	{
		System.out.println("DB Connection opened...");
	}
	
	//@AfterTest
	@AfterSuite
	void closedDBConnect()
	{
		System.out.println("DB Connection closed...");
	}

}
