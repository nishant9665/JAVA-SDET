package selenium_IQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".//ALL-EXE/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 driver.findElement(By.xpath("//div[@class='products']//div//h4[contains(text(),'Brocolli - 1 Kg')]//following-sibling::p//following::div[2][@class='product-action']//button[contains(text(),'ADD TO CART')]")).click();
		 driver.findElement(By.xpath("//div[@class='products']//div//h4[contains(text(),'Cauliflower - 1 Kg')]//following-sibling::p//following::div[2][@class='product-action']//button[contains(text(),'ADD TO CART')]")).click();

	}

}
