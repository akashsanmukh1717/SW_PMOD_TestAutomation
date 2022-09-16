@TAGStoreManager_PricingDetails
Feature: Validate account details with TAG Store Manager

  Background:
    Given TAGStoreManager is on dashboard page
    When TAGStoreManager clicks on user profile link

  @TAGStoreManager32 @PMODT115 @Sprint5
  Scenario Outline: TAGStoreManagerPMODT115 want to be able to search for an account's pricing for a specific product with Advanced Search options - Category
    Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
    When TAGStoreManager opens an <accountNumber> using an pricing account number
    And TAGStoreManager Selects a Job from the dropdown
    And TAGStoreManager clicks on advance search option
    And TAGStoreManager choose the category with primer value using <primer>
    And TAGStoreManager able to see three results with size code details
    Then TAGStoreManager is able to see product pricing

    Examples:
      | divisionName       | role                         | costCenterCode | accountNumber | primer  |
      | The Americas Group | CPMMaint_Store_Manager_Group | 701104         | 531754307     | 1124028 |

  @TAGStoreManagerPMODT121 @PMODT121 @Sprint5
  Scenario Outline: TAGStoreManagerPMODT121 want to be able to search for an account's pricing for a specific product with Advanced Search options - Product Group
    Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
    When TAGStoreManager opens an <accountNumber> using an pricing account number
    And TAGStoreManager Selects a Job from the dropdown
    And TAGStoreManager clicks on advance search option
    And TAGStoreManager choose the product group using <productGroup>
    Then TAGStoreManager is able to see product pricing

    Examples:
      | divisionName       | role                         | costCenterCode | accountNumber | productGroup                     |
      | The Americas Group | CPMMaint_Store_Manager_Group | 701104         | 531754307     | 110055 - PRO INDUSTRIAL COATINGS |

  @TAGStoreManager40 @PMODT123 @Sprint5
  Scenario Outline: TAGStoreManagerPMODT121 want to be able to clear the search field results after searching for product
    Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
    When TAGStoreManager opens an <accountNumber> using an pricing account number
    And TAGStoreManager Selects a Job from the dropdown
    And TAGStoreManager clicks on <salesNumber> field
    And TAGStoreManager is able to see the product pricing
    Then TAGStoreManager is able to clear the search field

    Examples:
      | divisionName       | role                         | costCenterCode | accountNumber | salesNumber |
      | The Americas Group | CPMMaint_Store_Manager_Group | 701104         | 531754307     | 650946635   |

  @TAGStoreManager @PMODT122 @Sprint6
  Scenario Outline: TAGStoreManagerPMODT122 I want to be able to submit an exception price for a specific product using the Advanced Search options - Product Group
  Back
    Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
    When TAGStoreManager opens an <accountNumber> using an pricing account number
    And TAGStoreManager Selects a Job from the dropdown
    And TAGStoreManager clicks on advance search option
    And TAGStoreManager choose the product group using <productGroup>
    And TAGStoreManager is able to click the blue ViewEdit Selections button at the top of the search results with <sizeCode>
    And TAGStoreManager is able to click the blue Edit Exceptions button at the bottom of this screen
    And TAGStoreManager is able to choose new price value for size code <sizeCode>
    And TAGStoreManager is able to click on the Expiration Date drop down and select tomorrow's date
    And TAGStoreManager is able to click on the Update Reason field and type the text
    And TAGStoreManager is able to click the blue Next button and click on submit
    And TAGStoreManager is able to see the product pricing
    Then TAGStoreManager is able to clear the search field

    Examples:
      | divisionName       | role                         | costCenterCode | accountNumber | productGroup                     | sizeCode |
      | The Americas Group | CPMMaint_Store_Manager_Group | 701104         | 531754307     | 110055 - PRO INDUSTRIAL COATINGS | 16~20    |

  @TAGStoreManager @PMODT110 @Sprint6
  Scenario Outline: TAGStoreManagerPMODT110 I want to be able to submit an exception price for a specific product using the Sales Number
    Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
    When TAGStoreManager opens an <accountNumber> using an pricing account number
    And TAGStoreManager Selects a Job from the dropdown
    And TAGStoreManager clicks on <salesNumber> field
    And TAGStoreManager is able to click the blue ViewEdit Selections button at the top of the search results with <sizeCode>
    And TAGStoreManager is able to click the blue Edit Exceptions button at the bottom of this screen
    And TAGStoreManager is able to choose new price value for size code <sizeCode>
    And TAGStoreManager is able to click on the Expiration Date drop down and select tomorrow's date
    And TAGStoreManager is able to click on the Update Reason field and type the text
    And TAGStoreManager is able to click the blue Next button and click on submit
    And TAGStoreManager is able to see the product pricing
    Then TAGStoreManager is able to clear the search field
    Examples:
      | divisionName       | role                         | costCenterCode | accountNumber | salesNumber  | sizeCode |
      | The Americas Group | CPMMaint_Store_Manager_Group | 701104         | 531754307     |  650946635   | 16       |