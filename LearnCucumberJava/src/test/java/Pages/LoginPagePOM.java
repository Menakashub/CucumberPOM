package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {
	
	WebDriver driver;
	
	By txt_username=By.id("name");
	By txt_password=By.id("password");
	By txt_Login =By.id("login");
	By txt_logout =By.id("logout");
	
	public LoginPagePOM(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	public void getUsername(String uname) {
		driver.findElement(txt_username).sendKeys(uname);
	}
	public void getPassword(String pwd) {
		driver.findElement(txt_password).sendKeys(pwd);
	}
	
	public void clickLogin() {
		driver.findElement(txt_Login).click();
	}
	public void checkLogoutIsDisplayed() {
		driver.findElement(txt_logout).isDisplayed();
	}
	
	

}
