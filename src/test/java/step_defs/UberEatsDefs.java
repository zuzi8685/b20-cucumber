package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigUtils;
import utils.DriverUtils;

public class UberEatsDefs {
    WebDriver driver;
    @When("user search for Uber eats")
    public void user_search_for_uber_eats() {
        driver=DriverUtils.getDriver("chrome");
        String url=ConfigUtils.getConfigProp("url3");
        driver.navigate().to(url);

    }
    @Then("user can order delivery near you")
    public void user_can_order_delivery_near_you() {
        WebElement uber  = driver.findElement(By.xpath("//h1[text()='Order delivery near you']"));
        Assert.assertEquals("Order delivery near you", uber.getText());


    }


    }



