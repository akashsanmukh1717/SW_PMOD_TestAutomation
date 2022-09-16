@TAGSalesMgr_accountDetails
Feature: Validate account details with TAG Sales manager role

Background: 
Given TAG Sales manager is on dashboard page
When TAG Sales manager clicks on TAG Sales manager profile link

@TAGSalesMgr2 @PMODT192 @Sprint4
Scenario Outline: TAG Sales managerPMODT192 wants to be able to enter an account by Account Number and for results to populate
Given TAG Sales manager is able to change the role using <divisionName> <role>
When TAG Sales manager opens an <accountNumber> using an account number
Then TAG Sales manager is on account details page

Examples:
|divisionName      |role                        |accountNumber|
|The Americas Group|CPMMaint_Sales_Manager_Group|420587826    |

  @TAGSalesMgr3 @PMODT193 @Sprint5
  Scenario Outline: TAGSalesMgrPMODT193 want to be able to enter an account by Account Name and for results to populate
    Given TAG Sales manager is able to change the role using <divisionName> <role>
    When TAG Sales manager opens an <accountName> using an account name
    Then TAG Sales manager is on account details page
    Examples:
      |divisionName      |role                        |accountName            |
      |The Americas Group|CPMMaint_Sales_Manager_Group|NAVARROS WALL COVERINGS|

@TAGSalesMgr9 @PMODT199 @Sprint4
Scenario Outline: TAG Sales managerPMODT199 wants to be able to sort the account's Jobs
Given TAG Sales manager is able to change the role using <divisionName> <role>
When TAG Sales manager opens an <accountNumber> using an account number
Then TAG Sales manager Can sort all columns as described

Examples:
|divisionName      |role                        |accountNumber|
|The Americas Group|CPMMaint_Sales_Manager_Group|420587826    |

@TAGSalesMgr12 @PMODT202 @Sprint4
Scenario Outline: TAG Sales managerPMODT202 wants to be able to view the Pricing Detail for a Job from the Account Maintenance Screen
Given TAG Sales manager is able to change the role using <divisionName> <role>
When TAG Sales manager opens an <accountNumber> using an account number
Then TAG Sales manager is able to view an account's Authorized Buyers

Examples:
|divisionName      |role                        |accountNumber|
|The Americas Group|CPMMaint_Sales_Manager_Group|420587826    |

@TAGSalesMgr11 @PMODT201 @Sprint4
Scenario Outline: TAG Sales managerPMODT201 wants to be able to view an account's Authorized Buyers
Given TAG Sales manager is able to change the role using <divisionName> <role>
When TAG Sales manager opens an <accountNumber> using an account number
Then TAG Sales manager is moved from the Account tab to the Pricing tab

Examples:
|divisionName      |role                        |accountNumber|
|The Americas Group|CPMMaint_Sales_Manager_Group|420587826    |
