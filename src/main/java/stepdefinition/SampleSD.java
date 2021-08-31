package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSD {

    WebDriver driver;

    @Given("I am on Login page")
    public void i_am_on_login_page() {
        System.out.println("I am on Login page");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
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

        String expected = "https://stock.scriptinglogic.net/dashboard.php";
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
}
