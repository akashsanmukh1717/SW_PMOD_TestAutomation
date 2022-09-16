package stepDefinations;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Hooks {
    TestContextSetup testContextSetup;
    Scenario scenario;
    FileInputStream fis;
    Properties prop;

    TestBase base;

    public Hooks(TestContextSetup testContextSetup, TestBase base) throws IOException {
        this.testContextSetup = testContextSetup;
        fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//global.properties");
        prop = new Properties();
        prop.load(fis);
        this.base = base;
    }

    @Before
    public void beforeScenario(Scenario scenario) throws Exception {
        this.scenario = scenario;
        base.setScenario(scenario);
        String scenarioName = scenario.getName();
        if (prop.getProperty("videoRecording").trim().equalsIgnoreCase("yes")) {
            ScreenRecorderUtil.startRecord(scenarioName);
        }
    }

    @After
    public void afterScenario() throws Exception {
        if (prop.getProperty("videoRecording").trim().equalsIgnoreCase("yes")) {
            ScreenRecorderUtil.stopRecord();
        }
        BrowserFactory.getDriver().quit();
    }

    //Add ScreenShot
    @AfterStep
    public void addScreenshot(Scenario scenario) throws IOException {
        WebDriver driver = BrowserFactory.getDriver();
        Status extentStatus;
        if (!scenario.isFailed())
            extentStatus = Status.PASS;
        else
            extentStatus = Status.FAIL;
        if (scenario.isFailed() || prop.getProperty("screenshotEveryStep").trim().equalsIgnoreCase("yes"))
            ExtentCucumberAdapter.getCurrentStep().log(extentStatus, MediaEntityBuilder.createScreenCaptureFromBase64String(new WebActions(BrowserFactory.getDriver()).getBase64Screenshot()).build());
    }

}
