package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",
glue= {"stepDefinition","Hooks"},
plugin={"pretty","rerun:target/failedrerun.txt"})
public class MyTestRunner extends AbstractTestNGCucumberTests{

}
