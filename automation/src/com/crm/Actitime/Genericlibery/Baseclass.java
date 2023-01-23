package com.crm.Actitime.Genericlibery;

import java.time.Duration;

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

import com.crm.Actitime.objectRepository.Loginpage;

import qsp.readdatafromproperty;

public class Baseclass {
	static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	 readdatafromproperty r = new readdatafromproperty();
	 public static WebDriver driver;
	 @BeforeSuite
	 public void databaseconnection() {
		 Reporter.log("database is connected",true);
		 
	 }
	 @AfterSuite
	public void databasedisconnection() {
		 Reporter.log("database is disconnected",true);
	 }
	 
	 @BeforeTest
	 public void launchbrowser() throws InterruptedException {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Thread.sleep(3000);

		 String Url= r.ReadDatafromProperty("url");
		 driver.get(Url);
	 }
	 
	 @AfterTest
	 public void closeBrowser() {
		 driver.close();
	 }
	 
	 @BeforeMethod
	 public void login() {
	 String UN = r.ReadDatafromProperty("username");
	 String pw = r.ReadDatafromProperty("password");
	 	Loginpage lp=new Loginpage(driver);
	 	lp.logintoActitime(UN, pw);
	 	
	 }
	 
	 @AfterMethod
	 public void logout() {
		 driver.findElement(By.id("logoutLink")).click();
	 }
	 

}
