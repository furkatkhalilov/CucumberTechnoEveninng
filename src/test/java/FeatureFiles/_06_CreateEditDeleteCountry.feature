Feature: Countries functionality

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully

    @SmokeTest1
    Scenario: Create a country

      And Navigate to countries page
      When User create a country name as "AliCountryaa" code as "myCode"
      Then Success message should be displayed

    @SmokeTest1
    Scenario: Edit a country

      And Navigate to countries page
      When User edit the "AliCountryaa" to "AliEditedCountryaa"
      Then Success message should be displayed

   @SmokeTest1
    Scenario: Delete a country

      And Navigate to countries page
      When User delete the "AliEditedCountryaa"
      Then Success message should be displayed


