package reeasyaskbackendv1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyCMS {

	@Test
	public void cms_test() throws InterruptedException {
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
		
		//CMS
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[14]/a").click();
		Thread.sleep(1000);
		
		//Templates
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[14]/ul/li[1]/a").click();
		Thread.sleep(2000);
		
		
	    //Pages
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[14]/ul/li[2]/a").click();
		Thread.sleep(2000);
		
		//Content
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[14]/ul/li[3]/a").click();
		Thread.sleep(2000);
		
		
		//Navigation
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[14]/ul/li[4]/a").click();
		Thread.sleep(2000);
		
		
	    //Widgets
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[14]/ul/li[5]/a").click();
		Thread.sleep(2000);
		
		
		//Log Out
				driver.findElementByXPath("/html/body/header/ul[2]/li/a/img").click();
				Thread.sleep(3000);
				driver.findElementByXPath("/html/body/header/ul[2]/li/div/a[2]").click();
				Thread.sleep(3000);
				
				driver.close();
				
	}
}
