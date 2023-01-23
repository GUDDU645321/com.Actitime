package com.crm.Actitime.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Taskpage {

	@FindBy(xpath = "//div[@class='title ellipsis']")
	private WebElement addnewbtn;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newcustbtn;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custnametext;
	
	@FindBy(xpath  = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptiontext;
	
	@FindBy(xpath = "(//div[.='- Select Customer -'])[2]")
	private WebElement dropdown;
	
	@FindBy(xpath = "(//div[.='Our company'])[9]")
	private WebElement companyname;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createbtn;
	
	public Taskpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcustbtn() {
		return newcustbtn;
	}

	public WebElement getCustnametext() {
		return custnametext;
	}

	public WebElement getDescriptiontext() {
		return descriptiontext;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public WebElement getCreatebtn() {
		return createbtn;
	}
	
	//business logic
	public void creatcustomer() {
		addnewbtn.click();
		newcustbtn.click();
		custnametext.sendKeys("HDFC_OO1");
		descriptiontext.sendKeys("BANKING");
		dropdown.click();
		dropdown.click();
		createbtn.click();
	}
}
		
		
		
		
		


	
	
	
	
	
	
	
