package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefinition {
	static WebDriver driver;
	@Given("user navigates to loginpage")
	public void user_navigates_to_loginpage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.saucedemo.com/v1");
		//driver.get();
		
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement txtusername = driver.findElement(By.id("user-name"));
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtusername.sendKeys("standard_user");
		txtpassword.sendKeys("secret_sauce");
		
		
	}

	@And("clicks login button")
	public void clicks_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("login-button")).click();;
	}

	@Then("Navigate to home page")
	public void navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//div[@class='product_label']"));
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='product_label']")).isDisplayed(), "element found");
	}

	@And("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.close(); to avoid error
		driver.quit();
	}
}
