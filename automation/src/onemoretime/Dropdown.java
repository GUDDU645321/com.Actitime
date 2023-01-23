package onemoretime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("vishal");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("kurup");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("7558231850");
		Thread.sleep(3000);
		driver.findElement(By.id("password_step_input")).sendKeys("VISHALM12345678");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s = new Select(day);
		s.selectByIndex(3);
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByValue("2");
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s2 = new Select(year);
		s2.selectByValue("1998");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.close();
		
	}

}
