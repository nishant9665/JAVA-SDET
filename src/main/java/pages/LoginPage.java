package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	
	By click_MyAccount= By.xpath("//a//span[contains(text(),'My account')]");
	By user_Name= By.id("username");
	By password= By.id("password");
	By click_LoginButton= By.xpath("//button[@name='login']");
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void clickOn_MyAccount() {
		driver.findElement(click_MyAccount).click();;
	}
	
	public void enter_userName() {
		driver.findElement(user_Name).sendKeys("TestUser");
	}
	
	public void enter_password() {
		driver.findElement(password).sendKeys("Tester5027#");
	}
	
	public void clickOn_loginButton() {
		driver.findElement(click_LoginButton).click();;
	}
}
//driver.findElement(By.xpath("//a//span[contains(text(),'My account')]")).click();
//driver.findElement(By.id("username")).sendKeys("TestUser");
//driver.findElement(By.id("password")).sendKeys("Tester5027#");
//driver.findElement(By.xpath("//button[@name='login']")).click();