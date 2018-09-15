package ExampleSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleSteps {

    private WebDriver driver;

    @Given("^type codersguru$" )
    public void type_codersguru() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "/home/marcin/IdeaProjects/Zadanie2/src/main/resources/geckodriver");
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://men-men-s-01.codersguru.pl/");

    }

    @Then("^Goto add new user$" )
    public void goto_add_new_user() throws Throwable {
        System.out.println("Wpisuje uzytkowanikow.");

    }

    @When("^type in to formular$" )
    public void type_in_to_formular() throws Throwable {
        System.out.println("Wypelniam formularz.");

    }

}