

Feature: Contact functionality


#  Background is working as before method in testNG
#   It is running before each scenario in the feature file
#   It is not affecting to other feature files

  Background: Contact scenario background
    Given Navigateo to our website
    When Enter the username and password
    Then User should login as expected
    And Navigate to contaact page

  Scenario: Create a contact
    When User create a contact
    Then Contact should be created

  Scenario: Edit a contact
    When User edit the contact
    Then Contact should be edited

  Scenario: Delete a contact
    When User delete the contact
    Then Contact should be delete

#  Background Done
#  Runner helping us to run multiple feature files and scenarious
#  tags
#  report