package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/java/Features"},
        glue= {"Stepdefinition","Utility"},
        monochrome =true,
        tags= "@appium",
        plugin = {"json:target/TestRunner3/cucumber.json","pretty", "html:target/TestRunner3/Cucumber-reports/cucumber-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunner3 extends AbstractTestNGCucumberTests {


}

