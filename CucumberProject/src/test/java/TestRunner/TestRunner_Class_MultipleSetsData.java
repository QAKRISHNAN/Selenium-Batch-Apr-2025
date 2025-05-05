package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/SwagLoginMultipleSetsData.feature", // Path to feature files
        glue = {"stepDefinations_SwagLabs"}, // Package where step definitions are located
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Report generation
        monochrome = true // Readable console output
)

public class TestRunner_Class_MultipleSetsData {

}
