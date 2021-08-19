package reeasyaskbackendv1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyMarketing {
	
	@Test
	public void marketing_test() throws InterruptedException {
		
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
		
		//Marketing
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[16]/a").click();
		Thread.sleep(1000);
		
		
		//Campaigns 
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[16]/ul/li[1]/a").click();
		Thread.sleep(2000);
		
		
	    //LandingPages
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[16]/ul/li[2]/a").click();
		Thread.sleep(2000);
		
		
		//Merchandising Zone
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[16]/ul/li[3]/a").click();
		Thread.sleep(2000);
		
		
		//Email
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[16]/ul/li[4]/a").click();
		Thread.sleep(2000);
		
		
	    //Subscribers
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[16]/ul/li[5]/a").click();
		Thread.sleep(2000);
		
		//close
		driver.close();
		
	}
}
