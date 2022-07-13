package uk.co.amazon.pages;

import org.openqa.selenium.By;
import uk.co.amazon.utility.Utility;

public class HomePage extends Utility {
    By acceptCookies = By.name("accept");
    By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
    By searchButton = By.xpath(("//input[@id='nav-search-submit-button']"));
    By selectItem = By.xpath("//span[normalize-space()='Dell XPS 13 9305 13.3 inch FHD Laptop, Intel Evo Core i5-1135G7, 8GB RAM, 256GB SSD, Backlit Keyboard, Fingerprint Reader, Windows 11 Home, (Platinum Silver)']");
    By setQuantity = By.id("quantity");
    By addToBasket = By.xpath("//input[@id='add-to-cart-button']");
    By noWarranty = By.xpath("//span[@id='attachSiNoCoverage']");
    By checkBasket = By.xpath("//span[@id='nav-cart-count']");
    By itemQuantity = By.xpath("//*[@id='a-autoid-5-announce']/span[2]");
    By itemPrice = By.xpath("//span[@id='sc-subtotal-amount-buybox']//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'][normalize-space()='£3,036.00']");
    By dropDown=By.xpath("//body/div[@id='a-page']/div[2]/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]/span[1]");
    By cartQty=By.xpath("//*[@id='a-popover-2']/div/div/ul/li[3]");
    By revisedPrice=By.xpath("//span[@id='sc-subtotal-amount-buybox']//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'][normalize-space()='£1,518.00']");
    By selectItem2 =By.xpath("//img[@alt='Sponsored Ad – Retractable Ballpoint Pen, Medium Point (1.0 mm), Assorted, 8 Pack']");
    By item2Price=By.xpath("//span[normalize-space()='£3.51']");

    public void acceptCookies() {
        clickOnElement(acceptCookies);
    }

    public void enterItemName(String name) {
        sendTextToElement(searchBox, name);
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }

    public void clickOnFirstProduct() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(selectItem);
    }

    public void selectQty(String qty) throws InterruptedException {
        Thread.sleep(3000);
        selectByValueFromDropDown(setQuantity, qty);
    }

    public void clickAddToBasket() {
        clickOnElement(addToBasket);
        clickOnElement(noWarranty);
    }

    public void clickOnBasket() {
        clickOnElement(checkBasket);
    }

    public String verifyItemQuantity() {
        return getTextFromElement(itemQuantity);
    }

    public String verifyItemPrice() {
        return getTextFromElement(itemPrice);
    }

    public void selectQtyTwo() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(dropDown);
        clickOnElement(cartQty);
    }

    public String verifyRevisedItemPrice() {
        return getTextFromElement(revisedPrice);
    }

    public void clickOnSecondProduct() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(selectItem2);
    }

    public String verifyItem2Price() {
        return getTextFromElement(item2Price);
    }

}
