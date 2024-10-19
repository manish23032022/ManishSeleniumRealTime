package QSpider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pro {
    public static void main(String[] args) throws IOException {
		 FileInputStream fs=new FileInputStream("C:\\Users\\Manish\\git\\repository11\\ManishProject\\chintu.properties");
		 Properties property=new Properties();
		 property.load(fs);
		 String username=property.getProperty("username");
		 String password=property.getProperty("password");
		 String url=property.getProperty("url");
		 WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password,Keys.ENTER);
		 
		 

	}
}
