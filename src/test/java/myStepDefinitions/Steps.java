package myStepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.java.en.When;

import myPageObjects.LoginPage;

public class Steps {
			
		public WebDriver driver;
		public LoginPage lp;

		@Given("User launch Chrome Browser$")
		
		public void user_launch_chrome_browser() {

		    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//myDrivers/chromedriver.exe");
			driver = new ChromeDriver();
		    lp=new LoginPage(driver);
		}
		
		@When("User opens URL {string}")
		public void user_opens_url(String url) {
			driver.get(url);
		}
		
		@When("User enters username: {string}")
		public void user_enters_username(String username) {
		    lp.setUserName(username);
		 }
		
		@When("User enters Password: {string}")
		public void user_enters_password(String pwd) {
		    lp.setPassword(pwd);
		}
		
		@When("^Click on login$")
		public void click_on_login() {
		    lp.clickLogin();
		}
		
		@Then("Page titile should be {string}")
		public void page_titile_should_be(String title) throws InterruptedException {
		
		if (driver.getPageSource().contains("Login was unsuccessful."))
			{
		driver.close();
		Assert.assertTrue(false);
			}
			else 
			{
			Assert.assertEquals(title, driver.getTitle());
			}
		 Thread.sleep(3000);
		}
		
		
		@Then("^User click on Logout link$")
		public void user_clock_on_logout_link() throws InterruptedException {
			 lp.clickLogout();
			 Thread.sleep(3000);
		}
		
			
		
		@Then("close chrome browser")
		public void close_chrome_browser() {
		   driver.quit(); 
		}
	
	
}
