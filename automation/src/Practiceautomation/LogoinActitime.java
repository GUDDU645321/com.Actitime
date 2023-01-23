package Practiceautomation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class LogoinActitime {
	static {
		System.setProperty("webdriver.chrome.driver" ,"./driver/chromedriver.exe");
		
	}
public static void main(String[] args) throws InterruptedException, IOException {
 WebDriver driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.get( "https://www.instagram.com/");
 Thread.sleep(3000);
 driver.findElement( By.name( "username")).sendKeys("skurupvishal5@gmail.com");
 driver.findElement(By.name("password")).sendKeys("MVISHAL12345678");
 Thread.sleep(3000);
 driver.findElement( By.xpath("//button[@class='_acan _aiit _acao _aija _acat _aj1-']")).click();
 Thread.sleep(5000);
 driver.findElement( By.xpath("//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm']/button[1]")).click();
 Thread.sleep(3000);
 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/section/main/div/div/div/div/button")).click();
 Thread.sleep(3000);
 driver.findElement(By.xpath("//button[@class='_a9-- _a9_1']")).click();
 Thread.sleep(3000);
 TakesScreenshot t = (TakesScreenshot)driver;
 File src = t.getScreenshotAs(OutputType.FILE);
 File dest = new File("./screenshot/ss.png");
 Files.copy(src, dest);
 driver.close();


 
 
 
 
	
}
}
