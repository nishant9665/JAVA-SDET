package selenium_IQ;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_alert {

	public static void main(String[] args) throws Exception {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://demoqa.com/alerts");
		 driver.findElement(By.id("alertButton")).click();
		 Alert al= driver.switchTo().alert();
		 al.accept();
		 
		 
		 Thread.sleep(2000);
		 // alert appear after 5 second ,
		 driver.findElement(By.id("timerAlertButton")).click();
		 Thread.sleep(5000);
		 al.accept();
		 

	}

}
