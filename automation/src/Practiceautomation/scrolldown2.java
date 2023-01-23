package Practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		Thread.sleep(3000);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		 int y = driver.findElement(By.xpath("//span[.='Editor’s Picks']")).getLocation().getY();
		 System.out.println(y);
		 j.executeScript("window.scrollBy(0,"+y+")");
		 Thread.sleep(3000);
		 driver.close();
		
		 
		
		
	}
}
