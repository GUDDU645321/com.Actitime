import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		
		int Xaxis=driver.findElement(By.name("q")).getLocation().getX();
	int yaxis=driver.findElement(By.name("q")).getLocation().getY();
	System.out.println(Xaxis);
	System.out.println(yaxis);
	driver.close();
		
	}

}
