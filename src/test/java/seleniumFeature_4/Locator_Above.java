package seleniumFeature_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


import org.openqa.selenium.By;


public class Locator_Above {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./All-Exe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
       
        WebElement ele=driver.findElement(By.name("name"));
        WebElement email = driver.findElement(with(By.tagName("label")).above(ele));
        System.out.println(email.getText());
        System.out.println("Done");
        driver.quit();

	}

}
