@testLogin
Feature: TestSite login Functionality

  Scenario: Validate the  test login sitewith valid credentials
    Given chrome Browser is opened with options
    And User is on the test site login page
    When user enters the  valid credentials "student" and "Password123"
    And user clicks on submit button
    Then user lands on the practise test automation page
    And close the browser
