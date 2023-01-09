package test_I;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver", "./All-Exe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("nishant9665@gmail.com");
        driver.findElement(By.xpath("//div[@class='IiD88i _351hSN'][2]/input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Test@12345");
        driver.findElement(By.xpath("//div[@class='col-12-12 _2oO9oE']//button[@type='submit']")).click();
	}

}
