package selenium_IQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_nonCommerApp {
	
	public  WebDriver driver;
	@BeforeMethod
	public void setUP() {
		 System.setProperty("webdriver.chrome.driver",".//ALL-EXE/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}
	@Test
	public void non_CommerAppLogin() {
		 driver.findElement(By.id("Email")).clear();
         driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
         driver.findElement(By.id("Password")).clear();
         driver.findElement(By.id("Password")).sendKeys("admin");
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         String userName =driver.findElement(By.xpath("//ul[@class='navbar-nav ml-auto pl-2']/li[2]/a")).getText();
	     System.out.println(userName);
	     driver.findElement(By.xpath("//div[@id='navbarText']//ul//child::li[3]/a")).click();
	   
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Testing Complated");
	}
	

}
