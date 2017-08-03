package StepDef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import searchApp.AllPage;
import searchApp.Google;
import searchApp.Navigate;
import utilities.BeforeScn;
import utilities.UtilityHelper;


public class Search {
    Navigate navigate = new Navigate();
    Google google = new Google();
    AllPage allPage = new AllPage();
    BeforeScn beforeScn = new BeforeScn();


    @Before()
    public void beforeScenario() {
        beforeScn.init();
    }

    @Given("^The user is on the google search page$")
    public void theUserIsOnTheGoogleSearchPage() throws Throwable {
        navigate.Google();

    }

    @And("^the user enters bears into the search edit$")
    public void theUserEntersBearsIntoTheSearchEdit() throws Throwable {
        google.googSearch_edt_sendKeys("bears");

    }

    @When("^the user click the search google button$")
    public void theUserClickTheSearchGoogleButton() throws Throwable {
        google.googSearch_btn_click();

    }

    @Then("^search results list bears$")
    public void searchResultsListBears() throws Throwable {
        Boolean value = UtilityHelper.divcontainsText("www.chicagobears.com");
        Assert.assertEquals("true", value.toString());

    }

}

