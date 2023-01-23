package Practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocation {
	static {
    	System.setProperty("webdriver.chorme.driver","./driver/chromedriver.exe");
    	
    }
    public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");
		int xaxis = driver.findElement(By.id("email")).getLocation().getX();
		int yaxis = driver.findElement(By.id("email")).getLocation().getY();
		System.out.println("xaxis=" +xaxis);
		System.out.println("yaxis=="+yaxis);
		driver.close();
		
	}
}
