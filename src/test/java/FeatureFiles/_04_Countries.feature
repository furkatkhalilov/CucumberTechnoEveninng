Feature: Countries functionality

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to countries page

  @SmokeTest
  Scenario: Create a country

    When User create a country
    Then Success message should be displayed

#    How to send a data from feature file to step definition
  @SmokeTest
  Scenario: Create a country with different data

    When User create a country name as "My country" code as "myCode"
    Then Success message should be displayed

  @SmokeTest
  Scenario: Create a country with different data

    When User create a country name as "Country name" code as "code1"
    Then Success message should be displayed

#StaleElementReferenceException
#   Element was in the page but it is not in the page any more or page is refreshed basically DOM is changes

# After login Clicking on the setup > parameters > countries -- selenium is finding the plus icon in the dashboard page
#                                -- Chrome is swithcing the countries page so selenium is throw StaleElementReferenceException

# we should wait until specific step is completed and then selenium should click on add button
