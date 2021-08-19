package reeasyaskbackendv1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyWarehouseCreation {
	
	
	@Test
	public void warehouse_creation_test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\webdrivers\\geckodriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://18.209.122.163/admin/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("superadmin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("superadmin");
		driver.findElementByXPath("/html/body/div/div/div/div[1]/div/form/div[4]/div/button").click();
		Thread.sleep(1000);
		
		
		//location
		driver.findElementByCssSelector("body > div.app-body > div > nav > ul > li:nth-child(13) > a").click();
		
		//warehouse
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[13]/ul/li[1]/a").click();
		Thread.sleep(1000);
		driver.findElementByXPath("/html/body/div[2]/main/div[2]/div/div/div[1]/div[1]/div/a/span").click();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("imran@automation.com");
		Thread.sleep(1000);
		driver.findElement(By.name("address")).sendKeys("Mohammadpur,Dhaka");
		Thread.sleep(1000);
		driver.findElement(By.name("telephone")).sendKeys("12345678");
		Thread.sleep(1000);
		driver.findElement(By.name("zip_code")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElementByXPath("/html/body/div/main/div/div/div/form/div[2]/div/button/span[2]").click();
		Thread.sleep(10000);
		driver.close();
		
		
	}
}
