package selenium_IQ;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import testBase.TestBase;

public class PizzaOrder3 extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	CartPage cartPage;
	
	@BeforeMethod
	public void SetUp() {
		Inilizations();
	    loginPage = new LoginPage(driver);
	    homePage = new HomePage(driver);
	    cartPage = new CartPage(driver);
	}
	
	@Test
	public void PizzaOrder() throws Exception {
		loginPage.clickOn_MyAccount();
		loginPage.enter_userName();
		loginPage.enter_password();
		loginPage.clickOn_loginButton();
		homePage.clickOn_onShop();
		js.executeScript("window.scrollBy(0,350)", "");
		homePage.clickOn_onPizzaName();
		js.executeScript("window.scrollBy(0,350)", "");
		cartPage.clickOn_onCart();
		cartPage.clickOn_CheckOut();
		cartPage.clickOn_PlaceOder();
		String OrderNumber=cartPage.getOrder_Number();
		System.out.println(OrderNumber);
	}

}
