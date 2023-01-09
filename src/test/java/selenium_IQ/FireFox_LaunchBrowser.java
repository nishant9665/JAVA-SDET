package selenium_IQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FireFox_LaunchBrowser {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",".//All-Exe//geckodriver.exe");

	    // Instantiating the Firefox Driver
	    WebDriver driver = new FirefoxDriver();

	    // Open the URL in the driver instance
	    driver.get("http://www.automationbyte.com");

	    // Get the title from the driver.
	    String websiteTitle = driver.getTitle();
	    System.out.println(websiteTitle);


	}

}
