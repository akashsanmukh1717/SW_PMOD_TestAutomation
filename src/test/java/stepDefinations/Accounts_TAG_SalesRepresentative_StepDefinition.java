package stepDefinations;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Accounts_Methods;
import pageObjects.Dashboard_Methods;
import utils.TestContextSetup;

public class Accounts_TAG_SalesRepresentative_StepDefinition {
	TestContextSetup testContextSetup;
	Accounts_Methods account;
	Dashboard_Methods dashboard;

	public Accounts_TAG_SalesRepresentative_StepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.account = testContextSetup.pageObjectManager.getAccount();
		this.dashboard=testContextSetup.pageObjectManager.getDashboard();
	}

	@Given("TAG Sales Representative is on dashboard page")
	public void tag_sales_representative_is_on_dashboard_page() throws IOException, InterruptedException {
		dashboard.loginUser(4);
		Assert.assertTrue(dashboard.checkUserinOnDashboard(), "User is not able to be on dashboard");
	}

	@When("^TAG Sales Representative opens an (.+) using an account number$")
	public void tag_sales_representative_opens_an_using_an_account_number(String accountNumber) {
		account.selectAccoount(accountNumber);
	}

	@Given("^TAG Sales Representative is able to change the role using (.+) (.+) (.+)$")
	public void user_is_able_to_change_the_role_using(String divisionname, String role, String costcentercode)
			throws Throwable {
		dashboard.changeUserProfile(divisionname, role, costcentercode);
	}

	@When("^TAG Sales Representative clicks on TAG Sales Representative profile link$")
	public void user_clicks_on_user_profile_link() throws Throwable {
		dashboard.clickUserProfile();
	}

	@Then("^TAG Sales Representative is on account details page$")
	public void user_is_on_account_details_page() throws Throwable {
		Assert.assertTrue(account.checkUserinOnAccountDetailsPage(),
				"TAG Sales Representative is not navigated to account page");
	}

	@Then("^TAG Sales Representative is able to view account Comments$")
	public void user_is_able_to_view_account_comments() throws Throwable {
		Assert.assertTrue(account.commentDetailsCheck(), "Comment details are not populated");
	}

	@Then("^TAG Sales Representative is able to view an account's Authorized Buyers$")
	public void user_is_able_to_view_an_accounts_authorized_buyers() throws Throwable {
		Assert.assertTrue(account.authorizedBuyersCheck(), "Authorized Buyer details are not populated");
	}

	@Then("^TAG Sales Representative is able to view an account's customer CAC code$")
	public void user_is_able_to_view_an_accounts_customer_cac_code() throws Throwable {
		Assert.assertTrue(account.checkCACcode(), "CAC Code details are not populated");
	}

	@Then("^TAG Sales Representative is able to view the customer's Sales Potential$")
	public void user_is_able_to_view_the_customers_sales_potential() throws Throwable {
		Assert.assertTrue(account.salesPotential(), "Sales Potentials details are not populated");
	}

	@When("^TAG Sales Representative opens an (.+) using an account name$")
	public void tag_sales_representative_opens_an_using_an_account_name(String accountname) throws Throwable {
		account.selectAccoountName(accountname);
	}

	@Then("^TAG Sales Representative is able to add account Comments$")
	public void tag_sales_representative_is_able_to_add_account_comments() throws Throwable {
		Assert.assertTrue(account.addAccountComments(), "Added comments are not populated");
	}

	@Then("^TAG Sales Representative is able to edit account Comments$")
	public void tag_sales_representative_is_able_to_edit_account_comments() throws Throwable {
		Assert.assertTrue(account.editAccountComments(), "Edited comments are not populated");
	}

	@Then("^TAG Sales Representative is able to edit the customer's Sales Potential$")
	public void tag_sales_representative_is_able_to_edit_the_customers_sales_potential() throws Throwable {
		Assert.assertTrue(account.editCustomerSalesPotentials(), "Success message is not dispalyed");
	}

	@Then("^TAG Sales Representative is able to edit the CAC value using (.+) and (.+)$")
	public void tag_sales_representative_is_able_to_edit_the_cac_value_using_and(String cacgroup, String caccode)
			throws Throwable {
		Assert.assertTrue(account.editCACCode(cacgroup, caccode), "Success message is not dispalyed");
	}

	@Then("^TAG Sales Representative is able to add the new authorized buyer to account$")
	public void tag_sales_representative_is_able_to_add_the_new_authorized_buyer_to_account() throws Throwable {
		Assert.assertTrue(account.addNewAuthBuyerSP(), "Success message is not dispalyed");
	}
	@Then("^TAG Sales Representative is able to edit the authorized buyer to account$")
    public void tag_sales_representative_is_able_to_edit_the_authorized_buyer_to_account() throws Throwable {
		Assert.assertTrue(account.editAuthBuyer(), "Success message is not dispalyed");
    }
//	@Then("^TAG Sales Representative is able to delete an account's Authorized Buyer$")
//    public void tag_sales_representative_is_able_to_delete_an_accounts_authorized_buyer() throws Throwable {
//		Assert.assertTrue(account.deleteAuth(), "Success message is not dispalyed");
//    }
	
	@Then("^TAG Sales Representative is able to add Contact Information to an account$")
    public void tag_sales_representative_is_able_to_add_contact_information_to_an_account() throws Throwable {
		Assert.assertTrue(account.addContactInfo(), "Success message is not dispalyed");
    }
	@Then("^TAG Sales Representative is able to edit Contact Information to an account$")
    public void tag_sales_representative_is_able_to_edit_contact_information_to_an_account() throws Throwable {
		Assert.assertTrue(account.editContactInfo(), "Success message is not dispalyed");
    }
	@Then("^TAG Sales Representative is able to delete Contact Information to an account$")
    public void tag_sales_representative_is_able_to_delete_contact_information_to_an_account() throws Throwable {
		Assert.assertTrue(account.deleteContactInfo(), "Success message is not dispalyed");
    }
	 @Then("^TAG Sales Representative is able to view the Pricing Detail for a Job from the Account Maintenance Screen$")
	    public void tag_sales_representative_is_able_to_view_the_pricing_detail_for_a_job_from_the_account_maintenance_screen() throws Throwable {
		 Assert.assertTrue(account.pricingDeatilsFromJob(), "Pricing Details are not populated");
	    }

	@Then("TAG Sales Representative is able to sort the account's Jobs")
	public void tag_sales_representative_is_able_to_sort_the_account_s_jobs() {
		Assert.assertTrue(account.jobsColumnSort(),"TAG Sales Representative is not able to sort the account's Jobs");
	}

}
