package reeasyaskbackendv1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifySettings {
	
	@Test
	public void settings_verify() throws InterruptedException {
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
		
		//Settings
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[17]/a").click();
		Thread.sleep(1000);
		
		
		//Core Configuration
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[17]/ul/li[1]/a").click();
		Thread.sleep(2000);
		
		
		//Core Configuration Edit
		driver.findElementByXPath("/html/body/div/main/div/div/div/div/div/table/tbody/tr[7]/td[2]/a").click();
		Thread.sleep(2000);
		driver.findElementByXPath("/html/body/div/main/div/div/div/form/div[2]/div/ul/li[2]/a").click();
		Thread.sleep(2000);
		driver.findElementByXPath("/html/body/div/main/div/div/div/form/div[3]/div/button/span[2]").click();
		
		
		//ERP Configuration
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[17]/ul/li[2]/a").click();
		Thread.sleep(2000);
		
		
	    //Shipping
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[17]/ul/li[3]/a").click();
		Thread.sleep(2000);
		
		
		//TAX
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[17]/ul/li[4]/a").click();
		Thread.sleep(2000);
		
		
		//Payments
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[17]/ul/li[5]/a").click();
		Thread.sleep(2000);
		
		
	    //Email
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[17]/ul/li[6]/a").click();
		Thread.sleep(2000);
		
	}
}
