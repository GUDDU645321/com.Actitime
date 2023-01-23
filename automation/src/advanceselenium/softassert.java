package advanceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void verfiy() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String Expected = "actitime-logi";
		String actual = driver.getTitle();
		SoftAssert s = new SoftAssert();
		 s.assertEquals( Expected,actual);
		driver.close();
		
	}
	

}


