package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubscribeSD {

    @Given("^I am on subscription page$")
    public void i_am_on_subscription_page() throws Throwable {

    }

    @When("^I enter below details (.+) , (.+) , (.+)$")
    public void i_enter_below_details_(String name, String email, String phone)
             {

                 System.out.println("name="+name);
                 System.out.println("email="+email);
                 System.out.println("phone="+phone);

             }

    @Then("^subscription should be added$")
    public void subscription_should_be_added() throws Throwable {

    }

    @And("^I click submit$")
    public void i_click_submit() throws Throwable {

    }

}
