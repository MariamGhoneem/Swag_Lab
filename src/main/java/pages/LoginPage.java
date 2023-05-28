package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import pages.home.HomePage;

public class LoginPage {
    private WebDriver driver;
    private By NameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage Login(String username, String password){
        driver.findElement(NameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
}
