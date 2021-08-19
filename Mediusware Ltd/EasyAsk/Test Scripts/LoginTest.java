package reeasyaskbackendv1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//
public class LoginTest {
	
	@Test
	public void loginverify() throws InterruptedException{

	System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://18.209.122.163/admin/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("superadmin@gmail.com");
	driver.findElement(By.id("password")).sendKeys("superadmin");
	driver.findElementByXPath("/html/body/div/div/div/div[1]/div/form/div[4]/div/button").click();
	Thread.sleep(1000);
	driver.close();

}
	}

