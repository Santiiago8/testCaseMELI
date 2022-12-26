package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultSearchPage extends BasePage{
    public ResultSearchPage(WebDriver driver) {
        super(driver);
    }

    By PRICE = By.xpath("//div[@class='ui-search-money-picker-dt-title']");
    By CONDICION = By.xpath("//div[@class='ui-search-filter-dt-title shops-custom-primary-font'])[2]");

    By FIRST_PRODUCT = By.xpath("//li[@class='ui-search-layout__item'])[1]");

    public void getPrice(){
        findElementByLocator(PRICE).getText();
    }

    public void getCondicion(){
        findElementByLocator(CONDICION).getText();
    }

    public void selectFirstProduct(){
        clickElement(FIRST_PRODUCT);
    }

    public void switchPage(){
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
    }
}
