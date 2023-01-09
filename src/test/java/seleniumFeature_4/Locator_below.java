package seleniumFeature_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


import org.openqa.selenium.By;


public class Locator_below {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./All-Exe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
       
        WebElement ele=driver.findElement(By.xpath("//label[@for='exampleFormControlSelect1']"));
        WebElement gender_type = driver.findElement(with(By.tagName("select")).below(ele));
        System.out.println(gender_type.getText());
        System.out.println("Done");
        driver.quit();

	}

}
