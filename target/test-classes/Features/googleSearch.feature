@googleSearch
Feature: Google Search functionality

  Scenario: Validate google search is working
    Given Browser is opened
    And user is on the search page
    When user enters a text on the search box
    And hits enter
    Then user is navigated to the search result page
