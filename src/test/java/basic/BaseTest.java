package basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
//import pages.LoginPage;
//import pages.home.HomePage;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private LoginPage loginPage;
    protected HomePage homePage;

    @BeforeSuite
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        String URL = "https://www.saucedemo.com/";

        driver.get(URL);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }
    @BeforeClass
    public void testSuccessfulLogin(){
        loginPage = new LoginPage(driver);
        //write down your username and password
        homePage = loginPage.Login("standard_user","secret_sauce");
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
