package onemoretime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vkHtml {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/VISHAL%20VINOJ%20KURUP/OneDrive/Desktop/vk.html");
		driver.findElement(By.id("vishal")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
	//First open notepaid and add the code and save in(demo.html).a

}
