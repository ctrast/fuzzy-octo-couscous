
Feature: Google Search

  As a User I want to search for things so that I can find out more information about things.

  Rules:
  - Google should resturn as many known results as possible.
  - Google Cannot search inless a search parameter is entered.

  @smoke
  Scenario Outline: Search for values
    Given The user is on the google search page
    And the user enters the searchvalue <searchvalue> into the search edit
    When the user presses Enter button
    Then search results list the <searchresults>

    Examples:
      |searchvalue|searchresults|
      |Bears      |www.chicagobears.com|
      |Polar Bears|https://en.wikipedia.org/wiki/Polar_bear|