package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.Accounts_Methods;
import pageObjects.Dashboard_Methods;
import utils.TestContextSetup;

public class Pricing_PCG_Associate_StepDefinition {

    TestContextSetup testContextSetup;
    Accounts_Methods account;
    Dashboard_Methods dashboard;

    public Pricing_PCG_Associate_StepDefinition(TestContextSetup testContextSetup)
    {
        this.testContextSetup = testContextSetup;
        this.account= testContextSetup.pageObjectManager.getAccount();
        this.dashboard=testContextSetup.pageObjectManager.getDashboard();

    }

    @Then("^PCG Associate is able to see the account summary on the pricing tab header$")
    public void pcg_associate_is_able_to_see_the_account_summary_on_the_pricing_tab_header() throws Throwable {

    }


}
