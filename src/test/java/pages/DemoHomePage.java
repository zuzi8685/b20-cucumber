package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoHomePage {
    public DemoHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
@FindBy(xpath = "//input[@name='username']")
    public WebElement userName;
    @FindBy(xpath="//input[@name='password']")
    public WebElement password;

    @FindBy(id = "Pharmacy")
    public WebElement pharmacy;
    @FindBy(xpath="//input[@id='loginButton']")
    public WebElement loginBut;
    @FindBy(xpath = "//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")
    public  WebElement registerPatient;
    @FindBy(xpath = "//input[@name='givenName']")
    public WebElement givenName;
    @FindBy(xpath="//input[@name='familyName']")
    public WebElement familyName;
    @FindBy(xpath = "//button[@id='next-button']")
    public WebElement clickNextButton;
    @FindBy(xpath="//option[text()='Female']")
    public WebElement gender;

    @FindBy(xpath = "//button[@id='next-button']")
    public WebElement buttonClick;
    @FindBy(xpath="//input[@id='birthdateDay-field']")
    public WebElement  birthdate ;
    @FindBy(xpath = "//select[@id='birthdateMonth-field']")
    public WebElement month ;
    @FindBy(xpath="//input[@id='birthdateYear-field']")
    public WebElement year;
    @FindBy(xpath = "//button[@id='next-button']")
    public WebElement clickButton;

    @FindBy(xpath="//input[@id='address1']")
    public WebElement address1;
    @FindBy(xpath="//input[@name='address2']")
    public WebElement address2;
    @FindBy(xpath="//button[@id='next-button']")
    public WebElement clickBut;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//button[@class='confirm right']")
    public WebElement clicked;
    @FindBy(xpath = "//select[@id='relationship_type']")
    public WebElement relationship;
    @FindBy(xpath = "//input[@placeholder='Person Name']")
    public WebElement personName;
    @FindBy(xpath = "//button[@id='next-button']")
    public WebElement clickField;
    @FindBy(xpath = "//input[@id='submit']")
    public WebElement confirm;








    }







