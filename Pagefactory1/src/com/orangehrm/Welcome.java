package com.orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome {

	
	WebDriver driver;
	 @FindBy(xpath ="//input[@id='txtUsername']")
	 WebElement username;
	
	 @FindBy(xpath="//input[@id='txtPassword']")
	WebElement  password;
	 
	 
	 
	 @FindBy(xpath="//input[@id='btnLogin']")
	 WebElement login;
	
	 
	 
	public Welcome(WebDriver driver)
	{
		this.driver= driver;
PageFactory.initElements(driver,this);
	
	}
	
	public void typeusername() {
		username.sendKeys("Admin");
		
	}
		
	public void typepassword() {
		password.sendKeys("admin123");
	}
	
	public void clickonlogin() {
	login.click();
	}
	
}
	
	
		
		
	
	
	
	
	
	

