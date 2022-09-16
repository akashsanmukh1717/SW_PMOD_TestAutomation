package stepDefinations;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Accounts_Methods;
import pageObjects.Dashboard_Methods;
import utils.TestContextSetup;

public class Accounts_TAG_Asso_StepDefinition {

	TestContextSetup testContextSetup;
	Accounts_Methods account;
	Dashboard_Methods dashboard;

	public Accounts_TAG_Asso_StepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.account=testContextSetup.pageObjectManager.getAccount();
		this.dashboard=testContextSetup.pageObjectManager.getDashboard();
	}
	
	@Given("TAG Associate is on dashboard page")
	public void user_is_on_dashboard_page() throws InterruptedException, IOException {
    dashboard.loginUser(4);
    Assert.assertTrue(dashboard.checkUserinOnDashboard(), "TAG Associate is not able to be on dashboard");
	}	
	@Given("^TAG Associate is able to change the role using (.+) (.+)$")
	public void user_is_able_to_change_the_role_using(String divisionname, String role)
			throws Throwable {
		dashboard.changeUserProfile(divisionname, role, null);
	}
	@When("^TAG Associate clicks on TAG Associate profile link$")
	public void user_clicks_on_user_profile_link() throws Throwable {
		dashboard.clickUserProfile();
	}
	@When("TAG Associate opens an (.+) usnig an account number$")
	public void user_opens_an_usnig_an_account_number(String accountNumber) {
		account.selectAccoount(accountNumber);
	}
	@When("TAG Associate opens an (.+) usnig an account name$")
	public void user_opens_an_usnig_an_account_name(String accountName) {
		account.selectAccoount(accountName);
    }
	@Then("^TAG Associate is on account details page$")
	public void user_is_on_account_details_page() throws Throwable {
		Assert.assertTrue(account.checkUserinOnAccountDetailsPage(), "TAG Associate is not navigated to account page");
	}
	@Then("TAG Associate is able to see the account summary")
	public void user_is_able_to_see_the_account_summary() throws InterruptedException {
		Assert.assertTrue(account.accountDetails(), "Account details is not populated");
	}
	@Then("TAG Associate is able to see the account comments")
	public void tag_associate_is_able_to_see_the_account_comments() {
		Assert.assertTrue(account.commentDetailsCheck(),"Comment details are not populated");
	}
	@Then("TAG Associate is able to see the authorised buyers")
    public void user_is_able_to_see_the_authorised_buyers() throws Throwable {
		Assert.assertTrue(account.authorizedBuyersCheck(), "Authorized Buyer details are not populated");
    }
	@Then("TAG Associate is able to see the account contact information")
	public void user_is_able_to_see_the_account_contact_information() throws Throwable {
		Assert.assertTrue(account.contactInfoCheck(), "Contact Info details are not populated");
	}
	@Then("TAG Associate is able to see the accounts job information")
    public void user_is_able_to_see_the_accounts_job_information() throws Throwable {
		Assert.assertTrue(account.accountsJobInfomationCheck(), "Job Information details not pupulated");
    }

	@Then("TAG Associate is able to confirm all permissible data displays")
	public void tag_associate_is_able_to_confirm_all_permissible_data_displays() throws InterruptedException {
		Assert.assertTrue(account.accountDetails(), "Account details is not populated");
		Assert.assertTrue(account.authorizedBuyersCheck(), "Authorized Buyer details are not populated");
		Assert.assertTrue(account.contactInfoCheck(), "Contact Info details are not populated");
		Assert.assertTrue(account.commentDetailsCheck(), "Comment Details are not populated");
	}

	@Then("TAG Associate is able verify jobs are viewable")
	public void tag_associate_is_able_verify_jobs_are_viewable() {
		Assert.assertTrue(account.jobsColumnSort(), "TAG District manager Can not sort all columns as described");
	}

}
