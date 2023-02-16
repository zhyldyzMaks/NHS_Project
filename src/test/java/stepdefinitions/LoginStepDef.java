package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class LoginStepDef {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    @Given("User navigates to NHS website")
    public void user_navigates_to_nhs_website() {
        driver.get(ConfigReader.readProperty("nhsurl"));
    }

    @When("User provides username and password")
    public void user_provides_username_and_password() {
        loginPage.login(ConfigReader.readProperty("username"),ConfigReader.readProperty("password"));
    }
    @When("User clicks on the signIn button")
    public void user_clicks_on_the_signIn_button() {
        loginPage.pressSignInButton();

    }
    @Then("User validates the title {string}")
    public void user_validates_the_title(String title) {
        Assert.assertEquals("NHS patients",driver.getTitle());
        loginPage.pressLogOutButton();

    }
    @Given("user gets to the NHS website")
    public void user_gets_to_the_nhs_website() {
       driver.get(ConfigReader.readProperty("nhsurl"));
    }


    @When("user provides username and empty password and clicks on signin button")
    public void user_provides_username_and_empty_password_and_clicks_on_signin_button() {
        loginPage.login(ConfigReader.readProperty("username"),"");
    }

    @Then("user validates the error message {string}")
    public void user_validates_the_error_message(String errorMessage) {


    }



}
