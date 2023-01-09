package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	By web_shop = By.xpath("//a//span[contains(text(),'Shop')]");
	By web_PizzaName=By.xpath("//li[@class='product-category product first']//a//h2[contains(text(),'Pizza ')]");
	public HomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void clickOn_onShop() {
		driver.findElement(web_shop).click();;
	}
	public void clickOn_onPizzaName() {
		driver.findElement(web_PizzaName).click();;
	}
}
