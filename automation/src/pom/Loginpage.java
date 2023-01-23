package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy (id = "username")
	private WebElement unbtx;
	
	
	
	@FindBy(name = "pwd")
	private WebElement pwtbx;
	
	
	@FindBy(xpath = "//div[.='login']")  //decleration
	private WebElement lgbtn;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this); //intilization
	}

	public WebElement getUnbtx() {
		return unbtx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
	 
     public void loginToActitime(String username,String password) {
    	 unbtx.sendKeys(username);
    	 pwtbx.sendKeys(password);
    	 lgbtn.click();
     }
	

}
