//package com.mindtree.StepDefinitions;
//
//import org.junit.runner.RunWith;
//import org.openqa.selenium.WebDriver;
//
//import com.mindtree.pageObjects.HomePage;
//import com.mindtree.pageObjects.SignInPage;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.junit.Cucumber;
//import jdk.internal.org.jline.utils.Log;
//
//@RunWith(Cucumber.class)
//public class SignInSD {
//	static WebDriver driver;
//	public SignInPage sp;
//	public HomePage hp;
//	
//	 @Given("^Getting driver from the HomePageSD file$")
//	    public void getting_driver_from_the_homepagesd_file() throws Throwable {
//		 
//	        driver = HomePageSD.getDriver();
//	    }
//	 
//	 @Then("^click on SignIn button$")
//	    public void click_on_signin_button() throws Throwable {
//		 hp =new HomePage(driver);
//	        hp.getLogin().click();
//	    }
//	 @Then("giving the email as (.+) and Password as (.+)$")
//	 public void giving_the_email_as_and_password_as(String email, String password) throws InterruptedException {
//		 sp = new SignInPage(driver);
//		 sp.getEmail().clear();
//	    	sp.getEmail().sendKeys(email);
//	    	Log.info(email + " Entered");
//	    	sp.getPassword().clear();
//	    	sp.getPassword().sendKeys(password);
//	    	Log.info(password + " Enetered" );
//	    	Thread.sleep(3000);
//	    	Log.info("Enetered the cred");
//	 }
//
//
//
//	    @And("^Clicking on the submit button$")
//	    public void clicking_on_the_submit_button() throws Throwable {
//	    	sp = new SignInPage(driver);
//	    	sp.getSignIn().click();
//	    	Log.info("Entered");
//	    }
//	    
//	    public static WebDriver getDriver() {
//	    	return driver;
//	    }
//
//}
package com.mindtree.StepDefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.pageObjects.SignInPage;
import com.mindtree.runner.BigSmall;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class SignInSD {
	public SignInPage SP;
	static WebDriver driver;
	Logger log = LogManager.getLogger(BigSmall.class.getName());


	@Given("^Getting driver from the Landing Page of the application$")
	public void getting_driver_from_the_landing_page_of_the_application8() throws Throwable {
		driver = HomePageSD.getDriver();
		Thread.sleep(5000);
	}

	@When("^user click on SignIn$")
	public void user_click_on_signin() throws Throwable {
		SP = new SignInPage(driver);
		SP.getSignIn().click();
	}

	@And("^User enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_email_as_and_password_as(String email, String password) throws Throwable {
		SP = new SignInPage(driver);
		SP.getEmail().clear();
		SP.getEmail().sendKeys(email);
		log.info(email + " entered");
		SP.getPassword().clear();
		SP.getPassword().sendKeys(password);
		log.info(password + " entered");

	}

	@And("^Click on Submit$")
	public void click_on_submit() throws Throwable {
		SP = new SignInPage(driver);
		SP.getSubmit().click();

	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}