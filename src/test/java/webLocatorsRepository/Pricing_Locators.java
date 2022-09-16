package webLocatorsRepository;

import org.openqa.selenium.By;

public interface Pricing_Locators {
	By pricingTab = By.xpath("//span[text()='Pricing']");
	By pricingMaintenance = By.xpath("//a[@href='/pricing']");
	By pricingSearchFieldAccount = By.xpath("//input[@id='rc_select_0']");
	By pricingAccountSelectionXpath = By.xpath("//div[@class = 'ant-select-item-option-content']");
	By pricingJobSearch = By.xpath("(//span[@class ='ant-select-selection-item'])[1]");
	By pricingJobStrMngrJobValue = By.xpath("(//div[@class = 'ant-select-item-option-content' and text() = '10 - GENEVA LODGE'])");
	By pricingRadioButtonXpath = By.xpath("//button[@role='switch']");
	By pricingCategoryXpath = By.xpath("//div[label[text()='Category:']]/following-sibling::div/div/div/div/div/div/span/span/input");
	By pricingShowResults = By.xpath("//span[text()='Show Results']");
	By pricingCategoryTable = By.xpath("(//table[@class = 'ant-table-fixed'])[1]");
	By sizeCodeVerification = By.xpath("//td[text()='14']");
	By priceVerification = By.xpath("(//tbody[@class= 'ant-table-tbody']/tr/td)[8]/div/span");
	By productGroupSearchInput = By.xpath("//div[label[text()= 'Product Group:']]/following-sibling::div/div/div/div/div/div/div/div/div/div/input");
	By productGroupSearchClick= By.xpath("//div[label[text()= 'Product Group:']]/following-sibling::div/div/div/div/div/div/div/div");
	By productGroupValue = By.xpath("//div[text() = '110055 - PRO INDUSTRIAL COATINGS']");

	By pricingSalesNumberxpathInput = By.xpath("//div[label[text() = 'Sales Number:']]/following-sibling::div/div/div/div/div/div/div/div/div/div/input");
	By pricingSalesNumberSearchClick = By.xpath("//div[label[text() = 'Sales Number:']]/following-sibling::div/div/div/div/div/div/div/div");
	By pricingClearSearchButton = By.xpath("//span[text()= 'Clear Search']");
	By pricingProductFamilySearchInput = By.xpath("//div[label[text() = 'Product Family:']]/following-sibling::div/div/div/div/div/div/div/div/div/div/input");
	By pricingProductFamilySearchClick = By.xpath("//div[label[text() = 'Product Family:']]/following-sibling::div/div/div/div/div/div/div/div");
	By noDataxSearchTabXpath = By.xpath("(//p[text()='No Data'])[1]");
	By viewEditTable = By.xpath("//div[@class = 'ant-card-body']");
	By checkBoxSizeCode16 = By.xpath("(//tr[td[text() = '16']]/td/div/label/span)[1]");
	By checkBoxSizecode20 = By.xpath("(//tr[td[text() = '20']]/td/div/label/span)[1]");
	By viewEditButton = By.xpath("//span[contains(text(),'View/Edit')]");
	By priceUpdateValidationPage = By.xpath("//div[text() = 'Please review before submitting the request']");
	By editExceptionButton = By.xpath("//span[text() = 'Edit Exceptions']");
	By updateReasonTextArea = By.xpath("//textarea[@id='updateReason']");
	By nextButtonClick = By.xpath("//span[text()= 'Next']");
	By successMsgExceptionPrice = By.xpath("//span[text() = 'Successfully submitted price proposal!']");
	By expirationDateInputBox = By.xpath("//div[label[text() = 'Expiration Date:']]/following-sibling::div/div/div/span/div");
	By nextExpirationDate = By.xpath("//td[contains(@class, 'ant-calendar-today')]/following-sibling::td/div");
	By pricingProductNumberInput = By.xpath("//div[label[text()='Product Number:']]/following-sibling::div/div/div/div/div/div/div/div/div/div/input");
	By pricingProductNumberSearchClick = By.xpath("//div[label[text() = 'Product Number:']]/following-sibling::div/div/div/div/div/div/div/div/div");

}
