package qsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	static{System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	Thread.sleep(3000);
	 WebElement src = driver.findElement(By.xpath("//h1[.='Block 1']"));
	 Thread.sleep(2000);
	WebElement dest = driver.findElement(By.xpath("//h1[.='Block 4']"));
	Thread.sleep(2000);
	Actions a = new Actions(driver);
	Thread.sleep(3000);
	a.dragAndDrop(src,dest).perform();
	Thread.sleep(3000);
	driver.close();
	

}
}
