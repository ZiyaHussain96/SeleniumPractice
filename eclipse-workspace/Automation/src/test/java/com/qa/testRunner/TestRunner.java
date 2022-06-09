package com.qa.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/features/login1.feature"
		,glue={"com.qa.step.def"},
		dryRun=true,
		monochrome = true,
		plugin= {"pretty","html:test-output.html"}
		)
public class TestRunner 
{
	

}
