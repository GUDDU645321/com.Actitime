package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readdatafromproperty {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/commondata.property");
		Properties p= new Properties();
		p.load(fis);
		String URL = p.getProperty("url");
	    String UN = p.getProperty("username");
	    String PW = p.getProperty("password");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(UN);
		driver.findElement(By.name("pwd")).sendKeys(PW);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
	
		
	}
	public String ReadDatafromProperty(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
