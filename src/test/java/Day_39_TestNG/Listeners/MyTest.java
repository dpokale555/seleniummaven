package Day_39_TestNG.Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(MyListener.class)   //do not used approach to add listener in class instead of this only mentioned listener in xml file
public class MyTest {
	
	@Test(priority=1)
	void test1()
	{
		Assert.assertEquals("A", "A");
	}
	
	@Test(priority=2)
	void test2()
	{
		Assert.assertEquals("A", "B");
	}
	
	@Test(priority=3,dependsOnMethods= {"test2"})
	void test3()
	{
		Assert.assertEquals("A", "A");
	}
}
