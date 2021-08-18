package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class CategoriesFromCatalogue {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\webdrivers\\geckodriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://18.209.122.163/admin/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("superadmin@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("superadmin");
		Thread.sleep(1000);
		driver.findElementByXPath("/html/body/div/div/div/div[1]/div/form/div[4]/div/button").click();
		Thread.sleep(1000);
		
		
		//catalogue
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[3]/a").click();
		
		
		//Category
		driver.findElementByXPath("/html/body/div/div/nav/ul/li[3]/ul/li[1]/a").click();
		Thread.sleep(3000);
		
		
		
		//<>
		driver.findElementByXPath("/html/body/div[2]/main/div[2]/div/div/div[2]/div[3]/div[3]/div/ul/li[6]/a").click();
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/div[2]/main/div[2]/div/div/div[2]/div[3]/div[3]/div/ul/li[1]/a").click();
		Thread.sleep(3000);
				
				
				
		//Entries
		driver.findElementByXPath("/html/body/div[2]/main/div[2]/div/div/div[2]/div[3]/div[1]/div/label/select").click();
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/div[2]/main/div[2]/div/div/div[2]/div[3]/div[1]/div/label/select/option[5]").click();
		Thread.sleep(3000);
		
		
		
		//Search Category
		driver.findElementByXPath("/html/body/div[2]/main/div[2]/div/div/div[1]/div[2]/div/div/label/input").sendKeys("Automation");
		Thread.sleep(3000);
		
		
		
		//Add Category
		driver.findElementByXPath("/html/body/div[2]/main/div[2]/div/div/div[1]/div[1]/div/a[1]/span").click();
		driver.findElement(By.name("category_code")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.name("category_name")).sendKeys("Automation");
		Thread.sleep(2000);
		driver.findElement(By.name("pim_category_id")).sendKeys("6789");
		Thread.sleep(2000);
		driver.findElement(By.name("template")).sendKeys("None");
		Thread.sleep(2000);
		driver.findElementByXPath("/html/body/div/main/div/div/div/form/div[2]/div/button/span[2]").click();
		Thread.sleep(2000);
		
		
		
		
		
		
		driver.close();
		
		
		
	}
}