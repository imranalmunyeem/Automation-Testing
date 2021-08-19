package reeasyaskbackendv1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyRegistration {

	@Test
	public void registrationtest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\webdrivers\\geckodriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://18.209.122.163/admin/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("automation");
		driver.findElement(By.id("email")).sendKeys("automation@tester.com");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.id("password_confirmation")).sendKeys("12345678");
		driver.findElementByXPath("/html/body/div/div/div/div[1]/div/form/div[5]/div/button").click();
		Thread.sleep(1000);
		driver.close();
	}
	
}
