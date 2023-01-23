package advanceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class verificationassertion{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void verfiy() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String Expected = "actitime";
		String actual = driver.getTitle();
		if (Expected.equals(actual)) {
		Reporter.log("testscript pass",true);	
		}else {
			Reporter.log("testscript fail",true);
		}
		driver.close();
	}
	

}
