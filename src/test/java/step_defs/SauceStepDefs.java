package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.domsnapshot.model.StringIndex;
import pages.SauceloginPage;
import pages.sauceProductPage;
import utils.ConfigUtils;
import utils.DriverUtils;

import java.util.List;

public class SauceStepDefs {
    WebDriver driver;

    @Given("I am on swag home page")
    public void i_am_on_swag_home_page() {
        driver = DriverUtils.getDriver("chrome");
        String url = ConfigUtils.getConfigProp("sauce_demo_url");
        driver.get(url);


    }

    @When("I login with valid username and password")
    public void i_login_with_valid_username_and_password() {
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='user-name']"));
        String username = ConfigUtils.getConfigProp("sauce_username");
        usernameField.sendKeys(username);
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        String password = ConfigUtils.getConfigProp("sauce_password");
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();


    }

    @Then("I should see items on page")
    public void i_should_see_items_on_page() {
        List<WebElement> items = driver.findElements(By.cssSelector(".inventory_description"));
        for (WebElement item : items) {
            System.out.println(item.getText());
        }

    }

    @When("I login with locked username and password")
    public void i_login_with_locked_username_and_password() {
        SauceloginPage slp = new SauceloginPage(driver);
        String username = ConfigUtils.getConfigProp("sauce_locked_user");
        String password = ConfigUtils.getConfigProp("sauce_password");
        slp.login(username, password);

    }

    @Given("I am on sauce swag login page")
    public void i_am_on_sauce_swag_login_page() {

    }

    @When("I am login with visual user")
    public void i_am_login_with_visual_user() {
        SauceloginPage slp = new SauceloginPage(driver);
        String username = ConfigUtils.getConfigProp("sauce_visual_username");
        String password = ConfigUtils.getConfigProp("sauce_password");
        slp.login(username, password);


    }


    @Then("I should see {string} item")
    public void i_should_see_item(String item) {
        sauceProductPage spp = new sauceProductPage(driver);


        if (item.equalsIgnoreCase("backpack")) {


            boolean isbackpackDisplayed = spp.backpackItem.isDisplayed();
            Assert.assertTrue(isbackpackDisplayed);


        } else if (item.equalsIgnoreCase("onesie")) {
            boolean isOnesieDisplayed = spp.onesiePrice.isDisplayed();
            Assert.assertTrue(isOnesieDisplayed);
        } else {
            Assert.fail("Provided item is not supported yet");


        }
    }

    @Then("price should be {double}")
    public void price_should_be(double price) {
        sauceProductPage spp = new sauceProductPage(driver);
        String priceText = spp.onesiePrice.getText();
        System.out.println(priceText.substring(1));
    }


}



















