package webLocatorsRepository;

import org.openqa.selenium.By;

public interface Accounts_Locators {

	// User role Change
	By formContainer = By.cssSelector(".container-fluid");
	By userProfileLink = By.xpath("//a[@href = '/dashboard']/following-sibling::div/div/span[contains(text(), 'Hi')]");
	By changeDivisionDropDown = By.xpath("//input[@id = 'division']");
	By divisionSelectionxpath = By
			.xpath("//div[@class = 'ant-select-item-option-content' and text() = 'The Americas Group']");
	By changeRoleDropDown = By.xpath("//input[@id = 'role']");
	By roleSelectionXpath = By
			.xpath("//div[@class = 'ant-select-item-option-content' and text() = 'CPMMaint_Store_Manager_Group']");
	By costCenterClick = By.xpath("//input[@id ='costCenter']");
	By storeSelection = By.xpath("//div[@class = 'ant-select-item-option-content' and text () = '701104']");
	By selectSubmitButton = By.xpath("//span[text() = 'Submit']");
	By clickonOK = By.xpath("//span[text () = 'OK']");
	By successMsg = By.xpath("//span[text() = 'Successfully updated permissions']");
	// Selection of Account from account Tab
	By accountTAb = By.xpath("//a[@href='/account']");
	By accountSearchField = By.xpath("//input[@id='rc_select_0']");
	By selectAccount = By.xpath("//div[@class = 'ant-select-item-option-content' and contains(text(), '531754307')]");
	By selectAccountfromName = By.xpath(
			"//div[@class = 'ant-select-item-option-content' and contains(text(), '288309636 - M2 ENTERPRISES')]");
	By acountselectionXpath = By.xpath("//div[@class = 'ant-select-item-option-content']");
	By accountSummaryDetails = By
			.xpath("//div[contains(text(),'Account Summary')]/..//div[@class='ant-descriptions-item-container']/span");
	By salesPotentialValue = By.xpath("//span[text() = 'Sales Potential']/following-sibling::span/div/div");
	By cacCodeLocator = By.xpath("//span[text() = 'CAC']/following-sibling::span/div/div");
	By commentsLocator = By.className("m-0");
	By accountCommentsDropDown = By.xpath("//div[contains(text(), 'Account Comments')]");
	By addCommentsClick = By.xpath("//div[text() = 'Account Comments']/div/div/span");
	By addCommentsTextArea = By.xpath("//div[text() = 'Account Comments']/following-sibling::div/div/div/div/span/textarea");
	By commentSaveButton = By.xpath(
			"//div[text() = 'Account Comments']/following-sibling::div/div/div/div/div/button/div/span[text() = 'Save']");
	By contactInfoDropDown = By.xpath("//div[contains(text(), 'Contact Info')]");
	By contactContent = By.xpath("//div[contains(text(), 'Contact Info')]/../div[@class='ant-collapse-content']");
	By authorizedBuyersDropDown = By.xpath("//div[text()= 'Authorized Buyers']");
	By authorizedBuyersContent = By
			.xpath("//div[contains(text(), 'Authorized Buyers')]/..//div[@class='ant-collapse-content']");
	By usernameLocator = By.xpath("//input[@type = 'email']");
	By passwordLocator = By.name("passwd");
	By nextLocatorMFA = By.xpath("//input[@type='submit']");
	By signInLocatorMFA = By.xpath("//input[@id='idSIButton9']");
	By rememberPasswordNoBtnMFA = By.id("idBtn_Back");
	By demographicsDropDown = By.xpath("//div[contains(text(), 'Demographics')]");
	By demographicsDetails = By
			.xpath("//div[contains(text(), 'Demographics')]/..//span[@class='ant-descriptions-item-label']");
	By accountSize = By
			.xpath("//div[text() = 'Demographics']/following-sibling::div/div/div/div/div/table/tbody/tr/td");
	By jobsDropDown = By.xpath("//div[contains(text(), 'Jobs')]");
	By editSalesPotentialClick = By.xpath("//span[text() = 'Sales Potential']/following-sibling::span/div/span");
	By newSalesPotentialValue = By.xpath("//input[@type = 'text']");
	By reasonForChangeDropDown = By.xpath("//div[div[span[text() = 'Please select a reason for change']]]");
	By reasonForChangeValueSP = By
			.xpath("//div[@class and text() = \"Customer's sales potential from all paint suppliers has decreased as a result of diminished business\"]");
	By submitButton = By.xpath("//span[text() = 'Submit']");
	By salesPotentialSuccessMsg = By.xpath("//span[text() = 'Sales potential update was submitted successfully.']");
	By clickOk = By.xpath("//span[text() = 'OK']");
	By editCACClick = By.xpath("//span[text() = 'CAC']/following-sibling::span/div/span");
	By cacGroupDropDown = By.xpath("//input[@id = 'cacGroup']");
	By chooseCACGroup = By
			.xpath("//div[@class = 'ant-select-item-option-content' and text() = '2020 - PC RESIDENTIAL REPAINT']");
	By cacCodeDropDown = By.xpath("//input[@id = 'cacCode']");
	By chooseCACCode = By
			.xpath("//div[@class = 'ant-select-item-option-content' and text() = '1791 - RESIDENTIAL REMODELER']");
	By reasonForChangeValueCAC = By.xpath(
			"//div[@class = 'ant-select-item-option-content' and text() = 'The CAC serviced/focus has changed since the account was setup, this will better classify the customer']");
	By cacSuccessMsg = By.xpath("//span[text() = 'CAC update was submitted successfully.']");
	By jobListId = By.xpath("//span[@class='job-number-link'][1]");
	By ChooseCACCodeForStrMgr = By.xpath(
			"//div[@class = 'ant-select-item-option-content' and text() = '1722 - RESIDENTIAL REPAINT CONTRACTOR']");
	By jobTableValues = By.xpath("//div[contains(text(), 'Jobs')]/..//td//span");

	By jobNumberValues = By.xpath("//span[@class='job-number-link']");

	By jobNumberSort = By.xpath(
			"//span[contains(text(),'Job Number')]/..//span[@class='anticon anticon-caret-down ant-table-column-sorter-down off']");

	By jobNameSort = By.xpath(
			"//span[contains(text(),'Job Name')]/..//span[@class='anticon anticon-caret-down ant-table-column-sorter-down off']");
	By plusButtonAuthBuyer = By.xpath("//div[text()= 'Authorized Buyers']/div/span");
	By firstNameAuth = By.xpath("//input[@id= 'authBuyerFirstName']");
	By lastNameAuth = By.xpath("//input[@id= 'authBuyerLastName']");
	By phoneNoAuth = By.xpath("//input[@id= 'authBuyerPhone']");
	By emailAuth = By.xpath("//input[@id= 'authBuyerEmail']");
	By commentsAuth = By.xpath("//textarea[@id= 'authBuyerComments']");
	By successMsgAuth = By.xpath("//span[text() = 'Successfully added authorized buyer!']");
	By authTextArea = By.xpath("(//div[text()= 'Authorized Buyers']/following-sibling::div/div/div/div/div/div/div/div/div/div/table/tbody/tr/td)[2]");

	By authTableHeader = By.xpath("//div[text() ='Authorized Buyers']/following-sibling::div/div/div/div/div/div/div/div/div/div/table/thead/tr/th/span/div/span[contains(text(), 'Name')]");
	By editButtonAuth = By.xpath("//div[text()= 'Authorized Buyers']/following-sibling::div/div/div/div/div/div/div/div/div/div/table/tbody/tr/td[4]/div/span[2]");
	By editSuccessMsgAuth = By.xpath("//span[text()= 'Successfully edited authorized buyer!']");
	By authContent = By.xpath("//div[text() = 'Authorized Buyers']/following-sibling::div/div/div/div/div/div/div/div/div/div/table/tbody/tr");
	By deleteIconAuth = By.xpath("//div[text() = 'Authorized Buyers']/following-sibling::div/div/div/div/div/div/div/div/div/div/table/tbody/tr/td[4]/div/span[3]");
	By deleteConfMsgAuth = By.xpath("//div[text() = 'Are you sure?']");
	By deleteSuccessMsgAuth = By.xpath("//span[text() = 'Successfully deleted authorized buyer!']");
	By plusButtonContactInfo = By.xpath("//div[text()= 'Contact Info']/div/span");
	By firstNameContactInfo = By.xpath("//input[@id= 'firstName']");
	By lastNameContactInfo = By.xpath("//input[@id= 'lastName']");
	By emailContactInfo = By.xpath("//input[@id= 'email']");
	By phoneContactInfo = By.xpath("//input[@id= 'primaryPhone']");
	By commentsContactInfo = By.xpath("//textarea[@id= 'comments']");
	By successMsgContactInfo = By.xpath("//span[text()= 'Successfully added account contact!']");
	By contactInfoTextArea = By.xpath("(//div[text()= 'Contact Info']/following-sibling::div/div/div/div/div/div/div/div/div/div/table/tbody/tr/td)[2]");
	By editButtonContactInfo = By.xpath("//div[text()= 'Contact Info']/following-sibling::div/div/div/div/div/div/div/div/div/div/table/tbody/tr/td[5]/div/span[2]");
	By editSuccessMsgContactInfo = By.xpath("//span[text()= 'Successfully edited account contact']");
	By contactInfoContent = By.xpath("//div[text() = 'Contact Info']/following-sibling::div/div/div/div/div/div/div/div/div/div/table/tbody/tr");
	By deleteButtonContactInfo = By.xpath("//div[text() = 'Contact Info']/following-sibling::div/div/div/div/div/div/div/div/div/div/table/tbody/tr/td[5]/div/span[3]");
	By deleteCongMsgContactInfo = By.xpath("//div[text() = 'Are you sure you want to delete?']");
	By deleteSuccessMsgContactInfo = By.xpath("//span[text() = 'Successfully deleted account contact']");
	By pricingAttributesDropDown = By.xpath("//div[contains(text(), 'Pricing Attributes')]");
	By pricingProgramsDropDown = By.xpath("//div[contains(text(), 'Pricing Programs')]");
	By pricingAttributes = By.xpath("//div[contains(text(),'Pricing Attributes')]");
	By ecommerceField = By.xpath("//span[contains(text(),'Ecommerce')]");
//	By jobsNumbersDropdown = By.xpath("//input[@id='rc_select_2']");
//	By jobsNumbersDropdown = By.xpath("//li[@class='ant-pagination-options']");
	By jobsNumbersDropdown = By.xpath("//div[div[text() = 'Jobs']]/div/div/div/div/div/div/div/following-sibling::ul/li[contains(@class, 'ant-pagination-options')]/div/div");
	By select50 = By.xpath("//div[text()='50 / page']");
	By pricingAttributesEditButton = By.xpath("//div[text() = 'Pricing Attributes']/div/span");
	By pricingAttributesSelection = By.xpath("//label[text() = 'PO Required:']/following-sibling::label/span");
	By pricingAttributeSusscessMsg = By.xpath("//span[text() = 'Successfully updated pricing attributes!']");
	By customerProfileSuccessMsg = By.xpath("//span[text() = 'Customer profile update successful']");
	By jobNameValues = By.xpath("//td[@class='ant-table-column-has-actions ant-table-column-has-sorters ant-table-column-sort ant-table-row-cell-break-word']//span");
	By pagationitems = By.xpath("//li[contains(@class,'ant-pagination-item')]");
}

