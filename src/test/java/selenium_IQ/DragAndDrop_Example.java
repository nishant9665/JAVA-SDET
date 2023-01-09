package selenium_IQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Example {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://demoqa.com/droppable/");
		 
		 WebElement src=driver.findElement(By.id("draggable"));
		 WebElement drop=driver.findElement(By.id("droppable"));
		 
		 Actions act = new Actions(driver);
		 //act.dragAndDrop(src, drop);
		// act.dragAndDrop(src, drop).build().perform(); //working fine
		// act.dragAndDrop(src, drop).release().build().perform(); //ok
		 System.out.println("Done");
		 driver.quit();

	}

}
