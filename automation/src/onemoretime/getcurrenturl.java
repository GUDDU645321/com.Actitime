package onemoretime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/");
		Thread.sleep(3000);
		String psk = driver.getCurrentUrl();
		System.out.println(psk);
		driver.close();
	}
}
