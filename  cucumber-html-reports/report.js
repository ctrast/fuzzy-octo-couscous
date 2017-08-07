$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Com/Search.feature");
formatter.feature({
  "line": 2,
  "name": "Google Search",
  "description": "\nAs a User I want to search for things so that I can find out more information about things.\n\nRules:\n- Google should resturn as many known results as possible.\n- Google Cannot search inless a search parameter is entered.",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Search for values",
  "description": "",
  "id": "google-search;search-for-values",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "The user is on the google search page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "the user enters the searchvalue \u003csearchvalue\u003e into the search edit",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the user presses Enter button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "search results list the \u003csearchresults\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "google-search;search-for-values;",
  "rows": [
    {
      "cells": [
        "searchvalue",
        "searchresults"
      ],
      "line": 18,
      "id": "google-search;search-for-values;;1"
    },
    {
      "cells": [
        "Bears",
        "www.chicagobears.com"
      ],
      "line": 19,
      "id": "google-search;search-for-values;;2"
    },
    {
      "cells": [
        "Polar Bears",
        "https://en.wikipedia.org/wiki/Polar_bear"
      ],
      "line": 20,
      "id": "google-search;search-for-values;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2044522046,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Search for values",
  "description": "",
  "id": "google-search;search-for-values;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "The user is on the google search page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "the user enters the searchvalue Bears into the search edit",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the user presses Enter button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "search results list the www.chicagobears.com",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Search.theUserIsOnTheGoogleSearchPage()"
});
formatter.result({
  "duration": 1474643947,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bears",
      "offset": 32
    }
  ],
  "location": "Search.theUserEntersTheSearchvalueSearchvalueIntoTheSearchEdit(String)"
});
formatter.result({
  "duration": 2354815125,
  "status": "passed"
});
formatter.match({
  "location": "Search.theUserPressesEnterButton()"
});
formatter.result({
  "duration": 1200537295,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "www.chicagobears.com",
      "offset": 24
    }
  ],
  "location": "Search.searchResultsListTheSearchresults(String)"
});
formatter.result({
  "duration": 45061882,
  "status": "passed"
});
formatter.after({
  "duration": 148002081,
  "status": "passed"
});
formatter.before({
  "duration": 1462992702,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Search for values",
  "description": "",
  "id": "google-search;search-for-values;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "The user is on the google search page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "the user enters the searchvalue Polar Bears into the search edit",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the user presses Enter button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "search results list the https://en.wikipedia.org/wiki/Polar_bear",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Search.theUserIsOnTheGoogleSearchPage()"
});
formatter.result({
  "duration": 1236872670,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Polar Bears",
      "offset": 32
    }
  ],
  "location": "Search.theUserEntersTheSearchvalueSearchvalueIntoTheSearchEdit(String)"
});
formatter.result({
  "duration": 1621540269,
  "status": "passed"
});
formatter.match({
  "location": "Search.theUserPressesEnterButton()"
});
formatter.result({
  "duration": 1105394589,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://en.wikipedia.org/wiki/Polar_bear",
      "offset": 24
    }
  ],
  "location": "Search.searchResultsListTheSearchresults(String)"
});
formatter.result({
  "duration": 85019623,
  "status": "passed"
});
formatter.after({
  "duration": 133031820,
  "status": "passed"
});
});