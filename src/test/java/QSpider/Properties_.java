package QSpider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Properties_ {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis=new FileInputStream("C:\\Users\\Manish\\git\\repository11\\ManishProject\\abhiraj.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String url=pobj.getProperty("url");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		String title=driver.getTitle();
		System.out.println(title);
	}

}
