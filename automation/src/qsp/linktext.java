package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/VISHAL%20VINOJ%20KURUP/OneDrive/Desktop/demo.html");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Dream11 fantasy")).click();
	Thread.sleep(3000);
	driver.close();
}
}
