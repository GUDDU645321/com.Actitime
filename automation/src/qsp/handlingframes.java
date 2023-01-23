package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingframes {
	static {
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("file:///C:/Users/VISHAL%20VINOJ%20KURUP/OneDrive/Desktop/page1.html");
    driver.findElement(By.id("tb")).sendKeys("Q");
    driver.switchTo().frame(0);
    driver.findElement(By.id("tb2")).sendKeys("J");
    driver.switchTo().parentFrame();
    driver.findElement(By.id("tb")).sendKeys("s");
    driver.switchTo().frame(0);
    driver.findElement(By.id("tb2")).sendKeys("s");
    driver.switchTo().defaultContent();
    driver.findElement( By.id("tb")).sendKeys("p");
    driver.switchTo().frame(0);
    driver.findElement( By.id("tb2")).sendKeys("p");
    driver.switchTo().parentFrame();
    driver.findElement(By.id("tb")).sendKeys("r");
    driver.switchTo().frame(0);
    driver.findElement(By.id("tb2")).sendKeys("w");
    driver.switchTo().defaultContent();
    driver.findElement(By.id("tb")).sendKeys("E");
    driver.switchTo().frame(0);
    driver.findElement(By.id("tb2")).sendKeys("U");
    Thread.sleep(5000);
    driver.close();
    
    
		
	}

}
