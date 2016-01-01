import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium-WS\\Jars\\LatestChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.quackit.com/html/templates/frames/frames_example_3.html");
		
		driver.switchTo().frame("content");
		//Thread.sleep(3000);
		//WebDriverWait w = new WebDriverWait(driver, 10);
		//WebElement e = w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Code Generator")));
		//driver.findElement(By.xpath("/html/body/ul[3]/li[1]/a")).click();
		//e.click();
		WebElement link = driver.findElement(By.linkText("Code Generator"));
		link.click();
		ArrayList<String> tabArray = new ArrayList<String> (driver.getWindowHandles());
		System.out.println(tabArray.size());
		Thread.sleep(4000);
		
		 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
	        driver.switchTo().defaultContent();

	}

}
