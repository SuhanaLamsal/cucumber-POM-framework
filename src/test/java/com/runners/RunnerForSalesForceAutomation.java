package com.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

   @CucumberOptions(
		features= {"src/test/resources/salesforceautomation.feature"},
		glue= {"com.steps"}
	//	monochrome=true,
	//	dryRun=false,
	//	plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"}
		
	)	
		
	
public class RunnerForSalesForceAutomation extends AbstractTestNGCucumberTests {		
	
   }

