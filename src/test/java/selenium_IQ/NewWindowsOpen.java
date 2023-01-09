package selenium_IQ;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowsOpen {
	
	public static WebDriver driver;


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//All-Exe/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://www.crmpro.com/");

	}

}
