package com.vois.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.voic.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper {
	
	
	@Test
	public void validLoginTest()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalise-space()='Login']")).click();
	}
	

}
