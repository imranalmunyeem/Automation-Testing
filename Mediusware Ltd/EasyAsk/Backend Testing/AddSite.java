package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class AddSite {

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
		
		//Selecting Items in a Multiple SELECT elements
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[11]/a").click();
		driver.findElementByXPath("/html/body/div[2]/main/div[2]/div/div/div[1]/div[1]/div/a/span").click();
		driver.findElement(By.name("site_name")).sendKeys("Test By Imran");
		driver.findElement(By.name("site_description")).sendKeys("Automation Test Script");
		driver.findElement(By.name("url")).sendKeys("https://www.youtube.com/playlist?list=PLL34mf651faPB-LyEP0-a7Avp_RHO0Lsm");
		driver.findElementByXPath("/html/body/div/main/div/div/div/form/div[2]/div/button/span[2]").click();
		
		
		
		Thread.sleep(3000);
		driver.close();
		
	}
	}
