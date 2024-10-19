package Check;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class Thread {

	public static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	public static ThreadLocal<ExtentTest>  test=new ThreadLocal<ExtentTest>();
	public static ThreadLocal<WebDriver> getDriver() {
		return driver;
	}
	public static void setDriver(ThreadLocal<WebDriver> driver) {
		Thread.driver = driver;
	}
	public static ThreadLocal<ExtentTest> getTest() {
		return test;
	}
	public static void setTest(ThreadLocal<ExtentTest> test) {
		Thread.test = test;
	}
	
}
