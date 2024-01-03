package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\appFeatures\\farApp.feature"},
        glue = {"stepDefinitions","hooks"},
        //glue should only be a package where the stepDefiniton java class is located
        tags = "@Smoke or @Regression",
        plugin = {"pretty"}
        //plugin pretty is used to display the output in command prompt in decorative manner
)
public class RolloutTestRunner {
}
