package com.qmetry.qaf.example.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions( features= "scenarios/Amazon Test.feature",
				glue= {"com.qmetry.qaf.example.steps"},
				monochrome= true,
				strict= true,
				plugin= {"pretty","html:target/html-report","json:target/cucumber.json"},
				tags= {"@regression"},
				dryRun= false		
		)
public class junittestrunner {

}
