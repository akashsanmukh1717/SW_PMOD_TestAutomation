package stepDefinations;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Accounts_Methods;
import pageObjects.Dashboard_Methods;
import utils.TestContextSetup;

public class Account_PCG_StrMgr_StepDefination {
	TestContextSetup testContextSetup;
	Accounts_Methods account;
	Dashboard_Methods dashboard;

	public Account_PCG_StrMgr_StepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.account=testContextSetup.pageObjectManager.getAccount();
		this.dashboard=testContextSetup.pageObjectManager.getDashboard();
	 }

	@Given("^PCG Store Manager is on dashboard page$")
	public void pcg_store_manager_is_on_dashboard_page() throws Throwable {
		dashboard.loginUser(5);
		Assert.assertTrue(dashboard.checkUserinOnDashboard(), "PCG Store Manager is not able to be on dashboard");
	}

	@When("^PCG Store Manager clicks on PCG Manager profile link$")
	public void pcg_store_manager_clicks_on_pcg_manager_profile_link() throws Throwable {
		dashboard.clickUserProfile();
	}
	@Given("^PCG Store Manager is able to change the role using (.+) (.+) (.+)$")
	public void pcg_store_manager_is_able_to_change_the_role_using(String divisionname, String role, String costcentercode) throws Throwable {
		dashboard.changeUserProfile(divisionname, role, costcentercode);
	}
	@When("^PCG Store Manager opens an (.+) using an account number$")
	public void pcg_store_manager_opens_an_using_an_account_number(String accountnumber) throws Throwable {
		account.selectAccoount(accountnumber);
	}
	@Then("^PCG Store Manager is able to view the customer's Sales Potential$")
	public void pcg_store_manager_is_able_to_view_the_customers_sales_potential() throws Throwable {
		Assert.assertTrue(account.salesPotential(), "Sales Potential details is not populated");
	}
	@Then("^PCG Store Manager is able to confirm all permissible data displays$")
	public void pcg_store_manager_is_able_to_confirm_all_permissible_data_displays() throws Throwable {
		account.verifyAccountSectionDropdowns();
		account.accountDetails();
	}
	@Then("^PCG Store Manager is able to view the customer's CAC Code$")
	public void pcg_store_manager_is_able_to_view_the_customers_cac_code() throws Throwable {
		Assert.assertTrue(account.checkCACcode(), "CAC Code details is not populated");
	}
	@Then("^PCG Store Manager is able to view account Comments$")
	public void pcg_store_manager_is_able_to_view_account_comments() throws Throwable {
		Assert.assertTrue(account.commentDetailsCheck(), "Account comments are not populated");
	}
	@Then("^PCG Store Manager is able to delete an account's Authorized Buyer$")
	public void pcg_store_manager_is_able_to_delete_an_accounts_authorized_buyer() throws Throwable {
		Assert.assertTrue(account.deleteAuth(), "Authorized Buyer is not deleted");
	}

	@Then("^PCG Store Manager is able to edit the CAC value using (.+) and (.+)$")
	public void pcg_store_manager_is_able_to_edit_the_cac_value_using_and(String cacGroup, String cacCode) throws Throwable {
		Assert.assertTrue(account.editCACCode(cacGroup,cacCode), "PCG Store Manager is not able to edit the customer's CAC Code");
	}

	@Then("PCG Store Manager is able to add account comments")
	public void pcg_store_manager_is_able_to_add_account_comments() throws Throwable{
		Assert.assertTrue(account.addAccountComments(),"PCG Store Manager is not able to add account comments");
	}

	@Then("PCG Store Manager is able to edit account comments")
	public void pcg_store_manager_is_able_to_edit_account_comments() throws Throwable{
		Assert.assertTrue(account.editAccountComments(), "PCG Store Manager is not able to edit account comments");
	}

	@Then("PCG Store Manager is able to edit an account's Contact Information")
	public void pcg_store_manager_is_able_to_edit_an_account_s_contact_information() throws Throwable{
		Assert.assertTrue(account.editContactInfo(), "PCG Store Manager is not able to edit an account's Contact Information");
	}

	@Then("^PCG Store Manager is able to add Contact Information to an account$")
	public void pcg_store_manager_is_able_to_add_contact_information_to_an_account() throws Throwable {
		Assert.assertTrue(account.addContactInfo(),"PCG Store Manager is not able to add an account's Contact Information\"");
	}

	@Then("^PCG Store Manager is to be able to sort the account's Jobs$")
	public void pcg_store_manager_is_to_be_able_to_sort_the_accounts_jobs() throws Throwable {
		Assert.assertTrue(account.jobsColumnSort(), "PCG Store Manager is not able to sort all columns as described");
	}

	@Then("^PCG Store Manager is able to edit the Customer sales potential and view the new value$")
	public void pcg_store_manager_is_able_to_edit_the_customer_sales_potential_and_view_the_new_value() throws Throwable {
		Assert.assertTrue(account.editCustomerSalesPotentials(), "Custmer Sales Potential is not updated");
	}

	@Then("^PCG Store Manager is able to view an account's Contact Information$")
	public void pcg_store_manager_is_able_to_view_an_accounts_contact_information() throws Throwable {
		Assert.assertTrue(account.contactInfoCheck(), "Contact Info details are not populated");
	}

	@Then("^PCG Store Manager is able to delete Contact Information to an account$")
	public void pcg_store_manager_is_able_to_delete_contact_information_to_an_account() throws Throwable {
		Assert.assertTrue(account.deleteContactInfo(), "Success message is not dispalyed");
	}
}
