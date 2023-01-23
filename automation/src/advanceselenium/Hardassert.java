package advanceselenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Hardassert {
	
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		@Test
		public void verfiy() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			String Expected = "actitime - login ";
			String actual = driver.getTitle();
			Assert.assertEquals(actual, Expected);
			driver.close();
		}
		

	}


