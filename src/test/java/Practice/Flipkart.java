package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.rediff.com");
			driver.manage().window().maximize();
			
			
			driver.switchTo().frame("moneyiframe");
			WebElement w=driver.findElement(By.id("bseindex"));
			System.out.println(w.getText());
			
			driver.switchTo().defaultContent();
			WebElement e=driver.findElement(By.xpath("//div[@class='cell']/span[@class='hmsprite logo']"));
			System.out.println(e.getText());
//			driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
//			Thread.sleep(3000);
//			WebElement w=driver.findElement(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']"));
//			String s=w.getText();
//			System.out.println(w.getSize());
//			System.out.println(s);
	}

}
