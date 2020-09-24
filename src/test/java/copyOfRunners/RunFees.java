package copyOfRunners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

import java.io.File;

@CucumberOptions(
        plugin = {
                "html:target/cucumber-Html-Report",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportEnd2End.html" // to generate a extend report we need this plugin
        },
        features = {"src/test/java/FeatureFiles/_07_Fees.feature"},
        glue = {"StepDefinition"},
        dryRun = false
)

public class RunFees extends AbstractTestNGCucumberTests {
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
