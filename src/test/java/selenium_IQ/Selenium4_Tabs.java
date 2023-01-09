package selenium_IQ;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4_Tabs {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
       
		System.setProperty("webdriver.chrome.driver", ".//All-Exe/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // New Tab open in same
        //#2) Open the new tab on the browser:
        driver.get("https://www.google.com/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.crmpro.com/");	
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        driver.quit();

	}

}
