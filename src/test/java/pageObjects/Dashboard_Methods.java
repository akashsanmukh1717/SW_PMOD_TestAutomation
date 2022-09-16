package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ExtentLogs;
import utils.ReusableMethods;
import utils.WebActions;
import webLocatorsRepository.Accounts_Locators;
import webLocatorsRepository.Pricing_Locators;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Dashboard_Methods implements Accounts_Locators,Pricing_Locators{
    ReusableMethods reusableMethods;
    WebDriver driver;
    WebDriverWait wait;
    WebActions act;

    public Dashboard_Methods(WebDriver driver) {
        this.driver = driver;
        reusableMethods = new ReusableMethods(driver);
        wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
        act = new WebActions(driver);
    }


    public void clickUserProfile() {
        act.doJSclick(userProfileLink);
    }

    public void changeUserProfile(String divisionName, String role, String costCenterCode) {
        // Select Division from DropDown
        act.enterText(changeDivisionDropDown, divisionName);
        String changeDivision = "//div[@class = 'ant-select-item-option-content' and text () = '" + divisionName + "']";
        By divisionSelectionxpath = By.xpath(changeDivision);
        act.doJSclick(divisionSelectionxpath);

        // Select Role from DropDown
        act.enterText(changeRoleDropDown, role);
        String changeRole = "//div[@class = 'ant-select-item-option-content' and text () = '" + role + "']";
        By roleSelectionXpath = By.xpath(changeRole);
        act.doJSclick(roleSelectionXpath);

        // CostCenterSelection
        if(costCenterCode!=null) {
            act.enterText(costCenterClick, costCenterCode);
            String storeNumber = "//div[@class = 'ant-select-item-option-content' and text () = '" + costCenterCode + "']";
            By storeSelection = By.xpath(storeNumber);
            act.doJSclick(storeSelection);
        }

        act.doClick(selectSubmitButton);
        act.doClick(clickonOK);
        act.waitForElementToBeVisible(successMsg);
        act.doClick(clickonOK);
        act.waitForElementToBeInvisible(successMsg);
        driver.navigate().refresh();

    }

    public void loginUser(Integer number) throws IOException, InterruptedException {
        ExtentLogs.log("Logging into application");
        String[] data = reusableMethods.getCredentials(number);
        String username = data[0];
        String password = data[1];
        String parentWindow = reusableMethods.SwitchWindowToChild("Sign in to your account");

        act.enterText(usernameLocator, username);
        act.doJSclick(nextLocatorMFA);
        act.enterText(passwordLocator, password);
        act.doClick(signInLocatorMFA);
        act.waitForElementToBeInvisible(signInLocatorMFA);
        if(driver.getWindowHandles().size() > 1) {
            act.doClick(rememberPasswordNoBtnMFA);
        }
        driver.switchTo().window(parentWindow);
        ExtentLogs.log("Logged in successfully");

    }

    // Validation of dashboard page
    public boolean checkUserinOnDashboard() {
        String url = driver.getCurrentUrl();
        return url.contains("dashboard");
    }

}
