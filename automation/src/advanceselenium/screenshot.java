package advanceselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class screenshot {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
    @Test
    public void takescreenshot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot/ss.png");
	Files.copy(src, dest);
	driver.close();
		
		
	}
}
