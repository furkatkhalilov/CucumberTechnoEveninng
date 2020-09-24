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
        tags = {"@E2E1"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinition"},
        dryRun = false

)

public class End2EndScenario extends AbstractTestNGCucumberTests {

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


         */