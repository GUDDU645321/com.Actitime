package Practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class independent {
	static {
		System.setProperty("webdriver.chrome.driver" ,"./driver/chromedriver.exe");
		
	}
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro max");
	Thread.sleep(3000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(3000);
	String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	System.out.println(price);
	driver.close();
	
	
}
}
