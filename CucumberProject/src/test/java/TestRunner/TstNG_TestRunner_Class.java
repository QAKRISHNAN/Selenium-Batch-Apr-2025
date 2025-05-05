package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = {"stepDefinations_SwagLabs"},      // Package containing step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Reports
        monochrome = true
)

public class TstNG_TestRunner_Class extends AbstractTestNGCucumberTests {
    
    // Enables parallel execution of tests
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
