package pageObjects;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import utils.ExtentLogs;
import utils.ReusableMethods;
import utils.WebActions;
import webLocatorsRepository.Accounts_Locators;
import webLocatorsRepository.Pricing_Locators;

public class Accounts_Methods implements Accounts_Locators {
ReusableMethods reusableMethods;
WebDriver driver;
WebDriverWait wait;
WebActions act;

public Accounts_Methods(WebDriver driver) {
	this.driver = driver;
	reusableMethods = new ReusableMethods(driver);
	wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
	act = new WebActions(driver);
}

// Validation of account details page
public boolean checkUserinOnAccountDetailsPage() {
	String url = driver.getCurrentUrl();
	return url.contains("account");
}

// Picking a particular account for validation from account number
public void selectAccoount(String account) {
	act.doJSclick(accountTAb);
	act.enterText(accountSearchField, account);
	act.doJSclick(acountselectionXpath);
}

// Picking a particular account for validation from account name
public void selectAccoountName(String accountName) {
	act.doJSclick(accountTAb);
	act.enterText(accountSearchField, accountName);
	act.doJSclick(acountselectionXpath);
}

// Validation of account details
public boolean accountDetails() throws InterruptedException {
	List<WebElement> elements;
	act.waitForElementToBeVisible(accountSummaryDetails);
	elements = driver.findElements(accountSummaryDetails);
	for (int i = 0; i < elements.size(); i++) {
		Boolean result = elements.get(i).isDisplayed();
		if (result == false) {
			return false;
		}
	}
	return true;
}

// Sales Potentials Value Check
public boolean salesPotential() {
	ExtentLogs.log("Checking Sales potential value is populated or not");
	act.waitForElementToBeVisible(accountSummaryDetails);
	act.waitForElementToBeVisible(salesPotentialValue);
	String potentialValue = driver.findElement(salesPotentialValue).getAttribute("innerText");
	System.out.println("Sales Potential: " + potentialValue);
	ExtentLogs.log("Sales potential value is being populated");
	if (potentialValue.contains("$")) {
		ExtentLogs.log("Sales potential value is being populated");
		return true;
	} else {
		ExtentLogs.log("Sales potential value is not populated");
		return false;
	}
}

// CAC Code details
public boolean checkCACcode() {
	ExtentLogs.log("Checking CAC code value is populated or not");
	act.waitForElementToBeVisible(accountSummaryDetails);
	act.waitForElementToBeVisible(cacCodeLocator);
	Boolean result = driver.findElement(cacCodeLocator).isDisplayed();
	ExtentLogs.log("CAC code value is populated");
	return result;
}

// Comment Details Tab
public boolean commentDetailsCheck() {
	ExtentLogs.log("Checking Account comment value is populated or not");
	act.waitForElementToBeVisible(commentsLocator);
	String commentDetails = driver.findElement(commentsLocator).getText();
	act.doJSclick(accountCommentsDropDown);
	if (commentDetails.contains("No comments")) {
		ExtentLogs.log("Account comment details are not populated");
		return false;
	} else {
		ExtentLogs.log("Account comment details are populated");
		return true;
	}
}

// ContactInfo Tab
public boolean contactInfoCheck() {
	ExtentLogs.log("Checking Account contact info is populated or not");
	act.waitForElementToBeVisible(contactInfoDropDown);
	act.doClick(contactInfoDropDown);
	Boolean result = driver.findElement(contactInfoDropDown).isDisplayed();
	act.doJSclick(contactInfoDropDown);
	ExtentLogs.log("Account contact info is populated");
	return result;
}

// Authorized Buyers Tab
public boolean authorizedBuyersCheck() {
	ExtentLogs.log("Checking Account authorised buyer info is populated or not");
	act.waitForElementToBeVisible(authorizedBuyersDropDown);
	act.scrollInsideElement(formContainer,authorizedBuyersDropDown);
	act.doJSclick(authorizedBuyersDropDown);
	//act.waitForElementToBeVisible(authTableHeader);
	Boolean result = driver.findElement(authorizedBuyersDropDown).isDisplayed();
	act.doJSclick(authorizedBuyersDropDown);
	ExtentLogs.log("Account authorised buyer info is populated");
	return result;
}

// Demographics Tab
public boolean demographicsCheck() {
	ExtentLogs.log("Checking Account demographics info is populated or not");
	act.waitForElementToBeVisible(demographicsDropDown);
	act.doJSclick(demographicsDropDown);
	act.waitForElementToBeVisible(accountSize);
	Boolean result = driver.findElements(accountSize).size() > 0;
	System.out.println(result);
	ExtentLogs.log("Account demographics info is populated");
	return result;
}

// Account Job information
public boolean accountsJobInfomationCheck() {
	ExtentLogs.log("Checking Account JobInformation is populated or not");
	act.waitForElementToBeVisible(jobsDropDown);
	driver.findElement(jobsDropDown).click();
	Boolean result = driver.findElement(jobsDropDown).isDisplayed();
	act.doJSclick(jobsDropDown);
	ExtentLogs.log("Account JobInformation is populated");
	return result;
}

// Adding Account comments for sales rep
public boolean addAccountComments() {
	ExtentLogs.log("Checking whether user is able to add Account comments");
	act.waitForElementToBeVisible(accountCommentsDropDown);
	act.doClick(addCommentsClick);
	act.enterText(addCommentsTextArea,"Test Account comment " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
	act.doJSclick(commentSaveButton);
	act.waitForElementToBeVisible(customerProfileSuccessMsg);
	act.waitForElementToBeVisible(commentsLocator);
	String commentDetails = driver.findElement(commentsLocator).getText();
	if (commentDetails.contains("No comments")) {
		ExtentLogs.log("User is not able to add Account comments");
		return false;
	} else {
		ExtentLogs.log("User is able to add Account comments");
		return true;
	}
}

// Edit Account comments for Sales rep
public boolean editAccountComments() {
	ExtentLogs.log("Checking whether user is able to edit Account comments");
	act.waitForElementToBeVisible(commentsLocator);
	String existingComment = driver
			.findElement(
					By.xpath("(//div[text() = 'Account Comments']/following-sibling::div/div/div/div/div/p/p)[1]"))
			.getText();
	act.doClick(addCommentsClick);
	act.waitForElementToBeVisible(addCommentsTextArea);
	act.enterText(addCommentsTextArea,"Test Account comment edited " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()), true);
	act.doJSclick(commentSaveButton);
	act.waitForElementToBeVisible(customerProfileSuccessMsg);
	String updatedComment = driver
			.findElement(
					By.xpath("(//div[text() = 'Account Comments']/following-sibling::div/div/div/div/div/p/p)[1]"))
			.getText();
	if (existingComment.equals(updatedComment)) {
		ExtentLogs.log("Account comments is not edited");
		return false;
	} else {
		ExtentLogs.log("Account comments is edited");
		return true;
	}
}

// Edit Customer sales potentials
public boolean editCustomerSalesPotentials() {
	ExtentLogs.log("Checking whether user is able to edit Account Sales Potential");
	act.doJSclick(editSalesPotentialClick);
	act.enterText(newSalesPotentialValue,"10000");
	act.doClick(reasonForChangeDropDown);
	act.doJSclick(reasonForChangeValueSP);
	act.doJSclick(submitButton);
	Boolean result = act.isElementDisplayed(salesPotentialSuccessMsg);
	act.doJSclick(clickOk);
	ExtentLogs.log("user is able to edit Account Sales Potential");
	return result;
}

// Edit CAC Code
public boolean editCACCode(String CACGroup, String CACCode) {
	// choose CAC Group
	ExtentLogs.log("Checking whether user is able to edit Acconts CAC code");
	act.doJSclick(editCACClick);
	act.enterText(cacGroupDropDown,CACGroup);
	act.doJSclick(chooseCACGroup);
	act.waitForElementToBeVisible(cacCodeDropDown);
	act.enterText(cacCodeDropDown,CACCode);
	act.doJSclick(chooseCACCode);
	act.doClick(reasonForChangeDropDown);
	act.doJSclick(reasonForChangeValueCAC);
	act.doJSclick(submitButton);
	Boolean result = act.isElementDisplayed(cacSuccessMsg);
	act.doJSclick(clickOk);
	ExtentLogs.log("user is able to edit Acconts CAC code");
	return result;
}

// choose CAC Group for str mgr
public boolean editCACCodeStrMngr(String CACGroup, String CACCode) {
	// choose CAC Group
	ExtentLogs.log("Checking whether user is able to edit Acconts CAC code");
	act.doJSclick(editCACClick);
	act.enterText(cacGroupDropDown,CACGroup);
	act.doJSclick(chooseCACGroup);
	act.waitForElementToBeVisible(cacCodeDropDown);
	act.enterText(cacCodeDropDown,CACCode);
	act.doJSclick(ChooseCACCodeForStrMgr);
	act.doClick(reasonForChangeDropDown);
	act.doJSclick(reasonForChangeValueCAC);
	act.doJSclick(submitButton);
	Boolean result = act.isElementDisplayed(cacSuccessMsg);
	act.doJSclick(clickOk);
	ExtentLogs.log("user is able to edit Acconts CAC code");
	return result;
}

// Pricing details check from jobs section
public Boolean pricingDeatilsFromJob() {
	ExtentLogs.log("Checking whether user is able to see the pricing details from Job");
	act.waitForElementToBeVisible(jobsDropDown);
	act.doJSclick(jobsDropDown);
	act.waitForElementToBeVisible(jobListId);
	act.doJSclick(jobListId);
	String url = driver.getCurrentUrl();
	ExtentLogs.log("user is able to see the pricing details from Job");
	return url.contains("pricing");

}

	public Boolean jobsColumnSort() {
		Boolean resultFlag = false;
		act.doClick(jobsDropDown);
		act.scrollInsideElement(formContainer,jobsNumbersDropdown );
		List<WebElement> paginationNumbers = act.getListOfWebElements(pagationitems);
		int totalPagesNumber = paginationNumbers.size() * 10;
		act.doClick(jobsNumbersDropdown);
		totalPagesNumber = Math.min(totalPagesNumber, 50);
		By selectPage = By.xpath("//div[text()='"+totalPagesNumber+" / page']");
		act.doClick(selectPage);

		//Checking for the Job number ascending order
		ArrayList<Integer> dataListJobNumber = new ArrayList<>();
		List<WebElement> elementList = act.getListOfWebElements(jobNumberValues);
		for(int i=0;i<totalPagesNumber;i++) {
			String text = elementList.get(i).getText();
			dataListJobNumber.add(Integer.parseInt(text));
		}
		ArrayList<Integer> sortedList = new ArrayList<>(dataListJobNumber);
		Collections.sort(sortedList);
		resultFlag = sortedList.equals(dataListJobNumber);
		if (!resultFlag){
			ExtentLogs.log("Job number ascending order sort failed");
			return false;
		}

		//Checking for the Job number descending order
		act.doClick(jobNumberSort);
		ArrayList<Integer> dataListJobNumberDes = new ArrayList<>();
		List<WebElement> elementListDes = act.getListOfWebElements(jobNumberValues);
		for(int i=0;i<totalPagesNumber;i++) {
			String text = elementList.get(i).getText();
			dataListJobNumberDes.add(Integer.parseInt(text));
		}
		ArrayList<Integer> sortedListDes = new ArrayList<>(dataListJobNumberDes);
		Collections.sort(sortedListDes);
		Collections.reverse(sortedListDes);
		resultFlag = sortedListDes.equals(dataListJobNumberDes);
		if (!resultFlag){
			ExtentLogs.log("Job number descending order sort failed");
			return false;
		}

		//checking the Job name sorting in ascending order
		act.doClick(jobNameSort);
		ArrayList<String> dataListJobName = new ArrayList<>();
		List<WebElement> elementListJobName = act.getListOfWebElements(jobNameValues);
		for(int i=1;i<totalPagesNumber;i++) {
			dataListJobName.add(elementListJobName.get(i).getText());
		}
		ArrayList<String> sortedNameList = new ArrayList<>(dataListJobName);
		Collections.sort(sortedNameList);
		resultFlag = sortedNameList.equals(dataListJobName);
		if (!resultFlag){
			ExtentLogs.log("Job name ascending order sorting failed");
			return false;
		}
		//checking the Job name sorting in descending order
		act.doClick(jobNameSort);
		ArrayList<String> dataListJobNameDes = new ArrayList<>();
		List<WebElement> elementListJobNameDes = act.getListOfWebElements(jobNameValues);
		for(int i=1;i<totalPagesNumber;i++) {
			dataListJobNameDes.add(elementListJobNameDes.get(i).getText());
		}
		ArrayList<String> sortedNameListDes = new ArrayList<>(dataListJobNameDes);
		Collections.sort(sortedNameListDes);
		Collections.reverse(sortedNameListDes);
		resultFlag = sortedNameListDes.equals(dataListJobNameDes);
		if (!resultFlag){
			ExtentLogs.log("Job name descending order sorting failed");
		}
		return resultFlag;
	}

// Add new Auth buyers to account for sales rep
public boolean addNewAuthBuyerSP() {
	ExtentLogs.log("Checking whether user is able to add new authorised buyer");
	act.doClick(plusButtonAuthBuyer);
	act.waitForElementToBeVisible(firstNameAuth);
	act.enterText(firstNameAuth,"Johnny");
	act.enterText(lastNameAuth,"Smith");
	act.enterText(phoneNoAuth,"216-555-55555");
	act.enterText(emailAuth,"Test@gmail.com");
	act.enterText(commentsAuth,"New buyer");
	act.doJSclick(submitButton);
	Boolean result = act.isElementDisplayed(successMsgAuth);
	act.doJSclick(clickOk);
	ExtentLogs.log("user is able to add new authorised buyer");
	return result;
}

// Edit Auth buyers to the account for sales rep
public boolean editAuthBuyer() {
	ExtentLogs.log("Checking whether user is able to edit authorised buyer");
	act.waitForElementToBeVisible(authTextArea);
	String existingAuthData = act.getInnerText(By.xpath(
					"(//div[text()= 'Authorized Buyers']/following-sibling::div/div/div/div/div/div/div/div/div/div/table/thead/tr/th)[2]"));
	if (existingAuthData.contains("Email")) {
		act.doClick(editButtonAuth);
		act.enterText(emailAuth,"Test1@yahoo.com" + new SimpleDateFormat("HH:mm:ss").format(new Date()),true);
		act.doJSclick(submitButton);
		act.waitForElementToBeVisible(authTextArea);
		Boolean result = act.isElementDisplayed(editSuccessMsgAuth);
		act.doJSclick(clickOk);
		return result;
	} else {
		ExtentLogs.log("user is not able to edit authorised buyer");
		return false;
	}
}

// Delete Auth for sales rep
public boolean deleteAuth() {
	ExtentLogs.log("Checking whether user is able to delete authorised buyer");
	act.waitForElementToBeVisible(authContent);
	String existingAuthContent = act.getInnerText(By.xpath("//div[text() = 'Authorized Buyers']/following-sibling::div/div/div/div/div/div/div/div/div/div/table/tbody/tr"));
	if (existingAuthContent.isEmpty()) {
		ExtentLogs.log("user is not able to delete authorised buyer");
		return false;
	} else {
		act.doClick(deleteIconAuth);
		act.waitForElementToBeVisible(deleteConfMsgAuth);
		act.doJSclick(clickOk);
		Boolean result = act.isElementDisplayed(deleteSuccessMsgAuth);
		act.doClick(clickOk);
		ExtentLogs.log("user is able to delete authorised buyer");
		return result;
	}
}

//Add contact info to account
public boolean addContactInfo() {
	ExtentLogs.log("Checking whether user is able to add contact information to the account");
	act.doClick(contactInfoDropDown);
	act.doClick(plusButtonContactInfo);
	act.enterText(firstNameContactInfo, "Johnny");
	act.enterText(lastNameContactInfo, "Smith");
	act.enterText(emailContactInfo, "Test@gmail.com");
	act.enterText(phoneContactInfo, "216-555-5555");
	act.enterText(commentsContactInfo, "New contact");
	act.doJSclick(submitButton);
	Boolean result = act.isElementDisplayed(successMsgContactInfo);
	act.doJSclick(clickOk);
	ExtentLogs.log("User is able to add contact information to the account");
	return result;
}

//edit Contact info
public boolean editContactInfo() {
	ExtentLogs.log("Checking whether user is able to edit contact information for the account");
	act.doClick(contactInfoDropDown);
	act.waitForElementToBeVisible(contactInfoTextArea);
	String existingContactInfoData = act.getInnerText(By.xpath(
					"(//div[text()= 'Contact Info']/following-sibling::div/div/div/div/div/div/div/div/div/div/table/tbody/tr/td)[2]"));
	// Edited if statement for global string instead of local string
	if (existingContactInfoData.equals(existingContactInfoData)) {
		ExtentLogs.log("User is able to edit contact information for the account");
		act.doClick(editButtonContactInfo);
		act.enterText(firstNameContactInfo,"Johnny1", true);
		act.doJSclick(submitButton);
		Boolean result = act.isElementDisplayed(editSuccessMsgContactInfo);
		act.doJSclick(clickOk);
		return result;
	} else {
		ExtentLogs.log("User is not able to edit contact information for the account");
		return false;
	}

}
	//delete contact info for account
	public boolean deleteContactInfo() {
		ExtentLogs.log("Checking whether user is able to delete contact information for the account");
		act.doClick(contactInfoDropDown);
		act.waitForElementToBeVisible(contactInfoContent);
		String existingContactInfoContent = act.getInnerText(By.xpath("//div[text() = 'Contact Info']/following-sibling::div/div/div/div/div/div/div/div/div/div/table/tbody/tr"));
		if (existingContactInfoContent.isEmpty()) {
			ExtentLogs.log("User is not able to delete contact information for the account");
			return false;
		} else {
			ExtentLogs.log("User is able to delete contact information for the account");
			act.doClick(deleteButtonContactInfo);
			act.doClick(clickOk);
			Boolean result = act.isElementDisplayed(deleteCongMsgContactInfo);
			act.doJSclick(clickOk);
			return result;
		}
	}

// Verify Account screen each section dropdowns

public void verifyAccountSectionDropdowns() {
	ExtentLogs.log("Checking whether user is able to confirm all permissible data displays");
	act.doClick(pricingProgramsDropDown);
	act.waitForElementToBeVisible(pricingProgramsDropDown);
	act.doClick(pricingProgramsDropDown);
	act.doClick(accountCommentsDropDown);
	act.waitForElementToBeVisible(accountCommentsDropDown);
	act.doClick(accountCommentsDropDown);
	act.doClick(authorizedBuyersDropDown);
	act.waitForElementToBeVisible(authorizedBuyersDropDown);
	act.doClick(authorizedBuyersDropDown);
	act.doClick(contactInfoDropDown);
	act.waitForElementToBeVisible(contactInfoDropDown);
	act.doClick(contactInfoDropDown);
	act.doClick(demographicsDropDown);
	act.waitForElementToBeVisible(demographicsDropDown);
	act.doClick(demographicsDropDown);
	act.doClick(pricingAttributesDropDown);
	act.waitForElementToBeVisible(pricingAttributesDropDown);
	act.doClick(pricingAttributesDropDown);
	act.doClick(jobsDropDown);
	act.waitForElementToBeVisible(jobsDropDown);
	act.doClick(jobsDropDown);
	ExtentLogs.log("User is able to confirm all permissible data displays");
}

public Boolean pricingAttributesCheck() {
	ExtentLogs.log("Checking whether user is able to check pricing attributes of the account");
	act.doClick(pricingAttributes);
	Boolean result = driver.findElement(ecommerceField).isDisplayed();
	act.doClick(pricingAttributes);
	ExtentLogs.log("User is able to check pricing attributes of the account");
	return result;
}
public boolean editPricingAttribute() {
	ExtentLogs.log("Checking whether user is able to edit Pricing Attribute for the account");
	act.doClick(pricingAttributes);
	act.doClick(pricingAttributesEditButton);
	act.doJSclick(pricingAttributesSelection);
	try {
		TimeUnit.SECONDS.sleep(5);
	} catch (InterruptedException e) {
		throw new RuntimeException(e);
	}
	act.doClick(submitButton);
	Boolean result = act.isElementDisplayed(pricingAttributeSusscessMsg);
	act.waitForElementToBeVisible(customerProfileSuccessMsg);
	act.doClick(clickOk);
	ExtentLogs.log("User is able to edit Pricing Attribute for the account");
	return result;
}

}

