package utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestBase {

    private WebDriver driver;
    private Scenario scenario = null;

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public WebDriver webDriverManager() throws IOException {
        PropertiesReader prop = new PropertiesReader(".//src//test//resources//global.properties");
        String url = prop.getProperty("QAURL");
        String browser_name = prop.getProperty("browser");
        String browser_maven = System.getProperty("runIn");

        browser_name = browser_maven != null ? browser_maven : browser_name;

        if (driver == null) {
            BrowserFactory.setDriver(browser_name);
            driver = BrowserFactory.getDriver();
            driver.get(url);
            driver.manage().window().maximize();
        }
        ExtentLogs.log("Opened application in " + browser_name);
        return driver;

    }

} 