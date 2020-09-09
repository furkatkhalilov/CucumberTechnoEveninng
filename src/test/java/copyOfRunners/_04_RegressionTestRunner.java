package copyOfRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        tags = {"@RegressionTest"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinition"},
        dryRun = false
)

public class _04_RegressionTestRunner extends AbstractTestNGCucumberTests { }
