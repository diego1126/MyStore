package co.com.test.store.stepdefinitions.session;

import co.com.test.store.tasks.LoginTks;
import co.com.test.store.utils.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class LoginStep extends HomePage {
    public HomePage homePage = new HomePage();



    @Given("^that I am in the portal$")
    public void that_i_am_in_the_portal() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }
    @When("^Digit my (.*) and (.*)$")
    public void digit_my_diego_alvarez_castor_com_co_and_santi1126(String username, String password) {
        user.wasAbleTo(
                LoginTks.signInStore(username,password)
        );
    }
    @Then("^I can do my shopping$")
    public void i_can_do_my_shopping() {

    }
}
