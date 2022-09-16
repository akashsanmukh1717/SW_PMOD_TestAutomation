package stepDefinations;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Accounts_Methods;
import pageObjects.Dashboard_Methods;
import utils.TestContextSetup;

public class Accounts_TAG_StoreMgr_StepDefinition {

	TestContextSetup testContextSetup;
	Accounts_Methods account;
	Dashboard_Methods dashboard;

	public Accounts_TAG_StoreMgr_StepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.account = testContextSetup.pageObjectManager.getAccount();
		this.dashboard=testContextSetup.pageObjectManager.getDashboard();

	}

	@Given("TAGStoreManager is on dashboard page")
	public void TAGStoreManager_is_on_dashboard_page() throws IOException, InterruptedException {
		dashboard.loginUser(2);
		Assert.assertTrue(dashboard.checkUserinOnDashboard(), "User is not navigated to dashboard");
	}

	@When("^TAGStoreManager opens an (.+) using an account number$")
	public void TAGStoreManager_opens_an_account_using_an_anountNumber(String accountNumber) {
		account.selectAccoount(accountNumber);
	}

	@Given("^TAGStoreManager is able to change the role using (.+) (.+) (.+)$")
	public void TAGStoreManager_is_able_to_change_the_role_using(String divisionname, String role,
			String costcentercode) throws InterruptedException {
		dashboard.changeUserProfile(divisionname, role, costcentercode);
	}

	@When("^TAGStoreManager clicks on user profile link$")
	public void TAGStoreManager_clicks_on_user_profile_link() throws Throwable {
		dashboard.clickUserProfile();
	}

	@Then("^TAGStoreManager is on account details page$")
	public void TAGStoreManager_is_on_account_details_page() throws Throwable {
		Assert.assertTrue(account.checkUserinOnAccountDetailsPage(), "User is not navigated to account page");
	}

	@Then("^TAGStoreManager is able to view account Comments$")
	public void TAGStoreManager_is_able_to_view_account_comments() throws Throwable {
		Assert.assertTrue(account.commentDetailsCheck(), "Comment details are not populated");
	}

	@Then("^TAGStoreManager is able to view an account's Authorized Buyers$")
	public void TAGStoreManager_is_able_to_view_an_accounts_authorized_buyers() throws Throwable {
		Assert.assertTrue(account.authorizedBuyersCheck(), "Authorized Buyer details are not populated");
	}

	@Then("^TAGStoreManager is able to view an account's Contact Information$")
	public void TAGStoreManager_is_able_to_view_an_accounts_contact_information() throws Throwable {
		Assert.assertTrue(account.contactInfoCheck(), "Contact Info details are not populated");
	}

	@Then("^TAGStoreManager is able to view account's Demographic Information$")
	public void TAGStoreManager_is_able_to_view_accounts_demographic_information() throws Throwable {
		Assert.assertTrue(account.demographicsCheck(), "Demographics details are not populated");
	}

	@When("^TAGStoreManager opens an (.+) using an account name$")
	public void TAGStoreManager_opens_an_account_using_an_anountName(String accountName) {
		account.selectAccoount(accountName);
	}

	@Then("TAGStoreManager is able to edit the Customer sales potential and view the new value")
	public void tag_store_manager_is_able_to_edit_the_customer_sales_potential_and_view_the_new_value() {
		Assert.assertTrue(account.editCustomerSalesPotentials(), "Custmer Sales Potential is not updated");
	}

	@Then("^TAGStoreManager is able to edit the CAC value using (.+) and (.+)$")
	public void tagstoremanager_is_able_to_edit_the_cac_value_using_and(String cacgroup, String caccode)
			throws Throwable {
		Assert.assertTrue(account.editCACCodeStrMngr(cacgroup, caccode), "CACCod is not updated");
	}

	@Then("^TAGStoreManager is able to add account comments$")
	public void tagstoremanager_is_able_to_add_account_comments() throws Throwable {
		Assert.assertTrue(account.addAccountComments(), "Account comments is not added");
	}

	@Then("^TAGStoreManager is able to edit account comments$")
	public void tagstoremanager_is_able_to_edit_account_comments() throws Throwable {
		Assert.assertTrue(account.editAccountComments(), "Account comments not updated");
	}
	@Then("^TAGStoreManager is able to view the customer's CAC Code$")
    public void tagstoremanager_is_able_to_view_the_customers_cac_code() throws Throwable {
		Assert.assertTrue(account.checkCACcode(), "Account CAC code is not populated");
    }
	@Then("^TAGStoreManager is able to delete an account's Authorized Buyer$")
    public void tagstoremanager_is_able_to_delete_an_accounts_authorized_buyer() throws Throwable {
		Assert.assertTrue(account.deleteAuth(), "Success message is not dispalyed");
    }
	@Then("^TAGStoreManager is able to add Contact Information to an account$")
    public void tagstoremanager_is_able_to_add_contact_information_to_an_account() throws Throwable {
		Assert.assertTrue(account.addContactInfo(), "Success message is not dispalyed");
    }

	@Then("^TAGStoreManager is able to edit Contact Information to an account$")
	public void tagstoremanager_is_able_to_edit_contact_information_to_an_account() throws Throwable {
		Assert.assertTrue(account.editContactInfo(), "Success message is not dispalyed");
	}

	@Then("^TAGStoreManager is able to delete Contact Information to an account$")
	public void tagstoremanager_is_able_to_delete_contact_information_to_an_account() throws Throwable {
		Assert.assertTrue(account.deleteContactInfo(), "Success message is not dispalyed");
	}

	@Then("^TAGStoreManager able to Verify the Pricing Detail for a Job from the Account Maintenance Screen$")
	public void tagstoremanager_able_to_verify_the_pricing_detail_for_a_job_from_the_account_maintenance_screen() throws Throwable {
		Assert.assertTrue(account.pricingDeatilsFromJob(), "Pricing details page is not loaded");
	}
	@Then("^TAGStoreManager is able to confirm all permissible data displays$")
	public void tagstoremanager_is_able_to_confirm_all_permissible_data_displays() throws Throwable {
		Assert.assertTrue(account.accountDetails(), "Account details is not populated");
		account.verifyAccountSectionDropdowns();
	}

	@Then("^TAGStoreManager is able to view the customer's Sales Potential$")
	public void tagstoremanager_is_able_to_view_the_customers_sales_potential() throws Throwable {
		Assert.assertTrue(account.salesPotential(), "Sales Potentials details are not populated");
	}
	@Then("^TAGStoreManager is able to add the new authorized buyer to account$")
	public void tagstoremanager_is_able_to_add_the_new_authorized_buyer_to_account() throws Throwable {
		Assert.assertTrue(account.addNewAuthBuyerSP(), "Success message is not dispalyed");
	}

	@Then("^TAGStoreManager is able to edit the authorized buyer to account$")
	public void tagstoremanager_is_able_to_edit_the_authorized_buyer_to_account() throws Throwable {
		Assert.assertTrue(account.editAuthBuyer(), "Success message is not dispalyed");
	}
	@Then("^TAGStoreManager is able to edit an account's Pricing Attributes$")
	public void tagstoremanager_is_able_to_edit_an_accounts_pricing_attributes() throws Throwable {
		Assert.assertTrue(account.editPricingAttribute(), "Success message is not dispalyed");
	}

	@Then("^TAGStoreManager is to be able to view an account's Pricing Attributes$")
	public void tagstoremanager_is_to_be_able_to_view_an_accounts_pricing_attributes() throws Throwable {
		Assert.assertTrue(account.pricingAttributesCheck(),"Pricing Attributes are not displayed");
	}

	@Then("^TAGStoreManager Can sort all columns as described$")
	public void tagstoremanager_can_sort_all_columns_as_described() {
		Assert.assertTrue(account.jobsColumnSort(), "TAGStoreManager Can not sort all columns as described");

	}
}
