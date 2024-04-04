package step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigUtils;
import utils.DriverUtils;

import java.time.Duration;
import java.util.List;

public class HerokuappStepDefs {
    WebDriver driver;

    @When("I navigate to home page")
    public void i_navigate_to_home_page() {
        driver = DriverUtils.getDriver("chrome");
        String url = ConfigUtils.getConfigProp("url");
        driver.get(url);


    }

    @Then("should see {int} links")
    public void should_see_links(int int1) {
        List<WebElement> linkElementList = driver.findElements(By.xpath("//li//a"));
        int linksCount = linkElementList.size();
        Assert.assertEquals(int1, linksCount);

    }
    @When("I navigate to Checkboxes page")
    public void i_navigate_to_checkboxes_page() {
        driver=DriverUtils.getDriver("chrome");
        String url=ConfigUtils.getConfigProp("url2");
        driver.navigate().to(url);

    }
    @Then("I navigate page header")
    public void i_validate_page_header() {
       WebElement header  = driver.findElement(By.tagName("h3"));
        System.out.println(header.getText());
        Assert.assertEquals("Checkboxes", header.getText());

    }



    }



