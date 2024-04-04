package pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TumblrPage {


    public  TumblrPage(WebDriver driver){
        PageFactory.initElements(driver, this);


    }
    @FindBy(xpath = "//span[text()='Log in']//parent::button")
    public WebElement loginButton;
    @FindBy(xpath = "//button[@aria-label='Continue with email']")
    public WebElement continueWithEmailButton;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInputField;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputField;
    @FindBy(xpath = "//*[text()='Oops. There was an error. Try again.']")
    public WebElement error;





}