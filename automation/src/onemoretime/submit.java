package onemoretime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		int height1 = driver.findElement(By.id("username")).getSize().getHeight();
		int width2 = driver.findElement(By.id("username")).getSize().getWidth();
		int hight11 = driver.findElement(By.name("pwd")).getSize().getHeight();
		int width22 = driver.findElement(By.name("pwd")).getSize().getWidth();
		System.out.println("height1 of username testboox is"+height1);
		System.out.println("width2 of username testboox is"+width2);
		System.out.println("hight11 of password textboox is"+hight11);
		System.out.println("width22 of password textboox is"+width22);
		driver.close();
		
		
		
	}
}
