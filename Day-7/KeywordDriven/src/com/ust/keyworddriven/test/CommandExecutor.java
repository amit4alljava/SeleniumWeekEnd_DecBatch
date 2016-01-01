package com.ust.keyworddriven.test;

import java.util.ArrayList;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ust.keyworddriven.dto.CommandDTO;
import com.ust.keyworddriven.utility.ExcelReader;

public class CommandExecutor {
	
	@Test
	public void testCommandExecutor(){
		WebDriver driver = null;
		WebElement element = null;
		ExcelReader excelReader = ExcelReader.getInstance();
		try {
			ArrayList<CommandDTO> commandList = excelReader.readExcel();
			// Checking XLS Data is not Blank
			if(commandList!=null && commandList.size()>0){
				// Traverse the CommandList
				for(CommandDTO commandDTO : commandList){
					if(commandDTO.getCommand().equalsIgnoreCase("browser")){
						if(commandDTO.getTarget().equalsIgnoreCase("chrome")){
							System.setProperty("webdriver.chrome.driver",
									"D:\\Selenium-WS\\Jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
							driver = new ChromeDriver();
						}
						else
						if(commandDTO.getTarget().equalsIgnoreCase("firefox")){
							driver = new FirefoxDriver();
						}
						driver.manage().window().maximize();
					}  // Browser Command Code Ends Here
					else
					if(commandDTO.getCommand().equalsIgnoreCase("open")){
						driver.get(commandDTO.getTarget());
					} // OpenCommand Code Ends Here
					else
					if(commandDTO.getCommand().equalsIgnoreCase("type")){
						String target = commandDTO.getTarget();
						String array[] = target.split("=");  // array[0]=name array[1]=userName
						String type=array[0];
						if(type.equalsIgnoreCase("name")){
							element = driver.findElement(By.name(array[1]));
						}
						else
						if(type.equalsIgnoreCase("id")){
								element = driver.findElement(By.id(array[1]));
						}	
						else
						if(type.equalsIgnoreCase("css")){
									element = driver.findElement(By.cssSelector(array[1]));
						}
						else
						if(type.equalsIgnoreCase("xpath")){
										element = driver.findElement(By.xpath(array[1]));
						}
						element.sendKeys(commandDTO.getValue());
					} // type command ends here
					else
					if(commandDTO.getCommand().equalsIgnoreCase("clickAndWait")){
						String target = commandDTO.getTarget();
						String array[] = target.split("=");
						String type=array[0];
						if(type.equalsIgnoreCase("name")){
							element = driver.findElement(By.name(array[1]));
						}
						else
						if(type.equalsIgnoreCase("id")){
								element = driver.findElement(By.id(array[1]));
						}	
						else
						if(type.equalsIgnoreCase("css")){
									element = driver.findElement(By.cssSelector(array[1]));
						}
						else
						if(type.equalsIgnoreCase("xpath")){
										element = driver.findElement(By.xpath(array[1]));
						}
						element.click();
					} // ClickAndWait Code Ends Here
					else
					if(commandDTO.getCommand().equalsIgnoreCase("assertTitle")){
						String actualValue = driver.getTitle();
						String expectedValue = commandDTO.getTarget();
						Assert.assertTrue(actualValue.contains(expectedValue));
					}
				} // Loop Ends
				driver.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
