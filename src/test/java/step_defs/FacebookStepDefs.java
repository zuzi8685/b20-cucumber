package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.FacebookHomePage;
import pages.TumblrPage;
import utils.ConfigUtils;
import utils.DriverUtils;

public class FacebookStepDefs {
    private WebDriver driver;
    private FacebookHomePage fhp;
    @Given("I am on facebook home page")
    public void i_am_on_facebook_home_page() {
        driver=DriverUtils.getDriver("chrome");
        driver.get("https://www.facebook.com/");
    }
    @When("I enter invalid Facebook eamail {string}")
    public void i_enter_invalid_facebook_eamail(String email) {
        fhp= new FacebookHomePage(driver);
        fhp.emailField.sendKeys(email);

    }
    @When("I enter invalid Facebook password {string}")
    public void i_enter_invalid_facebook_password(String password) {
        fhp.passwordField.sendKeys(password);
        fhp.loginButton.click();
    }
    @Then("I should get error message: {string}")
    public void i_should_get_error_message(String expectedErrorMessage) {
        String actualErrorMessage=fhp.error.getText();

        System.out.println(expectedErrorMessage);
        System.out.println(actualErrorMessage);
        Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage));
    }

    }

