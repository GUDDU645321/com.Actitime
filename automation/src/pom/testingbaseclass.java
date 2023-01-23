package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testingbaseclass  {
	static {
		System.setProperty("webdriver.chorme.driver","./driver/chromedriver.exe");
	}
	@Test
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Loginpage lp = new Loginpage(driver);
		lp.loginToActitime("admin","manager");
		Thread.sleep(10000);
		driver.close();
	}
  
}
