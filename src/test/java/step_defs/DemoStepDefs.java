package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.DemoHomePage;
import utils.ConfigUtils;
import utils.DriverUtils;

public class DemoStepDefs {
    private WebDriver driver;
    private DemoHomePage dhf;
    @Given("I am demo home page")
    public void i_am_demo_home_page() {
        driver=DriverUtils.getDriver("chrome");
        String url=ConfigUtils.getConfigProp("demo_openmrs");
        driver.get(url);

    }
    @When("I login with  username")
    public void i_login_with_username() {
        DemoHomePage dhf=new DemoHomePage(driver);
        dhf.userName.sendKeys("admin");

    }
    @When("I login with password")
    public void i_login_with_password() {
        DemoHomePage dhf=new DemoHomePage(driver);
        dhf.password.sendKeys("Admin123");


    }
    @When("I locate with pharmacy")
    public void i_locate_with_pharmacy() {
        DemoHomePage dhf=new DemoHomePage(driver);
        dhf.pharmacy.click();
        dhf.loginBut.click();

    }
    @When("I click register new patient")
    public void i_click_register_new_patient() {
        DemoHomePage dhf=new DemoHomePage(driver);
        dhf.registerPatient.click();



    }
    @When("I enter all required information")
    public void i_enter_all_required_information(io.cucumber.datatable.DataTable dataTable) {
        DemoHomePage dhf=new DemoHomePage(driver);
        dhf.givenName.sendKeys("Anna");
        dhf.familyName.sendKeys("Annand");
        dhf.clickNextButton.click();
        dhf.gender.click();
        dhf.buttonClick.click();
        dhf. birthdate.sendKeys("01");
        Select select=new Select(dhf.month  );
        select.selectByVisibleText("January");
        dhf.year.sendKeys("2011");
        dhf.clickButton.click();
        dhf.address1.sendKeys("2220W Farwell");
        dhf.address2.sendKeys("2220 E.Devon");
        dhf.clickBut.click();
        dhf.phoneNumber.sendKeys("1234567");
        dhf.clicked.click();
        Select select1=new Select(dhf.relationship);
        select1.selectByVisibleText("Sibling");
        dhf.personName.sendKeys("John White");
        dhf.clickField.click();
        dhf.confirm.click();






    }




}




