package com.crm.Actitime.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id = "username")
	private WebElement untbx;
	
	@FindBy(name = "pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath = "//div[.='login']")
	private WebElement lgnbtn;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}
	
	public void logintoActitime(String un, String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgnbtn.click();
	}

}
