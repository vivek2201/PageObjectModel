package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failedrerun.txt",
glue= {"stepDefinition","Hooks"},
plugin={"pretty","rerun:target/failedrerun.txt"})
public class FailedRunner extends AbstractTestNGCucumberTests {

}
