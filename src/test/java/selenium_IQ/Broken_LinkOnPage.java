package selenium_IQ;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Broken_LinkOnPage {
	

	public  WebDriver driver;
	public HttpURLConnection httpURLConnect=null;
	@BeforeMethod
	public void setUP() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	@Test
	public void amazon_AppLogin() throws Exception {
		List<WebElement> ele =driver.findElements(By.tagName("a"));
		int count=0;
		for(int i=0;i<ele.size();i++) {
			String link = ele.get(i).getAttribute("href");
			 URL url = new URL(link);
			 httpURLConnect=(HttpURLConnection)url.openConnection();
			 
			 System.out.println("Link :"+link+"status code"+httpURLConnect.getResponseCode());
		}
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Testing Complated");
	}
	

}
