package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPagePOM;
import io.cucumber.java.en.*;

public class LoginPagePOMSteps {
	
	WebDriver driver=null;
	LoginPagePOM loginpage;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("I am Inside LOginDemo POM");
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
	}

	@Given("user is on Login Page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String uname,String pwd) throws InterruptedException {
		loginpage=new LoginPagePOM(driver);
		loginpage.getUsername(uname);
		Thread.sleep(3000);
		loginpage.getPassword(pwd);
			}

	@When("user clicks on Login")
	public void user_clicks_on_login() throws InterruptedException {
		
		loginpage.clickLogin();
		Thread.sleep(2000);
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
	    loginpage.checkLogoutIsDisplayed();
	    driver.close();
	    driver.quit();
	}


}
