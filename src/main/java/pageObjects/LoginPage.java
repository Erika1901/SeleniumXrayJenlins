package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {
    
    @FindBy(id = "username")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(css = "button[data-sitekey=\"6Let9EkbAAAAALwFg37LNL0RhBF0AC9E0k1f18bD\"]")
    private WebElement connectionButton;

    @FindBy( id = "signup__button")
    private WebElement signupBtn;

    @FindBy(css = "div.o-formBox__row div:nth-child(1)")
    private WebElement civility;

    @FindBy(name= "firstName")
    private WebElement firstnameField;

    @FindBy(name = "LastName")
    private WebElement nameField;

    @FindBy(name = "phoneValue")
    private WebElement numberField;

    @FindBy(name= "email")
    private WebElement email_field;

    @FindBy(name= "password")
    private WebElement password_field;

    @FindBy(xpath= "//div[@aria-labelledby=\"emailConsent\"]/div[1]/label")
    private WebElement news_email;

    @FindBy(xpath = "//div[@aria-labelledby=\"phoneConsent\"]/div[2]/label")
    private WebElement newsSMS;

    @FindBy ( css = "div.o-formBox__actions button:nth-child(1)")
    private WebElement creationBtn;

    public void load() {
        get(ENV.getUrl("/auth/"));
    }

    public void fillLoginForm(String email, String password) {
        sendKeysSlowly(emailField, email);
        sendKeysSlowly(passwordField, password);
    }

    public void login() {
        clickOn(connectionButton);
       }

    public void signUp(){ clickOn(signupBtn);}

    public void chooseCivility(){
        clickOn(civility);
    }

    public void fillInTheFields(String firstname, String name, String number, String email, String password){
        sendKeysSlowly(firstnameField, firstname);
        sendKeysSlowly(nameField, name);
        sendKeysSlowly(numberField, number);
        sendKeysSlowly(email_field, email);
        sendKeysSlowly(password_field, password);
    }

    public void chooseOffer(){
        clickOn(news_email);
        clickOn(newsSMS);
    }

    public void creationAccount(){
        clickOn(creationBtn);
    }
}


