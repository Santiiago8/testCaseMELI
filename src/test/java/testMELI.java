import Pages.HomePage;
import Pages.ProductPage;
import Pages.ResultSearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testMELI {

    WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "./src/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        //driver.close();
    }

    public void goToLink(String link){
        driver.get(link);
    }

    @Test
    public void testMeli(){
        String link = "https://www.mercadolibre.com.ar/";
        goToLink(link);
        HomePage homePage = new HomePage(driver);
        homePage.completeWithProduct("auto");
        homePage.selectSearch();

        ResultSearchPage resultSearchPage = new ResultSearchPage(driver);
        Assert.assertEquals("Precio",resultSearchPage.getPrice());
        Assert.assertEquals("Condición", resultSearchPage.getCondition());
        resultSearchPage.selectFirstProduct();

        resultSearchPage.switchPage();

        ProductPage productPage = new ProductPage(driver);
        productPage.selectSecondImage();
        Assert.assertEquals(productPage.getPrice(), "15.099.000");

    }
}
