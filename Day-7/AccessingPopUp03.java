package com.srivastava.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AccessingPopUp03 {
	@Test
	public void testPopUp(){
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-WS\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String alertMessage = "";
 
        driver.get("http://jsbin.com/usidix/1");
        List<WebElement> list = driver.findElements(By.tagName("input"));
        WebElement button = list.get(0);
        button.click();
        //driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        
        System.out.println("******************** "+alertMessage);
        driver.close();
        
        /* Three Ways to Close the Driver
         * webDriver.Close() - Close the browser window that the driver has focus of
			webDriver.Quit() - Calls dispose
			webDriver.Dispose() Closes all browser windows and safely ends the session
         */
        
	}

}
