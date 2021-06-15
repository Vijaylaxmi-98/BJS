package com.orangehrm;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home {

	
	WebDriver driver;
	
	@FindBy(xpath ="//input[@id='buyBtn1']")
	
	WebElement request;
	
	
	
	public Home(WebDriver driver)
	{
		this.driver= driver;
PageFactory.initElements(driver,this);
}
public void clickonrequest() {
	request.click();
	// TODO Auto-generated method stub
	
}
}