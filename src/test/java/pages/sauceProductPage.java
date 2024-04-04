package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sauceProductPage {
    //constructor
    public sauceProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
    @FindBy(css="#item_4_title_link")// # id attribute in css
    public WebElement backpackItem;
    @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-onesie']//preceding-sibling::div")
    public WebElement onesiePrice;

}
