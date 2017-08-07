package Com;

import cucumber.api.PendingException;
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
import utilities.Action;
import utilities.BeforeAfterScn;
import utilities.UtilityHelper;


public class Search {
    Navigate navigate = new Navigate();
    Google google = new Google();
    AllPage allPage = new AllPage();
    BeforeAfterScn beforeAfterScn = new BeforeAfterScn();


    @Before()
    public void beforeScenario() {
        beforeAfterScn.before();
    }
    @After()
    public void afterScenario(){
        beforeAfterScn.after();
    }

    @Given("^The user is on the google search page$")
    public void theUserIsOnTheGoogleSearchPage() throws Throwable {
        navigate.Google();

    }

    @And("^the user enters bears into the search edit$")
    public void theUserEntersBearsIntoTheSearchEdit() throws Throwable {
        google.googSearch_edt_sendKeys("bears");

    }

    @Then("^search results list bears$")
    public void searchResultsListBears() throws Throwable {
        Boolean value = UtilityHelper.divcontainsText("www.chicagobears.com");
        Assert.assertEquals("true", value.toString());

    }

    @When("^the user presses Enter button$")
    public void theUserPressesEnterButton() throws Throwable {
       Action.edt_sendKeysEnter();
    }


    @And("^the user enters the searchvalue (.*) into the search edit$")
    public void theUserEntersTheSearchvalueSearchvalueIntoTheSearchEdit(String searchValue) throws Throwable {
        google.googSearch_edt_sendKeys(searchValue);
    }

    @Then("^search results list the (.*)$")
    public void searchResultsListTheSearchresults(String searchResults) throws Throwable {
        Boolean value = UtilityHelper.divcontainsText(searchResults);
        Assert.assertEquals("true", value.toString());
    }
}

