

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
        monochrome = true,
        features = "src/test/resources/UI",
        format = {"pretty", "html: cucumber-html-reports",
        "json: cucumber-html-reports/cucumber.json"},
        dryRun = false,
        glue = "StepDef"
)


@RunWith(Cucumber.class)
public class Runner {

}

