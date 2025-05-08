package com.vois.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(By.name("username")).sendKeys("username");
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(By.name("password")).sendKeys("password");
	}
	//click on login
	public void clickOnLogin()
	{
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
 
	
	//getInvalidErrorMessage
	public String getInvalidErrorMessage()
	{
		return driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid credentials')]")).getText();
	}

	public String getUsernamePlaceholder()
	{
		return driver.findElement(By.name("username")).getDomAttribute("placeholder");
	}
}
