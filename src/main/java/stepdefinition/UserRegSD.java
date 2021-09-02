package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class UserRegSD {

    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {

        System.out.println("I am on user registration page");
    }
    @When("I enter below details")
    public void i_enter_below_details(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.


        List<String> data = dataTable.asList();

        System.out.println("name="+data.get(0));
        System.out.println("contact="+data.get(1));
        System.out.println("email="+data.get(2));
        System.out.println("city="+data.get(3));
        System.out.println("Job role="+data.get(4));

    }
    @When("I click on submit button")
    public void i_click_on_submit_button() {
        System.out.println("I click on submit button");
    }
    @Then("user should be added")
    public void user_should_be_added() {
        System.out.println("user should be added");
    }
}
