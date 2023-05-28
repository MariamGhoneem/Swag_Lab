package checkOut;

import basic.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CheckOut extends BaseTest{

    @Test
    public void itemAddedSuccessfully(){
        homePage.addToCart();
        assertEquals(homePage.checkCartElements(),"1");
    }

    @Test
    public void itemPriceIsRight(){

    }
    @Test
    public void checkOut(){
        homePage.openCart();
        homePage.checkOut();
    }

}
