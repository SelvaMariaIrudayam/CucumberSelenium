Feature: LeetCode login Functionality

  Scenario: Validate the login with valid credentials
    Given chrome Browser is opened
    And User is on the leetcode login page
    When user enters valid "SelvaMaria" and "PlanoWork28*"
    And user clicks on sign in btn
    Then user lands on the account page
