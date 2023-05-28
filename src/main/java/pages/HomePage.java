package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void addToCart(){
        //By addToCartBtn = By.xpath("//div[text()='Sauce Labs Backpack']/following-sibling::div/button[text()='ADD TO CART']");
        //*[@id="add-to-cart-sauce-labs-backpack"]
        By addCart = By.id("add-to-cart-sauce-labs-backpack");
        driver.findElement(addCart).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    public String checkCartElements(){
        By cartNum = By.className("shopping_cart_badge");
        return driver.findElement(cartNum).getText();
    }
//    public void checkPriceInCart(String name){
//        addToCart(name);
//        By price = By.cssSelector(".inventory_item:nth-child(1) .inventory_item_price");
//        By price2 = By.cssSelector("div.inventory_item_name:contains('Test.allTheThings() T-Shirt (Red)') + div.inventory_item_price");
//        String priceS = driver.findElement(price).getText();
//        openCart();
//    }

    public void openCart(){
        By cart = By.id("shopping_cart_container");
        driver.findElement(cart).click();
    }
     public void checkOut(){
        By checkout = By.id("checkout");
        driver.findElement(checkout).click();
     }

}
