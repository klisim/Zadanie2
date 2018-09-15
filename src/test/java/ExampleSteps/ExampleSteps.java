package ExampleSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//update
public class ExampleSteps {

    private WebDriver driver;

    @Given("^type codersguru$" )
    public void type_codersguru() {
        System.setProperty("webdriver.gecko.driver", "/home/marcin/IdeaProjects/Zadanie2/src/main/resources/geckodriver");
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://men-men-s-01.codersguru.pl/");

    }

    @Then("^Goto add new user$" )
    public void goto_add_new_user() {
        driver.findElement(By.xpath("/html/body/section[3]/div/form/input[2]")).click();

    }

    @When("^type in to formular$" )
    public void type_in_to_formular() {
        driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_email\"]")).sendKeys("username12@porkds.pl");

    }
    @And("^type username$")
    public void type_username() {
        driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_name\"]")).sendKeys("username12");

    }

    @And("^type Last Name$")
    public void type_Last_Name() {
        driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_lastname\"]")).sendKeys("dasda");

    }

    @When("^Password$")
    public void password() {
        driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_plainPassword_first\"]")).sendKeys("username12");

    }

    @When("^Repeat password$")
    public void repeat_password() {
        driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_plainPassword_second\"]")).sendKeys("username12");
        //throw new PendingException();
    }

    @When("^Type City Name$")
    public void type_City_Name() {
        driver.findElement(By.xpath("//*[@id=\"form_city\"]")).sendKeys("username12");
        //throw new PendingException();
    }

    @When("^Type Zip-Code$")
    public void type_Zip_Code() {
        driver.findElement(By.xpath("//*[@id=\"form_postal_code\"]")).sendKeys("54-100");
        //throw new PendingException();
    }

    @When("^Type Street Name$")
    public void type_Street_Name() {
        driver.findElement(By.xpath("//*[@id=\"form_street\"]")).sendKeys("username12");
        //throw new PendingException();
    }

    @When("^Type Home Number$")
    public void type_Home_Number() {
        driver.findElement(By.xpath("//*[@id=\"form_number\"]")).sendKeys("username12");
        //throw new PendingException();
    }

    @When("^Click \"([^\"]*)\"$")
    public void click(String arg1) {
        driver.findElement(By.xpath("/html/body/div/div/div/form/div[12]/input ")).click();
        //throw new PendingException();
    }

    @When("^Click register$")
    public void click_register() {
        driver.findElement(By.xpath("//*[@id=\"register-submit-btn\"]")).click();
        //throw new PendingException();
    }
}