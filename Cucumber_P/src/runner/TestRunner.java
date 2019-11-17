package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue={"stepDefinition"})
/*@CucumberOptions(monochrome = true,
features = "src/test/resources/features/",
format = { "pretty","html: cucumber-html-reports",
        "json: cucumber-html-reports/cucumber.json" },
dryRun = false,
glue = "fr.tlasnier.cucumber" )*/
public class TestRunner {



}


