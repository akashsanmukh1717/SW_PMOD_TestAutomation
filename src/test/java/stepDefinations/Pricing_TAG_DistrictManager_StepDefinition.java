package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.Pricing_Methods;
import utils.TestContextSetup;

public class Pricing_TAG_DistrictManager_StepDefinition {

    TestContextSetup testContextSetup;
    Pricing_Methods pricing;

    public Pricing_TAG_DistrictManager_StepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.pricing = testContextSetup.pageObjectManager.getPricing();
    }

    @When("^TAG District Manager opens an (.+) using an pricing account number$")
    public void tag_district_manager_opens_an_using_an_pricing_account_number(String accountNumber) throws Throwable {
        pricing.selectAccoount(accountNumber);
    }

    @Then("^TAG District Manager is able to see product pricing$")
    public void tag_district_manager_is_able_to_see_product_pricing() throws Throwable {
        Assert.assertTrue(pricing.validatePriceValue(), "Price is not populated");
    }

    @And("^TAG District Manager Selects a Job from the dropdown$")
    public void tag_district_manager_selects_a_job_from_the_dropdown() throws Throwable {
        pricing.selectJob();
    }

    @And("^TAG District Manager clicks on advance search option$")
    public void tag_district_manager_clicks_on_advance_search_option() throws Throwable {
        pricing.selectAdavnceSearchOptions();
    }

    @And("^TAG District Manager choose the category with primer value using (.+)$")
    public void tag_district_manager_choose_the_category_with_primer_value_using(String primer) throws Throwable {
        pricing.categorySelection(primer);
    }

    @And("^TAG District Manager able to see three results with size code details$")
    public void tag_district_manager_able_to_see_three_results_with_size_code_details() throws Throwable {
        pricing.validateSizeCode();
    }

    @And("^TAG District Manager choose the product group using (.+)$")
    public void tag_district_manager_choose_the_product_group_using(String productgroup) throws Throwable {
        pricing.productGroupSelection(productgroup);
    }

    @And("^TAG District Manager clicks on (.+) field$")
    public void tag_district_manager_clicks_on_field(String salesnumber) throws Throwable {
        pricing.salesNumberSelection(salesnumber);
    }

    @And("^TAG District Manager is able to see the product pricing$")
    public void tag_district_manager_is_able_to_see_the_product_pricing() throws Throwable {
        pricing.validatePriceValue();
    }
    @Then("^TAG District Manager is able to clear the search field$")
    public void tag_district_manager_is_able_to_clear_the_search_field() throws Throwable {
        pricing.clearSearchSelection();
    }

}
