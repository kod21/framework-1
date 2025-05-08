package com.vois.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.voic.base.AutomationWrapper;
import com.vois.pages.DashboardPage;
import com.vois.pages.LoginPage;
import com.vois.utils.DataUtils;

public class LoginTest extends AutomationWrapper {
	
	
	@Test
	public void validLoginTest()
	{
		LoginPage login= new LoginPage(driver);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLogin();
		//Assert 
		DashboardPage dashboard=new DashboardPage(driver);
		Assert.assertEquals(dashboard.getQuickLaunchText(),("Quick Launch"));
	}
	
	
	
	@Test(dataProviderClass=DataUtils.class,dataProvider="invalidLoginData")
	public void invalidLoginTest()
	{
		LoginPage login= new LoginPage(driver);
		login.enterUsername("John");
		login.enterPassword("admin123");
		login.clickOnLogin();
		
		String actualError=driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid credentials')]")).getText();
		Assert.assertEquals(actualError, "Invalid credentials");
	}
	

}
