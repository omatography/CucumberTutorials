package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import units.Product;
import units.Search;

public class SearchSteps {

    Product p;
    @Given("I have a search field in amazon")
    public void i_have_a_search_field_in_amazon() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("step1");
    }
    @When("I search {string} in search")
    public void i_search_in_search(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("step2");
        p = new Product("Macbook",10000);
    }
    @Then("Product named {string} with price {int} will appear")
    public void product_named_with_price_will_appear(String string, int price) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("step3");
        Search s = new Search();
        Assert.assertTrue("Product Name not in the list",s.searchProduct(p,string));

    }

}
