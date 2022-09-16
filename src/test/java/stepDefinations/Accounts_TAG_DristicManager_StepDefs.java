package stepDefinations;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Accounts_Methods;
import pageObjects.Dashboard_Methods;
import utils.TestContextSetup;

public class Accounts_TAG_DristicManager_StepDefs {
	TestContextSetup testContextSetup;
	Accounts_Methods account;
	Dashboard_Methods dashboard;
	
	public Accounts_TAG_DristicManager_StepDefs(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.account=testContextSetup.pageObjectManager.getAccount();
		this.dashboard=testContextSetup.pageObjectManager.getDashboard();
	}
	
	@Given("TAG District Manager is on dashboard page")
	public void tag_district_manager_is_on_dashboard_page() throws IOException, InterruptedException {
		dashboard.loginUser(1);
		Assert.assertTrue(dashboard.checkUserinOnDashboard(), "User is not able to be on dashboard");
	}
	
	@When("TAG District Manager clicks on user profile link")
	public void tag_district_manager_clicks_on_user_profile_link() {
		dashboard.clickUserProfile();
	}
	
	@Given("^TAG District Manager is able to change the role using (.+) (.+)$")
	public void tag_district_manager_is_able_to_change_the_role_using(String divisionname, String role) throws InterruptedException {
		dashboard.changeUserProfile(divisionname, role, null);
	}
	
	@When("^TAG District Manager opens an (.+) using an account number$")
	public void tag_district_manager_opens_an_using_an_account_number(String accountNumber) {
	    account.selectAccoount(accountNumber);
	}
	
	@Then("Under Account Summary section, TAG District Manager is able to view the listed Sales Potential")
	public void under_account_summary_section_tag_district_manager_is_able_to_view_the_listed_sales_potential() {
		Assert.assertTrue(account.salesPotential(), "User is not able to see the Sales Potential");
	}
	
	@Then("Verify the Job Info section populates and is viewable")
	public void verify_the_job_info_section_populates_and_is_viewable() {
		Assert.assertTrue(account.accountsJobInfomationCheck(), "Accounts job information is not viewable");
	}
	
	@Then("Verify the Comments section populates and is viewable")
	public void verify_the_comments_section_populates_and_is_viewable() {
		Assert.assertTrue(account.commentDetailsCheck(), "Comment Details are not populated");
	}
	
	@Then("TAG District Manager is on account details page")
	public void tag_district_manager_is_on_account_details_page() {
		Assert.assertTrue(account.checkUserinOnAccountDetailsPage(), "User is not on Account details page");
	}
	
	@Then("Under Account Summary section, TAG District Manager is able to view the listed CAC Code")
	public void under_account_summary_section_tag_district_manager_is_able_to_view_the_listed_cac_code() {
	    account.checkCACcode();
	}
	
	@Then("^Verify the Authorized Buyers section populates and is viewable$")
    public void verify_the_authorized_buyers_section_populates_and_is_viewable() throws Throwable {
        Assert.assertTrue(account.authorizedBuyersCheck(), "Authorized Buyer details are not populated");
    }
	
     @Then("^Verify the Pricing Detail for a Job from the Account Maintenance Screen$")
        public void veify_the_pricing_detail_for_a_job_from_the_account_maintenance_screen() throws Throwable {
        Assert.assertTrue(account.pricingDeatilsFromJob(), "not able to see pricing details");
    }

	@Then("^Verify account's Demographic Information populate and viewable$")
	public void verify_accounts_demographic_information_populate_and_viewable() throws Throwable {
		Assert.assertTrue(account.demographicsCheck(), "not able to see pricing details");

	}

	@Then("TAG District manager Can sort all columns as described")
	public void tag_district_manager_can_sort_all_columns_as_described() {
		Assert.assertTrue(account.jobsColumnSort(), "TAG District manager Can not sort all columns as described");
	}

	@Then("TAG District Manager can see the current Pricing Attributes information in the Pricing Attributes section")
	public void tag_district_manager_can_see_the_current_pricing_attributes_information_in_the_pricing_attributes_section() {
		Assert.assertTrue(account.pricingAttributesCheck(), "TAG District Manager can not see the current Pricing Attributes information in the Pricing Attributes section");
	}
}
