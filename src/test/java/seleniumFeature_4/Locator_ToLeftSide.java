package seleniumFeature_4;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ToLeftSide {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./All-Exe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
       
        WebElement ele=driver.findElement(By.xpath("//label[contains(text(),'Check me out if you Love IceCreams!')]"));
        WebElement CheckBox = driver.findElement(with(By.tagName("input")).toLeftOf(ele));
        System.out.println(CheckBox.getAttribute("type"));
        CheckBox.click();
        driver.quit();
       

	}

}
