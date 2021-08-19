package reeasyaskbackendv1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyResetPassword {
	
	@Test
	public void resetpasswordtest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://18.209.122.163/admin/login");
		driver.manage().window().maximize();
		driver.findElementByXPath("/html/body/div/div/div/div[2]/a").click();
		driver.findElement(By.id("email")).sendKeys("automation@tester.com");
		driver.findElementByXPath("/html/body/div/div/div/div[2]/div/div/form/div[2]/div/button").click();
		Thread.sleep(1000);
		driver.close();
	}

}
