package onemoretime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkspresents {
           static {
        	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
           }
           public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			WebElement allinks = driver.findElement(By.xpath("//a"));
		}
}
