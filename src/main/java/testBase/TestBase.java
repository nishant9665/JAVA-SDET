package testBase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public void Inilizations() {
		System.setProperty("webdriver.chrome.driver", ".//All-Exe/chromedriver.exe");
        driver = new ChromeDriver();
        js =(JavascriptExecutor)driver;
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://eqaroloflow.co.za/wp/");
	}

}
