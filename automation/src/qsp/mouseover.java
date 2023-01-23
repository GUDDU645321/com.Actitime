package qsp;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseover {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.get("https://www.vtiger.com/");
	 WebElement element = driver.findElement(By.partialLinkText("Resources"));
	 Actions a=new Actions(driver);
	 Thread.sleep(5000);
	 a.moveToElement(element).perform();
	 driver.findElement(By.partialLinkText("Contact Us")).click();
	 Thread.sleep(5000);
	String text = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]")).getText();
	
	 System.out.println(text);
	 Thread.sleep(3000);
	 driver.close(); 
	 
	 
	
}
}
