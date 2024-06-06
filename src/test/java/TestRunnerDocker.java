

import org.testng.annotations.BeforeClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.BeforeClass;
//import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/1.Login.feature"},
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags = "",
        glue = {"StepDefinitions","Pages","Base","Enums","Setup","Hooks","helpers","Core","TestData"}

)

public class TestRunnerDocker extends AbstractTestNGCucumberTests{


    @BeforeClass
    public static void setup(){

    }
}
