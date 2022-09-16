@PCGAssociate_accountDeatails
Feature: Validate account details with PCG Associate role

Background:
Given PCG Associate is on dashboard page
When PCG Associate clicks on PCG Associate profile link


@PCGAssociate2 @PMODT326 @Sprint4
Scenario Outline: PCGAssociatePMODT326 I want to be able to enter an account by Account Number and for results to populate
Given PCG Associate is able to change the role using <divisionName> <role>
When PCG Associate opens an <accountNumber> usnig an account number
Then PCG Associate is able to see the account summary

Examples:
|divisionName              |role                          |accountNumber|
|Performance Coatings Group|CPMMaint_Store_Associate_Group|677065559    |

@PCGAssociate3 @PMODT327 @Sprint4
Scenario Outline: PCGAssociatePMODT327 I want to be able to enter an account by Account Name and for results to populate
Given PCG Associate is able to change the role using <divisionName> <role> 
When PCG Associate opens an <accountName> usnig an account name
Then PCG Associate is able to see the account summary

Examples:
|divisionName              |role                          |accountName			         |
|Performance Coatings Group|CPMMaint_Store_Associate_Group|Brand Energy Solution/Pasadena|


@PCGAssociate @PMODT328 @Sprint6
Scenario Outline: PCGAssociatePMODT328 want to be able to view account Comments
Given PCG Associate is able to change the role using <divisionName> <role>
When PCG Associate opens an <accountNumber> usnig an account number
Then PCG Associate is able to able to view account Comments

Examples:
|divisionName              |role                          |accountNumber|
|Performance Coatings Group|CPMMaint_Store_Associate_Group|677065559    |

@PCGAssociate @PMODT329 @Sprint6
Scenario Outline: PCGAssociatePMODT329 want to be able to view an account's Authorized Buyers
Given PCG Associate is able to change the role using <divisionName> <role>
When PCG Associate opens an <accountNumber> usnig an account number
Then PCG Associate is able to able to view an account's Authorized Buyers

Examples:
  |divisionName              |role                          |accountNumber|
  |Performance Coatings Group|CPMMaint_Store_Associate_Group|677065559    |

@PCGAssociate @PMODT330 @Sprint6
Scenario Outline: PCGAssociatePMODT330 want to be able to view an account's Contact Information
  Given PCG Associate is able to change the role using <divisionName> <role>
  When PCG Associate opens an <accountNumber> usnig an account number
  Then PCG Associate is able to able to view an account's Contact Information

  Examples:
    |divisionName              |role                          |accountNumber|
    |Performance Coatings Group|CPMMaint_Store_Associate_Group|677065559    |

@PCGAssociate @PMODT374 @Sprint6
Scenario Outline: PCGAssociatePMODT374 want to be able to add an Authorized Buyer to an account
  Given PCG Associate is able to change the role using <divisionName> <role>
  When PCG Associate opens an <accountNumber> usnig an account number
  Then PCG Associate is able to able to add an Authorized Buyer to an account

  Examples:
    |divisionName              |role                          |accountNumber|
    |Performance Coatings Group|CPMMaint_Store_Associate_Group|677065559    |

@PCGAssociate @PMODT375 @Sprint6
Scenario Outline: PCGAssociatePMODT375 want to be able to edit an account's Authorized Buyers
  Given PCG Associate is able to change the role using <divisionName> <role>
  When PCG Associate opens an <accountNumber> usnig an account number
  Then PCG Associate is able to able to edit an account's Authorized Buyers

  Examples:
    |divisionName              |role                          |accountNumber|
    |Performance Coatings Group|CPMMaint_Store_Associate_Group|677065559    |

  @PCGAssociate @PMODT331 @Sprint6
  Scenario Outline: PCGAssociatePMODT331 able to view an account's Job Information
    Given PCG Associate is able to change the role using <divisionName> <role>
    When PCG Associate opens an <accountNumber> usnig an account number
    Then PCG Associate is able to view an account's Job Information

    Examples:
      |divisionName              |role                          |accountNumber|
      |Performance Coatings Group|CPMMaint_Store_Associate_Group|677065559    |

  @PCGAssociate @PMODT332 @Sprint6
  Scenario Outline: PCGAssociatePMODT332 want confirm the customer's Jobs are viewable in the Jobs Field
    Given PCG Associate is able to change the role using <divisionName> <role>
    When PCG Associate opens an <accountNumber> usnig an account number
    Then PCG Associate is confirm the customer's Jobs are viewable in the Jobs Field


    Examples:
      |divisionName              |role                          |accountNumber|
      |Performance Coatings Group|CPMMaint_Store_Associate_Group|677065559    |


  @PCGAssociate @PMODT333 @Sprint6
  Scenario Outline: PCGAssociatePMODT333 want to be able to confirm all permissible data displays
    Given PCG Associate is able to change the role using <divisionName> <role>
    When PCG Associate opens an <accountNumber> usnig an account number
    Then PCG Associate is to be able to confirm all permissible data displays


    Examples:
      |divisionName              |role                          |accountNumber|
      |Performance Coatings Group|CPMMaint_Store_Associate_Group|677065559    |