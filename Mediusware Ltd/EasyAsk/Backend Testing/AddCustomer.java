package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class AddCustomer {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\webdrivers\\geckodriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://18.209.122.163/admin/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("superadmin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("superadmin");
		driver.findElementByXPath("html/body/div/div/div/div[1]/div/form/div[4]/div/button").click();
		
		//Selecting Items in a Multiple SELECT elements
		driver.findElementByCssSelector("body > div > div > nav > ul > li:nth-child(4) > a").click();
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[4]/ul/li[1]/a").click();
		driver.findElementByXPath("/html/body/div[2]/main/div[2]/div/div/div[1]/div[1]/div/a/span").click();
		
		// Create Customers
		driver.findElementByXPath("/html/body/div[1]/main/div/div/div/form/div[1]/div/ul/li[1]/a").click();
		driver.findElement(By.name("customer_code")).sendKeys("12345");
		driver.findElement(By.name("customer_name")).sendKeys("imran");
		driver.findElement(By.name("email")).sendKeys("imran@automationtester.com");
		driver.findElement(By.name("phone")).sendKeys("12345678");

		//driver.findElement(By.name("item.address")).sendKeys("None");		
		driver.findElement(By.name("item.zip_code")).sendKeys("1212");
		driver.findElement(By.name("item.office_email")).sendKeys("office@email.com");
		driver.findElementByXPath("/html/body/div[1]/main/div/div/div/form/div[1]/div/ul/li[2]/a").click();
		driver.findElement(By.name("contact[name]")).sendKeys("12345");
		driver.findElement(By.name("contact[email]")).sendKeys("imran");
		driver.findElement(By.name("contact[phone]")).sendKeys("imran@automationtester.com");
		driver.findElement(By.name("phone")).sendKeys("12345678");
		driver.findElement(By.name("contact[password]")).sendKeys("12345678");
		driver.findElement(By.name("contact[password_confirmation]")).sendKeys("12345678");
		driver.findElement(By.name("contact[order_limit]")).sendKeys("12345");
		driver.findElement(By.name("contact[daily_budget_limit]")).sendKeys("123");
		driver.findElement(By.name("contact[monthly_budget_limit]")).sendKeys("1234");
		Thread.sleep(500);
		driver.close();
		
	}

}
