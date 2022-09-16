package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	Accounts_Methods account;
	Pricing_Methods pricing;
	Dashboard_Methods dashboard;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public Accounts_Methods getAccount() {

		Accounts_Methods account = new Accounts_Methods(driver);
		return account;
	}

	public Pricing_Methods getPricing() {

		Pricing_Methods pricing = new Pricing_Methods(driver);
		return pricing;
	}

	public Dashboard_Methods getDashboard() {
		Dashboard_Methods dashboard = new Dashboard_Methods(driver);
		return dashboard;
	}
}
