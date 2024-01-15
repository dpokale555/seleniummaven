package Day_37_Grouping;

import org.testng.annotations.Test;

/*
 * loginByEmail -sanity & regression
 * loginByfacebook -Sanity
 * loginBytwitter - sanity
 * 
 * signupbyemial - sanity & regression
 * signeupbyfacebook - regression
 * signeupbytwitter - regression
 * 
 * paymentByRupees - sanity & regression
 * paymentBydoller - sanity
 * paymentReturnbyBank - regression 
 */



public class GroupingDemo {
	
	
  @Test (priority=1, groups= {"sanity","regression"})
  void loginByEmail() 
  {
	  System.out.println("This is login by email");
	  
  }
  @Test (priority=2, groups= {"sanity"})
  void loginByfacebook() 
  {
	  System.out.println("This is login by facebook");
	  
  }
  @Test (priority=3, groups= {"sanity"})
  void loginBytwitter() 
  {
	  System.out.println("This is login by twitter");
	  
  }
  
  @Test (priority=4, groups= {"sanity","regression"})
  void signupByEmail() 
  {
	  System.out.println("This is signup by email");
	  
  }
  @Test (priority=5, groups= {"regression"})
  void signeupByfacebook() 
  {
	  System.out.println("This is signup by facebook");
	  
  }
  @Test (priority=6, groups= {"regression"})
  void signeupBytwitter() 
  {
	  System.out.println("This is signup by twitter");
	  
  }
  
  
  @Test (priority=7, groups= {"sanity","regression"})
  void paymentByrupees() 
  {
	  System.out.println("This is payment by Rupees");
	  
  }
  @Test (priority=8, groups= {"sanity"})
  void paymentBydoller() 
  {
	  System.out.println("This is payment by doller");
	  
  }
  @Test (priority=9, groups= {"regression"})
  void paymentReturnByBank() 
  {
	  System.out.println("payment return by bank");
	  
  }
  
  
}
