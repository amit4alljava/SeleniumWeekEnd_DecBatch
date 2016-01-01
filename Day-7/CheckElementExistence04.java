package com.srivastava.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CheckElementExistence04 {
	@Test
	public void testAccessingElements(){
		String url= "http://newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-WS\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement userName = driver.findElement(By.name("userName"));
		if(userName.isEnabled() && userName.isDisplayed()){
			userName.clear();
			userName.sendKeys("amitsrivastava");
		}
		WebElement password = driver.findElement(By.name("password"));
		if(userName.isEnabled() && userName.isDisplayed()){
				password.sendKeys("amit123456");
		}
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
				
		driver.close();
		
		/*List<WebElement> hyperLinks = driver.findElements(By.tagName("a"));
		Assert.assertTrue(hyperLinks.size()> 5);*/
		
	}
}
