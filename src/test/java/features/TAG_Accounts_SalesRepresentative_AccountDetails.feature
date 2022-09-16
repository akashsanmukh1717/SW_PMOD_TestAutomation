@TAGSalesRep_AccountDetails
Feature: Validate account details with TAG Sales Representative

  Background:
    Given TAG Sales Representative is on dashboard page
    When TAG Sales Representative clicks on TAG Sales Representative profile link

  @TAGSalesRepresentative2 @PMODT129 @Sprint3
  Scenario Outline: TAGSalesRepresentativePMODT129 I want to be able to enter an account by Account Number and for results to populate
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is on account details page
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 288309636     |

  @TAGTAGSalesRepresentative12 @PMODT139 @Sprint3
  Scenario Outline: TAGTAGSalesRepresentativePMODT139 I want to be able to view an account's Authorized Buyers
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is able to view an account's Authorized Buyers
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 944254812     |

  @TAGSalesRepresentative7 @PMODT134 @Sprint3
  Scenario Outline: TAGSalesRepresentativePMODT134 I want to be able to view the customer CAC Code
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is able to view an account's customer CAC code
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 288309636     |

  @TAGSalesRepresentative9 @PMODT136 @Sprint3
  Scenario Outline: TAGSalesRepresentativePMODT136 I want to be able to view account Comments
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is able to view account Comments
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 944254812     |

  @TAGSalesRepresentative4 @PMODT131 @Sprint3
  Scenario Outline: TAGSalesRepresentativePMODT131 I want to be able to view the customer's Sales Potential
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is able to view the customer's Sales Potential
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 288309636     |

  @TAGSalesRepresentative3 @PMODT130 @Sprint3
  Scenario Outline: TAGSalesRepresentativePMODT130 I want to be able to enter an account by Account Name and for results to populate
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountName> using an account name
    Then TAG Sales Representative is on account details page
    Examples:
      | divisionName       | role                   | costCenterCode | accountName    |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | M2 Enterprises |

  @TAGSalesRepresentative10 @PMODT137 @Sprint4
  Scenario Outline: TAGSalesRepresentativePMODT137 I want to be able to add Account Comments
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is able to add account Comments
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 944254812     |

  @TAGSalesRepresentative11 @PMODT138 @Sprint4
  Scenario Outline: TAGSalesRepresentativePMODT138 I want to be able to edit Account Comments
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is able to edit account Comments
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 944254812     |

  @TAGSalesRepresentative06 @PMODT133 @Sprint4
  Scenario Outline: TAGSalesRepresentativePMODT133 I want to be able to edit the customer's Sales Potential
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is able to edit the customer's Sales Potential
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber  |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | M2 Enterprises |

  @TAGSalesRepresentative08 @PMODT135 @Sprint4
  Scenario Outline: TAGSalesRepresentativePMODT135 I want to be able to edit the CAC code
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is able to edit the CAC value using <CACGroup> and <CACCode>
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber | CACGroup | CACCode |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 288309636     | 2020     | 1791    |

  @TAGSalesRepresentative13 @PMODT140 @Sprint5
  Scenario Outline: TAGSalesRepresentativePMODT140 I want to be able to add an Authorized Buyer to an account
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is able to add the new authorized buyer to account
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 944254812     |

  @TAGSalesRepresentative14 @PMODT141 @Sprint5
  Scenario Outline: TAGSalesRepresentativePMODT141 I want to be able to edit an account's Authorized Buyers
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is able to edit the authorized buyer to account
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 944254812     |

#@TAGSalesRepresentative15 @PMODT142 @SprintTBD
#Scenario Outline: TAGSalesRepresentative15 I want to be able to delete an account's Authorized Buyer
#Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
#When TAG Sales Representative opens an <accountName> using an account number
#Then TAG Sales Representative is able to delete an account's Authorized Buyer
#Examples:
#|divisionName      |role                  |costCenterCode|accountName   |
#|The Americas Group|CPMMaint_TAG_Rep_Group|754828        |M2 Enterprises|

  @TAGSalesRepresentative17 @PMODT144 @Sprint5
  Scenario Outline: TAGSalesRepresentativePMODT144 I want to be able to add Contact Information to an account
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is able to add Contact Information to an account
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 944254812     |

  @TAGSalesRepresentative18 @PMODT145 @Sprint5
  Scenario Outline: TAGSalesRepresentativePMODT145 I want to be able to edit an account's Contact Information
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is able to edit Contact Information to an account
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 944254812     |

  @TAGSalesRepresentative19 @PMODT146 @Sprint5
  Scenario Outline: TAGSalesRepresentativePMODT146 I want to be able to delete an account's Contact Information
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is able to delete Contact Information to an account
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 944254812     |

  @TAGSalesRepresentative24 @PMODT816 @Sprint5
  Scenario Outline: TAGSalesRepresentativePMODT816 I want to be able to view the Pricing Detail for a Job from the Account Maintenance Screen
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is able to view the Pricing Detail for a Job from the Account Maintenance Screen
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 944254812     |

  @TAGSalesRepresentative23 @PMODT150 @Sprint6
  Scenario Outline: TAGSalesRepresentativePMODT150 I want to be able to sort the account's Jobs
    Given TAG Sales Representative is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Sales Representative opens an <accountNumber> using an account number
    Then TAG Sales Representative is able to sort the account's Jobs
    Examples:
      | divisionName       | role                   | costCenterCode | accountNumber |
      | The Americas Group | CPMMaint_TAG_Rep_Group | 754828         | 101351286     |

