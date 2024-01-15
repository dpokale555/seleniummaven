package Day_36_Annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	void test()
	{
		Assert.assertTrue(true);   //passed
		Assert.assertTrue(false);  //failed
		
		Assert.assertFalse(false); //passed
		Assert.assertFalse(true);  //false
		
		int a=10;
		int b=20;
		int c=30;
		
		//Assert.assertEquals(actual,expect, description);      ---syntax
		//Assert.assertEquals(a>b, true);     //false
		//Assert.assertNotEquals(a>b, true);    //false
		
		//Assert.assertEquals(a<c, true);   //passed
		//Assert.assertEquals(a<c, false);   //passed
		
		//We can compaired string value also
		
		String act_val="abc";
		String exp_val="xyz";
				
		Assert.assertEquals(act_val,exp_val,"Values are not equal....");
		
		//Assert.fail();
		
	}

}
