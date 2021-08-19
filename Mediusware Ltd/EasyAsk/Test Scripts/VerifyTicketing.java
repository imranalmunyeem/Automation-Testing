package reeasyaskbackendv1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyTicketing {

	@Test
	public void ticketing_test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://18.209.122.163/admin/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("superadmin@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("superadmin");
		Thread.sleep(1000);
		driver.findElementByXPath("/html/body/div/div/div/div[1]/div/form/div[4]/div/button").click();
		Thread.sleep(1000);
		
		//Ticketing
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[15]/a").click();
		Thread.sleep(2000);
		
		//Tickets
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[15]/ul/li[1]/a").click();
		Thread.sleep(2000);
		
		//FAQ
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[15]/ul/li[2]/a").click();
		Thread.sleep(3000);
		
		//Log Out
		driver.findElementByXPath("/html/body/header/ul[2]/li/a/img").click();
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/header/ul[2]/li/div/a[2]").click();
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
