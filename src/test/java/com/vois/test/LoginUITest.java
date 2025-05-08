package com.vois.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.voic.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper{
	
	
	@Test
	public void titleTest()
	{
		  
		  String actualTiltle=driver.getTitle();
		  Assert.assertEquals(actualTiltle, "OrangeHRM");
		  
	}
	@Test
	public void headerTitle()
	{

		  // Assert the header - login
		  String actualHeader=driver.findElement(By.xpath("//h5")).getText();
		  Assert.assertEquals(actualHeader, "Login");
		  
	}
	
	
}
