package reeasyaskbackendv1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyStorePreviewEditDelete {
	
	@Test
	public void store_preview_edit_delete_test() throws InterruptedException {
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
		driver.findElementByCssSelector("body > div > div > nav > ul > li:nth-child(13) > a").click();
		
		//store
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[13]/ul/li[1]/a").click();
		Thread.sleep(1000);
		driver.findElementByXPath("/html/body/div[2]/div/nav/ul/li[13]/ul/li[2]/a").click();
		//driver.findElementByXPath("/html/body/div[2]/div/nav/ul/li[13]/ul/li[2]/a").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@id=\"crudTable\"]/tbody/tr[1]/td[6]/a[1]").click();
		driver.findElementByXPath("/html/body/div/main/div/div/div/div/div/table/tbody/tr[5]/td[2]/a[1]").click();
		driver.findElementByXPath("/html/body/div/main/div/div/div/form/div[2]/div/button/span[2]").click();
		
		//delete
		driver.findElementByXPath("/html/body/div/main/div/div/div/div/div/table/tbody/tr[5]/td[2]/a[2]").click();
		driver.findElementByXPath("/html/body/div[2]/div/div[4]/div[1]/button").click();
		
		
	}

}
