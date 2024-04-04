package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigUtils;
import utils.DriverUtils;

import java.time.Duration;

public class GoogleStepDefs {
    WebDriver driver;

    @Given("I am on google home page")
    public void i_am_on_google_home_page() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        String url=ConfigUtils.getConfigProp("url4");
        driver.get(url);



    }
    @When("I search for CodeFish")
    public void i_search_for_code_fish() {
        WebElement searchField= driver.findElement(By.name("q"));
        searchField.sendKeys("Codefish"+ Keys.ENTER);

    }
    @Then("I should get results")
    public void i_should_get_results() {
        WebElement result= driver.findElement(By.cssSelector("#result-stats"));
        String resultsText= result.getText();
        System.out.println(resultsText);

    }
    @Given("user on google page home")
    public void user_on_google_page_home() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

    }
    @When("user found  for st patrick's day {int}")
    public void user_found_for_st_patrick_s_day(Integer int1) {
        WebElement searchPatrickDays= driver.findElement(By.name("q"));
        searchPatrickDays.sendKeys("st patrick's day 2024",Keys.ENTER);

    }
    @Then("user  get Patrick's Day officially takes place on Sunday, March {int}")
    public void user_get_patrick_s_day_officially_takes_place_on_sunday_march(int int1) {
        WebElement getPatricksDay= driver.findElement(By.xpath("//span[@class='hgKElc']"));
        String getPatricksDayText= getPatricksDay.getText();
        System.out.println(getPatricksDayText);

    }

















}
