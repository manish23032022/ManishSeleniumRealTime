package QSpider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickUIElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.id("name")).sendKeys("Manish");
		driver.findElement(By.id("email")).sendKeys("exmanish2016@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Manish@1234");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		
	//	Thread.sleep(20000);
		//driver.findElement(By.xpath("//section[text()='Web Elements']")).click();
	}

}
