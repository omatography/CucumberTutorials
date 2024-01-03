Feature: Far Application Basic Scenarios

  Background:
    Given a login id of Far App Username "omkar" password "12345"
    When user enters username "omkar"
    And user enters password "12345"
    Then user able to login in Far App

  @Smoke @Regression
  Scenario: Create Rollout
    Given user is in "create rollout" page and contains list of stores
    When user selects "AIMT" store
    And user "selects" the rollout date as "05/12/2023"
    And user clicks submit button
    Then the store is "rolled out" with success message "AIMT Rolled out successfully"
  @Smoke
  Scenario: Modify Rollout
    Given user is in "modify rollout" page and contains list of stores
    When user selects "AIMT" store
    And user "changes" the rollout date as "05/12/2023"
    And user clicks submit button
    Then the store is "rollout modified" with success message "AIMT Updated successfully"
  @Smoke
  Scenario: Switch off Rollout
    Given user is in "switch off rollout" page and contains list of stores
    When user selects "AIMT" store
    And user clicks switch off button
    Then the store is "switched off" with success message "AIMT Swithed off successfully"