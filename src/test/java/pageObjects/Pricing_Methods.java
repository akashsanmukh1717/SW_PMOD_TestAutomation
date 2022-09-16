package pageObjects;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ExtentLogs;
import utils.ReusableMethods;
import utils.WebActions;
import webLocatorsRepository.Accounts_Locators;
import webLocatorsRepository.Pricing_Locators;

public class Pricing_Methods implements Pricing_Locators, Accounts_Locators{
    ReusableMethods reusableMethods;
    WebDriver driver;
    WebDriverWait wait;
    WebActions act;

    public Pricing_Methods(WebDriver driver) {
        this.driver = driver;
        reusableMethods = new ReusableMethods(driver);
        wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
        act = new WebActions(driver);
    }
    // Validation of pricing details page
    public boolean checkUserinOnPricingDetailsPage() {
        String url = driver.getCurrentUrl();
        return url.contains("pricing");
    }

    // Picking a particular account for validation from account number
    public void selectAccoount(String account) {
        act.waitForElementToBeVisible(pricingTab);
        act.doJSclick(pricingTab);
        act.doJSclick(pricingMaintenance);
        act.waitForElementToBeVisible(pricingSearchFieldAccount);
        act.enterText(pricingSearchFieldAccount, account);
        act.waitForElementToBeVisible(By.cssSelector(".ant-select-dropdown"));
        act.doJSclick(pricingAccountSelectionXpath);
    }
    // Select a job under pricing maintenance screen
    public void selectJob() {
        act.doClick(pricingJobSearch);
        act.doJSclick(pricingJobStrMngrJobValue);
    }
    //
    public void selectAdavnceSearchOptions() {
        ExtentLogs.log("Checking whether user is able to click on advance search option");
        act.doJSclick(pricingRadioButtonXpath);
        ExtentLogs.log("User is able to click on advance search option");
    }

    // Select category primer
    public void categorySelection(String primer) {
        ExtentLogs.log("Checking whether user is able to search for an account's pricing with Advanced Search options - Category");
        act.enterText(pricingCategoryXpath,primer);
        String chooseCategory = "//span[@class = 'ant-select-tree-title' and contains(text(), '"+primer+"')]";
        By categoryValueSelectionXpath = By.xpath(chooseCategory);
        act.doClick(categoryValueSelectionXpath);
        act.doClick(pricingCategoryXpath);
        act.doClick(pricingShowResults);
        ExtentLogs.log("User is able to search for an account's pricing with Advanced Search options - Category");
    }

    public boolean validateSizeCode() {
        ExtentLogs.log("Check whether user is able to verify the size code");
        act.waitForElementToBeVisible(pricingCategoryTable);
        String tableContent = driver.findElement(By.xpath("(//table[@class = 'ant-table-fixed'])[1]")).getText();
        if(tableContent.contains("Size Code")) {
            ExtentLogs.log("User is able to verify the size code");
            act.isElementDisplayed(sizeCodeVerification);
            return true;
        }
        else {
            ExtentLogs.log("User is not able to verify the size code");
            return false;
        }

    }

    public boolean validatePriceValue() {
        ExtentLogs.log("Check whether user is able to verify the price value");
        act.waitForElementToBeVisible(pricingCategoryTable);
        String tableContent = driver.findElement(By.xpath("(//table[@class = 'ant-table-fixed'])[1]")).getText();
        act.waitForElementToBeVisible(priceVerification);
        String priceValue = driver.findElement(By.xpath("(//tbody[@class= 'ant-table-tbody']/tr/td)[8]/div/span")).getText();
        System.out.println("Price Value: " + priceValue);
        if(tableContent.contains("Price")) {
            return true;
        }
        else if(priceValue.contains("$")) {
            ExtentLogs.log("User is able to verify the price value");
            act.waitForElementToBeVisible(priceVerification);
            driver.findElement(priceVerification).getAttribute("inner text");
            return true;
        }
        else {
            ExtentLogs.log("User is not able to verify the price value");
            return false;
        }
    }
    public void testing() {

        WebElement table = driver.findElement(By.xpath("(//tbody[@class= 'ant-table-tbody'])[1]"));
        List<WebElement> row = table.findElements(By.tagName("tbody"));
        System.out.println("Total Number of Rows = " + row.size());

        for (int i=0;i<=row.size()-1 ;i++){

            System.out.println(row.get(i).getText()); }

    }

    public void productGroupSelection(String productGroup) {
        ExtentLogs.log("Checking whether user is able to search for an account's pricing with Advanced Search options - product group");
        act.scrollInsideElement(formContainer,productGroupSearchClick);
        act.doClick(productGroupSearchClick);
        act.enterText(productGroupSearchInput,productGroup);
        String chooseProductGroup = "//div[text()='"+productGroup+"' and contains(@class, 'ant-select-item-option-content')]";
        By chooseProductGroupxpath = By.xpath(chooseProductGroup);
        act.doClick(chooseProductGroupxpath);
        act.doClick(productGroupSearchClick);
        act.doClick(pricingShowResults);
        ExtentLogs.log("User is able to search for an account's pricing with Advanced Search options - product group");
    }

    public void salesNumberSelection(String salesNumber){
        ExtentLogs.log("Checking whether user is able to search for an account's pricing with sales number");
        act.doClick(pricingSalesNumberSearchClick);
        act.enterText(pricingSalesNumberxpathInput,salesNumber);
        String chooseSalesNumber = "//div[@class = 'ant-select-item-option-content' and text () = '" + salesNumber
        + "']";
        By salesNumberSelectionXpath = By.xpath(chooseSalesNumber);
        act.doClick(salesNumberSelectionXpath);
        act.doClick(pricingShowResults);
        ExtentLogs.log("User is able to search for an account's pricing with sales number");
    }

    public boolean clearSearchSelection() {
        ExtentLogs.log("Checking whether user is able to perform clear search");
        act.doClick(pricingClearSearchButton);
        ExtentLogs.log("User is able to perform clear search");
        return act.isElementDisplayed(noDataxSearchTabXpath);
    }
    public void validateFromProductFamily(String productFamily){
        act.doClick(pricingProductFamilySearchClick);
        act.enterText(pricingProductFamilySearchInput,productFamily);
        String chooseProductFamily = "//div[@class = 'ant-select-item-option-content' and text () = '" + productFamily
                + "']";
        By productFamilySelectionXpath = By.xpath(chooseProductFamily);
        act.doClick(productFamilySelectionXpath);
        act.doClick(pricingSalesNumberSearchClick);
        act.doClick(pricingShowResults);
    }
    public void clickViewEditButton(String[] sizeCode) {
        act.scrollInsideElement(formContainer, viewEditTable);
        for(String s:sizeCode){
            String xpathSizeCode = "(//tr[td[text() = '"+s+"']]/td/div/label/span)[1]";
            act.doClick(By.xpath(xpathSizeCode));
        }
        act.isElementEnabled(viewEditButton);
        act.doClick(viewEditButton);
    }

    public void clickEditExceptionButton () {
        act.isElementDisplayed(priceUpdateValidationPage);
        act.isElementEnabled(editExceptionButton);
        act.doClick(editExceptionButton);
    }
public void chooseNewExceptionValue (String[] sizeCode){
    List<WebElement> priceLists = act.getListOfWebElements(By.xpath("//thead[tr[th[span[div[span[text() = 'Current Price']]]]]]/following-sibling::tbody/tr/td/span[contains(text() , '$')]"));
    for(int i = 0; i<sizeCode.length; i++){
        String newPriceValue = "//div[div[div[span[text()='Products - Fixed Price']]]]/div/following-sibling::div/div/div/div/div/div/div/div/div/table/tbody/tr/td[contains(text(),'" + sizeCode[i] + "')]/following-sibling::td/div/div/div/div/div/div/div/span/input";
        String price=priceLists.get(i).getText();
        price = price.replaceAll("[^0-9.]","");
        float number = Float.parseFloat(price);
        act.enterText(By.xpath(newPriceValue), Float.toString(number-=1));
    }
}
    public void selectExpirationDate () {
        act.doClick(expirationDateInputBox);
        act.doClick(nextExpirationDate);
    }
    public void updateReasonField(){
        act.enterText(updateReasonTextArea,"Test Exception " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()),true);
    }
    public void clickNextButtonAndSubmit(){
        act.isElementEnabled(nextButtonClick);
        act.doClick(nextButtonClick);
        act.doClick(submitButton);
        act.isElementDisplayed(successMsgExceptionPrice);
        act.doClick(clickOk);
    }
    public void productNumberSelection(String productNumber){
        ExtentLogs.log("Checking whether user is able to search for an account's pricing with product number");
        act.doClick(pricingProductNumberSearchClick);
        act.enterText(pricingProductNumberInput,productNumber);
        String chooseSalesNumber = "//div[@class = 'ant-select-item-option-content' and text () = '" + productNumber
                + "']";
        By salesNumberSelectionXpath = By.xpath(chooseSalesNumber);
        act.doClick(salesNumberSelectionXpath);
        act.doClick(pricingShowResults);
        ExtentLogs.log("User is able to search for an account's pricing with product number");
    }

}








