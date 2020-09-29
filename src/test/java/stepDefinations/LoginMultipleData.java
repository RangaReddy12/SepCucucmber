package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginMultipleData {
	WebDriver driver;
	String url="http://orangehrm.qedgetech.com/";
	@Given("^I launch url in \"([^\"]*)\"$")
	public void i_launch_url_in(String brw) throws Throwable {
	if(brw.equalsIgnoreCase("chrome"))	
	{
		System.out.println("Executing on Chrome Browser");
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	else if(brw.equalsIgnoreCase("firefox"))
	{
		System.out.println("Executing on Firefox Browser");
		driver= new FirefoxDriver();
		driver.get(url);
	}
	else
	{
		System.out.println("Brower Value not Matching");
	}
	}

	@When("^User Enter \"([^\"]*)\" in username field$")
	public void user_Enter_in_username_field(String username) throws Throwable {
	   driver.findElement(By.name("txtUsername")).sendKeys(username); 
	}

	@When("^user Enter \"([^\"]*)\"in password field$")
	public void user_Enter_in_password_field(String password) throws Throwable {
		driver.findElement(By.name("txtPassword")).sendKeys(password); 
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}
	@Then("^user verifies url$")
	public void user_verifies_url() throws Throwable {
		if(driver.getCurrentUrl().contains("dash"))
		{
			System.out.println("Login success");
		}
		else
		{
			System.out.println("Login fail");
		}
	      
	}
	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
	   driver.quit();
	}
}
