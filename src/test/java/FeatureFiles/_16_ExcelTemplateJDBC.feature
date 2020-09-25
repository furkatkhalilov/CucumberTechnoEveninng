Feature: Testing excel Template

  Scenario: Excel template with JDBC

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Click in the leftnav class
      | reports              |
      | setupUnderTheReports |
      | excel_Template       |

    Then Send the query to database "Select * FROM ExcelTemplate;" get the column 2


