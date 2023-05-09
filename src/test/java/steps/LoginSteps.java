package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps {
    
    private LoginPage loginPage;

    public LoginSteps(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        loginPage.load();
    }


    @When("User fill in the connection form with {string} and {string}")
    public void userFillInTheConnectionFormWithAnd(String email, String password) {
        loginPage.fillLoginForm(email, password);
    }

    @And("Click on the connection button")
    public void clickOnTheConnectionButton() {
        loginPage.login();
    }

    @And("User login with {string} and {string}")
    public void userLoginWithAnd(String email, String password) {
        loginPage.fillLoginForm(email, password);
        loginPage.login();
    }


    @And("Click on the signUp button")
    public void clickOnTheSignUpButton() {
        loginPage.signUp();
    }

    @When("User click on civility")
    public void userClickOnCivility() {
        loginPage.chooseCivility();
    }

    @And("Fill in the fields {string}, {string}, {string}, {string}, {string},")
    public void fillInTheFields(String firstname, String name, String number, String email, String password) {
        loginPage.fillInTheFields(firstname, name, number, email, password);
    }

    @And("Click to choose news email and SMS")
    public void clickToChooseNewsEmailAndSMS()  {
        loginPage.chooseOffer();

    }

    @And("Click on the creation account button")
    public void clickOnTheCreationAccountButton() {
        loginPage.creationAccount();
    }


}
