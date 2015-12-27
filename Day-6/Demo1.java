import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo1 {

	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void testLogin(){
	System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium-WS\\Jars\\LatestChrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/index.php");
		WebElement userNameTxt = driver.findElement(By.name("userName"));
		userNameTxt.sendKeys("amitsrivastava");
		WebElement pwdTxt = driver.findElement(By.name("password"));
		pwdTxt.sendKeys("amit123456");
		WebElement loginBt = driver.findElement(By.name("login"));
		loginBt.click();
		String expectedValue ="Find a Flight: Mercury Tours: ";
		String pageTitle = driver.getTitle();
		//System.out.println(pageTitle.length());
		//System.out.println(expectedValue.length());
		Assert.assertEquals(pageTitle.trim(), expectedValue.trim()); 
		/*if(pageTitle.trim().equals(expectedValue.trim())){
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}*/
		
		//Thread.sleep(3000);
		driver.close();

	}

}
