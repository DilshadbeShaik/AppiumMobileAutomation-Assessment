package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features"},
        glue= {"Stepdefinition", "Utility"},
        tags= "@appium",
        monochrome =true,
        plugin = {"pretty","json:target/TestRunner2/cucumber.json",
                "html:target/TestRunner2/Cucumber-reports/cucumber-report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)

public class TestRunner2 {
}
