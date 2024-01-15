package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@tag1 and not @tag2" , features = {"src/test/resources/Features"}, 
glue = { "StepDefinitions" }, 
plugin = {"pretty", "html:target/bddframeworkreport.html" })

public class TagsTestRunner extends AbstractTestNGCucumberTests {

}
