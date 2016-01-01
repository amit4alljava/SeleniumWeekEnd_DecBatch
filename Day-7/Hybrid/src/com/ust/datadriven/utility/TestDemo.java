package com.ust.datadriven.utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static com.ust.datadriven.utility.ConfigReader.*;

public class TestDemo {
	
	@DataProvider(name="myDataProvider")
	public Object[][] myDataProvider(){
		
		
		/*Object [][]array = {
				{"amitsrivastava","amit123456"},
				{"ram","123"},
				{"mike","4444"}
		};*/
		Object array[][]={};
		//ExcelReader reader = new ExcelReader();
		//DBReader reader = new DBReader();
		DBReader reader = DBReader.getObject();
		try {
			//array = reader.readExcelData();
			array = reader.readDB();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
	}

	@Test(dataProvider="myDataProvider")
	public void testLogin(String userid,String password){
		System.setProperty(getWebDriver(),getChromeDriverPath());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getURL());
		WebElement userName = driver.findElement(By.name("userName"));
		userName.clear();
		userName.sendKeys(userid);
		//driver.findElement(By.linkText("Add Shipper")).getText();
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.clear();
		pwd.sendKeys(password);
		
		WebElement signIn = driver.findElement(By.name("login"));
		signIn.click();
		
		WebElement msg = driver.findElement(By.xpath("//tr[3]/td/font"));
		Assert.assertTrue(msg.getText().contains("Use our Flight Finder"));
		
		
		
		driver.close();
	}


}
