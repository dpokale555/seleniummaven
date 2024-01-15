package Day_39_TestNG.Listeners;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
//public class MyListener extends TestListenerAdapter      //both lines are correct
{
	
	//1)implementes ItestListner (interface) path: 
	//path to see the all methods https://javadoc.io/doc/org.testng/testng/latest/org/testng/ITestListener.html
	
	public void onStart(ITestContext context)
	{
		System.out.println("On start");
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("On Test start");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("On Test failuer");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("On Test Skipped");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("On Test Success");
	}
	
	public void onFinish(ITestContext context)
	{
		System.out.println("On finsihed");
	}
	

}
