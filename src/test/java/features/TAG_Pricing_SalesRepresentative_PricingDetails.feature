@TAGSalesRep_PricingDetails
Feature: Validate account details with TAG Sales Representative

  Background:
    Given TAG Sales Representative is on dashboard page
    When TAG Sales Representative clicks on TAG Sales Representative profile link

  @TAGSalesRepresentative @PMODT158 @Sprint6
  Scenario Outline: TAGSalesRepresentative want to be able to search for an account's pricing for a specific product with Advanced Search options - Category
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an pricing account number
    And TAG Sales Representative Selects a Job from the dropdown
    And TAG Sales Representative clicks on advance search option
    And TAG Sales Representative choose the category with primer value using <primer>
    And TAG Sales Representative able to see three results with size code details
    Then TAG Sales Representative is able to see product pricing

    Examples:
      | divisionName       | role                   | accountNumber | costCenterCode | primer  |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 531754307     | 754828         | 1128081 |

  @TAGSalesRepresentative @PMODT153 @Sprint6
  Scenario Outline: TAGSalesRepresentativePMODT153 I want to be able to submit an exception price for a specific product using the Sales Number
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an pricing account number
    And TAG Sales Representative Selects a Job from the dropdown
    And TAG Sales Representative clicks on <salesNumber> field
    And TAG Sales Representative is able to click the blue ViewEdit Selections button at the top of the search results with <sizeCode>
    And TAG Sales Representative is able to click the blue Edit Exceptions button at the bottom of this screen
    And TAG Sales Representative is able to choose new price value for size code <sizeCode>
    And TAG Sales Representative is able to click on the Expiration Date drop down and select tomorrow's date
    And TAG Sales Representative is able to click on the Update Reason field and type the text
    And TAG Sales Representative is able to click the blue Next button and click on submit
    And TAG Sales Representative is able to see the product pricing
    Then TAG Sales Representative is able to clear the search field
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber | salesNumber | sizeCode |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 531754307     | 650946635   | 16       |

  @TAGSalesRepresentative @PMODT155 @Sprint6
  Scenario Outline: TAGSalesRepresentativePMODT155 I want to be able to submit an exception price for a specific product using the Product / REX Number
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an pricing account number
    And TAG Sales Representative Selects a Job from the dropdown
    And TAG Sales Representative clicks on <productNumber> field and select the product
    And TAG Sales Representative is able to click the blue ViewEdit Selections button at the top of the search results with <sizeCode>
    And TAG Sales Representative is able to click the blue Edit Exceptions button at the bottom of this screen
    And TAG Sales Representative is able to choose new price value for size code <sizeCode>
    And TAG Sales Representative is able to click on the Expiration Date drop down and select tomorrow's date
    And TAG Sales Representative is able to click on the Update Reason field and type the text
    And TAG Sales Representative is able to click the blue Next button and click on submit
    And TAG Sales Representative is able to see the product pricing
    Then TAG Sales Representative is able to clear the search field
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber | productNumber | sizeCode |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 531754307     | B30W12651     | 16~20    |