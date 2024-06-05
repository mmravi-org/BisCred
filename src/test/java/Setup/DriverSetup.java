package Setup;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverSetup {
    public static WebDriver driver;


    public static void setupDriver() throws MalformedURLException {
        //WebDriverManager.chromedriver().setup();
        String projectPath= System.getProperty("user.dir");
        //System.setProperty("webdriver.chrome.driver", projectPath + "/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--lang=en");
        //driver = new ChromeDriver(options);
        options.addArguments("--remote-allow-origins=*");
        driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
        driver.manage().window().maximize();
    }
}
