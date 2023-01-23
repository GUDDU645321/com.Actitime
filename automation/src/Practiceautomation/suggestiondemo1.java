package Practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class suggestiondemo1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.youtube.com/");
		Thread.sleep(5000);
		driver.findElement( By.xpath( "//input[@placeholder='Search']"));
		driver.findElement(By.name( "search_query")).sendKeys( "mai teri aankho me udasi");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
		driver.findElement(By.xpath( "//img[@class='yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded']")).click();
		Thread.sleep(50000);
		driver.close();
		
	}

}
