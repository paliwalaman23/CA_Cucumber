package com.mindtree.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//@RunWith(Cucumber.class)		//We are commenting it because we want to run it as testng
@CucumberOptions(
		features="Feature",
		glue = {"com.mindtree.StepDefinitions"},
			dryRun = false)

public class BigSmall extends AbstractTestNGCucumberTests  {

}
