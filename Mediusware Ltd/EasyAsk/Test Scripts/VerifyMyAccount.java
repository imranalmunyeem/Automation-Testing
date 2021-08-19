package reeasyaskbackendv1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyMyAccount {
	
	@Test
	public void testmyaccount() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\webdrivers\\geckodriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://18.209.122.163/admin/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("superadmin@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("superadmin");
		Thread.sleep(1000);
		driver.findElementByXPath("/html/body/div/div/div/div[1]/div/form/div[4]/div/button").click();
		Thread.sleep(1000);
		
		//My Account
		driver.findElementByXPath("/html/body/header/ul[2]/li/a/img").click();
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/header/ul[2]/li/div/a[1]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/div/main/div/div/div[2]/form/div/div[3]/a").click();
		Thread.sleep(3000);
		
		//Log out
		driver.findElementByXPath("/html/body/div/main/div/div/p[2]/a").click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
