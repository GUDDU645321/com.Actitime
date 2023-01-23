package advanceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class bassclass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static WebDriver driver;
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database connected",true);
	}
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("database disconnected",true);
	}
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("browser launch successful",true);
	}
	@AfterTest
	public void closebrowser() {
		Reporter.log("browser close successful",true);
		
	}
	@BeforeMethod
	public void LoginToActitime1() {
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
	}
    @AfterMethod
    public void logoutToActitime() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.findElement(By.id("logoutLink")).click();
    	driver.close();
    	Reporter.log("logout successful",true);
    }
    
    @BeforeMethod
	public void LoginToActitime() {
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
    
    }
}

