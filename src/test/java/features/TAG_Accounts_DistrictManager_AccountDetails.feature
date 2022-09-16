@TAGDistrictManager_accountDetails
Feature: Validate account details with TAG District Manager

Background: 
Given TAG District Manager is on dashboard page
When TAG District Manager clicks on user profile link

@TAGDistrictManager1 @PMODT171 @Sprint3
Scenario Outline: TAG District ManagerPMODT171 wants to be able to enter an account by Account Number and for results to populate
Given TAG District Manager is able to change the role using <divisionName> <role>
When TAG District Manager opens an <accountNumber> using an account number
Then TAG District Manager is on account details page
  Examples:
    |divisionName      |role             |accountNumber|
    |The Americas Group|CPMMaint_DM_Group|420587826    |

@TAGDistrictManager3 @PMODT173 @Sprint3
Scenario Outline: TAG District ManagerPMODT173 wants to be able to view the customer's Sales Potential
Given TAG District Manager is able to change the role using <divisionName> <role>
When TAG District Manager opens an <accountNumber> using an account number
Then Under Account Summary section, TAG District Manager is able to view the listed Sales Potential

  Examples:
    |divisionName      |role             |accountNumber|
    |The Americas Group|CPMMaint_DM_Group|420587826    |

@TAGDistrictManager4 @PMODT174 @Sprint3
Scenario Outline: TAG District ManagerPMODT174 wants to be able to view the customer's CAC Code
Given TAG District Manager is able to change the role using <divisionName> <role>
When TAG District Manager opens an <accountNumber> using an account number
Then Under Account Summary section, TAG District Manager is able to view the listed CAC Code

  Examples:
    |divisionName      |role             |accountNumber|
    |The Americas Group|CPMMaint_DM_Group|420587826    |

@TAGDistrictManager8 @PMODT177 @Sprint3
Scenario Outline: TAG District ManagerPMODT177 wants to be able to view an account's Jobs
Given TAG District Manager is able to change the role using <divisionName> <role>
When TAG District Manager opens an <accountNumber> using an account number
Then Verify the Job Info section populates and is viewable

  Examples:
    |divisionName      |role             |accountNumber|
    |The Americas Group|CPMMaint_DM_Group|420587826    |

@TAGDistrictManager10 @PMODT179 @Sprint3 @smoke-tests
Scenario Outline: TAG District ManagerPMODT179 wants to be able to view account Comments
Given TAG District Manager is able to change the role using <divisionName> <role>
When TAG District Manager opens an <accountNumber> using an account number
Then Verify the Comments section populates and is viewable

  Examples:
    |divisionName      |role             |accountNumber|
    |The Americas Group|CPMMaint_DM_Group|420587826    |

@TAGDistrictManager11 @PMODT180 @Sprint4 @smoke-tests
Scenario Outline: TAG District ManagerPMODT180 wants to be able to view an account's Authorized Buyers
Given TAG District Manager is able to change the role using <divisionName> <role>
When TAG District Manager opens an <accountNumber> using an account number
Then Verify the Authorized Buyers section populates and is viewable
Examples:
|divisionName      |role             |accountNumber|
|The Americas Group|CPMMaint_DM_Group|420587826    |

@TAGDistrictManager12 @PMODT181 @Sprint4 @smoke-tests
Scenario Outline: TAG District ManagerPMODT181 wants to be able to view the Pricing Detail for a Job from the Account Maintenance Screen
Given TAG District Manager is able to change the role using <divisionName> <role>
When TAG District Manager opens an <accountNumber> using an account number
Then Verify the Pricing Detail for a Job from the Account Maintenance Screen

  Examples:
    |divisionName      |role             |accountNumber|
    |The Americas Group|CPMMaint_DM_Group|420587826    |


  @TAGDistrictManager6 @PMODT175 @Sprint5 @smoke-tests
  Scenario Outline: TAG District ManagerPMODT175 wants to be be able to view an account's Demographic Information
    Given TAG District Manager is able to change the role using <divisionName> <role>
    When TAG District Manager opens an <accountNumber> using an account number
    Then Verify account's Demographic Information populate and viewable

    Examples:
      |divisionName      |role             |accountNumber|
      |The Americas Group|CPMMaint_DM_Group|420587826    |

  @TAGDistrictManager9 @PMODT178 @Sprint5 @smoke-tests
  Scenario Outline: TAG District managerPMODT178 wants to be able to sort the account's Jobs
    Given TAG District Manager is able to change the role using <divisionName> <role>
    When TAG District Manager opens an <accountNumber> using an account number
    Then TAG District manager Can sort all columns as described

    Examples:
      |divisionName      |role             |accountNumber|
      |The Americas Group|CPMMaint_DM_Group|420587826    |


  @TAGDistrictManager7 @PMODT176 @Sprint5 @smoke-tests
  Scenario Outline: TAG District managerPMODT176 wants to be able view  accounts pricing attributes
    Given TAG District Manager is able to change the role using <divisionName> <role>
    When TAG District Manager opens an <accountNumber> using an account number
    Then TAG District Manager can see the current Pricing Attributes information in the Pricing Attributes section

    Examples:
      |divisionName      |role             |accountNumber|
      |The Americas Group|CPMMaint_DM_Group|420587826    |