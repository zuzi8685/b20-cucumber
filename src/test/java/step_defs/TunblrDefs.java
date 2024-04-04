package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.SauceloginPage;
import pages.TumblrPage;
import utils.ConfigUtils;
import utils.DriverUtils;

public class TunblrDefs {
    private WebDriver driver;

    @Given("I am Tumblr home page")
    public void i_am_tumblr_home_page() {
        driver=DriverUtils.getDriver("chrome");
        String url=ConfigUtils.getConfigProp("tumblr_home_url");
        driver.get(url);
    }

    @When("I click login button")
    public void i_click_login_button() {
        TumblrPage thp=new TumblrPage(driver);
        thp.loginButton.click();

    }

    @When("I click continue with email")
    public void i_click_continue_with_email() {
        TumblrPage thp=new TumblrPage(driver);
        thp.continueWithEmailButton.click();


    }

    @When("I enter {string} email")
    public void i_enter_email(String email) {
        TumblrPage thp=new TumblrPage(driver);
        thp.emailInputField.sendKeys(email+ Keys.ENTER);




    }

    @When("I enter {string} password")
    public void i_enter_testtest_password(String password) {
        TumblrPage thp=new TumblrPage(driver);
        thp.passwordInputField.sendKeys(password+Keys.ENTER);

    }

    @Then("I should get {string} error")
    public void i_should_get_error(String expectedError) {
        TumblrPage thp=new TumblrPage(driver);
        String actualError=thp.error.getText();
        Assert.assertEquals(expectedError,actualError);

    }
    }
