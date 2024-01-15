package Day_36_Annotation;

import org.testng.annotations.*;

/*1) login
 * 2) search
 * 3) logout
 * 4)login
 * 5)adv search
 * 6) logout
 */

public class First_Test_Case {
	
		
	@BeforeMethod
	void login()
	{
		System.out.println("login application..");
	}
	
	@Test (priority=1)
	void search()
	{
		System.out.println("Searchin..");
	}
	
	@Test (priority=2)
	void advserache()
	{
		System.out.println("Adv serchaing...");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("logout application..");
	}
}

