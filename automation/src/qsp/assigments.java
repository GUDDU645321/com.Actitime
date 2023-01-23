package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assigments {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		 FileInputStream fis = new FileInputStream("./Testdata/commondata.property");
		 Properties p = new Properties();
		 p.load(fis);
		 String URL = p.getProperty("url");
		 String UN = p.getProperty("username");
		 String PW = p.getProperty("password");
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(5000);
		 driver.manage().window().maximize();
		 driver.get(URL);
		 driver.findElement(By.id("username")).sendKeys(UN);
		 driver.findElement(By.name("pwd")).sendKeys(PW);
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[.='Login ']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[.='Tasks']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[.='Add New']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
		 Thread.sleep(5000);
	     FileInputStream fis1 = new FileInputStream("./Testdata/Testdata.xlsx");
	     Workbook wb = WorkbookFactory.create(fis1);
		 String data = wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		 driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(data);
		 Thread.sleep(5000);
		 driver.close();
		 }
}


