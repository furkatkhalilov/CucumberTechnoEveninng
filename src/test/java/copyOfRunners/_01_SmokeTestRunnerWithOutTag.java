package copyOfRunners;/*
    Runners are helping us to run multiple feature files in the same time.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(

        features={"src/test/java/FeatureFiles"}, //the location of feature files.
        glue={"StepDefinition"}, // location of the step definition
        dryRun = false // Is checking is my feature files are created in the step definition package

)

public class _01_SmokeTestRunnerWithOutTag extends AbstractTestNGCucumberTests {
}


    /*

        How do you run multiple feature files together? -- How do you run specific scenario from the feature file?

            To run multiple feature files I have a runner class in my project.
                In the runner class I am giving the tags for example smoke test.
                I am typing the smoke test tag in the feature files as well.

                In this way my runner class can understand which scenario to run.

        If you add one tag in the feature file is it running one scenario or it is running all feature file?

            Tags are running specific scenario if I need to run all of them I need to add the tag for all scenarios.


        it RunnerClass running in alphabetic order?
            Runner class is running the feature file in alphabetical order but scenarios in the feature file it is running from top to buttom.

     */