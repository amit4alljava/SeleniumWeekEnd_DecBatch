import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium-WS\\Jars\\LatestChrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/index.php");
		/*WebElement userNameTxt = driver.findElement(By.name("userName"));
		userNameTxt.sendKeys("amitsrivastava");
		*/
		//driver.findElement(By.name("userName")).sendKeys("amitsrivastava");
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("amitsrivastava");

		WebElement pwdTxt = driver.findElement(By.name("password"));
		pwdTxt.sendKeys("amit123456");
		WebElement loginBt = driver.findElement(By.name("login"));
		loginBt.click();
		List<WebElement> radioList = driver.findElements(By.name("tripType"));
		radioList.get(1).click();
		
		/*WebElement passengerCount = driver.findElement(By.name("passCount"));
		Select passengerCountDropDown = new Select(passengerCount);
		passengerCountDropDown.selectByVisibleText("4");
		*/
		new Select(driver.findElement(By.name("passCount"))).selectByVisibleText("4");

		WebElement fromPort = driver.findElement(By.name("fromPort"));
		Select fromPortDropDown = new Select(fromPort);
		fromPortDropDown.selectByVisibleText("New York");
		
	}

}
