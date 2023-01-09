package selenium_IQ;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzaOrder {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", ".//All-Exe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js =(JavascriptExecutor)driver;
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://eqaroloflow.co.za/wp/");
        driver.findElement(By.xpath("//a//span[contains(text(),'My account')]")).click();
        driver.findElement(By.id("username")).sendKeys("TestUser");
        driver.findElement(By.id("password")).sendKeys("Tester5027#");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        driver.findElement(By.xpath("//a//span[contains(text(),'Shop')]")).click();
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(By.xpath("//li[@class='product-category product first']//a//h2[contains(text(),'Pizza ')]")).click();
        js.executeScript("window.scrollBy(0,350)", "");
       driver.findElement(By.xpath("//a[@aria-label='Add “Mexicana Pizza” to your cart']")).click();
		driver.findElement(By.xpath("//div[@class='wc-proceed-to-checkout']/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("place_order")).click();
		String orderid_Num=driver.findElement(By.xpath("//li[@class='woocommerce-order-overview__order order']/strong")).getText();
		System.out.println(orderid_Num);
	}

}
