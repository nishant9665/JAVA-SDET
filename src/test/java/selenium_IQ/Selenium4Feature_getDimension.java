package selenium_IQ;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4Feature_getDimension {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
       
		System.setProperty("webdriver.chrome.driver", ".//All-Exe/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        		
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        
        //Take screen shot code
        WebElement logo=driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        System.out.println("Height:"+logo.getRect().getDimension().getHeight());
        System.out.println("Height:" +logo.getRect().getDimension().getWidth());
        System.out.println("X Location:" +logo.getRect().getX());
        System.out.println("Y Location:" +logo.getRect().getY());

	}

}
