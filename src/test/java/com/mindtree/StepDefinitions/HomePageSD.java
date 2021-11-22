package com.mindtree.StepDefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusableComponent.WebDriverHelper;
import com.mindtree.runner.BigSmall;
import com.mindtree.utility.ReadPropertyFile;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

public class HomePageSD {
	
	static WebDriver driver;
	ReadPropertyFile rp = null;
	Logger log = LogManager.getLogger(BigSmall.class.getName());
	
	@Given("Open the Browser")
	public void open_the_browser() throws Exception {
	    
		WebDriverHelper.initializeDriver();
		driver = WebDriverHelper.getDriver();
	}

	@Then("Hit the url")
	public void hit_the_url() throws Exception {
		rp = new ReadPropertyFile();
		driver.get(rp.getUrl());
		log.info("Url has been hitted");
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
