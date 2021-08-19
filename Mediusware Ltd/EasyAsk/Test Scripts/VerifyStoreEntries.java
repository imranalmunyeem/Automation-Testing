package reeasyaskbackendv1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class VerifyStoreEntries {
	
	@Test
	public void store_entries_test() throws InterruptedException{
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
		//store
		driver.findElementByCssSelector("body > div.app-body > div > nav > ul > li:nth-child(13) > a").click();
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[13]/ul/li[1]/a").click();
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/div[2]/div/nav/ul/li[13]/ul/li[2]/a").click();
		Thread.sleep(3000);
		
		//<>
		driver.findElementByXPath("//*[@id=\"crudTable_next\"]/a").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"crudTable_previous\"]/a").click();
		Thread.sleep(3000);
		
		
		//entries
		driver.findElementByXPath("/html/body/div[2]/main/div[2]/div/div/div[2]/div[3]/div[1]/div/label/select").click();
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/div[2]/main/div[2]/div/div/div[2]/div[3]/div[1]/div/label/select/option[5]").click();
		Thread.sleep(3000);
		driver.close();
	}

}
