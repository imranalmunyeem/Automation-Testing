package reeasyaskbackendv1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle {
	
	@Test
	public void titletest() {
		
	
	String expectedtitle="Dashboard :: Backpack Admin Panel";
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://18.209.122.163/admin/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("superadmin@gmail.com");
	driver.findElement(By.id("password")).sendKeys("superadmin");
	driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/form/div[4]/div/button")).click();
	String actualtitle = driver.getTitle();
	Assert.assertEquals (expectedtitle, actualtitle);
	


}
}


