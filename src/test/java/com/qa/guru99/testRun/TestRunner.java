package com.qa.guru99.testRun;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Chintu\\workspace\\CucumberFrameWork_Guru99\\src\\test\\java\\com\\"
				+ "qa\\guru99\\features\\Hooks.feature",
		glue={"com.qa.guru99.StepDefinations"},
		format = {"pretty","html:test-output"},
		monochrome= true,
		strict=true,
		dryRun= false
		
		
		)

//**  OR   ** tags={"@E2ETest, @SmokeTest"} either E2ETest OR SmokeTest

//	**  AND   ** tags={"@E2ETest", "@SmokeTest"} scenarios tagged with both E2ETest AND SmokeTest

// **  NOT   ** tags={"~@E2ETest"}  remaining scenarios  EXCEPT tagged with E2ETest


public class TestRunner {

}
