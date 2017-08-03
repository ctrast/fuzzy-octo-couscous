@CucumberOptions(features="src/test/resources")
Feature: Google Search
  @smoke
  Scenario: Search for bears
    Given The user is on the google search page
    And the user enters bears into the search edit
    When the user click the search google button
    Then search results list bears