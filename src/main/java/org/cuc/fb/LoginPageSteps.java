package org.cuc.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	WebDriver driver;

	@Given("^User launch the facebook app$")
	public void user_launch_the_facebook_app() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jash\\eclipse-workspace\\BaseExecutable\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@Given("^User chek url and title$")
	public void user_chek_url_and_title() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("facebook")) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}

	}

	@When("^User enters the username$")
	public void user_enters_the_username() {
		driver.findElement(By.id("email")).sendKeys("Shahid");

	}

	@When("^User enters the password$")
	public void user_enters_the_password() {
		driver.findElement(By.id("pass")).sendKeys("Rehan");

	}

	@When("^User click login button$")
	public void user_click_login_button() {
		driver.findElement(By.id("loginbutton")).click();

	}

	@Then("^User checks the navigated url is correct or not$")
	public void user_checks_the_navigated_url_is_correct_or_not() {
		String url = driver.getCurrentUrl();
		if (url.contains("attempt")) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}
	}

	@Then("^User close the browser$")
	public void user_close_the_browser() {
		driver.quit();
	}

}
