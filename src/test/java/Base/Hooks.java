package Base;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

import static Setup.DriverSetup.driver;
import static Setup.DriverSetup.setupDriver;


public class Hooks {

    public static void takeScreenshot(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png","screenshot");
    }
    public static WebDriver getDriver(){
        return driver;
    }



    @BeforeAll
    public static void beforeAll() throws MalformedURLException {
        if (driver == null){
            setupDriver();
        }
    }

    @After
    public void takeScreenshotForFailedScenario(Scenario scenario){
        if(scenario.isFailed()){
            takeScreenshot(scenario);
        }
    }

    @AfterAll
    public static void afterAll(){
        driver.quit();
    }
}
