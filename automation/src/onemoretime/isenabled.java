package onemoretime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
     public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		boolean button = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		if (button==true) {
			System.out.println("button is enable");
			
			
		}
		else {
			System.out.println("button is dienable");
		}
		driver.close();
	}
     
}
