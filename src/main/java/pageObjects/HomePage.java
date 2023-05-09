package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class HomePage extends Page {
    
    @FindBy(css = "button[data-id=\"customer-panel\"]")
    private WebElement icon;

    @FindBy(css = "button[autotrack-event-action=\"layer_disconnect\"]")
    private WebElement disconnectionButton;

    @FindBy(id ="onetrust-accept-btn-handler")
    private WebElement acceptCookiesBtn;

//    @FindBy(css ="a[data-id=\"03c3e905-55bc-4d56-8a20-b70c58cadd30\"]")
//    private WebElement product;
//
//    @FindBy(css ="button[data-tracking-label=\"03c3e905-55bc-4d56-8a20-b70c58cadd30\"]")
//    private WebElement addCartButton;
//
//    @FindBy(className = "cart-item__wrp")
//    private WebElement cartItem;
    @FindBy(css = "a[href=\"/checkout/cart/\"]")
    private WebElement cartIcon;

    @FindBy(css = "div.cart-quote__actions button:nth-child(2)")
    private WebElement emptyCartButton;

    @FindBy(css = "div.confirm-modal__actions button:nth-child(2)")
    private WebElement emptyBtn;

    @FindBy(className = "empty-cart__title")
    private WebElement emptyCartTextCconfirm;

    @FindBy (className = "m-formHeader__subTitle")
    private WebElement confirmSubscribe;

    public boolean haveIcon() {
        return shortUntil(visibilityOf(icon));
    }

    public void clickOnIcon(){
        clickOn(icon);
    }

    public void acceptCookies(){clickOn(acceptCookiesBtn);}
    public void logout(){
        clickOn(disconnectionButton);
    }

    public void goToCart(){ clickOn(cartIcon);}

    public void emptyTheCart(){clickOn(emptyCartButton);}

    public void emptyConfirm(){clickOn(emptyBtn);}

    public boolean haveText(){ return shortUntil(visibilityOf(emptyCartTextCconfirm));}

    public boolean confirmText(){ return shortUntil(visibilityOf(confirmSubscribe));}

    //    public void clickOnProduct(){
//        clickOn(product);
//    }
//
//    public void addToCart(){
//        clickOn(addCartButton);
//    }
//
//  public boolean haveElementInCart() {
//       return shortUntil(visibilityOf(cartItem));
//   }

}
