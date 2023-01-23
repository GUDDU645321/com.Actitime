package qsp;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosagation {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
   public static void main(String[] args) throws InterruptedException {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get( "https://www.flipkart.com/");
   driver.findElement( By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
   Thread.sleep(5000);
   driver.findElement(By.name( "q")).sendKeys( "oneplus");
   Thread.sleep(5000);
   List<WebElement> allsugges = driver.findElements(By.xpath( "//a[@class='_3izBDY']/.."));
  
   int count = allsugges.size();
   for (int i = 0; i <count; i++) {
   String sugg = allsugges.get(i).getText();
   System.out.println(sugg);
   
	
}
	driver.close();
}
   
}

