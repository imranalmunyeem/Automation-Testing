package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class Utilities {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\webdrivers\\geckodriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://18.209.122.163/admin/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("superadmin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("superadmin");
		driver.findElementByXPath("/html/body/div/div/div/div[1]/div/form/div[4]/div/button").click();
		
		//Utilities
		//import
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[6]/a").click();
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[6]/ul/li[1]/a").click();

		//export
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[6]/a").click();
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[6]/ul/li[2]/a").click();

		//scheduled jobs
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[6]/a").click();
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[6]/ul/li[3]/a").click();

		driver.close();
		
	}
}