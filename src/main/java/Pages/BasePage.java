package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElementByLocator(By locator){
        return driver.findElement(locator);
    }
    public void clickElement(By locator){
        findElementByLocator(locator).click();
    }

    public void completeElementWithKeys(By locator, Keys key){
        findElementByLocator(locator).sendKeys(key);
    }
    public void completeElementWithStrg(By locator, String content){
        findElementByLocator(locator).sendKeys(content);
    }
}
