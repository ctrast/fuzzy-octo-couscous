import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import searchApp.AllPage;
import searchApp.Google;
import searchApp.Navigate;

public class Search {
    Navigate navigate = new Navigate();
    Google google = new Google();
    AllPage allPage = new AllPage();
    @Given("^The user is on the google search page$")
    public void theUserIsOnTheGoogleSearchPage() throws Throwable {
        navigate.Google();
        throw new PendingException();
    }

    @And("^the user enters bears into the search edit$")
    public void theUserEntersBearsIntoTheSearchEdit() throws Throwable {
        google.googSearch_edt_sendKeys("bears");
        throw new PendingException();
    }

    @When("^the user click the search google button$")
    public void theUserClickTheSearchGoogleButton() throws Throwable {
        google.googSearchMagGlass_btn_click();
        throw new PendingException();
    }

    @Then("^search results list bears$")
    public void searchResultsListBears() throws Throwable {
        Assert.assertEquals("true", allPage.findLinkText("www.chicagobears.com"));
        throw new PendingException();
    }
}
