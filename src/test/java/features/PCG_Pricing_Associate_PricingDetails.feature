@PCGAssociate_pricingDeatails
Feature: Validate pricing details with PCG Associate role

  Background:
    Given PCG Associate is on dashboard page
    When PCG Associate clicks on PCG Associate profile link

  @PCGAssociate @PMODT334 @Sprint6
  Scenario Outline: PCGAssociatePMODT334 I want to be able to verify account summary fields are displaying on the pricing tab/header
    Given PCG Associate is able to change the role using <divisionName> <role>
    When PCG Associate opens an <accountNumber> usnig an account number
    Then PCG Associate is able to see the account summary on the pricing tab header

    Examples:
      |divisionName              |role                          |accountNumber|
      |Performance Coatings Group|CPMMaint_Store_Associate_Group|677065559    |
