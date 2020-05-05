
package stepDefPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login {
	
WebDriver driver;

@Given("^user is on login page$")
public void user_is_on_login_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 Thread.sleep(2000);
	 driver.get("https://opensource-demo.orangehrmlive.com/"); 
	 
}

@When("^user enters username and password$")
public void user_enters_username_and_password() throws Throwable {
    driver.findElement(By.id("divUsername")).sendKeys("Admin");
    driver.findElement(By.id("divPassword")).sendKeys("admin123");

}

@When("^clicks on login button$")
public void clicks_on_login_button() throws Throwable {
	
	driver.findElement(By.id("btnLogin")).click();

}

@Then("^user should navigate be navigate to home page$")
public void user_should_navigate_be_navigate_to_home_page() throws Throwable {
boolean status = driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
Assert.assertTrue(status);
}
	
	
}
