package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.Pricing_Methods;
import utils.TestContextSetup;

public class Pricing_TAG_SalesRepresentation_StepDefinition {

    TestContextSetup testContextSetup;
    Pricing_Methods pricing;

    public Pricing_TAG_SalesRepresentation_StepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.pricing = testContextSetup.pageObjectManager.getPricing();
    }

    @When("^TAG Sales Representative opens an (.+) using an pricing account number$")
    public void tag_sales_representative_opens_an_using_an_pricing_account_number(String accountnumber) throws Throwable {
        pricing.selectAccoount(accountnumber);
    }
    @And("^TAG Sales Representative Selects a Job from the dropdown$")
    public void tag_sales_representative_selects_a_job_from_the_dropdown() throws Throwable {
        pricing.selectJob();
    }

    @And("^TAG Sales Representative clicks on advance search option$")
    public void tag_sales_representative_clicks_on_advance_search_option() throws Throwable {
        pricing.selectAdavnceSearchOptions();
    }

    @And("^TAG Sales Representative choose the category with primer value using (.+)$")
    public void tag_sales_representative_choose_the_category_with_primer_value_using(String primer) throws Throwable {
        pricing.categorySelection(primer);
    }

    @And("^TAG Sales Representative able to see three results with size code details$")
    public void tag_sales_representative_able_to_see_three_results_with_size_code_details() throws Throwable {
        Assert.assertTrue(pricing.validateSizeCode(), "Size Code is not populated");
    }
    @Then("^TAG Sales Representative is able to see product pricing$")
    public void tag_sales_representative_is_able_to_see_product_pricing() throws Throwable {
        Assert.assertTrue(pricing.validatePriceValue(), "Price is not populated");
    }

    @And("^TAG Sales Representative clicks on (.+) field$")
    public void tag_sales_representative_clicks_on_field(String salesnumber) throws Throwable {
        pricing.salesNumberSelection(salesnumber);
    }

    @And("^TAG Sales Representative is able to click the blue ViewEdit Selections button at the top of the search results with (.+)$")
    public void tag_sales_representative_is_able_to_click_the_blue_viewedit_selections_button_at_the_top_of_the_search_results(String sizeCode) throws Throwable {
        String sizeCodes[] = sizeCode.split("~");
        pricing.clickViewEditButton(sizeCodes);
    }

    @And("^TAG Sales Representative is able to click the blue Edit Exceptions button at the bottom of this screen$")
    public void tag_sales_representative_is_able_to_click_the_blue_edit_exceptions_button_at_the_bottom_of_this_screen() throws Throwable {
        pricing.clickEditExceptionButton();
    }

    @And("^TAG Sales Representative is able to choose new price value for size code (.+)$")
    public void tag_sales_representative_is_able_to_choose_new_price_value_for_size_code(String sizecode) throws Throwable {
        String sizeCodes[] = sizecode.split("~");
        //String priceValues[] = pricevalue.split("~");
        pricing.chooseNewExceptionValue(sizeCodes);
    }

    @And("^TAG Sales Representative is able to click on the Expiration Date drop down and select tomorrow's date$")
    public void tag_sales_representative_is_able_to_click_on_the_expiration_date_drop_down_and_select_tomorrows_date() throws Throwable {
        pricing.selectExpirationDate();
    }

    @And("^TAG Sales Representative is able to click on the Update Reason field and type the text$")
    public void tag_sales_representative_is_able_to_click_on_the_update_reason_field_and_type_the_text() throws Throwable {
        pricing.updateReasonField();
    }

    @And("^TAG Sales Representative is able to click the blue Next button and click on submit$")
    public void tag_sales_representative_is_able_to_click_the_blue_next_button_and_click_on_submit() throws Throwable {
        pricing.clickNextButtonAndSubmit();
    }
    @And("^TAG Sales Representative is able to see the product pricing$")
    public void tag_sales_representative_is_able_to_see_the_product_pricing() throws Throwable {
        Assert.assertTrue(pricing.validatePriceValue(), "Price is not populated");
    }
    @And("^TAG Sales Representative clicks on (.+) field and select the product$")
    public void tag_sales_representative_clicks_on_field_and_select_the_product(String productnumber) throws Throwable {
        pricing.productNumberSelection(productnumber);
    }
    @Then("^TAG Sales Representative is able to clear the search field$")
    public void tag_sales_representative_is_able_to_clear_the_search_field() throws Throwable {
        pricing.clearSearchSelection();
    }



}
