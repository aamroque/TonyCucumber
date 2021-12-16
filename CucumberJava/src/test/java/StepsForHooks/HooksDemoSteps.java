package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {

	WebDriver driver = null;
	
	//This is a Function for Hooks
	//below line will only run for Scenarios with Tags
	//@Before("@SmokeTest")
	//below line will only run based on order
	//@Before(order=1)
	//below line will run based on tag and order
	@Before(value="@SmokeTest or @Regression or @CoreTC", order=1)
	public void browserSetup() {
		System.out.println("--- I am inside browserSetup ---");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is :"+projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/WebDrivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
//	@Before(order=2)
//	public void setup2() {
//		System.out.println("--- I am inside setup2 \n");
//	}
	
	//This is a Function for Hooks
	@After(order=1)
	public void teardown() {
		System.out.println("--- I am inside teardown ---");
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}
	
//	@After(order=2)
//	public void teardown2() {
//		System.out.println("--- I am inside teardown 2 \n");
//	}
	
	@BeforeStep
	public void beforeSteps() {
		System.out.println("--- I am inside beforeSteps ---");
	}
	
	@AfterStep
	public void afterSteps() {
		System.out.println("--- I am inside afterSteps ---");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	}

	@When("user neters valid username and password")
	public void user_neters_valid_username_and_password() {
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	}

}
