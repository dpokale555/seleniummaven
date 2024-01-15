package Day_34_TestNG;

import org.testng.annotations.Test;

public class First_Test_Case {
	
	@Test
	void openapp()
	{
		System.out.println("Openning application..");
	}
	
	@Test
	void login()
	{
		System.out.println("login application..");
	}
	
	@Test
	void logout()
	{
		System.out.println("logout application..");
	}
	
	@Test
	void closedapp()
	{
		System.out.println("Closing application..");
	}
}

