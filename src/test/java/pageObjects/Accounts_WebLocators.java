package pageObjects;
//package pageObjects;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class Accounts_Locators {
//	WebDriver driver;
//	
//	public Accounts_Locators(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
//	
//	@FindBy(xpath = "//a[@href='/account']")
//	WebElement accountTabLocator;
//	
//	@FindBy(xpath = "//input[@id='rc_select_0']")
//	WebElement accountSearchField;
//	
//	@FindBy(className = "ant-select-item-option-content")
//	WebElement selectAccount;
//	
////	@FindBy(xpath = "//div[contains(text(),'Account Summary')]/..//div[@class='ant-descriptions-item-container']/span")
////	WebElement accountSummaryDetails;
//	
//	@FindBy(xpath = "//span[contains(text(),'Sales Potential')]/../span[@class='ant-descriptions-item-content']//div//div")
//	WebElement salesPotentialValue;
//	
//	@FindBy(xpath = "//span[text()='CAC']/../span[@class='ant-descriptions-item-content']")
//	WebElement cacCodeLocator;
//	
//	@FindBy(className = "m-0")
//	WebElement commentsLocator;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Account Comments')]")
//	WebElement accountCommentsDropDown;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Contact Info')]")
//	WebElement contactInfoDropDown;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Contact Info')]/../div[@class='ant-collapse-content']")
//	WebElement contactContent;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Authorized Buyers')]")
//	WebElement authorizedBuyersDropDown;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Authorized Buyers')]/../div[@class='ant-collapse-content']")
//	WebElement authorizedBuyersContent;
//	
//	By usernameLocator = By.xpath("//input[@type = 'email']");
//	
//	By passwordLocator = By.name("passwd");
//	
//	By nextLocatorMFA = By.xpath("//input[@type='submit']");
//	
//	By signInLocatorMFA = By.xpath("//input[@id='idSIButton9']");
//	
//	By accountSummaryDetails = By.xpath("//div[contains(text(),'Account Summary')]/..//div[@class='ant-descriptions-item-container']/span");
//	
//	By userProfileLink = By.xpath("//a[@href = '/dashboard']/following-sibling::div/span[contains(text(), 'Hi')]");
//
//	By changeDivisionDropDown = By.xpath("//input[@id = 'division']");
//	
//	By divisionSelectionxpath = By.xpath("//div[@class = 'ant-select-item-option-content' and text() = 'The Americas Group']");
//	
//	By changeRoleDropDown = By.xpath("//input[@id = 'role']");
//	
//	By roleSelectionXpath = By.xpath("//div[@class = 'ant-select-item-option-content' and text() = 'CPMMaint_Store_Manager_Group']");
//	
//	By costCenterClick = By.xpath("//input[@id ='costCenter']");
//	
//	By storeSelection = By.xpath("//div[@class = 'ant-select-item-option-content' and text () = '701104']");
//	
//	By selectSubmitButton = By.xpath("//span[text() = 'Submit']");
//	
//	By clickonOK = By.xpath("//span[text () = 'OK']");
//	
//	By successMsg = By.xpath("//span[text() = 'Successfully updated permissions']");
//	
//	By jobsDropDown = By.xpath("//div[contains(text(), 'Jobs')]");
//	
//	By demographicsDetails = By.xpath("//div[contains(text(), 'Demographics')]/..//span[@class='ant-descriptions-item-label']");
//	
//	By accountSize = By.xpath("//div[text() = 'Demographics']/following-sibling::div/div/div/div/div/table/tbody/tr/td");
//
//	By demographicsDropDown = By.xpath("//div[contains(text(), 'Demographics')]");
//}
