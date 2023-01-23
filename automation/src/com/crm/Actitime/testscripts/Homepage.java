package com.crm.Actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasklink;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportslink;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement userlink;
	
	@FindBy(id ="logoutlink" )
	private WebElement logoutlink;
	
	

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getTasklink() {
		return tasklink;
		
	}
	
	public WebElement getReportslink() {
		return reportslink;
		
		
	}
	 public WebElement getUserlink() {
		 return userlink;
		 
	 }
	 public WebElement getLogoutlink() {
		 return logoutlink;
		 
	 }

	 
	 public void task() {
		 tasklink.click();
		 
	 }
	 
	 
	 
	  
	

}
