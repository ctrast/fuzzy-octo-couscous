$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 2,
  "name": "Google Search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CucumberOptions(features\u003d\"src/test/resources\")"
    }
  ]
});
formatter.before({
  "duration": 1238069973,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Search for bears",
  "description": "",
  "id": "google-search;search-for-bears",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "The user is on the google search page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user enters bears into the search edit",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user click the search google button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "search results list bears",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.theUserIsOnTheGoogleSearchPage()"
});
formatter.result({
  "duration": 1629051846,
  "status": "passed"
});
formatter.match({
  "location": "Search.theUserEntersBearsIntoTheSearchEdit()"
});
formatter.result({
  "duration": 96785714,
  "status": "passed"
});
formatter.match({
  "location": "Search.theUserClickTheSearchGoogleButton()"
});
formatter.result({
  "duration": 2380410657,
  "status": "passed"
});
formatter.match({
  "location": "Search.searchResultsListBears()"
});
formatter.result({
  "duration": 38387543,
  "status": "passed"
});
});