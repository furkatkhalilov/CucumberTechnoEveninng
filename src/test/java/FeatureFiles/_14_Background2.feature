Feature: Contact functionality 2

  Scenario: Create a contact
    When User create a contact
    Then Contact should be created

  Scenario: Edit a contact
    When User edit the contact
    Then Contact should be edited

  Scenario: Delete a contact
    When User delete the contact
    Then Contact should be delete


#    does it closes window tab in each time ?

