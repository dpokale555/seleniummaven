package Day_36.pack1;

import org.testng.annotations.Test;

public class DBTest1 {
	
	
	@Test (priority=1)
	void test_insert()
	{
		System.out.println("Insertion Test completed");
	}
	
	@Test (priority=2)
	void test_update()
	{
		System.out.println("Updation Test complicated");
	}
}
