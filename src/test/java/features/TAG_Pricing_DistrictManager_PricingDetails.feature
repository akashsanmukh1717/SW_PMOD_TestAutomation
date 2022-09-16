@TAGDistrictManager_PricingDetails
Feature: Validate account details with TAG District Manager

  Background:
    Given TAG District Manager is on dashboard page
    When TAG District Manager clicks on user profile link

  @TAGDistrictManager17 @PMODT186 @Sprint5
  Scenario Outline: TAGDistrictManagerPMODT186 want to be able to search for an account's pricing for a specific product with Advanced Search options - Category
    Given TAG District Manager is able to change the role using <divisionName> <role>
    When TAG District Manager opens an <accountNumber> using an pricing account number
    And TAG District Manager Selects a Job from the dropdown
    And TAG District Manager clicks on advance search option
    And TAG District Manager choose the category with primer value using <primer>
    And TAG District Manager able to see three results with size code details
    Then TAG District Manager is able to see product pricing

    Examples:
      | divisionName       | role              | accountNumber | primer  |
      | The Americas Group | CPMMaint_DM_Group | 531754307     | 1124028 |

  @TAGDistrictManager20 @PMODT189 @Sprint5
  Scenario Outline: TAGDistrictManagerPMODT189 want to be able to search for an account's pricing for a specific product with Advanced Search options - Product Group
    Given TAG District Manager is able to change the role using <divisionName> <role>
    When TAG District Manager opens an <accountNumber> using an pricing account number
    And TAG District Manager Selects a Job from the dropdown
    And TAG District Manager clicks on advance search option
    And TAG District Manager choose the product group using <productGroup>
    Then TAG District Manager is able to see product pricing

    Examples:
      | divisionName       | role              | accountNumber | productGroup                     |
      | The Americas Group | CPMMaint_DM_Group | 531754307     | 110055 - PRO INDUSTRIAL COATINGS |

  @TAGDistrictManager21 @PMODT190 @Sprint5
  Scenario Outline: TAGDistrictManagerPMODT190 I want to be able to clear the search field results after searching for product using a sales number
    Given TAG District Manager is able to change the role using <divisionName> <role>
    When TAG District Manager opens an <accountNumber> using an pricing account number
    And TAG District Manager Selects a Job from the dropdown
    And TAG District Manager clicks on <salesNumber> field
    And TAG District Manager is able to see the product pricing
    Then TAG District Manager is able to clear the search field

    Examples:
      | divisionName       | role              | accountNumber | salesNumber |
      | The Americas Group | CPMMaint_DM_Group | 531754307     | 650946635   |