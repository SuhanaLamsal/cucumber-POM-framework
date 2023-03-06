package com.runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/firebasefeature.feature"},
		glue= {"com.steps"}
		)

 public class RunnerForFireBase extends AbstractTestNGCucumberTests{

}
