package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",glue= {"stepDefinition","Hooks"},plugin="pretty")
public class MyTestRunner extends AbstractTestNGCucumberTests{

}
