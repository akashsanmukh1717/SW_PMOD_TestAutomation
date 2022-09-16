@TAGSalesManager_PricingDetails
Feature: Validate account details with TAG Sales Manager

  Background:
    Given TAG Sales manager is on dashboard page
    When TAG Sales manager clicks on TAG Sales manager profile link

  @PMODT210 @Sprint5
  Scenario Outline: TAGStoreManagerPMODT210 want to be able to search for an account's pricing for a specific product with Advanced Search options - Product Group
    Given TAG Sales manager is able to change the role using <divisionName> <role>
    When TAGSalesManager opens an <accountNumber> using an pricing account number
    And TAGSalesManager Selects a Job from the dropdown
    And TAGSalesManager clicks on advance search option
    And TAGSalesManager choose the product group using <productGroup>
    Then TAGSalesManager is able to see product pricing

    Examples:
      | divisionName       | role                         | accountNumber | productGroup                     |
      | The Americas Group | CPMMaint_Sales_Manager_Group | 531754307     | 110055 - PRO INDUSTRIAL COATINGS |

  @PMODT209 @Sprint5
  Scenario Outline: TAGStoreManagerPMODT209 I want to be able to search for an account's pricing for a specific product with Advanced Search options - Product Family
    Given TAG Sales manager is able to change the role using <divisionName> <role>
    When TAGSalesManager opens an <accountNumber> using an pricing account number
    And TAGSalesManager Selects a Job from the dropdown
    And TAGSalesManager clicks on advance search option
    And TAGSalesManager choose the product using <productFamily>
    Then TAGSalesManager is able to see product pricing

    Examples:
      | divisionName       | role                         | accountNumber | productFamily |
      | The Americas Group | CPMMaint_Sales_Manager_Group | 531754307     | BLOCK FILLER  |

  @PMODT207 @Sprint5
  Scenario Outline: TAG Sales managerPMODT207 want to be able to search for an account's pricing for a specific product with Advanced Search options - Category
    Given TAG Sales manager is able to change the role using <divisionName> <role>
    When TAGSalesManager opens an <accountNumber> using an pricing account number
    And TAGSalesManager Selects a Job from the dropdown
    And TAGSalesManager clicks on advance search option
    And TAGSalesManager choose the category with primer value using <primer>
    And TAGSalesManager able to see three results with size code details
    Then TAGSalesManager is able to see product pricing

    Examples:
      | divisionName       | role                         | accountNumber | primer  |
      | The Americas Group | CPMMaint_Sales_Manager_Group | 531754307     | 1124028 |

