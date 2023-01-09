package seleniumFeature_4;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_NearBy {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./All-Exe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
       
        WebElement ele=driver.findElement(By.xpath("//th[@aria-label='Veg/fruit name: activate to sort column ascending']"));
        WebElement Page_Lable = driver.findElement(with(By.tagName("span")).near(ele));
        System.out.println(Page_Lable.getAttribute("class"));
        System.out.println(Page_Lable.getTagName());
        driver.quit();
       

	}

}
