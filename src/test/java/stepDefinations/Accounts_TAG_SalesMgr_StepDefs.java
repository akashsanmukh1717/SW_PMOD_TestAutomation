package stepDefinations;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Accounts_Methods;
import pageObjects.Dashboard_Methods;
import utils.TestContextSetup;

public class Accounts_TAG_SalesMgr_StepDefs {
	TestContextSetup testContextSetup;
	Accounts_Methods account;
	Dashboard_Methods dashboard;

	public Accounts_TAG_SalesMgr_StepDefs(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.account = testContextSetup.pageObjectManager.getAccount();
		this.dashboard=testContextSetup.pageObjectManager.getDashboard();
	}
	@Given("TAG Sales manager is on dashboard page")
	public void tag_sales_manager_is_on_dashboard_page() throws IOException, InterruptedException {
		dashboard.loginUser(1);
        Assert.assertTrue(dashboard.checkUserinOnDashboard(), "User is not navigated to dashboard");
	}
	@When("TAG Sales manager clicks on TAG Sales manager profile link")
	public void tag_sales_manager_clicks_on_Sales_manager_profile_link() {
		dashboard.clickUserProfile();
	}
	@Given("^TAG Sales manager is able to change the role using (.+) (.+)$")
	public void tag_sales_manager_is_able_to_change_the_role_using_the_americas_group_cpm_maint_store_manager_group(String divisionname, String role) throws InterruptedException {
		dashboard.changeUserProfile(divisionname, role,null);
	}
	@When("^TAG Sales manager opens an (.+) using an account number$")
	public void tag_sales_manager_opens_an_using_an_account_number(String accountNumber) {
		account.selectAccoount(accountNumber);
	}
	@Then("TAG Sales manager is on account details page")
	public void tag_sales_manager_is_on_account_details_page() {
		Assert.assertTrue(account.checkUserinOnAccountDetailsPage(), "TAG Sales manager is not navigated to account page");
	}
	
	@Then("TAG Sales manager is able to view an account's Authorized Buyers")
	public void tag_sales_manager_is_able_to_view_an_account_s_authorized_buyers() {
	    Assert.assertTrue(account.authorizedBuyersCheck(), "TAG Sales manager is not able to view authorized Buyers");
	}
	
	@Then("TAG Sales manager is moved from the Account tab to the Pricing tab")
	public void tag_sales_manager_is_moved_from_the_account_tab_to_the_pricing_tab() {
	    Assert.assertTrue(account.pricingDeatilsFromJob(),"TAG Sales manager is not moved to the Pricing tab");
	}
	
	@Then("TAG Sales manager Can sort all columns as described")
	public void tag_sales_manager_can_sort_all_columns_as_described() {
		Assert.assertTrue(account.jobsColumnSort(), "TAG Sales manager Can not sort all columns as described");
	}

	//Sprint_5
	@When("^TAG Sales manager opens an (.+) using an account name$")
	public void tag_sales_manager_opens_an_using_an_account_name(String accountname)
	{
		account.selectAccoountName(accountname);
	}
	
}
