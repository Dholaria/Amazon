package uk.co.amazon.testsuite;

import org.junit.Assert;
import org.testng.annotations.Test;
import uk.co.amazon.pages.HomePage;
import uk.co.amazon.testbase.TestBase;

public class AmazonTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldAddProductToCart() throws InterruptedException {
        homePage.acceptCookies();
        homePage.enterItemName("Dell Laptop");
        homePage.clickOnSearchButton();
        homePage.clickOnFirstProduct();
        homePage.selectQty("4");
        homePage.clickAddToBasket();
        homePage.clickOnBasket();
        String expQty = "4";
        String actualQty = homePage.verifyItemQuantity();
        Assert.assertEquals("Qty not Matched", expQty, actualQty);
        String expPrice = "£3,036.00";
        String actualPrice = homePage.verifyItemPrice();
        Assert.assertEquals("Price not Matched", expPrice, actualPrice);
    }

    @Test
    public void verifyUserShouldChangeProductQuantityFromCart() throws InterruptedException {
        verifyUserShouldAddProductToCart();
        homePage.selectQtyTwo();
        String expQty = "2";
        String actualQty = homePage.verifyItemQuantity();
        Assert.assertEquals("Qty not Matched", expQty, actualQty);
        String expPrice = "£1,518.00";
        String actualPrice = homePage.verifyRevisedItemPrice();
        Assert.assertEquals("Price not Matched", expPrice, actualPrice);
    }

    @Test
    public void verifyUserShouldAddTwoProductsInCart() throws InterruptedException {
        homePage.acceptCookies();
        homePage.enterItemName("Dell Laptop");
        homePage.clickOnSearchButton();
        homePage.clickOnFirstProduct();
        homePage.selectQty("4");
        homePage.clickAddToBasket();
        homePage.enterItemName("pen");
        homePage.clickOnSearchButton();
        homePage.clickOnSecondProduct();
        homePage.selectQty("2");
        homePage.clickAddToBasket();
        homePage.clickOnBasket();
        String expQty = "4";
        String actualQty = homePage.verifyItemQuantity();
        Assert.assertEquals("Qty not Matched", expQty, actualQty);
        String expPrice = "£3,036.00";
        String actualPrice = homePage.verifyItemPrice();
        Assert.assertEquals("Price not Matched", expPrice, actualPrice);
        String expQty2 = "2";
        String actualQty2 = homePage.verifyItemQuantity();
        Assert.assertEquals("Qty not Matched", expQty2, actualQty2);
        String expPrice2 = "£3.51";
        String actualPrice2 = homePage.verifyItem2Price();
        Assert.assertEquals("Price not Matched", expPrice2, actualPrice2);
    }



}
