package onemoretime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://timesofindia.indiatimes.com/city/nashik");
		Thread.sleep(3000);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		int y = driver.findElement(By.xpath("//h2[@class='_3CEeM']")).getLocation().getY();
		System.out.println(y);
		j.executeScript("window.scrollby(0,"+y+")");
		Thread.sleep(3000);
		driver.close();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[6]/div/div[5]/div/div[1]/h2"));
		
		
		
				
				
				
				
				
				
				
				
	}

}
