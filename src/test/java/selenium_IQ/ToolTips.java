package selenium_IQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTips {

	public static void main(String[] args) throws Exception {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://demoqa.com/tool-tips/");
		 Thread.sleep(2000);
		 Actions act = new Actions(driver);
		 WebElement ele=driver.findElement(By.id("toolTipButton"));
		 act.moveToElement(ele).build().perform();
		 
		 System.out.println(ele.getAttribute("aria-describedby"));
		 
		 

	}

}
