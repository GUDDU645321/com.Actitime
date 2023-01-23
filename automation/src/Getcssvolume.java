import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcssvolume {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kalyanjewellers.net/brands.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String value = driver.findElement( By.xpath( "(//img[@alt='Kalyan'])[3]")).getAttribute( "class");
		System.out.println(value);
		driver.close();
		
			
			
	}

}
