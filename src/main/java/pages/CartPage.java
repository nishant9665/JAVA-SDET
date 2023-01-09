package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;
	By web_Cart = By.xpath("//a[@aria-label='Add “Mexicana Pizza” to your cart']");
	By web_CheckOut=By.xpath("//div[@class='wc-proceed-to-checkout']/a");
	By web_placeOrder=By.xpath("//div[@class='wc-proceed-to-checkout']/a");
	By web_ordernumber=By.xpath("//li[@class='woocommerce-order-overview__order order']/strong");
	public CartPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void clickOn_onCart() {
		driver.findElement(web_Cart).click();;
	}
	public void clickOn_CheckOut() throws Exception {
		driver.findElement(web_CheckOut).click();
		Thread.sleep(3000);
	}
	public void clickOn_PlaceOder() {
		driver.findElement(web_placeOrder).click();
	}
	
	public String getOrder_Number() {
		return driver.findElement(web_ordernumber).getText();
	}
}
