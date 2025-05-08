package com.vois.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.voic.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper {
	
	
	@Test
	public void validLoginTest()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		//Assert 
		String actualText=driver.findElement(By.xpath("//p[contains(normalize-space,'Quick')]")).getText();
		Assert.assertTrue(actualText.contains("Quick Launch"));
	}
	
	public void invalidLoginTest()
	{
		driver.findElement(By.name("username")).sendKeys("john");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		String actualError=driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid credentials')]")).getText();
		Assert.assertEquals(actualError, "Invalid credentials");
	}
	

}
