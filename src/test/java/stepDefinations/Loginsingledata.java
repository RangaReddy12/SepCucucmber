package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginsingledata {
	WebDriver driver;
	@Given("^launch url in chrome$")
	public void launch_url_in_chrome() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.get("http://orangehrm.qedgetech.com/");
	   driver.manage().window().maximize();
	}

	@When("^i enter user name and enter password$")
	public void i_enter_user_name_and_enter_password() throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	    
	}

	@When("^user click on login$")
	public void user_click_on_login() throws Throwable {
		driver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
	    
	}

	@Then("^verify dashboard text in url$")
	public void verify_dashboard_text_in_url() throws Throwable {
		if(driver.getCurrentUrl().contains("dash"))
		{
			System.out.println("Login success");
		}
		else
		{
			System.out.println("Login fail");
		}
	   
	}
	@Then("^i Close Browser$")
	public void i_Close_Browser() throws Throwable {
	    driver.close();
	}

}
