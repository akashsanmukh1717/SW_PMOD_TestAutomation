package stepDefinations;

import org.testng.Assert;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Accounts_Methods;
import pageObjects.Dashboard_Methods;
import utils.TestContextSetup;

public class Account_PCG_Associate_StepDefinition {
	TestContextSetup testContextSetup;
	Accounts_Methods account;
    Dashboard_Methods dashboard;
	
	public Account_PCG_Associate_StepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
		this.account= testContextSetup.pageObjectManager.getAccount();
        this.dashboard=testContextSetup.pageObjectManager.getDashboard();
		
	}
	
	@Given("^PCG Associate is on dashboard page$")
    public void pcg_associate_is_on_dashboard_page() throws Throwable {
       dashboard.loginUser(4);
       Assert.assertTrue(dashboard.checkUserinOnDashboard(), "PCG Associate is not able to be on dashboard");
    }

    @When("^PCG Associate clicks on PCG Associate profile link$")
    public void pcg_associate_clicks_on_pcg_associate_profile_link() throws Throwable {
       dashboard.clickUserProfile();
    }
    
    @Given("^PCG Associate is able to change the role using (.+) (.+)$")
    public void pcg_associate_is_able_to_change_the_role_using(String divisionname, String role) throws Throwable {
        dashboard.changeUserProfile(divisionname, role, null);
    }

    @When("^PCG Associate opens an (.+) usnig an account number$")
    public void pcg_associate_opens_an_usnig_an_account_number(String accountnumber) throws Throwable {
    	account.selectAccoount(accountnumber);
    }
    
    @When("^PCG Associate opens an (.+) usnig an account name$")
    public void pcg_associate_opens_an_usnig_an_account_name(String accountname) throws Throwable {
        account.selectAccoountName(accountname);
    }

    @Then("^PCG Associate is able to see the account summary$")
    public void pcg_associate_is_able_to_see_the_account_summary() throws Throwable {
    	 Assert.assertTrue(account.accountDetails(), "Account details is not populated");
    }
    @Then("^PCG Associate is able to able to view account Comments$")
    public void pcg_associate_is_able_to_able_to_view_account_comments() throws Throwable {
        Assert.assertTrue(account.commentDetailsCheck(), "Comment details is not populated");
    }
    @Then("^PCG Associate is able to able to view an account's Authorized Buyers$")
    public void pcg_associate_is_able_to_able_to_view_an_accounts_authorized_buyers() throws Throwable {
        Assert.assertTrue(account.authorizedBuyersCheck(), "Authorized Buyer details is not populated");
    }
    @Then("^PCG Associate is able to able to view an account's Contact Information$")
    public void pcg_associate_is_able_to_able_to_view_an_accounts_contact_information() throws Throwable {
        Assert.assertTrue(account.contactInfoCheck(), "Contact Info details is not populated");
    }

    @Then("PCG Associate is able to able to add an Authorized Buyer to an account")
    public void pcg_associate_is_able_to_able_to_add_an_authorized_buyer_to_an_account() throws Throwable {
        Assert.assertTrue(account.addNewAuthBuyerSP(), "PCG Associate is not able to able to add an Authorized Buyer to an account");
    }

    @Then("PCG Associate is able to able to edit an account's Authorized Buyers")
    public void pcg_associate_is_able_to_able_to_edit_an_account_s_authorized_buyers() throws Throwable {
        Assert.assertTrue(account.editAuthBuyer(), "PCG Associate is not able to able to edit an account's Authorized Buyers");
    }

    @Then("^PCG Associate is able to view an account's Job Information$")
    public void pcg_associate_is_able_to_view_an_accounts_job_information() throws Throwable {
        Assert.assertTrue(account.accountsJobInfomationCheck(),"PCG Associate is not able to view job information");
    }

    @Then("^PCG Associate is confirm the customer's Jobs are viewable in the Jobs Field$")
    public void pcg_associate_is_confirm_the_customers_jobs_are_viewable_in_the_jobs_field() throws Throwable {
        Assert.assertTrue(account.jobsColumnSort(), "PCG Associate is not able to sort all columns as described");
    }

    @Then("^PCG Associate is to be able to confirm all permissible data displays$")
    public void pcg_associate_is_to_be_able_to_confirm_all_permissible_data_displays() throws Throwable {
        account.verifyAccountSectionDropdowns();
        account.accountDetails();
    }
	 

}
