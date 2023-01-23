package onemoretime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAll {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("file:///C:/Users/VISHAL%20VINOJ%20KURUP/OneDrive/Desktop/gtfrft.html");
		WebElement menu = driver.findElement(By.id("menu"));
		Select s= new Select(menu);
		Thread.sleep(3000);
		s.selectByValue("ckw");
		Thread.sleep(3000);
		s.selectByVisibleText("chicken biryani");
		Thread.sleep(3000);
		s.selectByIndex(8);
		Thread.sleep(3000);
		s.selectByVisibleText("masala papad");
		Thread.sleep(3000);
		s.deselectByVisibleText("manchurian");
		Thread.sleep(3000);
		s.deselectByVisibleText("coke");
		Thread.sleep(3000);
		s.deselectAll();
	}

}
