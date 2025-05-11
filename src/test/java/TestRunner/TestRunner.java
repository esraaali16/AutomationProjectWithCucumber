package TestRunner;

import Hooks.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Feature/Logout.feature",glue = {"Steps"}
        ,plugin = {"pretty","html:target/cucumber-html-report"})
public class TestRunner extends TestBase
{

}
