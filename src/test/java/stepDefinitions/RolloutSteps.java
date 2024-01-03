package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import units.Credentials;

public class RolloutSteps {

    String actualUserName;String actualPassword; Credentials credentials;
    @Given("a login id of Far App Username {string} password {string}")
    public void a_login_id_of_far_app_username_password(String userName,String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("a login id of Far App Username "+userName+" and password "+password);
        credentials = new Credentials(userName,password);
    }
    @When("user enters username {string}")
    public void user_enters_username(String userName) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Entered username "+userName);
        actualUserName=userName;
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Entered username "+password);
        actualPassword=password;
    }

    @Then("user able to login in Far App")
    public void user_able_to_login_in_far_app() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue("Entered credentials are invalid",credentials.compareCredentials(actualUserName,actualPassword));
        System.out.println("User able to login successfully. ");
    }
    @Given("user is in {string} page and contains list of stores")
    public void user_is_in_page_and_contains_list_of_stores(String page) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Able to see the list of stores in " + page);
    }
    @When("user selects {string} store")
    public void user_selects_store_for_rollout(String store) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User selected " + store);
    }
    @When("user {string} the rollout date as {string}")
    public void user_selects_the_rollout_date(String mode,String date) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User "+mode+" the rollout date "+date);
    }
    @When("user clicks submit button")
    public void user_clicks_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user clicks submit button");
    }
    @Then("the store is {string} with success message {string}")
    public void the_store_is_rolled_out_with_success_message(String mode,String message) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the store is "+mode+" with success message "+message);
    }


    @When("user clicks switch off button")
    public void user_clicks_switch_off_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user clicks switch off button");
    }
}
