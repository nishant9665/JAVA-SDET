package selenium_IQ;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handle {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://neetabus.in/Index.aspx");
		// pop close button
		 driver.findElement(By.id("ctl00_sitecontent_ImageButton1")).click();

	}

}
