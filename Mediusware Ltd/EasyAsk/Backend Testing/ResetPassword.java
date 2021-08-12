package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ResetPassword {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\webdrivers\\geckodriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://18.209.122.163/admin/login");
		driver.manage().window().maximize();
		driver.findElementByXPath("/html/body/div/div/div/div[2]/a").click();
		driver.findElement(By.id("email")).sendKeys("automation@tester.com");
		driver.findElementByXPath("/html/body/div/div/div/div[2]/div/div/form/div[2]/div/button").click();
		Thread.sleep(1000);
		driver.close();
	}

}