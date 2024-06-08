Feature: SalesForce login Functionality

  Scenario: Validate the  salesforce login with valid credentials
    Given chrome Browser is opened with all necessary options
    And User is on the salesforce  login page
    When user enters the  credentials "selvaxavier.rajam-xnxl@force.com" and "PlanoWork28*"
    And user clicks on the login button to login
    Then user lands on the salesforce home page
