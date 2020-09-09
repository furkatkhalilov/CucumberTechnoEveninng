package copyOfRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/_05_Natianalities.feature" , "src/test/java/FeatureFiles/_07_Fees.feature"},
        glue = {"StepDefinition"},
        dryRun = false
)

public class _03_RunCoupleFeatues extends AbstractTestNGCucumberTests {
}
