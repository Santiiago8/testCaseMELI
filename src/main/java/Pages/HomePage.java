package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    By INPUT_SEARCH = By.xpath("//input[@name='as_word']");
    By BUTTON_SEARCH =  By.xpath("//button[@class='nav-search-btn']");

    public void completeWithProduct (String product){
        completeElementWithStrg(INPUT_SEARCH, product);
    }

    public void selectSearch(){
        clickElement(BUTTON_SEARCH);
    }
}
