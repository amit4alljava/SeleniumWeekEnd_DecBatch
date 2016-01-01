package com.srivastava.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccessingElements02 {
	
	@Test
	public void testAccessingElements(){
		String url= "http://newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-WS\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement userName = driver.findElement(By.name("userName"));
		userName.sendKeys("amitsrivastava");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("amit123456");
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		List<WebElement> hyperLinks = driver.findElements(By.tagName("a"));
		Assert.assertTrue(hyperLinks.size()> 5);
		
	}

}
