package Day_36.pack1;

import org.testng.annotations.Test;

public class DBTest2 {
	
	@Test (priority=3)
	void test_select()
	{
		System.out.println("Select Test completed");
	}

	@Test (priority=4)
	void test_delete()
	{
		System.out.println("Delete Test complicated");
	}

}
