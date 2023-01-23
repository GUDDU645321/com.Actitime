package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suugestionamazon {
 static {
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	 
 }
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.com/");
	 Thread.sleep(3000);
	 driver.findElement(By.id( "twotabsearchtextbox")).sendKeys( "oneplus");
	 Thread.sleep(5000);
	 List<WebElement> allsugges = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
	 int count = allsugges.size();
	 for (int i = 0; i < args.length; i++) {
		 String sugg = allsugges.get(i).getText();
		 System.out.println(sugg);
		 
		
	}
	driver.close(); 
	
}
 
}
