package Practiceautomation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementss {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
	 List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	 
	 int count = alllinks.size();
	for (int i = 0; i <count; i++) {
	 String links = alllinks.get(i).getText();
	 System.out.println(links);
	
		
	}
	 Thread.sleep(1000);
	driver.close();
	}
	 
	}


