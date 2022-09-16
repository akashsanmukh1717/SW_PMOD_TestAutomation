package stepDefinations;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Accounts_Methods;
import pageObjects.Pricing_Methods;
import utils.TestContextSetup;

public class Pricing_TAG_StoreManager_StepDefinition {

    TestContextSetup testContextSetup;
    Pricing_Methods pricing;

    public Pricing_TAG_StoreManager_StepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.pricing = testContextSetup.pageObjectManager.getPricing();
    }

    @When("^TAGStoreManager opens an (.+) using an pricing account number$")
    public void TAGStoreManager_opens_an_account_using_an_pricing_anountNumber(String accountNumber) {
        pricing.selectAccoount(accountNumber);
    }

    @Then("^TAGStoreManager is on pricing details page$")
    public void TAGStoreManager_is_on_pricing_details_page() throws Throwable {
        Assert.assertTrue(pricing.checkUserinOnPricingDetailsPage(), "User is not navigated to pricing page");
    }

    @And("^TAGStoreManager Selects a Job from the dropdown$")
    public void tagstoremanager_selects_a_job_from_the_dropdown() throws Throwable {
        pricing.selectJob();
    }

    @And("^TAGStoreManager clicks on advance search option$")
    public void tagstoremanager_clicks_on_advance_search_option() throws Throwable {
        pricing.selectAdavnceSearchOptions();

    }

    @And("^TAGStoreManager choose the category with primer value using (.+)$")
    public void tagstoremanager_choose_the_category_with_primer_value_using(String primer) throws Throwable {
        pricing.categorySelection(primer);
    }

    @And("^TAGStoreManager able to see three results with size code details$")
    public void tagstoremanager_able_to_see_three_results_with_size_code_details() throws Throwable {
        pricing.testing();

    }

    @And("^TAGStoreManager choose the product group using (.+)$")
    public void tagstoremanager_choose_the_product_group_using(String productgroup) throws Throwable {
        pricing.productGroupSelection(productgroup);
    }

    @Then("^TAGStoreManager is able to see product pricing$")
    public void tagstoremanager_is_able_to_see_product_pricing() throws Throwable {
        Assert.assertTrue(pricing.validatePriceValue(), "Price is not populated");
    }

    @And("^TAGStoreManager clicks on (.+) field$")
    public void tagstoremanager_clicks_on_field(String salesnumber) throws Throwable {
        pricing.salesNumberSelection(salesnumber);

    }

    @And("^TAGStoreManager is able to see the product pricing$")
    public void tagstoremanager_is_able_to_see_the_product_pricing() throws Throwable {
        pricing.validatePriceValue();

    }
    @And("^TAGStoreManager is able to click the blue ViewEdit Selections button at the top of the search results with (.+)$")
    public void tagstoremanager_is_able_to_click_the_blue_viewedit_selections_button_at_the_top_of_the_search_results(String sizeCode) throws Throwable {
        String sizeCodes[] = sizeCode.split("~");
        pricing.clickViewEditButton(sizeCodes);
    }

    @And("^TAGStoreManager is able to click the blue Edit Exceptions button at the bottom of this screen$")
    public void tagstoremanager_is_able_to_click_the_blue_edit_exceptions_button_at_the_bottom_of_this_screen() throws Throwable {
        pricing.clickEditExceptionButton();
    }

    @And("^TAGStoreManager is able to choose new price value for size code (.+)$")
    public void tagstoremanager_is_able_to_choose_new_price_value_for_size_code(String sizecode) throws Throwable {
        String sizeCodes[] = sizecode.split("~");
        pricing.chooseNewExceptionValue(sizeCodes);
    }


    @And("^TAGStoreManager is able to click on the Expiration Date drop down and select tomorrow's date$")
    public void tagstoremanager_is_able_to_click_on_the_expiration_date_drop_down_and_select_tomorrows_date() throws Throwable {
        pricing.selectExpirationDate();
    }

    @And("^TAGStoreManager is able to click on the Update Reason field and type the text$")
    public void tagstoremanager_is_able_to_click_on_the_update_reason_field_and_type_the_text() throws Throwable {
        pricing.updateReasonField();
    }

    @And("^TAGStoreManager is able to click the blue Next button and click on submit$")
    public void tagstoremanager_is_able_to_click_the_blue_next_button_and_click_on_submit() throws Throwable {
        pricing.clickNextButtonAndSubmit();
    }

    @Then("^TAGStoreManager is able to clear the search field$")
    public void tagstoremanager_is_able_to_clear_the_search_field() throws Throwable {
        pricing.clearSearchSelection();
    }

}
