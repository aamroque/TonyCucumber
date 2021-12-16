package StepDefinitions;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginDemoSteps_POM {
//	
//	WebDriver driver = null;
//	LoginPage login;
//
//	@Given("browser is open")
//	public void browser_is_open() throws IOException, InterruptedException {
//		System.out.println(" === I am inside LoginDemoSteps_POM === ");
//		System.out.println("Inside Step - browser is open");
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is :"+projectPath);
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/WebDrivers/chromedriver.exe");
//		//OR
//		//System.setProperty("webdriver.chrome.driver","C:/Users/trmro/eclipse-workspace/CucumberJava/src/test/resources/WebDrivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() throws InterruptedException {
//		driver.navigate().to("https://example.testproject.io/web/");
//		Thread.sleep(2000);
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//		login = new LoginPage(driver);
//		login.enterUsername(username);
//		Thread.sleep(2000);
//		login.enterPassword(password);
//		//driver.findElement(By.xpath("//*[@id='name']")).sendKeys(username);
//		//driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
//		Thread.sleep(2000);
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() throws InterruptedException {
//		login.clickLogin();
//		//driver.findElement(By.xpath("//*[@id='login']")).click();
//		Thread.sleep(2000);
//	}
//	
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//		login.checkLogOutIsDisplayed();
//		//driver.findElement(By.id("logout")).isDisplayed();
//		Thread.sleep(2000);
//		
//		driver.close();
//		driver.quit();
//		
//	}
//	
}
