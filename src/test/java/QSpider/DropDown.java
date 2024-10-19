package QSpider;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.id("phone")).sendKeys("0987654321");
		
		//WebElement gen=driver.findElement(By.xpath("//option[text()='Select Gender']"));
		WebElement gen=driver.findElement(By.id("select2"));
		Select s1=new Select(gen);
		s1.selectByIndex(2);
//		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
//		driver.findElement(By.xpath("//input[@id='attended']")).click();
		
		
	}

}
