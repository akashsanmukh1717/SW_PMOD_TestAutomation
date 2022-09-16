@PCGStoreManager_accountDeatails
Feature: Validate account details with PCG Store Manager role

Background:
Given PCG Store Manager is on dashboard page
When PCG Store Manager clicks on PCG Manager profile link

@PCGStoreManager @PMODT365 @Sprint3
Scenario Outline: PCGStoreManagerPMODT365 I want to be able to view the customer's Sales Potential
Given PCG Store Manager is able to change the role using <divisionName> <role> <costCenterCode>
When PCG Store Manager opens an <accountNumber> using an account number
Then PCG Store Manager is able to view the customer's Sales Potential

Examples:
|divisionName              |role                            |costCenterCode|accountNumber|
|Performance Coatings Group|CPMMaint_PCG_Store_Manager_Group|794337        |669390585    |

@PCGStoreManager @PMODT367 @Sprint3
Scenario Outline: PCGStoreManagerPMODT367 I want to be able to confirm all permissible data displays
Given PCG Store Manager is able to change the role using <divisionName> <role> <costCenterCode>
When PCG Store Manager opens an <accountNumber> using an account number
Then PCG Store Manager is able to confirm all permissible data displays

Examples:
|divisionName              |role                            |costCenterCode|accountNumber|
|Performance Coatings Group|CPMMaint_PCG_Store_Manager_Group|794337        |669390585    |

@PCGStoreManager @PMODT368 @Sprint3
Scenario Outline: PCGStoreManagerPMODT368 want to be able to view the customer's CAC Code
Given PCG Store Manager is able to change the role using <divisionName> <role> <costCenterCode>
When PCG Store Manager opens an <accountNumber> using an account number
Then PCG Store Manager is able to view the customer's CAC Code

Examples:
|divisionName              |role                            |costCenterCode|accountNumber|
|Performance Coatings Group|CPMMaint_PCG_Store_Manager_Group|794337        |669390585    |

@PCGStoreManager @PMODT370 @Sprint3
Scenario Outline: PCGStoreManagerPMODT370 want to be able to view account Comments
Given PCG Store Manager is able to change the role using <divisionName> <role> <costCenterCode>
When PCG Store Manager opens an <accountNumber> using an account number
Then PCG Store Manager is able to view account Comments

Examples:
|divisionName              |role                            |costCenterCode|accountNumber|
|Performance Coatings Group|CPMMaint_PCG_Store_Manager_Group|794337        |669390585    |

@PCGStoreManager @PMODT376 @Sprint6
Scenario Outline: PCGStoreManagerPMODT376 want to be able to delete an account's Authorized Buyer
  Given PCG Store Manager is able to change the role using <divisionName> <role> <costCenterCode>
  When PCG Store Manager opens an <accountNumber> using an account number
  Then PCG Store Manager is able to delete an account's Authorized Buyer

  Examples:
    |divisionName              |role                            |costCenterCode|accountNumber|
    |Performance Coatings Group|CPMMaint_PCG_Store_Manager_Group|794337        |669390585    |

@PCGStoreManager @PMODT369 @Sprint6
Scenario Outline: PCGStoreManagerPMODT369 wants to be able to edit the customer's CAC Code
  Given PCG Store Manager is able to change the role using <divisionName> <role> <costCenterCode>
  When PCG Store Manager opens an <accountNumber> using an account number
  Then PCG Store Manager is able to edit the CAC value using <CACGroup> and <CACCode>

  Examples:
    |divisionName              |role                            |costCenterCode|accountNumber|CACGroup|CACCode|
    |Performance Coatings Group|CPMMaint_PCG_Store_Manager_Group|794337        |669390585    |3025    |3479   |

@PCGStoreManager @PMODT371 @Sprint6
Scenario Outline: PCGStoreManagerPMODT371 wants to able to add Account Comments
  Given PCG Store Manager is able to change the role using <divisionName> <role> <costCenterCode>
  When PCG Store Manager opens an <accountNumber> using an account number
  Then PCG Store Manager is able to add account comments

  Examples:
    |divisionName              |role                            |costCenterCode|accountNumber|
    |Performance Coatings Group|CPMMaint_PCG_Store_Manager_Group|794337        |669390585    |

@PCGStoreManager @PMODT372 @Sprint6
Scenario Outline: PCGStoreManagerPMODT372 wants to be able to edit Account Comments
  Given PCG Store Manager is able to change the role using <divisionName> <role> <costCenterCode>
  When PCG Store Manager opens an <accountNumber> using an account number
  Then PCG Store Manager is able to edit account comments

  Examples:
    |divisionName              |role                            |costCenterCode|accountNumber|
    |Performance Coatings Group|CPMMaint_PCG_Store_Manager_Group|794337        |669390585    |

@PCGStoreManager @PMODT379 @Sprint6
Scenario Outline: PCGStoreManagerPMODT379 wants to be able to edit an account's Contact Information
  Given PCG Store Manager is able to change the role using <divisionName> <role> <costCenterCode>
  When PCG Store Manager opens an <accountNumber> using an account number
  Then PCG Store Manager is able to edit an account's Contact Information

  Examples:
    |divisionName              |role                            |costCenterCode|accountNumber|
    |Performance Coatings Group|CPMMaint_PCG_Store_Manager_Group|794337        |669390585    |

  @PCGStoreManager @PMODT378 @Sprint6
  Scenario Outline: PCGStoreManagerPMODT378 want to be able to add Contact Information to an account
    Given PCG Store Manager is able to change the role using <divisionName> <role> <costCenterCode>
    When PCG Store Manager opens an <accountNumber> using an account number
    Then PCG Store Manager is able to add Contact Information to an account

    Examples:
      |divisionName              |role                            |costCenterCode|accountNumber|
      |Performance Coatings Group|CPMMaint_PCG_Store_Manager_Group|794337        |669390585    |

  @PCGStoreManager @PMODT384 @Sprint6
  Scenario Outline: PCGStoreManagerPMODT384 want to be able to sort the account's Jobs
    Given PCG Store Manager is able to change the role using <divisionName> <role> <costCenterCode>
    When PCG Store Manager opens an <accountNumber> using an account number
    Then PCG Store Manager is to be able to sort the account's Jobs

    Examples:
      |divisionName              |role                            |costCenterCode|accountNumber|
      |Performance Coatings Group|CPMMaint_PCG_Store_Manager_Group|794337        |669390585    |

  @PCGStoreManager @PMODT366 @Sprint6
  Scenario Outline: PCGStoreManagerPMODT366 I want to able to edit Customer Sales Potential and validate the new Sales Potential
    Given PCG Store Manager is able to change the role using <divisionName> <role> <costCenterCode>
    When PCG Store Manager opens an <accountNumber> using an account number
    Then PCG Store Manager is able to edit the Customer sales potential and view the new value
    Examples:
      |divisionName              |role                            |costCenterCode|accountNumber|
      |Performance Coatings Group|CPMMaint_PCG_Store_Manager_Group|794337        |669390585    |

  @PCGStoreManager @PMODT377 @Sprint6
  Scenario Outline: PCGStoreManagerPMODT377 I want to be able to view an account's Contact Information
    Given PCG Store Manager is able to change the role using <divisionName> <role> <costCenterCode>
    When PCG Store Manager opens an <accountNumber> using an account number
    Then PCG Store Manager is able to view an account's Contact Information
    Examples:
      |divisionName              |role                            |costCenterCode|accountNumber|
      |Performance Coatings Group|CPMMaint_PCG_Store_Manager_Group|794337        |669390585    |

  @PCGStoreManager @PMODT380 @Sprint6
  Scenario Outline: PCGStoreManagerPMODT380 want to be able to delete Contact Information to an account
    Given PCG Store Manager is able to change the role using <divisionName> <role> <costCenterCode>
    When PCG Store Manager opens an <accountNumber> using an account number
    Then PCG Store Manager is able to delete Contact Information to an account
    Examples:
      |divisionName              |role                            |costCenterCode|accountNumber|
      |Performance Coatings Group|CPMMaint_PCG_Store_Manager_Group|794337        |669390585    |







