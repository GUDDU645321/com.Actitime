import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkspresents {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	     List<WebElement> alllinks = driver.findElements(By.xpath("//div"));
	    int count = alllinks.size();
	    System.out.println(count);
	    for (int i = 0; i <count; i++) {
	    	String link = alllinks.get(i).getText();
	    	System.out.println(link);
			
		}
	    driver.close();
	    
	    
	  
		
	}
		
	}


