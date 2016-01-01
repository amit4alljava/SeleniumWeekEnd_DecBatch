import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderDemo {
	
	@DataProvider(name="myDataProvider")
	public Object[][] myDataProvider(){
		Object [][]array = {
				{"amitsrivastava","amit123456"},
				{"ram","123"},
				{"mike","4444"}
		};
		return array;
	}

	@Test(dataProvider="myDataProvider")
	public void testLogin(String userid,String password){
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium-WS\\Jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
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
