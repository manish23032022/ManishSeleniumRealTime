package QSpider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exce {
   public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\Manish\\git\\repository17\\ManishProject\\ManishNoushad.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String url=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	String user=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	String pass=wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.findElement(By.name("email")).sendKeys(user);
	driver.findElement(By.name("pass")).sendKeys(pass);
	
	
}
}
