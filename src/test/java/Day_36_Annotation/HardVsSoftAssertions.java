package Day_36_Annotation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	@Test
	void test_hardassertions()
	{
		System.out.println("testing....");
		System.out.println("testing....");
		System.out.println("testing....");
		
		Assert.assertEquals(1, 2);
		
		System.out.println("hard assertion is completed...");   //this statement will be exicuited even if soft assertions get failed
	}
	
	@Test
	void test_softassertions()
	{
		System.out.println("testing....");
		System.out.println("testing....");
		System.out.println("testing....");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);
		
		System.out.println("soft assertion is completed...");   //this statement will not be exicuted bcoz of hard assertions if its failed
		
		sa.assertAll();    //this is mandetory required
		
	}

}
