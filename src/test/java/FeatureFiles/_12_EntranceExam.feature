Feature: Entrance Examinations functionality

  @RegressionTest
  Scenario: Create exam

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Click in the leftnav class
      | EntranceExamsParent |
      | EntranceExamsSetup  |
      | EntranceExamsChild  |
    And Click on the element in the dialog content class
      | AddButton |
    When User sending the keys in the dialog content class
      | NameInput | AliExam |
    And Click in the formsClass class
      | academicPeriod |
      | Option1        |
      | gradeLevel     |
      | Option1        |
      | documentType   |
      | Option1        |
    And Click on the element in the dialog content class
      | SaveButton |
    Then Success message should be displayed
    And Click in the leftnav class
      | EntranceExamsParent |
      | EntranceExamsSetup  |
      | EntranceExamsChild  |
    When User delete the "AliExam"
    Then Success message should be displayed


  Scenario: Create exam

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Click in the leftnav class
      | EntranceExamsParent |
      | EntranceExamsSetup  |
      | EntranceExamsChild  |
    And Click on the element in the dialog content class
      | AddButton |
    When User sending the keys in the dialog content class
      | NameInput | AliExam |
    And Click in the formsClass class
      | academicPeriod |
      | Option2        |
      | gradeLevel     |
      | Option2        |
      | documentType   |
      | Option2        |
    And Click on the element in the dialog content class
      | SaveButton |
    Then Success message should be displayed
    And Click in the leftnav class
      | EntranceExamsParent |
      | EntranceExamsSetup  |
      | EntranceExamsChild  |
    When User delete the "AliExam"
    Then Success message should be displayed


#    Scenario outline vs Data table

#    What is Data table in cucumber?

 