package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main (String[]args) throws InterruptedException  {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.name("q")).sendKeys("APPLE iPhone 14 Pro Max (Gold, 256 GB)");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(3000);
String price = driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']")).getText();
System.out.println(price);
driver.close();
}
}
