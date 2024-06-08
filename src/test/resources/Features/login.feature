#Author Selva
#Date 6 June 2024
#Description Login Test
@SmokeScenario
Feature: Login Functionality

  @SmokeTest
  Scenario Outline: Login with valid credentials
    Given user is on the login page
    When user enters valid <userName> and <passWord>
    And click on the login button
    Then user navigates to the home page

    Examples: 
      | userName | passWord       |
      | Selva    | Sel@gamil.com  |
      | Jeff     | Jeff@gmail.com |

  Scenario: Login with invalid credentials
    Given user is on the login page
    When user enters invalid <userName> and <passWord>
    And click on the login button
    Then user receives the error message
