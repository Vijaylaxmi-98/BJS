package com.orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	
	@FindBy(xpath="//input[@id='MP_link']")
	WebElement marketplace;
	
	public Login(WebDriver driver)
	{
		this.driver= driver;
PageFactory.initElements(driver,this);
	}
public void clickonmarketplace()
{
	marketplace.click();
}
}