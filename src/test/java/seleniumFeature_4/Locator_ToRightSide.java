package seleniumFeature_4;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ToRightSide {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./All-Exe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
       
        WebElement ele=driver.findElement(By.id("inlineRadio1"));
        WebElement Student_label = driver.findElement(with(By.tagName("label")).toRightOf(ele));
        System.out.println(Student_label.getAttribute("class"));
        System.out.println(Student_label.getText());
        System.out.println(Student_label.getTagName());
        driver.quit();
       

	}

}
