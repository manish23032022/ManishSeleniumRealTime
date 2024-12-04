package InterviewQestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelectedEnableDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement text=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		System.out.println(text.isDisplayed());
		System.out.println(text.isEnabled());
		
		WebElement sel=driver.findElement(By.xpath("//input[@value='Male']"));
		sel.click();
		System.out.println(sel.isSelected());
		
	}

}
