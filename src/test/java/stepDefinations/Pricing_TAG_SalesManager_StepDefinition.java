package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.Pricing_Methods;
import utils.TestContextSetup;

public class Pricing_TAG_SalesManager_StepDefinition {

    TestContextSetup testContextSetup;
    Pricing_Methods pricing;

    public Pricing_TAG_SalesManager_StepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.pricing = testContextSetup.pageObjectManager.getPricing();
    }

    @When("^TAGSalesManager opens an (.+) using an pricing account number$")
    public void tagsalesmanager_opens_an_using_an_pricing_account_number(String accountnumber) throws Throwable {
        pricing.selectAccoount(accountnumber);
    }

    @And("^TAGSalesManager Selects a Job from the dropdown$")
    public void tagsalesmanager_selects_a_job_from_the_dropdown() throws Throwable {
        pricing.selectJob();
    }

    @And("^TAGSalesManager clicks on advance search option$")
    public void tagsalesmanager_clicks_on_advance_search_option() throws Throwable {
        pricing.selectAdavnceSearchOptions();
    }

    @And("^TAGSalesManager choose the product group using (.+)$")
    public void tagsalesmanager_choose_the_product_group_using(String productgroup) throws Throwable {
        pricing.productGroupSelection(productgroup);
    }

    @And("^TAGSalesManager choose the category with primer value using (.+)$")
    public void tagsalesmanager_choose_the_category_with_primer_value_using(String primer) throws Throwable {
        pricing.categorySelection(primer);
    }

    @And("^TAGSalesManager able to see three results with size code details$")
    public void tagsalesmanager_able_to_see_three_results_with_size_code_details() throws Throwable {
        pricing.testing();

    }
    @And("^TAGSalesManager choose the product using (.+)$")
    public void tagsalesmanager_choose_the_product_using(String productfamily) throws Throwable {
        pricing.validateFromProductFamily(productfamily);
    }

    @Then("^TAGSalesManager is able to see product pricing$")
    public void tagsalesmanager_is_able_to_see_product_pricing() throws Throwable {
        Assert.assertTrue(pricing.validatePriceValue(), "Price is not populated");
    }



}
