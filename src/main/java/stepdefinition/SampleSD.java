package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSD {

    @Given("^browser is opened$")
    public void browser_is_opened() throws Throwable {
        System.out.println("browser is opened");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @And("^it is maximized$")
    public void it_is_maximized() throws Throwable {
        System.out.println("it is maximized");
        driver.manage().window().maximize();
    }



    WebDriver driver;

    @Given("I am on Login page")
    public void i_am_on_login_page() {
        System.out.println("I am on Login page");



        driver.get("https://stock.scriptinglogic.net/");
    }
    @When("I Enter valid username and password")
    public void i_enter_valid_username_and_password() {
        System.out.println("I Enter valid username and password");

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");

    }
    @When("I click on Login button")
    public void i_click_on_login_button() {

        System.out.println("I click on Login button");
        driver.findElement(By.name("submit")).click();

    }
    @Then("I should be on home page")
    public void i_should_be_on_home_page() {
        System.out.println("I should be on home page");

        String expected = "https://stock.scriptinglogic.net/dashboard.php1";
        String actual = driver.getCurrentUrl();

        Assert.assertEquals("msg",expected,actual);

    }


    @When("^I Enter invalid username and password$")
    public void i_enter_invalid_username_and_password() throws Throwable {
        driver.findElement(By.id("login-username")).sendKeys("ewewe");
        driver.findElement(By.id("login-password")).sendKeys("ewewe");

    }

    @Then("^we should be on same page$")
    public void we_should_be_on_same_page() throws Throwable {

        String expected = "POSNIC - Login to Control Panel";
        String actual = driver.getTitle();
        Assert.assertEquals("msg",expected,actual);
    }


    @When("^I Enter blank username and password$")
    public void i_enter_blank_username_and_password() throws Throwable {
        driver.findElement(By.id("login-username")).sendKeys("");
        driver.findElement(By.id("login-password")).sendKeys("");

    }


    /*@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_enter_username_as_something_and_password_as_something(String strArg1, String strArg2) throws Throwable {

    }*/

    @When("I enter username as {string} and password as {string}")
    public void i_enter_username_as_and_password_as(String username, String password) {
        driver.findElement(By.id("login-username")).sendKeys(username);
        driver.findElement(By.id("login-password")).sendKeys(password);
    }

}
