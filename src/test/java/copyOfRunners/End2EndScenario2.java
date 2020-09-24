package copyOfRunners;/*
    Create one runner class
        run  create edit delete country features
        Fees feature scenario outline

 Runner is helping us to run multiple feature files and also we can choose which scenario to run in the feature file.

 */

import Utilities.Driver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;

/*
        Added extend report
        Screen shots

 */

@CucumberOptions(

        plugin = {
          "html:target/cucumber-Html-Report",
          "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportEnd2End.html" // to generate a extend report we need this plugin
        },
        tags = {"@E2E2"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinition"},
        dryRun = false

)

public class End2EndScenario2 extends AbstractTestNGCucumberTests {

        @BeforeClass
        @Parameters("browser")
        public void beforeMethod(String browser){
                Driver.browserName.set(browser);
        }

        //        After runner is done this after method will run and put username application name information in the report.
        @AfterClass
        public static void afterClass(){

//                Location of the xml file
                Reporter.loadXMLConfig(new File("src/test/java/FeatureFiles/extentReport.xml"));
                Reporter.setSystemInfo("User Name" , "Ali Koklu");
                Reporter.setSystemInfo("Application Name", "Basqar");
                Reporter.setSystemInfo("Operating System Type" , System.getProperty("os.name"));
                Reporter.setSystemInfo("Environment", "QA");
                Reporter.setTestRunnerOutput("Test execution Cucumber report");
        }
}

        /*
                What kind of report do you use in your project?
                        I am using extend report in my current project.
                              In this report I have a chart it is showing me how many features
                                how many scenarios and steps I ran in that runner.

                         If I have a fails then it is showing as red so it is understandable for every one in the team
                           After I run my regression or smoke I share with the team and they also aware of the result.
         */


        /*
                If they asked
                        What is the Runner files what can we say?
                        How do you run your multiple feature files together?
                        For example you have 20 scenarios and you would like to run 15 of them how you can do it?

                 Runner is helps me to run multiple feature files or scenarious together.
                        I can decide with a tags which file or which scenario to run.

                        For example in my project I have regressionRunner class and I have a regression tag.
                        I am adding these tags to feature files and according to tags runner will run those scenarios.



         */