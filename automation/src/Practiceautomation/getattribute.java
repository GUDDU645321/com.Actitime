package Practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {
	
        static {
        	System.setProperty("webdriver.chorme.driver","./driver/chromedriver.exe");
        	
        }
        public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
		String value = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(value);
			driver.close();
			
		}
}



