package Day_39_ExtentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManagers implements ITestListener
{
	public ExtentSparkReporter sparkReporter;   //UI of the report
	public ExtentReports extent;      //populate common info of the report
	public ExtentTest test;            //creating test case entries in the report and update status of the methods
	
	public void onStart(ITestContext Context)
	{
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/Report/myReports.html"); //specify local
 		
		sparkReporter.config().setDocumentTitle("Automation Report"); //Title of the report
		sparkReporter.config().setReportName("Functional Testing");  //name of the report
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Enviornment", "QA");
		extent.setSystemInfo("Tester Name", "Dhananjay");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browser Name", "Chrome,Firefox,Edge");
		
	}
	
	public void onTestSuccess(ITestResult result)
	{
		test=extent.createTest(result.getName());       //create a new entry in the report
		test.log(Status.PASS, "Test Case PASSED is: "+result.getName());  //update status passed/failed/skiped
				
	}
	
	public void onTestFailuer(ITestResult result)
	{
		test= extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED is: "+result.getName());
		test.log(Status.FAIL, "Test case FAILED cause is: "+result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		test =extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case SKIPPED is: "+result.getName());
	}
	
	public void onFinsih(ITestContext context)
	{
		extent.flush();
	}
	
}
