@TAGAssociate_accountDetails
Feature: Validate account details with TAG Associate role

  Background:
    Given TAG Associate is on dashboard page
    When TAG Associate clicks on TAG Associate profile link

  @TAGAssociate1 @PMODT70 @Sprint3
  Scenario Outline: TAGAssociatePMODT70 I want to be able to enter an account by Account Number and for results to populate
    Given TAG Associate is able to change the role using <divisionName> <role>
    When TAG Associate opens an <accountNumber> usnig an account number
    Then TAG Associate is able to see the account summary

    Examples:
      | divisionName       | role                           |  accountNumber |
      | The Americas Group | CPMMaint_Store_Associate_Group |  420587826     |

  @TAGAssociate2 @PMODT71 @Sprint4
  Scenario Outline: TAGAssociatePMODT71 I want to be able to enter an account by Account Name and for results to populate
    Given TAG Associate is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Associate opens an <accountName> usnig an account name
    Then TAG Associate is able to see the account summary

    Examples:
      | divisionName       | role                           |  accountName            |
      | The Americas Group | CPMMaint_Store_Associate_Group |  Navarros Wall Covering |

  @TAGAssociate3 @PMODT72 @Sprint3
  Scenario Outline: TAGAssociatePMODT72 I want to be able to view account comments
    Given TAG Associate is able to change the role using <divisionName> <role>
    When TAG Associate opens an <accountNumber> usnig an account number
    Then TAG Associate is able to see the account comments

    Examples:
      | divisionName       | role                           | accountNumber |
      | The Americas Group | CPMMaint_Store_Associate_Group | 420587826     |

  @TAGAssociate4 @PMODT73 @Sprint3
  Scenario Outline: TAGAssociatePMODT73 I want to be able to view an accounts authorised buyers
    Given TAG Associate is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Associate opens an <accountNumber> usnig an account number
    Then TAG Associate is able to see the authorised buyers

    Examples:
      | divisionName       | role                           | accountNumber |
      | The Americas Group | CPMMaint_Store_Associate_Group | 420587826     |


  @TAGAssociate5 @PMODT74 @Sprint3
  Scenario Outline: TAGAssociatePMODT74 I want to be able to view an accounts contact information
    Given TAG Associate is able to change the role using <divisionName> <role>
    When TAG Associate opens an <accountNumber> usnig an account number
    Then TAG Associate is able to see the account contact information

    Examples:
      | divisionName       | role                           | accountNumber |
      | The Americas Group | CPMMaint_Store_Associate_Group | 420587826     |

  @TAGAssociate6 @PMODT75 @Sprint5
  Scenario Outline: TAGAssociatePMODT75 I want to be able to view an accounts job information
    Given TAG Associate is able to change the role using <divisionName> <role>
    When TAG Associate opens an <accountNumber> usnig an account number
    Then TAG Associate is able to see the accounts job information

    Examples:
      | divisionName       | role                           | accountNumber |
      | The Americas Group | CPMMaint_Store_Associate_Group | 420587826     |

  @TAGAssociate8 @PMODT76 @Sprint5
  Scenario Outline: TAGAssociatePMODT76 want confirm the customer's Jobs are viewable in the Jobs Field
    Given TAG Associate is able to change the role using <divisionName> <role> <costCenterCode>
    When TAG Associate opens an <accountNumber> usnig an account number
    Then TAG Associate is able verify jobs are viewable

    Examples:
      | divisionName       | role                           | accountNumber |
      | The Americas Group | CPMMaint_Store_Associate_Group | 420587826     |

  @TAGAssociate9 @PMODT77 @Sprint5
  Scenario Outline: TAGAssociatePMODT77 I want to be able to confirm all permissible data displays
    Given TAG Associate is able to change the role using <divisionName> <role>
    When TAG Associate opens an <accountNumber> usnig an account number
    Then TAG Associate is able to confirm all permissible data displays

    Examples:
      | divisionName       | role                           | accountNumber |
      | The Americas Group | CPMMaint_Store_Associate_Group | 420587826     |

