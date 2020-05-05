package stepDefPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LearnStepDef {
	WebDriver driver;


@Given("^user is entering google\\.co\\.in$")
public void user_is_entering_google_co_in() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("http://www.google.co.in"); 
}

@When("^User is typing the search  \"([^\"]*)\"$")
public void user_is_typing_the_search(String arg1) throws Throwable {
	  driver.findElement(By.xpath("//div//input[@class='gLFyf gsfi']")).sendKeys("vinoth");

}

@When("^eneter the return key$")
public void eneter_the_return_key() throws Throwable {
	  driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

}

@Then("^user shoud see the results$")
public void user_shoud_see_the_results() throws Throwable {
	boolean status = driver.findElement(By.partialLinkText("vinoth")).isDisplayed();
	 
	if (status)
	{
		System.out.println("result Displayed");
}
}


}
