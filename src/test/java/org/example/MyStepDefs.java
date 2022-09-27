package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    AmazonHomePage amazonHomePage = new AmazonHomePage();
    PageAfterSearch pageAfterSearch = new PageAfterSearch();
    BasketPage basketPage = new BasketPage();

    @Given("user is on the homepage of amazon")
    public void user_is_on_the_homepage_of_amazon() {
        // Write code here that turns the phrase above into concrete actions
        amazonHomePage.validateCurrentUrl();
    }
    @When("user login to amazon")
    public void user_login_to_amazon() {
        // Write code here that turns the phrase above into concrete actions
        //amazonHomePage.loginToAmazon();
    }
    @When("user Search desk lamp in the search box")
    public void user_search_in_the_search_box () {
        // Write code here that turns the phrase above into concrete actions
        amazonHomePage.searchAnItem();
    }
    @When("user verify search result page")
    public void user_verify_search_result_page() {
        // Write code here that turns the phrase above into concrete actions
        amazonHomePage.verifySearchResults();
    }
    @When("user add the desired item to the basket")
    public void user_add_the_desired_item_to_the_basket() {
        // Write code here that turns the phrase above into concrete actions
        amazonHomePage.selectItemToAdd();
    }
    @When("user increases the quantity by two")
    public void user_increases_the_quantity_by_two() {
        // Write code here that turns the phrase above into concrete actions
        pageAfterSearch.changeQuantityInBasket();
    }
    @Then("user should validate items and the subtotal")
    public void user_should_validate_items_and_the_subtotal() {
        // Write code here that turns the phrase above into concrete actions
        basketPage.validateSubtotal();
    }

}
