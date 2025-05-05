package RunnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/SwagLabValidInValid.feature", // Path to feature files
        glue = {"stepDefinations"}, // Package where step definitions are located
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Report generation
        monochrome = true // Readable console output
)
public class InValidSwagRunner 
{

}
