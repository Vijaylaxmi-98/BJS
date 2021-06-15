package com.bjs.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.orangehrm.Home;
import com.orangehrm.Login;
import com.orangehrm.Welcome;

public class OrangehrmTest 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("https://opensource-demo.orangehrmlive.com/");


                Welcome w=new Welcome(driver);
                w.typeusername();
                w.typepassword();
                w.clickonlogin();
                
                Login l=new Login(driver);
                l.clickonmarketplace();
               
                
         Home h= new Home(driver);
         h.clickonrequest();
	}          
	}  
                