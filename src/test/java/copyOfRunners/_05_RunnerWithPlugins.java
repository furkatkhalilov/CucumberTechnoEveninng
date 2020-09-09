package copyOfRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

//        With a plugin we are able to create multiple types of reports.
        plugin = {
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        },

        tags = {"@SmokeTest1"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinition"},
        dryRun = false

)

public class _05_RunnerWithPlugins extends AbstractTestNGCucumberTests {
}
