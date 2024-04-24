package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
            features = {"src/test/java/Features"},
            glue= {"Stepdefinition", "Utility"},
            tags= "@test",
            monochrome =true,
            plugin = {"pretty","json:target/TestRunner/cucumber.json",
                    "html:target/TestRunner/Cucumber-reports/cucumber-report.html",
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                    "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
    )

public class TestRunner {
}
