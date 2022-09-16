package utils;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebActions {

    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    private final int maxRetryCount = 2;

    public WebActions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
        js = (JavascriptExecutor) this.driver;
    }

    private WebActions() {
    }

    public void doClick(By element) {
        int retryCnt = 0;
        while (true) {
            if (retryCnt > maxRetryCount)
                throw new FrameworkException("Unable to click the element with locator:" + element +". If locator is valid try performing a JavaScript click using doJSclick() method.");
            try {
                wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                ExtentLogs.log("Clicked on the element with locator: " + element);
                break;
            }
            catch (Exception e) {
                retryCnt++;
            }
        }
    }

    public void doJSclick(By element) {
        int retryCnt = 0;
        while (true) {
            if (retryCnt > maxRetryCount)
                throw new FrameworkException("Unable to click the element with locator: " + element);
            try {
                wait.until(ExpectedConditions.elementToBeClickable(element));
                js.executeScript("arguments[0].click();", driver.findElement(element));
                ExtentLogs.log("Clicked on the element with locator: " + element);
                break;
            } catch (Exception e) {
                retryCnt++;
            }
        }
    }

    public void enterText(By element, String text, boolean clearField){
        int retryCnt = 0;
        while (true) {
            if (retryCnt > maxRetryCount)
                throw new FrameworkException("Unable to enter text into the element with locator: " + element);
            try {
                WebElement elm = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
                if(clearField)
                    elm.clear();
                elm.sendKeys(text);
                ExtentLogs.log("Entered text: "+text+" on the element with locator: " + element);
                break;
            } catch (Exception e) {
                retryCnt++;
            }
        }
    }

    public void enterText(By element, String text){
        enterText(element, text, true);
    }

    public void waitForElementToBeInvisible(By element){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
        ExtentLogs.log("Successfully waited for the invisibility of element with locator: " + element);
    }

    public void waitForElementToBeVisible(By element){
        int retryCnt = 0;
        while(true){
            if (retryCnt > maxRetryCount)
                throw new FrameworkException("Unable to locate and wait for visibility of the element with locator: " + element);
            try{
                wait.until(ExpectedConditions.presenceOfElementLocated(element));
                ExtentLogs.log("Successfully waited for the visibility of element with locator: " + element);
                break;
            }catch (Exception e){
                retryCnt++;
            }
        }
    }

    public String getBase64Screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }

    public byte[] getByteScreenshot(){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    public void scrollInsideElement(By parentElement, By childElement){
        int retryCnt = 0;
        while (true){
            if (retryCnt > maxRetryCount)
                throw new FrameworkException("Unable to perform scroll inside element operation");
            try{
                wait.until(ExpectedConditions.presenceOfElementLocated(parentElement));
                wait.until(ExpectedConditions.presenceOfElementLocated(childElement));
                js.executeScript(
                        "arguments[0].scrollTop=arguments[1].offsetTop",
                        driver.findElement(parentElement),
                        driver.findElement(childElement));
                pauseExecution(2);
                ExtentLogs.log("Successfully performed scroll inside element operation");
                break;
            }catch (Exception e){
                retryCnt++;
            }
        }
    }

    public void scrollToElement(By element){
        int retryCnt = 0;
        while (true){
            if (retryCnt > maxRetryCount)
                throw new FrameworkException("Unable to scroll the webpage to element with locator: " + element);
            try{
                wait.until(ExpectedConditions.presenceOfElementLocated(element));
                js.executeScript(
                        "arguments[0].scrollIntoView({behavior: \"smooth\"})",
                        driver.findElement(element));
                pauseExecution(2);
                ExtentLogs.log("Successfully scrolled the webpage to element with locator: " + element);
                break;
            }catch (Exception e){
                retryCnt++;
            }
        }
    }

    public boolean isElementDisplayed(By element){
        int retryCnt = 0;
        while (true){
            if (retryCnt > maxRetryCount) {
                ExtentLogs.log("Maximum retry limit reached waiting for the visibility of element with locator: " + element);
                return false;
            }
            try{
                return wait.until(ExpectedConditions.presenceOfElementLocated(element)).isDisplayed();
            }catch (Exception e){
                retryCnt++;
            }
        }
    }

    public void pauseExecution(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new FrameworkException("Could not pause the execution");
        }
    }

    public List<WebElement> getListOfWebElements(By locator){
        int retryCnt = 0;
        while (true){
            try{
                if(retryCnt > maxRetryCount){
                    throw new FrameworkException("Unable to fetch list of web elements with locator: "+locator);
                }
                wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
                return driver.findElements(locator);
            }catch (Exception e){
                retryCnt++;
            }
        }
    }

    public String getInnerText(By element){
        int retryCnt = 0;
        while (true){
            try{
                if(retryCnt > maxRetryCount)
                    throw new FrameworkException("Unable to fetch text from element with locator: "+element);
                return wait.until(ExpectedConditions.presenceOfElementLocated(element)).getText();
            }catch (Exception e){
                retryCnt++;
            }
        }
    }

    public String getAttribute(By element, String attributeName){
        int retryCnt = 0;
        while (true){
            try{
                if(retryCnt > maxRetryCount)
                    throw new FrameworkException("Unable to fetch attribute from element with locator: "+element);
                return wait.until(ExpectedConditions.presenceOfElementLocated(element)).getAttribute(attributeName);
            }catch (Exception e){
                retryCnt++;
            }
        }
    }

    public boolean isElementEnabled(By element){
        int retryCnt = 0;
        while (true){
            if (retryCnt > maxRetryCount) {
                ExtentLogs.log("Maximum retry limit reached checking element is enabled or not with locator: " + element);
                return false;
            }
            try{
                return wait.until(ExpectedConditions.presenceOfElementLocated(element)).isEnabled();
            }catch (Exception e){
                retryCnt++;
            }
        }
    }

    public boolean isElementSelected(By element){
        int retryCnt = 0;
        while (true){
            if (retryCnt > maxRetryCount) {
                ExtentLogs.log("Maximum retry limit reached checking element is selected or not with locator: " + element);
                return false;
            }
            try{
                return wait.until(ExpectedConditions.presenceOfElementLocated(element)).isSelected();
            }catch (Exception e){
                retryCnt++;
            }
        }
    }

    public WebElement getWebElement(By locator){
        int retryCnt = 0;
        while (true){
            if (retryCnt > maxRetryCount)
                throw new FrameworkException("Unable to get web element with locator: "+locator);
            try{
                return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            }catch (Exception e){
                retryCnt++;
            }
        }
    }

}
