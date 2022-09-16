@TAGStoreManager_AccountDetails
Feature: Validate account details with TAG Store Manager

Background: 
Given TAGStoreManager is on dashboard page
When TAGStoreManager clicks on user profile link

@TAGStoreManager2 @PMODT85 @Sprint3
Scenario Outline: TAGStoreManagerPMODT85 I want to be able to enter an account by Account Number and for results to populate
Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
When TAGStoreManager opens an <accountNumber> using an account number
Then TAGStoreManager is on account details page
Examples:
|divisionName      |role                        |costCenterCode|accountNumber|
|The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

@TAGStoreManager12 @PMODT95 @Sprint3
Scenario Outline: TAGStoreManagerPMODT95 I want to be able to view an account's Authorized Buyers
Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
When TAGStoreManager opens an <accountNumber> using an account number
Then TAGStoreManager is able to view an account's Authorized Buyers
Examples:
|divisionName      |role                        |costCenterCode|accountNumber|
|The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

@TAGStoreManager16 @PMODT99 @Sprint3
Scenario Outline: TAGStoreManagerPMODT99 I want to be able to view an account's Contact Information
Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
When TAGStoreManager opens an <accountNumber> using an account number
Then TAGStoreManager is able to view an account's Contact Information
Examples:
|divisionName      |role                        |costCenterCode|accountNumber|
|The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

@TAGStoreManager09 @PMODT92 @Sprint3
Scenario Outline: TAGStoreManagerPMODT92 I want to be able to view account Comments
Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
When TAGStoreManager opens an <accountNumber> using an account number
Then TAGStoreManager is able to view account Comments
Examples:
|divisionName      |role                        |costCenterCode|accountNumber|
|The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

@TAGStoreManager20 @PMODT103 @Sprint3
Scenario Outline: TAGStoreManagerPMODT103 I want to be able to view an account's Demographic Information
Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
When TAGStoreManager opens an <accountNumber> using an account number
Then TAGStoreManager is able to view account's Demographic Information
Examples:
|divisionName      |role                        |costCenterCode|accountNumber|
|The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

@TAGStoreManager3 @PMODT86 @Sprint4
Scenario Outline: TAGStoreManagerPMODT86 I want to be able to enter an account by Account Name and for results to populate
Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
When TAGStoreManager opens an <accountName> using an account name
Then TAGStoreManager is on account details page
Examples:
|divisionName      |role                        |costCenterCode|accountName           |
|The Americas Group|CPMMaint_Store_Manager_Group|701104        |JCI CONTRACTORS INC   |

@TAGStoreManager6 @PMODT89 @Sprint4
Scenario Outline: TAGStoreManagerPMODT89 I want to able to edit Customer Sales Potential and validate the new Sales Potential
Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
When TAGStoreManager opens an <accountNumber> using an account number
Then TAGStoreManager is able to edit the Customer sales potential and view the new value
Examples:
|divisionName      |role                        |costCenterCode|accountNumber|
|The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

@TAGStoreManager8 @PMODT91 @Sprint4
Scenario Outline: TAGStoreManagerPMODT91 I want to able to edit Customers CAC code and validate the new CAC code
Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
When TAGStoreManager opens an <accountNumber> using an account number
Then TAGStoreManager is able to edit the CAC value using <CACGroup> and <CACCode>
Examples:
|divisionName      |role                        |costCenterCode|accountNumber|CACGroup|CACCode|
|The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |2020    |1722   |

@TAGStoreManager10 @PMODT93 @Sprint4
Scenario Outline: TAGStoreManagerPMODT93 I want to able to add Account Comments
Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
When TAGStoreManager opens an <accountNumber> using an account number
Then TAGStoreManager is able to add account comments
Examples:
|divisionName      |role                        |costCenterCode|accountNumber|
|The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

@TAGStoreManager11 @PMODT94 @Sprint4
Scenario Outline: TAGStoreManagerPMODT94 I want to able to edit Account Comments
Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
When TAGStoreManager opens an <accountNumber> using an account number
Then TAGStoreManager is able to edit account comments
Examples:
|divisionName      |role                        |costCenterCode|accountNumber|
|The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

@TAGStoreManager7 @PMODT90 @Sprint3
Scenario Outline: TAGStoreManagerPMODT90 I want to be able to view the customer's CAC Code
Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
When TAGStoreManager opens an <accountNumber> using an account number
Then TAGStoreManager is able to view the customer's CAC Code
Examples:
|divisionName      |role                        |costCenterCode|accountNumber|
|The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

@TAGStoreManager15 @PMODT98 @Sprint5
Scenario Outline: TAGStoreManagerPMODT98 I want to be able to delete an account's Authorized Buyer
Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
When TAGStoreManager opens an <accountNumber> using an account number
Then TAGStoreManager is able to delete an account's Authorized Buyer
Examples:
|divisionName      |role                        |costCenterCode|accountNumber|
|The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

@TAGStoreManager17 @PMODT100 @Sprint5
Scenario Outline: TAGStoreManagerPMODT100 I want to be able to add Contact Information to an account
Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
When TAGStoreManager opens an <accountNumber> using an account number
Then TAGStoreManager is able to add Contact Information to an account
Examples:
|divisionName      |role                        |costCenterCode|accountNumber|
|The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

  @TAGStoreManager18 @PMODT101 @Sprint5
  Scenario Outline: TAGStoreManagerPMODT101 want to be able to edit Contact Information to an account
    Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
    When TAGStoreManager opens an <accountNumber> using an account number
    Then TAGStoreManager is able to edit Contact Information to an account
    Examples:
      |divisionName      |role                        |costCenterCode|accountNumber|
      |The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

  @TAGStoreManager19 @PMODT102 @Sprint5
  Scenario Outline: TAGStoreManagerPMODT102 want to be able to delete Contact Information to an account
    Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
    When TAGStoreManager opens an <accountNumber> using an account number
    Then TAGStoreManager is able to delete Contact Information to an account
    Examples:
      |divisionName      |role                        |costCenterCode|accountNumber|
      |The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

  @TAGStoreManager25 @PMODT108 @Sprint5
  Scenario Outline: TAGStoreManagerPMODT108 able to view the Pricing Detail for a Job from the Account Maintenance Screen
    Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
    When TAGStoreManager opens an <accountNumber> using an account number
    Then TAGStoreManager able to Verify the Pricing Detail for a Job from the Account Maintenance Screen

    Examples:
      |divisionName      |role                        |costCenterCode|accountNumber|
      |The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

  @TAGStoreManager5 @PMODT88 @Sprint5
  Scenario Outline: TAGStoreManagerPMODT88 I want to be able to confirm all permissible data displays
    Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
    When TAGStoreManager opens an <accountNumber> using an account number
    Then TAGStoreManager is able to confirm all permissible data displays
    Examples:
      |divisionName      |role                        |costCenterCode|accountNumber|
      |The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

  @TAGStoreManager4 @PMODT87 @Sprint5
  Scenario Outline: TAGStoreManagerPMODT87 I want to be able to view the customer's Sales Potential
    Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
    When TAGStoreManager opens an <accountNumber> using an account number
    Then TAGStoreManager is able to view the customer's Sales Potential
    Examples:
      |divisionName      |role                        |costCenterCode|accountNumber|
      |The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

  @TAGStoreManager13 @PMODT96 @Sprint5
  Scenario Outline: TAGStoreManagerPMODT96 I want to be able to add an Authorized Buyer to an account
    Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
    When TAGStoreManager opens an <accountNumber> using an account number
    Then TAGStoreManager is able to add the new authorized buyer to account
    Examples:
      |divisionName      |role                        |costCenterCode|accountNumber|
      |The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

  @TAGStoreManager14 @PMODT97 @Sprint5
  Scenario Outline: TAGStoreManagerPMODT97 I want to be able to edit an account's Authorized Buyers
    Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
    When TAGStoreManager opens an <accountNumber> using an account number
    Then TAGStoreManager is able to edit the authorized buyer to account
    Examples:
      |divisionName      |role                        |costCenterCode|accountNumber|
      |The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |


  @TAGStoreManager @PMODT104 @Sprint6
  Scenario Outline: TAGStoreManagerPMODT104 want to be able to view an account's Pricing Attributes
    Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
    When TAGStoreManager opens an <accountNumber> using an account number
    Then TAGStoreManager is to be able to view an account's Pricing Attributes
    Examples:
      |divisionName      |role                        |costCenterCode|accountNumber|
      |The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

  @TAGStoreManager @PMODT105 @Sprint6
  Scenario Outline: TAGStoreManagerPMODT105 want to be able to edit an account's Pricing Attributes
    Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
    When TAGStoreManager opens an <accountNumber> using an account number
    Then TAGStoreManager is able to edit an account's Pricing Attributes
    Examples:
      |divisionName      |role                        |costCenterCode|accountNumber|
      |The Americas Group|CPMMaint_Store_Manager_Group|701104        |531754307    |

  @TAGStoreManager @PMODT107 @Sprint6
  Scenario Outline:TAGStoreManagerPMODT107 wants to be able to sort the account's Jobs
    Given TAGStoreManager is able to change the role using <divisionName> <role> <costCenterCode>
    When TAGStoreManager opens an <accountNumber> using an account number
    Then TAGStoreManager Can sort all columns as described

    Examples:
      |divisionName      |role                        |costCenterCode|accountNumber|
      |The Americas Group|CPMMaint_Store_Manager_Group|704338        |101351286    |