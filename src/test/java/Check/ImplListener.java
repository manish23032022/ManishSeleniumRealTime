package Check;


import org.openqa.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import TestNg.ListenerDemo;
public class ImplListener implements ITestListener,ISuiteListener {

	WebDriver driver; 
	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;
	
	@Override
	public void onStart(ISuite suite) {
		spark=new ExtentSparkReporter("./Extentmanishreport/ali"+suite.getName()+".html");
		spark.config().setDocumentTitle("Loging");
		spark.config().setReportName("Mainsh ExtentReport");
		spark.config().setTheme(Theme.DARK);
		
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("Platform", "window-10");
		report.setSystemInfo("Version", "4.0.3");
		
		
	}

	@Override
	public void onFinish(ISuite suite) {
     report.flush();
     
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getMethod().getMethodName());
	
     
		
	}

	

	@Override
	public void onTestSuccess(ITestResult result) {
		 test.log(Status.PASS, "Cript is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot)ListenerDemo.driver;
		String filepath = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(filepath);
	
	
	}
	
	

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Cript is Skip");
	}


	



	



	


	
	
}
