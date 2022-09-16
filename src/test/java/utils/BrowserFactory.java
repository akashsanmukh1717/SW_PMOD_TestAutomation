package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserFactory {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static synchronized WebDriver getDriver() {
        return driver.get();
    }

    public static synchronized void setDriver(String browserName) {
        if (browserName.trim().equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver.set(new FirefoxDriver());
        } else if (
                browserName.trim().equalsIgnoreCase("grid") ||
                        browserName.trim().equalsIgnoreCase("grid-chrome") ||
                        browserName.trim().equalsIgnoreCase("grid-firefox")
        ) {
            String gridUrl = new PropertiesReader(".//src//test//resources//global.properties").getProperty("GRIDURL");
            try {
                if (browserName.equalsIgnoreCase("grid-firefox"))
                    driver.set(new RemoteWebDriver(new URL(gridUrl), new FirefoxOptions()));
                else
                    driver.set(new RemoteWebDriver(new URL(gridUrl), getChromeOptions()));
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        } else {
            WebDriverManager.chromedriver().setup();
            driver.set(new ChromeDriver(getChromeOptions()));
        }
    }

    public static ChromeOptions getChromeOptions(){
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("--incognito");
        opts.setAcceptInsecureCerts(true);
        return opts;
    }

}
